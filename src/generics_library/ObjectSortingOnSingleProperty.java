package generics_library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//This class is used to sort the object on single property
class Student implements Comparable{
	
	 private String name;
	 private int age;
	 private int id;
	
	public Student(String name, int age, int id){
		
		this.name= name;
		this.age=age;
		this.id= id;
	}

	public int compareTo(Object o) {
		
		Student rv1 = (Student) o;
		
		return this.name.compareTo(rv1.name);
	}
	
//public int compareTo(Object o) {
//		
//		Student rv1 = (Student) o;
//		
//		return this.age-rv1.age;
//	}
	
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

public class ObjectSortingOnSingleProperty {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		List<Student> l1 = new ArrayList<Student>();
		
		l1.add(new Student("Kalyan",26,5019));
		l1.add(new Student("Chakri",24,5008));
		l1.add(new Student("Chintu",23,2012));
		
        Collections.sort(l1);
 
        for(Student s1 : l1){
        	
       System.out.println(s1.getAge()+"..."+s1.getName()+"..."+s1.getId());
        	
        }
 
	}

}
