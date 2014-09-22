package ca.ualberta.cs.ejlo.todolistforandroid.test;

import junit.framework.TestCase;
import ca.ualberta.cs.ejlo.todolistforandroid.ToDoItem;

public class ToDoTest extends TestCase {
	
	public void testToDo(){
		String testString = ("Get milk");
		ToDoItem item1 = new ToDoItem(testString);	
		assertTrue("Item text is not testString", testString == item1.getText());
	}

}

