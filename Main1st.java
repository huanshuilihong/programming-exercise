import java.util.*;
/*
Write a program that takes two positive integers as command line arguments and prints
true if either evenly divides the other. You might need % (to check divisible) and boolean
operations. (You can use the LeapYear test program in the lecture notes as the reference.)
2. Write a program that prints the sum of two random integers between 1 and 6 (such as you
might get
 */
public class Main1st {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();int b=in.nextInt();
boolean judge;
        judge= a % b == 0 || b % a == 0;
if(judge){System.out.println(judge);}
    }
}