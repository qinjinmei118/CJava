package org.ddd.annotation.example;

import bits.org.SQL.TableProcessor;

public class AnnotationTest {
	public static void main(String[] args) throws Exception {
		TableProcessor processor = new TableProcessor();
		String sql = processor.process(System.getProperty("user.dir"));
		System.out.println(sql);
	}
}
