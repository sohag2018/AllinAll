package interviewCoddingQ;

import java.util.Iterator;
import java.util.Stack;

//The stack is the subclass of Vector. It implements the last-in-first-out data structure, i.e., Stack. 
//The stack contains all of the methods of Vector class and also provides its methods like boolean push(),
//boolean peek(), boolean push(object o), which defines its properties.

public class StackClass {

	public static void main(String[] args) {
		Stack<String>st=new Stack<>();
		st.push("Sohag");
		st.add("Sharif");
		
		Iterator it=st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
