import junit.framework.TestCase;

public class MyPrimeNumberTest extends TestCase {
	MyPrimeNumber num;
	
	protected void setUp() throws Exception {
		super.setUp();
		num = new MyPrimeNumber();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	  public void testIsPrime_TC1() {
		  	assertEquals(num.isPrime(1),1); 
		  	assertEquals(num.isPrime(2),1); 
		  	assertEquals(num.isPrime(4),0); 
	  }
}
