package dev.dietermai.coreutil.cli.cat;


import java.util.Objects;

import dev.dietermai.coreutil.cli.cat.error.CliError;

public class CatCliException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private final CliError error;
	
	public static CatCliException parse(Throwable e) {
		return new CatCliException(e);
	}


	private CatCliException(Throwable nested) {
		super(nested);
		this.error = CliError.of(nested);
	}

	public CliError getError() {
		return error;
	}


	@Override
	public int hashCode() {
		return Objects.hash(error);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		return Objects.equals(error, ((CatCliException) obj).error);
	}
	
}
