package qsp1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	public void test1() throws FileNotFoundException, IOException
	{
		//step1
		Properties p=new Properties();
		//step2
		p.load(new FileInputStream("./p.properties"));
		//step3
		String val = p.getProperty("baseurl");
		System.out.println(val);
	}
	@Test
	public void test2(String path,String key) throws FileNotFoundException, IOException
	{
		//step1
		Properties p=new Properties();
		//step2
		p.load(new FileInputStream(path));
		//step3
		String val = p.getProperty(key);
		System.out.println(val);
	}

}
