import java.util.*;
/*
[Optional] Counting Write a program PrimeCounter that takes an integer
command line argument n and finds the number of primes less than or equal to n. Use it to
print out the number of primes less than or equal to 10 million. Note: If you are not careful,
your program may not finish in a reasonable amount of time!
Hint: To give an efficient program, you might need to use a boolean array.(ans=664579)
 */
public class Main5th {
    public static void main(String[] args) {
        int a=5;
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(2);myArrayList.add(3);
        while(a<10000000){
int n = myArrayList.size();
boolean yo=true;
for(int i=1;i<n;i++){
    int b=myArrayList.get(i);
    if(a%b==0){yo=false;break;}
    if(b>=(a/2)){break;}
}
if(yo){myArrayList.add(a);}
a=a+2;
        }
int p=myArrayList.size();
        System.out.println(p);
    }
}