package com.helpherfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
		File f=new File("C:\\Users\\Nandhini Varadhan\\eclipse-workspace\\july_7am_project_batch\\src\\main\\java\\com\\helpherfile\\Configuration.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		p=new Properties();
		
		p.load(fis);
				
	}	
	
	public String getUsername() {
		String Username = p.getProperty("uname");
		return Username;

	}
		
	public String getPassword() {
		String Password = p.getProperty("pass");
		return Password;
	}
	
	
	

}
