import java.util.*;
/*
Write a Java program to compute the sum of the first N positive even numbers. N can be
input from the command argument. Suppose N = 2, then the sum will be 2 + 4 = 6. If N = 3,
then the sum will be 2 + 4 + 6 = 12. You can use the following template to implement this
Java program.
 */
public class Main1st {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n = in.nextInt();
int[]a=new int[n];
int sum=2;a[0]=2;
for(int i=1;i<n;i++){a[i]=a[i-1]+2;sum=sum+a[i];}
System.out.println(sum);
    }
}