package stringSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter count of words:");
		int wordCount = input.nextInt();
		
		for(int i = 0; i < wordCount; i++) {
			System.out.println("Enter next word: ");
			String word = input.next();
			list.add(word);
		}
		input.close();
		
		Comparator<String> comp = new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		};
		Collections.sort(list, comp);
		for(String x: list) {
			System.out.print(x + " ");
		}
	}

}
