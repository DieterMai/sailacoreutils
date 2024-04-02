package dev.dietermai.coreutil.cli.cat;

import dev.dietermai.coreutil.cli.cat.parse.result.ParsingResult;

public interface CatCliParser {
	ParsingResult parse(String[] args) throws CatCliException;
}
