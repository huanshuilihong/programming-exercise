/*
Write a static method max3() that takes three int arguments and returns the value of the
largest one. Add an overloaded function that does the same thing with three double values.
 */
public class PutArrayInReserveOrder
{
    public static void main(String[] args)
    {
int[] a=new int[args.length];
for(int i=0;i< args.length;i++){
    a[i]=Integer.parseInt(args[i]);
}
a=reverse(a);
for(int aa:a){System.out.print(" "+aa);}
    }
    public static int[] reverse(int[]x){
       int[]a=new int[x.length];
       for(int i=0;i<x.length;i++){a[i]=x[x.length-1-i];}
       return a;
    }
}