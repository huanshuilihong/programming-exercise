import java.util.*;
/*
Write a static method: given a string s consisting of words and spaces, return the
length of the last word i n the string.
A word is a maximal substring consisting of non-space characters only.
If s = "Hello World", the returned length should be , the returned length should be 55, as the last word is "World""World".
Hint: you can use split() method from String. https://stackoverflow.com/questions/3481828/howhttps://stackoverflow.com/questions/3481828/how--dodo--ii--splitsplit--aa--stringstring--inin--javajava
You can also implement this method without using split(). Be careful if s = s = "Hello World "."Hello World ".
但实际上这段代码我写的是输出最长的一个单词，而且有一个缺陷，那就是无法区分出标点符号，比如“all.”是一个4长度单词。
 */
public class LongestWordInALine
{
    public static void main(String[] args) {
Scanner in=new Scanner(System.in);
ArrayList<String>a=new ArrayList<>();
while(in.hasNextLine()){a.add(in.nextLine());}
in.close();
for(String aa:a){
    int b=bb(aa);
    System.out.println(b);
}
    }
    public static int bb(String a){
int l=a.length();
char[]c=new char[l];
ArrayList<Integer>blank=new ArrayList<>();
for(int i=0;i<l;i++){
    c[i]=a.charAt(i);
    if(c[i]==' '){blank.add(i);}
}
int blanklth=blank.size();
int max=0;
for(int i=1;i<blanklth;i++){
    if(blank.get(i)-blank.get(i-1)>1){
        int delta=blank.get(i)-blank.get(i-1);
        if(delta-1>max){max=delta-1;}
    }
}
if(blank.get(0)!=0){
    int v=blank.get(0)-1;
    if (max<v){max=v;}
}
if(c[l-1]!=' '){
    int v=l-(blank.get(blanklth-1)+1);
    if (max<v){max=v;}
}
return max;
    }
    }
