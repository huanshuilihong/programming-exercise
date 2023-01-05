import java.util.*;
/*
Write a program that takes an integer command line argument n and prints all the positive
powers of 3 less than or equal to n.
 */
public class Main3rd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t=1;
        while(t<=n){
            System.out.println(t);
            t=t*3;
        }
    }
}
