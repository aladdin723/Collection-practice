package collections;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("ala", "IT", 5000));
		emp.add(new Employee("tawba", "IT", 5000));
		emp.add(new Employee("ali", "AT", 1000));
		emp.add(new Employee("omar", "AT", 5000));
		emp.add(new Employee("assil", "BT", 3000));
		emp.add(new Employee("israa", "BT", 2000));
		emp.add(new Employee("taym", "BT", 4000));

		try {
			FileWriter writer = new FileWriter("Employee3.txt", true);
			writer.write(emp.toString() + "\n");
			writer.close();
		} catch (IOException e) {

			System.out.println("writing error " + e.getMessage());
		}

		ArrayList<String> emp2 = new ArrayList<>();

		try {
			File file = new File("Employee3.txt");
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				
				emp2.add(reader.nextLine());

			}
			reader.close();

		} catch (Exception e) {
			System.out.println("reading error " + e.getMessage());
		}
	         System.out.println(emp2);
	        
	         
	         List<Employee> employees = (List<Employee>) emp2.stream()
	        		 .map(line->{
	        			 String parts[] = line.split(",");
	        			 String name = parts[0];
	        			 String department = parts[1];
	        			 double salary = Double.parseDouble(parts[2]);
	        			 return new Employee(name,department,salary);
	        		 }
	        		 )
	        		 .collect(Collectors.toList());
	         
	         System.out.println(employees);
	        		  
	        		 List<String> resualt = employees.stream()
	        				 .filter(p->p.getSalary()>3000)
	        				 .sorted((a,b)->Double.compare(b.getSalary(), a.getSalary()))
	        				 .map(e->e.getName())
	        				 .collect(Collectors.toList());
	        		 
	        		 double totalSalary = employees.stream()
	        			 
	        				.map(d->d.getSalary())
	        				.reduce(0.0,(total,current)->total+current);
	        		 
	        		        System.out.println(totalSalary);
	        		        
	        		 Optional<Employee> higestsalary = employees.stream()
	        				 
	        				 .max((a,b)->Double.compare(a.getSalary(),b.getSalary()));
	        		          System.out.println(higestsalary);
	        		          
	        		  boolean allSalary = employees.stream()
	        				  .allMatch(p->p.getSalary()>=1000);
	        		  System.out.println(allSalary);
	        				 
	        		  
	        		  List<String> uniqueDepartment = employees.stream()
	        				  .map(d->d.getDepartment())
	        				  .distinct()
	        				  .collect(Collectors.toList());
	        		  
	        		  double count = employees.stream()
	        				  .filter(p->p.getDepartment().equals("IT"))
	        				  .count();
	        		  System.out.println(count);
	        				
	        				
	        		 
              
	        
	}

}