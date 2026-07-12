package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Main {


	
	public static void main(String[] args) {
		
		ArrayList<Persone> list = new ArrayList<Persone>();
		
		list.add(new Persone("ala",21));
		list.add(new Persone("asil",22));
		list.add(new Persone("tawba",23));
		list.add(new Persone("ala",24));
		list.add(new Persone("oussama",25));
		
		for(Persone persone : list) {
			System.out.print(persone+"\n");
		}
		Comparator<Persone> com =(a,b)->b.getAge()-a.getAge();
		
		list.sort(com);
		System.out.print("-------------\n");
		
		for(Persone persone : list) {
			System.out.println(persone);
		}
	}
}