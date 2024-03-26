package week1.day3;

import java.util.Scanner;

public class Isprime {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int nextInt=scan.nextInt();
		
		int count=0;
		for(int i=1;i<=11;i++) {
			
			if(nextInt%i==0) {
				count=count+1;
			}
		}
				if(count==2) {
					System.out.println(nextInt + " The number is a prime number");
				}
				else {
					System.out.println("Not a prime number");
				}
		}
	}
