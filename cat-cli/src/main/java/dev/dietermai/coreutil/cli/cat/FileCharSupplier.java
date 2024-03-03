package dev.dietermai.coreutil.cli.cat;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import dev.dietermai.coreutil.cat.charsupplier.CharSupplier;

public class FileCharSupplier implements CharSupplier, AutoCloseable {

	private final FileReader reader;
	private int next = -1;

	public FileCharSupplier(String filename) throws FileNotFoundException {
		reader = new FileReader(filename);
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
