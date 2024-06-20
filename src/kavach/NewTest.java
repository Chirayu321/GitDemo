package kavach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class NewTest {
 // @Test
  public void f() {
	  
	  ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("himanshu");
		names.add("gagan");
		names.add("Adams");
		names.add("Arjun");
		int count =0;
		for(int i=0;i<names.size();i++) {
			String actual =names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
			System.out.println(count);
			
		}
  }
 // @Test
  public void streams() {
	  ArrayList<String> names = new ArrayList<String>();
	  names.add("Abhishek");
		names.add("himanshu");
		names.add("gagan");
		names.add("Adams");
		names.add("Arjun");
	  
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
  }
  
  
  //@Test
  public void printNames() {
	  ArrayList<String> names = new ArrayList<String>();
	  names.add("Abhishek");
		names.add("himanshu");
		names.add("gagan");
		names.add("Adams");
		names.add("Arjun");
  
		names.stream().filter(s->s.length()>3).forEach(s->System.out.println(s));

  }
  @Test
  public void maps() {
	  List<String> names = Arrays.asList("Abhishek","himanshu","gagan","Adams","Arjun");
	  names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
}
