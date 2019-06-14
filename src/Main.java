import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int num;
        String prime;
        String cont;
        boolean ifPrime = true;


        Scanner keyboard = new Scanner(System.in);
        num = keyboard.nextInt();


        //printing all numbers between 0 and 10,000
        //initialize that we increment by 1
        //this function will be for user input
        //prime numbers are greater than 1
        //prime numbers factors are only 1 and itself...number == divide by 2 -> prime number
        for (int p = 2; p <= Math.sqrt(num); p++) {

            System.out.println("Don't know your prime numbers? Check here!");
            num = keyboard.nextInt();

            if (num % p == 0) {
                keyboard.nextInt();
                ifPrime = false;
                System.out.println(num + " Is not a prime number");
            }
            if (ifPrime) {
                System.out.println(num + " Is a prime number");
            }


        }



    }

//
//        System.out.println("Would like to see a list of prime numbers or generate a number?");
//                keyboard.next();


}
