import java.util.Arrays;
/*
Write a static method that takes double values ymin and ymax (with ymin strictly less than
ymax ), and a double array a[] as arguments, and linearly scale the values in a[] so that
they are all between ymin and ymax.
For example, if
a[] = {4.0, 5.0, 6.0} 6.0}, ymin = 0 , and ymax = 1 , then the array
after scaling should be {0.0, 0.5,
 */
public class LinearlyScale
{
    public static void main(String[] args)
    {
String [] a= Arrays.copyOf(args,args.length-2);
double min=Double.parseDouble(args[args.length-2]);
        double max=Double.parseDouble(args[args.length-1]);
        double[] b=new double[a.length];
        for (int i = 0;i<a.length;i++) {
            b[i]=Double.parseDouble(a[i]);
        }
        b=scale(b,min,max);
        for(double bb:b){
            System.out.print(" "+bb);
        }
    }
    public static double max(double[]x){
double a=x[0];
        for (double xx:x) {
            if(xx>a){a=xx;}
        }
        return a;
    }
    public static double min(double[]x){
    double a=x[0];
    for (double xx:x) {
        if(xx<a){a=xx;}
    }
    return a;
}
    public static double[] scale(double[]x,double y,double z){
        double delta=max(x)-min(x);
        double s=(z-y)/delta;
        double[]o =new double[x.length];
        for (int i=0;i<x.length;i++) {
            o[i]=(x[i]-min(x))*s+y;
        }
        return o;
    }
}
