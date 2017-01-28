package com.techelevator;

public class HomeworkAssignment {
	private int totalMarks;
	private int possibleMarks;
	private String submitter;
	
	public HomeworkAssignment() {
		totalMarks = 0;
		possibleMarks = 100;
		submitter = new String();
	}
	
	public int getTotalMarks() {
		return totalMarks;
	}
	
	public void setTotalMarks(int totalMarks) {
		if(totalMarks <= possibleMarks && totalMarks >= 0){
			this.totalMarks = totalMarks;
		}
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	public void setPossibleMarks(int possibleMarks) {
		if(possibleMarks > 0) {
			this.possibleMarks = possibleMarks;
		}
	}
	
	public String getSubmitter() {
		return submitter;
	}
	
	public void setSubmitter(String submitter){
		if(submitter != null && !submitter.isEmpty()){
			this.submitter = submitter;
		}
	}
	
			/* Letter grade scale
			- For 90% or greater return "A" 
		    - 80-89% return "B" 
		    - 70-79% return "C" 
		    - 60-69% return "D" 
		    - otherwise return "F"
		    */
	
	public String getLetterGrade() {
		double percentage = totalMarks/(double)possibleMarks;
		if(percentage>-0.9){
			return "A";
		} else if (percentage >= 0.8){
			return "B";
		} else if (percentage >= 0.7){
			return "C";
		} else if (percentage >= 0.6){
			return "D";
		} else {
			return "F";
		}
	}
	
}

