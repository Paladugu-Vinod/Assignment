import java.util.Scanner;
import java.io.*;
public class Pang{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter a String:");
		int[] occur = new int[26];
		String str = in.nextLine().replaceAll(" ", "");
		boolean pangram = true;
		for (int i = 0; i <str.length(); i++)
			occur[Character.toLowerCase(str.charAt(i)) - 'a']++;
		for (int i = 0; i < 26; i++)
			if (occur[i] == 0) {
				pangram = false;
				break;
			}

		if (pangram)
			System.out.println("pangram");
		else
			System.out.println("not pangram");

		in.close();
	}

}