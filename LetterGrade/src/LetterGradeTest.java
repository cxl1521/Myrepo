import junit.framework.TestCase;


public class LetterGradeTest extends TestCase {
	// private ScoreToLetterGrade sg = new ScoreToLetterGrade();
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testLetterGrade(){
		assertEquals(ScoreToLetterGrade.letterGrade(100),'A');
		assertEquals(ScoreToLetterGrade.letterGrade(90),'A');
		assertEquals(ScoreToLetterGrade.letterGrade(89),'B');
		assertEquals(ScoreToLetterGrade.letterGrade(80),'B');
		assertEquals(ScoreToLetterGrade.letterGrade(70),'C');
		assertEquals(ScoreToLetterGrade.letterGrade(60),'D');
		assertEquals(ScoreToLetterGrade.letterGrade(59),'F');
	}

	public void testLetterGrade2(){
		assertEquals(ScoreToLetterGrade.letterGrade(101),'X');
	}
	public void testLetterGrade3(){
		assertEquals(ScoreToLetterGrade.letterGrade(0),'F');
	}
}
