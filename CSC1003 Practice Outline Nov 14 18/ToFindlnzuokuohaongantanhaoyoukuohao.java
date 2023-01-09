/*
Write a recursive function that takes a positive integer n as its argument and returns ln (n!).
 */
public class ToFindlnzuokuohaongantanhaoyoukuohao
{
    public static void main(String[] args) {
double n=Double.parseDouble(args[0]);
System.out.println(a(n));
    }
public static Double a(Double n){
        double a=0;
        if(n>0){a=a+Math.log(n)+a(n-1);}
        return a;
}
    }
