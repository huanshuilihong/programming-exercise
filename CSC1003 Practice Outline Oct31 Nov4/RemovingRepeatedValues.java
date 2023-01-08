/*
Write a static method max3() that takes three int arguments and returns the value of the
largest one. Add an overloaded function that does the same thing with three double values.
 */
public class RemovingRepeatedValues
{
    public static void main(String[] args)
    {
var a=max3(1,12.1,3);
System.out.println(a);
    }
    public static int max3(int x,int y,int z){
        int a=x;
                if(y>a){a=y;}
                if(z>a){a=z;}
                return a;
    }
    public static double max3(double x,double y,double z){
        double a=x;
        if(y>a){a=y;}
        if(z>a){a=z;}
        return a;
    }
}
