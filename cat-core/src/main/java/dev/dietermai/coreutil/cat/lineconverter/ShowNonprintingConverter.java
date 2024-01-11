package dev.dietermai.coreutil.cat.lineconverter;

import java.nio.charset.StandardCharsets;

public class ShowNonprintingConverter implements ILineConverter {

	@Override
	public String convert(String line) {
		byte[] utf8Bytes = line.getBytes(StandardCharsets.UTF_8);

		StringBuilder sb = new StringBuilder();
		for (byte b : utf8Bytes) {
			sb.append(convert(b));
		}
		return sb.toString();
	}

	private String convert(byte b) {
		StringBuilder sb = new StringBuilder();
		int i = Byte.toUnsignedInt(b);
		if (i == '\r') {
			sb.append("^M");
		} else if (i == '\n') {
			sb.append("\n");
		} else if (i == '\t') {
			sb.append((char) i);
		} else if (i < ' ') {
			sb.append('^');
			sb.append((char) (i + '@'));
		} else if (i == 127) { // delete
			sb.append("^?");
		} else if (i > 127 && i <= 159) {
			sb.append("M-^");
			sb.append((char) (i - 128 + '@'));
		} else if (i > 159 && i < 255) {
			sb.append("M-");
			sb.append((char) (i - 160 + ' '));
		} else if (i == 255) {
			sb.append("M-^?");
		} else {
			sb.append((char) i);
		}
//		System.out.println("NonprintingConverter.convert() Convert "+b+" ("+i+") to "+sb.toString());
		return sb.toString();
	}
}
