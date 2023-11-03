package dev.dietermai.coreutil.cat.charsupplier;

public class StringCharSupplier implements CharSupplier{

	public final CharSequence string;
	public final int length;
	public int cursor;
	
	public StringCharSupplier(CharSequence string) {
		this.string = string;
		this.length = string.length();
	}
	
	@Override
	public char next() {
		return string.charAt(cursor++);
	}

	@Override
	public boolean hasNext() {
		return cursor < length;
	}
	

}
