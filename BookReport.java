import java.util.*;
//By Kaylah Tan
import java.io.*;

public class BookReport {
	static ArrayList<String> text = new ArrayList<String>();
	static StringBuilder text2 = new StringBuilder();

	public static void main(String[] args) {
		BookReport report = new BookReport();

		System.out.println("-----Welcome to my Frankenstein 'Book Report'-----");
		System.out.println("1) Search a word" + "\n" + "2) Total words in this book" + "\n" + "3) Average word length"
				+ "\n" + "4) Most common character" + "\n" + "5) Most common word" + "\n"
				+ "6) Create a random summary");
		Scanner input = new Scanner(System.in);
		// creation of scanner
		String result = input.next();// tells scanner what to do
		try {
			File data = new File("Frankenstein.txt");
			Scanner fr = new Scanner(data);
			Scanner fr2 = new Scanner(data);

			while (fr.hasNext()) {
				text.add(fr.next());// Arraylist
				text2.append(fr2.next());// Stringbuilder
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (result.equals("1")) { // works
			System.out.println("What word would you like to search? ");
			String answer = input.next();
			System.out.println("The total number of that word in this book is: " + report.rSearch(answer));

		} else if (result.equals("2")) { // works
			System.out.println("The total number of words in this book is: " + report.numWords());

		} else if (result.equals("3")) { // works
			System.out.println("The average word length is: " + report.avgWordLength());

		} else if (result.equals("4")) {// Doesn't work
			System.out.println("The most common character is: " + report.mostCommonChar());

		} else if (result.equals("5")) { // works
			System.out.println("The most common word is: '" + report.mostCommonWord());

		} else if (result.equals("6")) {
			System.out.println("How many words do you want to print out?");
			int answer = input.nextInt();
			System.out.println("Summary: " + report.randomSummary(answer));
		}
	}

	// WORKS
	private int rSearch(String word) {
		int count = 0;
		for (int i = 0; i < text.size(); i++) {
			if (word.equals(text.get(i))) {
				count++;
			}
		}
		return count;
	}

	// WORKS
	private int numWords() {
		return text.size();
	}

	// WORKS
	private int avgWordLength() {
		int avg;
		avg = text2.length() / text.size();
		return avg;
	}

	private Object mostCommonChar() {
		Object mostUsedChar = "";
		int count = 0;
		Object[] array = text.toArray();

		for (int i = 0; i < array.length; i++) {
			int tempCount = 0;

			for (int j = 0; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					tempCount++;
				}
				if (tempCount > count) {
					count = tempCount;
					mostUsedChar = array[i];
				}
			}
		}
		return mostUsedChar;
	}

	// WORKS
	private String mostCommonWord() {
		int count = 0;
		int newCount = 0;
		String word = "";
		for (int i = 0; i < text.size(); i++) {
			count = 1;
			for (int j = i + 1; j < text.size(); j++) {// count each word in the file
				if (text.get(i).equals(text.get(j))) {
					count++;
				}
			}
			if (count > newCount) {// if the amount is less than count then store value of count in maxCount
				newCount = count;
				word = text.get(i);
			}
		}
		return word;
	}

	private StringBuilder randomSummary(int input) {
		StringBuilder builder = new StringBuilder();
		int location = (int) (Math.random()*text.size());

		for(int i = 0; i < input; i ++) {
		String wordStart = text.get(location);
		builder.append(wordStart);
		}

		return builder;
	}
}
