import java.util.*;

class SetTheoryHomework{
    public static void main(String[] args) {
        int[] s = new int[21];

        for(int i = 0; i <= 20; i++){
            s[i] = i;
        }

        int index = 0;
        int[] a = new int[11];

        for(int i = 2; i < 16; i++){
            if (i == 3 || i == 10 || i == 14) continue;
            a[index] = i;
            index++;
        }

        int[] B = new int[11];
        index = 0;

        for(int i = 0; i <= 20; i += 2){
            B[index] = i;
            index ++;
        }

        int[] C = new int[5];
        index = 1;
        C[0] = 2;

        for(int i = 3; i <= 11; i += 2){
            if (i == 9) continue;
            C[index] = i;
            index++;
        }

        Set A = new Set(a, s);
        System.out.println(Arrays.toString(A.complement()));
    }
}