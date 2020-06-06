import java.util.*;

public class Set {
    int[] set, Universe;
    int length;

    Set(int[] set, int[] Universe){
        this.set = set;
        this.Universe = Universe;
        this.length = set.length;
    }

    private boolean has(int e, int[] otherSet){
        for (int i : otherSet){
            if (i == e) return true;
        }
        return false;
    }

    boolean has(int e){
        for (int i : set){
            if (i == e) return true;
        }
        return false;
    }

    Set complement(){
        ArrayList <Integer> aux = new ArrayList <Integer> ();
        int[] complement;

        for(int i : Universe){
            if (!(has(i))) aux.add(i);
        }
        complement = new int[aux.size()];

        for (int i = 0; i < complement.length; i++){
            complement[i] = aux.get(i);
        }
        return new Set(complement, Universe);
    }

    Set subtract(Set a){
        ArrayList <Integer> aux = new ArrayList <Integer> ();
        int[] res;

        for (int i : set){
            if (!(has(i, a.set))) aux.add(i);
        }
        res = new int[aux.size()];

        for(int i = 0; i < res.length; i++){
            res[i] = aux.get(i);
        }
        return new Set(res, Universe);
    }

    Set intersection(int[] anotherSet){
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
        return new Set(intersection, Universe);
    }

    Set union(Set a){
        ArrayList <Integer> aux = new ArrayList <Integer> ();
        int[] res;

        for (int i = 0; i < set.length; i++){
            if (!(aux.contains(set[i]))) aux.add(set[i]);
            if (!(aux.contains(a.set[i]))) aux.add(a.set[i]);
        }
        
        res = new int[aux.size()];

        for (int i = 0; i < aux.size(); i++){
            res[i] = aux.get(i);
        }

        Arrays.sort(res);
        return new Set(res, Universe);
    }
}