package LinkedAndArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListImpl {
    public static  void main(String [] args){
        ArrayList<String> al= new ArrayList<String>();
        al.add("string1");
        al.add("string2");
        System.out.print(al);
        al.get(0);
        al.set(0,"updatedstring1");
        al.remove(1);
        al.clear();
        al.size();
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        Collections.sort(al);

}
}
