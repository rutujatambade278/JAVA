package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListProgram {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Eat");
        list.add("Coffee");
        list.add("Code");
        list.add("Sleep");
        list.add("Repeat");

        // Synchronize the list
        list = Collections.synchronizedList(list);

        // Synchronized block to iterate over the synchronized list
        synchronized(list) {
            Iterator<String> itr = list.iterator();
            while(itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }
}
