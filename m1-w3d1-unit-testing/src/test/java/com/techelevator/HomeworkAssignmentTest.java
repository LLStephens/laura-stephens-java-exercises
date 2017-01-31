package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {

	private HomeworkAssignment hw;

	@Before
	public void setup(){
		hw = new HomeworkAssignment(100);
	}
	
	@Test
	public void get_hw_possible_score_100(){
		//Arrange
		Assert.assertEquals("The total number of points possible is 100", 100, hw.getPossibleMarks());
		
	}
	
	@Test
	public void get_hw_given_score_of_98(){
		//Act
		hw.setTotalMarks(98);
		
		//Assert
		Assert.assertEquals("The score should be 98", 98, hw.getTotalMarks());
	}
	
	@Test
	public void get_student_name_for_Paul_Brown(){
		//Act
		hw.setSubmitterName("Paul Brown");
		
		//Assert
		Assert.assertEquals("The submitter's name is Paul Brown", "Paul Brown", hw.getSubmitterName());
	}
	
	@Test
	public void get_letter_grade_for_A(){
		//Act
		hw.setTotalMarks(9);
		hw.setPossibleMarks(10);
		
		//Assert
		Assert.assertEquals("The letter grade is A", "A",  hw.getLetterGrade());
	}
	@Test
	public void get_letter_grade_for_B(){
		//Act
		hw.setTotalMarks(8);
		hw.setPossibleMarks(10);
		
		//Assert
		Assert.assertEquals("The letter grade is B", "B",  hw.getLetterGrade());
	}
	
	@Test
	public void get_letter_grade_for_C(){
		//Act
		hw.setTotalMarks(7);
		hw.setPossibleMarks(10);
		
		//Assert
		Assert.assertEquals("The letter grade is C", "C",  hw.getLetterGrade());
	}
	
	@Test
	public void get_letter_grade_for_D(){
		//Act
		hw.setTotalMarks(6);
		hw.setPossibleMarks(10);
		
		//Assert
		Assert.assertEquals("The letter grade is D", "D",  hw.getLetterGrade());
	}
	
	@Test
	public void get_letter_grade_for_F(){
		//Act
		hw.setTotalMarks(4);
		hw.setPossibleMarks(10);
		
		//Assert
		Assert.assertEquals("The letter grade is F", "F",  hw.getLetterGrade());
	}
}
		