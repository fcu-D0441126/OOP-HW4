package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PasswordEncorder T= new PasswordEncorder();
		Scanner cin = new Scanner(System.in);
		String input;
		while(true){
			System.out.print("Please enter a password(while input \"exit\" then exit) :");
			input=cin.next();
			if (input.equals("exit")) {
				break;
			}
			else{
				System.out.println(T.encode(input));
			}
			
		}
			
		cin.close();

	}

}
