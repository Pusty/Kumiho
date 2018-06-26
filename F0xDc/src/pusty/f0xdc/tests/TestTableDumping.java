package pusty.f0xdc.tests;

import java.io.File;

import pusty.f0xdc.pe.ExecutableReader;

//Testing Reading of Import Table/Resource Table
public class TestTableDumping {
	public static void main(String[] args) throws Exception {
		File file = new File("example.exe");
		ExecutableReader reader = ExecutableReader.create(file);
		reader.getOptionalHeader().printImportTable();
		reader.getOptionalHeader().printResourceTable();
	}
}
