package collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
      HashSet<String> colors = new HashSet<String>();
    
      colors.add("red"); 
      colors.add("yeloow"); 
      colors.add("green"); 
      colors.add("pink");
      try {
		FileWriter writer = new FileWriter("note",true);
	
		for(String color : colors) {
			writer.write(color+ "\n");
	      }
		 writer.close();
	} catch (IOException e) {
		
		System.out.println("writig error "+ e.getMessage());
	}
      
      for(String color : colors) {
    	  System.out.println(color);
      }
      System.out.println("-------");
      colors.add("pink");
      for(String color : colors) {
    	  System.out.println(color);
      }
      System.out.println("-------");
      System.out.println( colors.contains("red"));
      System.out.println("-------");
      System.out.println(colors.size());
      
      
	 
	
	
	}
}