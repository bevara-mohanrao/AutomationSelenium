package javaprogramming;

import java.util.HashSet;
import java.util.Set;

public class JavaDupStringwithCasesens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String inputString = "I do this program Do This program again and Again";

		        // Split the input string into words
		        String[] words = inputString.split("\\s+");

		        // Create a Set to store unique words
		        Set<String> uniqueWords = new HashSet<>();

		        // Add each word to the set
		        for (String word : words) {
		            uniqueWords.add(word.toUpperCase());
		        }

		        // Print the unique words
		        System.out.println("Unique words (case-sensitive):");
		        for (String uniqueWord : uniqueWords) {
		        	String output = String.join(", " +uniqueWord);
		            System.out.println(output);
		        }
		    
		   
	
	}
}


