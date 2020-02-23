package ºØ∫œ¿‡;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> tr = new TreeSet<String>();
        tr.add("one");
        tr.add("two");
        tr.add("three");
        Iterator<String> it = tr.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
