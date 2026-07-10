package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {


	
	public static void main(String[] args) {
		
		Pairs<String, Integer> list =  new Pairs<>();
		
		list.setItems1("ala");
		list.setItems2(21);
		
		System.out.println(list.getItems1()+" is "+ list.getItems2());
		System.out.println("using get first "+ list.getFirst());
		System.out.println("using get second "+ list.getSecond());

		
	
	}
}