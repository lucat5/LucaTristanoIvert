import java.util.*;

public class Esercizio4 {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(8,6,4,9,2);
        System.out.println("Il numero minimo è "+ Collections.min(list));
        System.out.println("Il numero Massimo è "+ Collections.max(list));

        int sum= list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("La somma è "+sum+" ");

        double avg= list.stream().mapToInt(a -> a).average().orElse(0);
        System.out.println("La media è "+avg+" ");

        list.sort(Comparator.naturalOrder());
        System.out.println("La lista ordinata è "+list);
    }
}
