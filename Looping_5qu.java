// 5.Validate Mobile Number Length
// Ask user to enter a 10-digit mobile number.
// If wrong, repeat —
// but the input prompt should run once minimum.





package com.index;

public class Looping_5qu {

	public static void main(String[] args) {
	
		
		Scanner obj = new Scanner(System.in);
        String mobile;

        do {
            System.out.print("Enter 10-digit mobile number: ");
            mobile = obj.nextLine();
        } while (mobile.length() != 10);

        System.out.println("Valid mobile number");

	}

}
