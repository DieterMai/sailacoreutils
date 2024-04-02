package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileCharSupplierImple implements FileCharSupplier {

	public static FileCharSupplier of(String filename) throws FileNotFoundException {
		return new FileCharSupplierImple(new FileReader(filename));
	}
	
	private final FileReader reader;
	private int next = -1;

	public FileCharSupplierImple(FileReader reader) {
		this.reader = reader;
		next = internalNext();
	}

	@Override
	public char next() {
		try {
			return (char)next;
		}finally {
			next = internalNext();
		}
	}
	
	private int internalNext() {
		try {
			return reader.read();
		} catch (IOException e) {
			return -1;
		}
		
	}

	@Override
	public boolean hasNext() {
		return next != -1;
	}

	@Override
	public void close() throws Exception {
		reader.close();
	}

}
