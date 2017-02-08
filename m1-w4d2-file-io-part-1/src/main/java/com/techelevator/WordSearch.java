package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) {
		try(Scanner userInput = new Scanner(System.in)){
			System.out.print("Enter search term >>> ");
			String searchTerm = userInput.nextLine();
			
			System.out.print("Enter file path >>> ");
			String filePath = userInput.nextLine();
			
			System.out.print("Do you want the search to be case sensitive? (y or n) >>> ");
			String caseInput = userInput.nextLine();
			
			try {
				File searchFile = getSearchFile(filePath);
				try(Scanner fileInput = new Scanner(searchFile)){ //open files and reads
					int lineNumber = 1;
					while(fileInput.hasNextLine()) {
						String line = fileInput.nextLine();
						
						if(caseInput == "y"){
							if(line.contains(searchTerm)) {
								System.out.println(lineNumber + ".) " + line);
							}
						} else {
							String lineLower = line.toLowerCase();
							String searchTermLower = searchTerm.toLowerCase();
							if(lineLower.contains(searchTermLower)) {
								System.out.println(lineNumber + ".) " + line);
							} 
						}
						lineNumber++;
					}
				}
				
				
			} catch (FileNotFoundException ex) {
				System.out.println(ex.getMessage());
				System.exit(1);  //represents an error of some kind. any number but zero tells OS that program exited bc of some error
			} catch (IOException ex) {
				System.out.println(ex.getMessage());
				System.exit(1);
			}
		}
	}
	
	private static File getSearchFile(String filePath) throws IOException{
		File searchFile = new File(filePath);
		
		if(!searchFile.exists()) {
			throw new FileNotFoundException("Search file: " + filePath + " does not exist");
		}
		
		if(!searchFile.isFile()) {
		throw new IOException("Search file: " + filePath + " exists but is not a file");
		}
		
		return searchFile;
	}

}
