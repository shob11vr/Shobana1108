package week1.day3;

import java.util.Arrays;

public class FindMissingNumber {
	public static void main(String[] args) {
		
		int num[]= {1,8,5,2,7,3,4};
		
		Arrays.sort(num);
		for(int i =0;i< num.length;i++)
		{
			int j=i+1;
			if(num[i]!=j) {
				System.out.println(j);
				break;
			}
		}
		
	}

}
