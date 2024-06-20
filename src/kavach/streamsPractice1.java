package kavach;

import java.util.ArrayList;

public class streamsPractice1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhishek");
		names.add("himanshu");
		names.add("gagan");
		names.add("adams");
		names.add("arjun");
		int count =0;
		for(int i=0;i<names.size();i++) {
			String actual =names.get(i);
			if(actual.startsWith("a")) {
				count++;
			}
			System.out.println(count);
			
		}
		
		
		
		
		
	}

}
