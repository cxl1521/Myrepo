import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.security.InvalidParameterException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LetterGradeTest {
	private LetterGrade lgrade;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUp() throws Exception {
		lgrade = new LetterGrade();
	}
	
	@Before
	public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void restoreStreams() {
	    System.setOut(originalOut);
	}
		
	@Test
	public void testLetterGrade(){
		//boundary
		assertEquals(lgrade.letterGrade(100,100),'A');
		assertEquals(lgrade.letterGrade(0,0),'F');
		
		//normal
		assertEquals(lgrade.letterGrade(95,95),'A');
		assertEquals(lgrade.letterGrade(80,80),'B');
		assertEquals(lgrade.letterGrade(70,70),'C');
		assertEquals(lgrade.letterGrade(60,60),'D');
		assertEquals(lgrade.letterGrade(59,59),'F');
	}
	
//	@Test
//	public void testInvalidInput() {
//		assertEquals(lgrade.letterGrade(-1,90),'X');
//		assertEquals(lgrade.letterGrade(90,-1),'X');
//		assertEquals(lgrade.letterGrade(101,1),'X');
//		assertEquals(lgrade.letterGrade(1,101),'X');
//	}
	
	@Test
	public void testInvalidScore1() {
		try {
			   lgrade.letterGrade(-1,90);
		       fail("Expected a InvalidParameterException to be thrown");
		} catch(InvalidParameterException ipe) {
			System.out.println("invalid input: out of input range!");
		}
	}
	
	@Test
	public void testInvalidScore2() {
		try {
			   lgrade.letterGrade(90,-1);
		       fail("Expected a InvalidParameterException to be thrown");
		} catch(InvalidParameterException ipe) {
			System.out.println("invalid input: out of input range!");
		}
	}
	
	@Test
	public void testInvalidScore3() {
		try {
			   lgrade.letterGrade(101,1);
		       fail("Expected a InvalidParameterException to be thrown");
		} catch(InvalidParameterException ipe) {
			System.out.println("invalid input: out of input range!");
		}
	}
	
	@Test
	public void testInvalidScore4() {
		try {
			   lgrade.letterGrade(1,101);
		       fail("Expected a InvalidParameterException to be thrown");
		} catch(InvalidParameterException ipe) {
			System.out.println("invalid input: out of input range!");
		}
	}

//	@Test 
//	public void testConsoleOutput() {
//	    assertEquals("The grade is "+lgrade.letterGrade(100,90), outContent.toString().trim());
////		assertEquals("The grade is "+lgrade.letterGrade(60,60), outContent.toString().trim());
//	}
}
