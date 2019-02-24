import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class ListDemo{
    public static void main(String args[]){
        List values = new ArrayList();
        values.add(11);
        values.add(33);
        values.add(44);
        values.add(1, 22);

        for(int i=0; i<values.size(); i++){
            System.out.println(values.get(i));
        }

        for(Object o : values){
            System.out.println(o);
        }
    }
}