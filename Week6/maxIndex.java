
//Q : Find the Maximum Index in an Array

public class maxIndex {
    public static void main(String[] args) {
        int[] T = { 1, 2, 3, 4, 5, 90, 7, 8, 5, 12 };
        int max = 0;
        int k = 0;
        int i = 0;
        while (i < T.length) {
            if (T[i] > max) {
                max = T[i];
                k = i;
            }
            i++;
        }
        System.out.println(k);
    }
}
