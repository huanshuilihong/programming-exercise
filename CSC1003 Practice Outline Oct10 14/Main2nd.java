import java.util.*;
/*
Write a Java program to compute the g reatest common divisor of two given positive
integers A and B. You can assume the two positive integers are not larger than 1,000,000.
For example, the highest common factor of 54 and 24 is 6.
 */
public class Main2nd {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int a= in.nextInt();int b= in.nextInt();
int s=Math.min(a,b);int ss=Math.max(a,b);
int o=0;
for(int i=1;i<=s;i++){if(ss%i==0&&s%i==0){o=i;}}
System.out.println(o);
    }
}