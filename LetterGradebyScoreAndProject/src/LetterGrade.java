import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
/*
 * compute the score and then covert it to a letter grade
 * the overall score = exam_score * 0.7 + project_score *.3 
 */
public class LetterGrade {
	int examScore, projectScore;

	public static void main(String[] args) {

		LetterGrade lg = new LetterGrade();
		try {
			System.out.print("Enetr the Exam score = ");
			InputStreamReader isr1 = new InputStreamReader(System.in);
			BufferedReader br1 = new BufferedReader(isr1);
			lg.examScore = Integer.parseInt(br1.readLine());
			
			System.out.print("Enetr the Project score = ");		
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			lg.projectScore = Integer.parseInt(br.readLine());	
			
			char grade = lg.letterGrade(lg.examScore, lg.projectScore);	        
		} catch (NumberFormatException ex) {
			System.out.println("Not an integer !");
		} catch (IOException e) {
			e.printStackTrace();
		}     

	}  

	public char letterGrade(int exam, int project) {
		double score;
		char grade;
		// add exception handling for invalid input parameters
		try {
		       if((exam<0 || exam>100) || (project<0 || project >100))
		         throw new InvalidParameterException("invalid parameters");
		} catch (Exception e) {
		  System.out.println("invalid input: out of input range!");
		  throw new InvalidParameterException("invalid parameters");
		}
		
//	    if((exam<0 || exam>100) || (project<0 || project >100)) {
//	    	return 'X';
//	    }

		
		score = exam*0.7 + project*0.3;
		if (score <0 || score > 100)
			grade = 'X';
		else if (score>=90 && score <=100)
			grade = 'A';
		else if (score>=80 && score <90)
			grade = 'B';
		else if (score>=70 && score <80)
			grade = 'C';
		else if (score>=60 && score <70)
			grade = 'D';
		else
			grade ='F';
        System.out.println("The grade is " + grade);
		return grade;	
	}
}


