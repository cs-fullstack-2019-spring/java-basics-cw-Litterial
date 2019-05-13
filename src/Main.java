import java.util.Scanner;

import static java.lang.Double.NaN;

public class Main {

    public static void main(String[] args)
    {
      Scanner scan= new Scanner(System.in);
//####  Exercise 1:
//        Create a program that prints “It’s a great day today”. Then ask the user “What is your name?. Then print “Hello [NAME]”

        System.out.println("It's a great day today");
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello "+ name);
//
//####  Exercise 2:
//        Ask for the user to enter a number. Ask the user for another number. Print the sum of the two numbers, then the difference of the two numbers.

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number");
        int num2 = scan.nextInt();
        System.out.println("The sum of "+num1+ " and " +num2+ " is "+(num1+num2));
        System.out.println("The difference of "+num1+ " and " +num2+ " is "+(num1-num2));

//
//####  Exercise 3:
//        Ask the user to enter their balance. Print “I’ve granted you $1.50 more!. Your new balance is: [BALANCE]”
        System.out.println("Enter your balance");
        double balance = scan.nextDouble();
        System.out.println("I've granted you $1.50 more");
        System.out.println("Your new balance is $" + (balance + 1.50));

//
//####  Exercise 4:
//        Ask a user to enter a password. Enter a password. Ask user to reenter password. Check to see if they are correct.
        System.out.println("Enter your password");
        String pass1 = scan.next();
        System.out.println("Enter your second password");
        String pass2 = scan.next();
        if (pass1.equals(pass2))
            System.out.println("Passwords Match");
        else
            System.out.println("These passwords do not match");
            System.out.println(pass1);
            System.out.println(pass2);



//####  Exercise 5:
//        Print “CORRECT” if 1, 2, or 3 is entered. If anything else is entered print "ERROR".

        System.out.println("Enter 1, 2, or 3. Please follow directions");
        int number = scan.nextInt();
        if (number !=1 && number!=2 && number !=3)
            System.out.println("You did not follow directions");
        else
            System.out.println("Correct");
//
//####  Exercise 6:
//        Ask the user to enter a number. If it’s positive, print “POSITIVE”. If it’s negative, print “NEGATIVE”. If it’s zero, print "ZERO".
        System.out.println("Enter a number");
        double pos_neg=scan.nextDouble();
        if (pos_neg==0)
            System.out.println("Zero");
        else if (pos_neg>0)
            System.out.println(pos_neg+ " is a positive number.");
        else
            System.out.println(pos_neg+ " is a negative number.");


//
//####  Exercise 7:
//        Ask the user for 3 card numbers. If it equals 21 print BLACKJACK!, if it’s greater than 21 print BUST!, if it’s less than 21 print “The total is [TOTAL]”
        System.out.println("Please enter 3 card values");
        int card1 = scan.nextInt();
        int card2 = scan.nextInt();
        int card3 = scan.nextInt();

        if (card1+card2+card3==21)
            System.out.println("Blackjack");
        else if (card1+card2+card3>21)
            System.out.println("Bust!!!");
        else
            System.out.println("The total value is" + (card1+card2+card3));

//
//####  Exercise 8:
//        Ask the user to enter a number grade. It should print according to the following:
//
//    A 90 - 100 B 80 - 89 C 70 - 79 D 60 - 69 F 0 - 59
//
//        If it's negative or over 100 print "Error".

        System.out.println("Enter your grade number");
        double grade = scan.nextDouble();
        if (grade<= 100 && grade >=90)
            System.out.println("A");
        else if (grade<= 89 && grade >=80)
            System.out.println("B");
        else if (grade<= 79 && grade >=70)
            System.out.println("C");
        else if (grade<= 69 && grade >=60)
            System.out.println("D");
        else if (grade<= 59 && grade >=0)
            System.out.println("F");
        else
            System.out.println("Error");



//
//####  Exercise 9:
//        Ask the user for their height in centimeters. Print their height in feet and inches.
        System.out.println("Enter your height in centimeters");
        double cm=scan.nextDouble();
        double inches=cm/2.54;
        //changing the primitive type of inches from double to int to display an integer
        System.out.println("Your height is " +((int)(Math.floor(inches/12)))+"'"+(Math.round(inches)%12));
//
//####  Exercise 10:
//        Ask the user to enter three numbers. Find the largest of three numbers using only things we learned today.
        System.out.println("Enter three numbers");
        double size1=scan.nextDouble();
        double size2=scan.nextDouble();
        double size3=scan.nextDouble();

        if (size1 >= size2 && size1 >=size3)
            System.out.println (size1+ " is the greatest number");
        else if (size2>=size1 && size2>=size3)
            System.out.println (size2+ " is the greatest number");
        else
            System.out.println (size3+ " is the greatest number");


//
//####  Exercise 11:
//        Create a program that can calculate the quadratic equation. Google it if you don't know the equation.
        System.out.println("The quadratic formula is Ax^2+Bx+C where a!=0. Enter your values for A, B, and C");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        double pre_discriminant=Math.pow(b,2)-4*a*c;
        double x1=-b+Math.sqrt(pre_discriminant)/2*a;
        double x2=-b-Math.sqrt(pre_discriminant)/2*a;
        //Math.sqrt returns NaN if the argument is NaN or negative;
        System.out.println("The function intercepts the x-axis at " +x1+ " and " +x2);


    }
}
