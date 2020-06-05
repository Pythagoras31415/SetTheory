import java.util.*;

public class Set {
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
        
        int[] complement = new int[aux.size()];
        for (int i = 0; i < complement.length; i++){
            complement[i] = aux.get(i);
        }
        return complement;
    }

    boolean has(int e){
        for (int i : set){
            if (i == e) return true;
        }
        return false;
    }

    private boolean has(int e, int[] otherSet){
        for (int i : otherSet){
            if (i == e) return true;
        }
        return false;
    }

    int[] intersection(int[] anotherSet){
        int[] max, other, intersection;
        ArrayList <Integer> inter = new ArrayList <Integer> ();

        if (anotherSet.length >= set.length){ 
            max = anotherSet;
            other = set;
        }
        else {
            max = set;
            other = anotherSet;
        }

        for(int i : max){
            if (has(i, other)) inter.add(i);
        }
        
        intersection = new int[inter.size()];

        for (int i = 0; i < intersection.length; i++){
            intersection[i] = inter.get(i);
        }
        return intersection;
    }
}