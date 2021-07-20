package LOOPING;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n value:");
		n=sc.nextInt();
		int sum =0;
		for (int i=1;i<=n;i++) {
			sum=sum+i;
		}
		
System.out.println(sum);
	}

}
