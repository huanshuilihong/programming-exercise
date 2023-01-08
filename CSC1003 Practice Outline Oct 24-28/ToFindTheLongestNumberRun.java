/*
Write a program that reads in a sequence of integers and prints both the integer that
appears in the longest consecutive run and the length of that run. For example, if the input
is 1 2 2 1 5 1 1 7 7 7 7 1 1, then your program should print the longest run: 4
consecutive 7s.
 */
import java.util.*;
public class ToFindTheLongestNumberRun
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        num.add(in.nextInt() );  sum.add(1);
        while (in.hasNextInt()){
int a =in.nextInt();
int b=num.size();
int c=num.get(b-1);
int d=sum.get(b-1);
if(a==c){sum.set(b-1,d+1);}
else{num.add(a);sum.add(1);}
        }
in.close();
        int max=0;
        int a=0;
        for(int i=0;i<sum.size();i++){
            if(sum.get(i)>max){max=sum.get(i);a=num.get(i);}
        }
        System.out.println("Longest run: "+max);
        System.out.println("consecutive "+a+"s");
    }
}