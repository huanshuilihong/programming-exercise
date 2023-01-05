import java.util.*;
/*
Modify Factors to print just one copy each of the prime divisors. Currently, executing
Factors with argument 98 gives us:
% java Factors 98
% 2 7 7
After modifications, the output should be
% java Factors 98
% 2 7
 */
public class Main4th {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int b=2;
        int n=in.nextInt();
        boolean printif=true;
        while(b<=n){
            if(n%b==0){
                if(printif){System.out.println(b);printif=false;}
                n=n/b;
            }
            else{b=b+1;printif=true;}
        }
    }
}