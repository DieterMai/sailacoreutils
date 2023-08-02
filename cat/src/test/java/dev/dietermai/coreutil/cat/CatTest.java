package dev.dietermai.coreutil.cat;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class CatTest {

	@Test
	void test() {
		String path = "foo";
		assertEquals(CatRecord.ofFile(path), Cat.of(path).get());
	}

}
