package Projects;

import java.util.Scanner;

public class V_3 {

    int password = 1234;
    boolean pass = false;
    int count = 3;
    int min_balance = 2000;
    int balance = 2000;

    //	static initializer
    static {
        System.out.println("Welcome to E-Wallet");
    }

    /////////////////////////////////////////////////////////////////////////////////

//password validation

    Scanner sc = new Scanner(System.in);

    public boolean login_validate() {
        System.out.println("\nPlease Enter Your Credentials.");
        int pwd = sc.nextInt();

        if (password == pwd) {
            return true;
        } else {
            return false;
        }
    }

    public boolean on_pass_success() {
        return pass = true;
    }

    public boolean on_pass_fail() {
        if (count > 0) {
            System.out.println("\npress 1 to enter correct password.");
            System.out.println("press 2 to exit");

            int exit_val = sc.nextInt();

            while (exit_val > 2 || exit_val <= 0) {
                // does not allow to enter other than 1 or 2. Repeats in loop till we enter 1 or
                // 2
                System.out.println("\nInvalid number entered.");
                System.out.println("press 1 to enter correct password.");
                System.out.println("press 2 to exit");
                exit_val = sc.nextInt(); // reinitializing again. if 1 or 2. while loop exits.
            }

            if (exit_val == 1) {
                return !pass;
            } else if (exit_val == 2) {
                System.out.println("\nPlease visit again");
                System.out.println("Logged out");
            }
            return pass = true;
        } else {
            System.out.println("\nYou tried all 3 attempts. Please try again");
            System.out.println("Logging out");
            return pass = true;
        }
    }

    public static void main(String[] args) {
        //		object creation
        V_3 obj1 = new V_3();

//		password logic
        while(!obj1.pass) {
            if (obj1.login_validate()) {
                obj1.on_pass_success();
            } else {
                obj1.count = obj1.count - 1;
                System.out.println("\nYou have " + obj1.count + " attempts left");

                obj1.on_pass_fail();
            }
        }
    }
}
