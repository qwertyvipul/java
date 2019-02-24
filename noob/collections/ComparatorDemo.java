import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.Comparator;

class ComparatorDemo{
    public static void main(String args[]){
        List<Integer> values = new ArrayList();
        values.add(123);
        values.add(331);
        values.add(442);
        values.add(220);

        Comparator<Integer> c = new Comparator<Integer>(){
            public int compare(Integer i, Integer j){
                return (i%10 > j%10)?1:-1;
            }
        };

        Collections.sort(values, c);

        for(Integer val : values){
            System.out.println(val);
        }
    }
}