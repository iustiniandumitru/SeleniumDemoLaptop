package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		

	}

	public static void getProperties() throws IOException {
		
		
		try {
			Properties prop = new Properties();
			String projectPath = System.getProperty("user.dir");
			InputStream input = new FileInputStream("C:\\Users\\fk80wa\\eclipse-workspace\\Demo\\src\\config\\config.properties");
			prop.load(input);
			prop.getProperty("browser");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("e.getCause()");
			System.out.println("e.getMessage()");
			e.printStackTrace();
		}
		
	}
}
