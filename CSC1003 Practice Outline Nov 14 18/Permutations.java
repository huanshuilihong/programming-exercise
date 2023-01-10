/*
Permutations. Write a program Permutations that takes an integer command line argument
n and prints all n ! permutations of the n letters starting at a (assume that n is no greater
than 26). A permutation of n elements is one of the n ! possible orderings of the elements.
As an example, when n = 3, you should get the following output (but do not worry about
the order i n which you enumerate them):
bca cba cab acb bac abc
 */
public class Permutations {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        char[] elements = new char[n];
        for (int i = 0; i < n; i++) {
            elements[i] = (char) ('a' + i);//把数组elements按从a到z的顺序填满n个
        }
        generatePermutations(elements, 0);
    }

    private static void generatePermutations(char[] elements, int k) {
        if (k == elements.length) {//可以看出来，k的值一开始为0
            print(elements);//打印出char[]数组中的所有元素并且换行
        } else {
            for (int i = k; i < elements.length; i++) {
                swap(elements, k, i);
                generatePermutations(elements, k + 1);
                swap(elements, k, i);
                /*
                我们以k=2来分析一下。一开始，elements[0]=a;elements[1]=b,k=0，elements.length=0
                第一次加入for循环，i=0，k=0，那么，第一个swap交换elements[0]与elements[0]自己
                然后，加入迭代，k=1
                    第一次加入for循环，i=1,k=1,那么，第一个swap交换elements[1]与elements[1]自己
                    然后，加入迭代，k=2
                        这次，由于k=2，直接打印出elements[0]=a;elements[1]=b
                        退出迭代
                    又一次交换，还是交换elements[1]与elements[1]自己，回到循环开头
                    没有第二次for循环，因为i+1=2了
                又一次交换，还是交换elements[0]与elements[0]自己，回到循环开头
                那么，回到开头，第二次for循环，i=1,k=0，那么，第一个swap交换elements[0]与elements[1]，现在elements[0]=b;elements[1]=a
                然后，加入迭代，k=1
                    ...由于内容同上，打印出elements[0]=b;elements[1]=a
                    退出迭代
                又一次交换，交换elements[0]与elements[1]（换回来）
                没有新一次循环了
                完结。
                 */
            }
        }
    }

    private static void swap(char[] elements, int i, int j) {//这个函数将
        char tmp = elements[i];
        elements[i] = elements[j];
        elements[j] = tmp;
    }

    public static void print(char[] elements) {//这个函数的作用是，打印出char[]数组中的所有元素并且换行
        for (char element : elements) {
            System.out.print(element);
        }
        System.out.println();
    }
}

