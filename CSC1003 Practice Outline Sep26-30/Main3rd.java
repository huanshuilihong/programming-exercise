import java.util.*;
/*
[Optional] Order Write a program that takes three double command line
arguments x, y, and z and prints true if the values are strictly ascending or descend ing ( x <
y < z or x > y > z ), and false otherwise.
 */
public class Main3rd {
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
double[] a=new double[3];
for(int i=0;i<3;i++){
    a[i]=in.nextDouble();
}
if(a[0]<a[1]&&a[1]<a[2]){System.out.println("true");}
else if (a[0]>a[1]&&a[1]>a[2]) {System.out.println("true");}
else {System.out.println("false");}
    }
}