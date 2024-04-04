package dev.dietermai.coreutil.cli.cat;

public class SystemServiceImple implements SystemService {

	@Override
	public void exit(int code) {
		System.exit(code);
	}
	
}
