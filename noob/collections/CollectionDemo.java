import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class CollectionDemo{
    public static void main(String args[]){
        Collection values = new ArrayList();
        values.add(11);
        values.add(22);
        values.add(33);

        Iterator it = values.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}