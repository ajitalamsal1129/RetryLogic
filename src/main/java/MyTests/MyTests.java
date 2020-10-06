package MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTests {
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void Test1() {
		Assert.assertEquals(true, false);
	}
	
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void Test2() {
		Assert.assertEquals(true, false);
	}
	

}
