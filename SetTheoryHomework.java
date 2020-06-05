import java.util.*;

class SetTheoryHomework{
    public static void main(String[] args) {
        int[] S = new int[21];

        for(int i = 0; i <= 20; i++){
            S[i] = i;
        }

        int index = 0;
        int[] A = new int[11];

        for(int i = 2; i < 16; i++){
            if (i == 3 || i == 10 || i == 14) continue;
            A[index] = i;
            index++;
        }

        int[] B = new int[11];
        index = 0;

        for(int i = 0; i <= 20; i += 2){
            B[index] = i;
            index ++;
        }
        System.out.println(Arrays.toString(B));

        int[] C = new int[5];
        index = 1;
        C[0] = 2;

        for(int i = 3; i <= 11; i += 2){
            if (i == 9) continue;
            C[index] = i;
            index++;
        }
    }
}

class Set{
    int[] set, Universe;
    int length;

    Set(int[] set, int[] Universe){
        this.set = set;
        this.Universe = Universe;
        length = set.length;
    }

    int[] complement(){
        ArrayList <Integer> aux = new ArrayList <Integer> ();

        for(int i : Universe){
            if (!(has(i))) aux.add(i);
        }
        return aux.toArray();
    }

    boolean has(int e){
        for (int i : set){
            if (i == e) return true;
        }
        return false;
    }

    private boolean has(int e, int[] anonSet){
        for (int i : anonSet){
            if (i == e) return true;
        }
        return false;
    }
}