package amazon_Project1.Amazon1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
  
	int count = 0;
	int retry_count= 1;
	@Override
	public boolean retry(ITestResult result) {
		if (count<retry_count)
		{
			count++;
			return true;
		}
		return false;
	}

}
