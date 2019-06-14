import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {


        System.out.println("Don't know your prime numbers? Check here!");
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();

//        String prime;
        String cont;
        boolean ifPrime = true;
//        int maxNum= 10000;


//        num = keyboard.nextInt();

        //printing all numbers between 0 and 10,000
        //initialize that we increment by 1
        //this function will be for user input
        //prime numbers are greater than 1
        //prime numbers factors are only 1 and itself...number == divide by 2 -> prime number

        for (int p = 2; p <= Math.sqrt(num); p++) {
//            for (int p = 2; maxNum <= p; num++){

            if (num % p == 0) {
                ifPrime = false;
                System.out.println(num + " is not a prime number");
            }

        }
        if (ifPrime) {
            System.out.println(num + " is a prime number");

        }
    }

//            System.out.println("Do you want to enter another number (Y/N)?");
//            cont = keyboard.next();
//
//        }while (cont.equalsIgnoreCase("Y")) ;
//    }
}