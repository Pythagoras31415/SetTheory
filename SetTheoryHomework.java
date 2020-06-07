// @Author: Pythagoras314

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

        int[] b = new int[11];
        index = 0;

        for(int i = 0; i <= 20; i += 2){
            b[index] = i;
            index ++;
        }

        int[] c = new int[5];
        index = 1;
        c[0] = 2;

        for(int i = 3; i <= 11; i += 2){
            if (i == 9) continue;
            c[index] = i;
            index++;
        }

        Set A = new Set(a, s);
        Set B = new Set(b, s);
        Set C = new Set(c, s);
        Set S = new Set(s, s);

        System.out.println("Dados los siguientes conjuntos: ");
        System.out.println("El conjunto universo: " + Arrays.toString(S.set));
        System.out.println("A: " + Arrays.toString(A.set));
        System.out.println("B: " + Arrays.toString(B.set));
        System.out.println("C: " + Arrays.toString(C.set));
        System.out.println("Encontrar: \n");
        System.out.println("1. Complemento de A intersección complemento de B");
        System.out.println(Arrays.toString(A.complement().intersection(B.complement()).set) + "\n");
        System.out.println("2. Intersección de los complementos de A y B, unión con C");
        System.out.println(Arrays.toString(C.union(A.complement().intersection(B.complement())).set) + "\n");
        System.out.println("3. A menos la intersección de B con C");
        System.out.println(Arrays.toString(A.subtract(B.intersection(C)).set) + "\n");
        System.out.println("4. El complemento de B menos C, menos A");
        System.out.println(Arrays.toString(new Set(B.subtract(C).set, S.set).complement().subtract(A).set) + "\n");
        System.out.println("5. El complemento de A menos C, intersección B");
        System.out.println(Arrays.toString(new Set(A.subtract(C).set, S.set).complement().intersection(B).set) + "\n");
    }
}