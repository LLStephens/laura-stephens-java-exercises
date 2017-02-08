package com.techelevator;

public class QuizQuestion {
	private String correctAnswer = new String();

	public void construct(String line) {
		String[] answers = line.split("\\|");
		int count = 0;

		for (String answer : answers) {

			if (count > 0) {
				String result = (count + ".) " + answer);

				if (answer.contains("*")) {
					correctAnswer = String.valueOf(result.charAt(0));
				}
				result = (count + ".) " + answer.replaceAll("\\*", ""));
				System.out.println(result);

			} else {
				System.out.println(answer);
			}
			count++;
		}
	}

	public int getCorrectAnswer() {
		return Integer.parseInt(correctAnswer);
	}
}
