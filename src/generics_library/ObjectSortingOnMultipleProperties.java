package generics_library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// This class is used to sort the object on mutiple properties
class Student1 implements Comparable{
	
	 private String name;
	 private int age;
	 private int id;
	
	public Student1(String name, int age, int id){
		
		this.name= name;
		this.age=age;
		this.id= id;
	}

	public int compareTo(Object o) {
		
		Student1 rv1 = (Student1) o;
		
		return this.age-rv1.age;
	}
	
	
	public String getName(){
		
		return name;
	}
    public int getAge(){
		
		return age;
	}
    public int getId(){
	
	return id;
    }
}
class NameCompare implements Comparator<Student1>{

	public int compare(Student1 s1, Student1 s2) {
		
		 return s1.getName().compareTo(s2.getName());
	}

}

class IdCompare implements Comparator<Student1>{

	public int compare(Student1 s1, Student1 s2) {
		
		if(s1.getId()>s2.getId()){ return 1;}
		else if(s1.getId()<s2.getId()){ return -1;}
		else{ return 0;}
	}

}


public class ObjectSortingOnMultipleProperties {

	public static void main(String[] args) {
       List<Student1> l1 = new ArrayList<Student1>();
		
		l1.add(new Student1("Kalyan",23,5019));
		l1.add(new Student1("Chakri",24,5008));
		l1.add(new Student1("Chintu",26,2012));
		
        Collections.sort(l1,new NameCompare());
        
        for(Student1 s3 : l1){
        	
            System.out.println(s3.getAge()+"..."+s3.getName()+"..."+s3.getId());
             	
        }
        
		
        System.out.println("******************");
        
        Collections.sort(l1,new IdCompare());
        
        for(Student1 s3 : l1){
        	
            System.out.println(s3.getAge()+"..."+s3.getName()+"..."+s3.getId());
             	
        }
        
	}

}
