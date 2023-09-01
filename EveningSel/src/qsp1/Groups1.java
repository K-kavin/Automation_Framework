package qsp1;

import org.testng.annotations.Test;

@Test(groups = {"functional"})//within classes
public class Groups1 {
	@Test(groups = {"sanity"})//within annotations
	public void test1()
	{
		System.out.println("compose");
	}
	@Test(groups = {"sanity","regression"})
	public void test2()
	{
		System.out.println("sentItems");
	}
	@Test(groups = {"regression"})
	public void test3()
	{
		System.out.println("trash");
	}
	

}
