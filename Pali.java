import java.io.*;
import java.util.Scanner;
class Pali {
	public static void main(String args[]){
	int rem;
	int sum =0;
	int temp;
	System.out.println("Enter the number");
	Scanner  n = new Scanner(System.in);
	int num = n.nextInt();
	temp = num;
	while(num>0){
	rem=num%10;
	sum=(sum*10)+rem;
	num=num/10;
	}
	if(temp==sum){
	System.out.println("Palindrom");
	}
	else{
	System.out.println("Not palindrome");
	}

	}

}
