import java.io.*;
import java.util.Scanner;

public class PanagramDetector{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int[] occurances = new int[26];
		System.out.println("Write a panagram:");
		String panagram = scan.nextLine();

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < panagram.length(); i++){
			for (int j = 0; j < alphabet.length(); j++){
				if (panagram.toLowerCase().charAt(i) == alphabet.charAt(j)){
					occurances[j]++;
				}
			}
		}

		System.out.println("");

		boolean isAPanagram = true;
		for (int k = 0; k < occurances.length; k++){
			if (occurances[k] == 0){
				isAPanagram = false;
			}
		}

		if (isAPanagram){
			System.out.println("That is a panagram.");
		}else{
			System.out.println("That is not a panagram.");
		}
	}
}