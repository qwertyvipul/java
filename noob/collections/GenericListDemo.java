import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class GenericListDemo{
    public static void main(String args[]){
        List<Integer> values = new ArrayList<>();
        values.add(11);
        values.add(33);
        values.add(44);
        values.add(1, 22);

        for(Integer val : values){
            System.out.println(val);
        }
    }
}