/*
Write a filter that reads in a sequence of integers and prints the integers, removing repeated
values that appear consecutively. For example, if the input is 1 2 2 1 5 1 1 7 7 7 7
1 1, then your program should print 1 2 1 5 1 7 1.
Hint: apart from typing the input via keyboard, you can also save the data into a text file and
redirected the file to the input of your Java program (details can be found in lecture notes).
4. Read a positive integer x from the input, print true if x is a palindrome; otherwise,
print false.
 */
import java.util.*;
public class RemovingRepeatedValues
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<>();
        while (in.hasNextInt()){a.add(in.nextInt());}
        in.close();
        ArrayList<Integer> b=new ArrayList<>();
        b.add(a.get(0));
        for(int i=1;i<a.size();i++){
            if(a.get(i)!=a.get(i-1)){b.add(a.get(i));}
        }
        for(int i=0;i<b.size()-1;i++){System.out.print(b.get(i)+" ");}
        System.out.print(b.get(b.size()-1));
    }
}