import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ScoreToLetterGradeTest {

	@Before
	public void setUp() throws Exception {}
	
	@After
	public void teardown() throws Exception {}

	@Test
	public void test(){
		assertEquals(ScoreToLetterGrade.letterGrade(100),'A');
		assertEquals(ScoreToLetterGrade.letterGrade(90),'A');
		assertEquals(ScoreToLetterGrade.letterGrade(89),'B');
		assertEquals(ScoreToLetterGrade.letterGrade(80),'B');
		assertEquals(ScoreToLetterGrade.letterGrade(70),'C');
		assertEquals(ScoreToLetterGrade.letterGrade(60),'D');
		assertEquals(ScoreToLetterGrade.letterGrade(59),'F');
	}
	
	@Test
	public void testLetterGrade2(){
		assertEquals(ScoreToLetterGrade.letterGrade(101),'X');
	}
	
	@Test
	public void testLetterGrade3(){
		assertEquals(ScoreToLetterGrade.letterGrade(0),'F');
	}

}
