package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizMaker {
	

	public static void main(String[] args) {
		int correctNum = 0;
		int total = 0;
		String filePath = "/Users/lstephens/Desktop/quiz_questions.txt";
		try {
			File searchFile = getSearchFile(filePath);
			try (Scanner fileInput = new Scanner(searchFile)) {
				QuizQuestion question = new QuizQuestion();

				try (Scanner numInput = new Scanner(System.in)) {

					while (fileInput.hasNextLine()) {
						String line = fileInput.nextLine();
						List<String> quiz = new ArrayList<>();
						quiz.add(line);

						for (int i = 0; i < quiz.size(); i++) {
							question.construct(quiz.get(i));

							System.out.println(question);
							System.out.println();

							System.out.print("Your answer: ");
							int numGuess = numInput.nextInt();
							int ans = question.getCorrectAnswer();

							if (numGuess == ans) {
								System.out.println("Correct!");
								System.out.println();
								++correctNum;
								++total;
							} else {
								System.out.println("Incorrect. The correct answer was " + ans + ".");
								System.out.println();
								++total;
							}

						}
					}
					System.out.println("You got " + correctNum + " correct out of the total " + total + " questions asked.");
				}
			}

		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			System.exit(1);
		}
	}
	
	private static File getSearchFile(String filePath) throws IOException {
		File searchFile = new File(filePath);

		if (!searchFile.exists()) {
			throw new FileNotFoundException("Search file: " + filePath + " does not exist");
		}
		if (!searchFile.isFile()) {
			throw new IOException("Search file: " + filePath + " exists but is not a file");
		}
		return searchFile;
	}
}
