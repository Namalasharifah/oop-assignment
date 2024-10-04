package oopassignment;
import java.util.Scanner;
public class Number_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the limit up to which you want to print prime numbers: ");
		        int limit = scanner.nextInt();
		        scanner.close();

		        System.out.println("Prime numbers up to " + limit + " are:");

		        for (int num = 2; num <= limit; num++) {
		            boolean isPrime = true;

		            for (int i = 2; i <= num / 2; i++) {
		                if (num % i == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }

		            if (isPrime) {
		                System.out.print(num + " ");
		            }
		        }
		    }


	}