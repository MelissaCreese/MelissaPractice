package myles.development.com.example.MelissaPractice;

import java.util.Scanner;

public class Bananas {

	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner becky = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first num: ");
		fnum = becky.nextDouble();
		System.out.println("Enter second num: ");
		snum = becky.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}






}
