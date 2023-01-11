/*

 */
public class Combinations {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);//获取要求的字母总数
        char[] elements = new char[n];
        for (int i = 0; i < n; i++) {
            elements[i] = (char) ('a' + i);
        }//填充，char[0]=a,char[1]=b......
        generateCombinations(elements);
    }

    private static void generateCombinations(char[] elements) {
        int[] combination = new int[elements.length];//combination即是n
        for (int i = 0; i <= elements.length; i++) {
            generateCombinations(elements, combination, 0, i, 0);//转入另一个方法
        }
    }

    private static void generateCombinations(char[] elements, int[] combination, int combinationIndex, int combinationSize, int elementIndex) {
        if (combinationIndex == combinationSize) {
            print(elements, combination, combinationSize);
        } else if (elementIndex < elements.length) {
            combination[combinationIndex] = elementIndex;
            generateCombinations(elements, combination, combinationIndex + 1, combinationSize, elementIndex + 1);
            generateCombinations(elements, combination, combinationIndex, combinationSize, elementIndex + 1);
        }
    }

    private static void print(char[] elements, int[] combination, int combinationSize) {
        for (int i = 0; i < combinationSize; i++) {
            System.out.print(elements[combination[i]]);
        }
        System.out.println();
    }
}
