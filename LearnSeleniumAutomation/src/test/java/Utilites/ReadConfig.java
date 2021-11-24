package Utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	public ReadConfig()
	{
		File src = new File("C:\\Users\\koutamv\\eclipse-workspace\\LearnSeleniumAutomation\\Configuration\\config.properties");
		
		try 
		{
			FileInputStream FileLoc = new FileInputStream(src);
			prop = new Properties();
			prop.load(FileLoc);
			
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String getApplicationURL()
	{
		String url=prop.getProperty("baseURL");
		return url;
	}
	
	public String getuname() {
		String uname=prop.getProperty("username");
		return uname;
	}
	
	public String getpwd() {
		String pwd=prop.getProperty("password");
		return pwd;
	}

}