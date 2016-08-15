package myles.development.com.example.MelissaPractice;

import java.util.Scanner;

public class Cherries {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		Scanner input= new Scanner(System.in);
		String word = input.next();
		String reverse = "";
		for(int i=word.length()-1; i>=0; i--)
			reverse += word.charAt(i);
		System.out.println(reverse);
		
	
	}

}
