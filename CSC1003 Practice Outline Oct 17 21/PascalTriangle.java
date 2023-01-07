import java.util.*;
/*
Given an integer N, print the first N rows of Pascal's triangle . In Pascal's
triangle , each number is the sum of the two numbers directly above it as
If n is 5, the first 5 rows of your program output looks like the following:
Hint: you can use a 2 dimensional array to implement this program.
 */
public class PascalTriangle
{
    public static void main(String[] args)
    {
int n=Integer.parseInt(args[0]);
int[][] a=new int[n][];
for(int i=0;i<n;i++){a[i]=new int[i+1];}
a[0][0]=1;System.out.println("1");
for(int i=1;i<n;i++){
    a[i][0]=1;a[i][i]=1;
    for(int j=1;j<i;j++){a[i][j]=a[i-1][j]+a[i-1][j-1];}
    for(int j=0;j<i;j++){System.out.print(a[i][j]+" ");}
    System.out.println(a[i][i]);
}

    }
}
