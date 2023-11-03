package dev.dietermai.coreutil.cat.charsupplier;

import java.util.Objects;

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

	public static StringCharSupplier of(String string) {
		return new StringCharSupplier(string);
	}

	@Override
	public String toString() {
		return "StringCharSupplier [string=" + string + ", length=" + length + ", cursor=" + cursor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(length, string);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringCharSupplier other = (StringCharSupplier) obj;
		return length == other.length && Objects.equals(string, other.string);
	}
	

}
