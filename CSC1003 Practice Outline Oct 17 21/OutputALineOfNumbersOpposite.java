/*
Read n numbers from the command arguments, and output the in reverse order.
For example, if you give 5 integers 1 2 3 4 5 as the input, the output should be 5 4 3 2 1.
You can also use Scanner to get the input from standard input stream, if you want.
Q.How do I specify the end of the stream?
A.<Ctrl-d>(standard for decades).
A.<Ctr1-z>(Windows).
 */
import java.util.*;
public class OutputALineOfNumbersOpposite
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> myArrayList = new ArrayList<>();
        while (in.hasNextInt()){myArrayList.add(in.nextInt());}
        in.close();
        for(int i=myArrayList.size()-1;i>0;i=i-1){
            int a=myArrayList.get(i);
            System.out.print(a+" ");}
        int a;
        a = myArrayList.get(0);
        System.out.print(a);
    }
}
