import java.util.Random;
/*
Write a program that prints the sum of two random integers between 1 and 6 (such as you
might get when rolling dice). This program does not need the input. You can use the
RandomInt program in the lecture notes as the reference.
 */
public class Main2nd {
    public static void main(String[] args) {
        Random random = new Random();
        int sum=0;
        for(int i = 0;i<2;i++) {
            int randomInt = random.nextInt(6) + 1;
            //System.out.println(randomInt);
            sum=sum+randomInt;
        }
        System.out.println(sum);
}
}