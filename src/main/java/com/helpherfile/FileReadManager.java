package com.helpherfile;

import java.io.IOException;

public class FileReadManager {
	//private method
	private FileReadManager() {
		
	}
	
	
	//static method --> creating object for this class
	public static FileReadManager instanceFRM() {
		FileReadManager frm=new FileReadManager();
		return frm;

	}
	
	
	//non static --> creating object for CR class
	
	public Configuration_Reader instanceCR() throws IOException {
		Configuration_Reader reader=new Configuration_Reader();
		return reader;
		

	}
	
	

}
