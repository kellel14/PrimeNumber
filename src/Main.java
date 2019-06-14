import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number");
        int num= keyboard.nextInt();
//        String prime;
//        String cont;
        boolean ifPrime = true;




        //printing all numbers between 0 and 10,000
        //initialize that we increment by 1
        //this function will be for user input
        //prime numbers are greater than 1
        //prime numbers factors are only 1 and itself...number == divide by 2 -> prime number
        for (int p = 2; p <= Math.sqrt(num); p++) {

            if (num % p == 0) {
                keyboard.nextInt();
                ifPrime = false;
//                System.out.println(num + " Is not a prime number");
            }
        }

        if (ifPrime == false) {
            System.out.println(num + " " + "is not a prime number");
        }

        else if (ifPrime == true) {
            System.out.println(num + " " + "is a prime number");
        }
    }


//
//        System.out.println("Would like to see a list of prime numbers or generate a number?");
//                keyboard.next();


}
