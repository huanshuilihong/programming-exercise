/*
Write a program that reads in floating-point numbers (as many as the user enters) from standard input and
a) prints the maximum and minimum values.
b) prints the mean (average value) and sample standard deviation (square root of the sum of the squares of their differences from the average, divided by n-1, where n is the
number of double values from input)
Hint: you can use Scanner or StdIn for handling standard input streams, the latter needs to have stdlib.jar available.
To end the input stream from keyboard, you can use the following commands.
 */
import java.util.*;
public class ReadDoubleAndOutput
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Double> myArrayList = new ArrayList<>();
        while (in.hasNextDouble()){myArrayList.add(in.nextDouble());}
in.close();
        double max=0;double min=0;
        for (Double aDouble : myArrayList) {
            if (aDouble > max) {
                max = aDouble;
            }
            if (aDouble < min) {
                min = aDouble;
            }
        }
        System.out.println("max="+max);System.out.println("min="+min);
        double sum=0;
        for (Double aDouble : myArrayList){
            sum=sum+aDouble;
        }
        double mean=sum/ myArrayList.size();
        System.out.println("mean="+mean);
        double ssd,summer=0;
        for (Double aDouble : myArrayList){
            double y=Math.pow(aDouble-mean, 2 );
            summer=summer+y;
        }
        ssd=Math.sqrt(summer);
        System.out.println("sample standard deviation="+ssd);
    }
}
