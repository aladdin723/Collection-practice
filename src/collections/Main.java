package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


	
	public static void main(String[] args) {
		
		ArrayList<Persone> list = new ArrayList<Persone>();
		
		list.add(new Persone("ala",21));
		list.add(new Persone("asil",22));
		list.add(new Persone("tawba",23));
		list.add(new Persone("ala",24));
		list.add(new Persone("oussama",25));
		
		
		int totalAges = list.stream()
		.map(p->p.getAge())
        .reduce(0,(sum,age)->sum+age);
         System.out.println(totalAges);
         
        Optional<Persone> oldestPersone = list.stream()
        		.max((a,b)->a.getAge()-b.getAge());
        		System.out.println(oldestPersone);
        		
        boolean anyone =list.stream()
        		.anyMatch(p->p.getAge()>=21);
        System.out.println(anyone);
        	
        		
        		
        
	}
	    
}