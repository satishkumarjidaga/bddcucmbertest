package com.test.commonuties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public Properties prop = null;
	public CharSequence Anumer;
	
	public ReadPropertiesFile() {
		
		prop = new Properties();
	}
	
	public String valuefromfile() throws Throwable{
		
		File file = new File ("FileLocation");
		FileInputStream fis = new FileInputStream(file);
		
		prop.load(fis);
		
		return prop.getProperty("valuefromfile");
		
		
		
	}

}
