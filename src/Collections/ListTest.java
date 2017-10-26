package Collections;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
import java.util.function.Consumer;

public class ListTest {
    public static void main(String[] args) {
        // write your code here

        // List (abstract concept)
        List<String> a = new LinkedList<String>();
        for (int i = 0; i<50; i++) {
            a.add(i, "toto");
        }
        Iterator it = a.listIterator();
        while (it.hasNext()){
           String o = it.next().toString();
           System.out.print(o);
        }


        // declaring an ArrayList
        ArrayList<String> x = new ArrayList<String>();
        //Collections.fill(x,"test text");
        for (int i = 0; i<50; i++) {
            x.add(i, "texto");
        }
        x.get(1).charAt(1);
        // Foreach loop
        for (String k:x) {
            k.charAt(1);
            System.out.print(k + "\n");
        }

        // using the iterator
        Iterator it2 = x.listIterator();
        while (it2.hasNext()){
            System.out.print(it2.next());
        }

        Collections.sort(x);

    }
}