package ca.ualberta.cs.ejlo.todolistforandroid.test;

import junit.framework.TestCase;
import ca.ualberta.cs.ejlo.todolistforandroid.ToDoItem;

public class ToDoTest extends TestCase {
	
	public void testToDo(){
		String testString = ("Get milk");
		ToDoItem item1 = new ToDoItem(testString);	
		assertTrue("Item text is not testString", testString == item1.getText());
		assertTrue("Item text.toString is not equal", item1.toString().equals(item1.getText()));
	}
	
	public void testToDoEquality(){
		String ToDoName = "Get rekt";
		String ToDoNameC = "Get shrekt";
		ToDoItem A = new ToDoItem(ToDoName);
		ToDoItem B = new ToDoItem(ToDoName);
		ToDoItem C = new ToDoItem(ToDoNameC);
		assertTrue("ToDoA is not equal ToDoB", A.equals(B));
		assertTrue("ToDoB is not equal ToDoA", B.equals(A));
		assertFalse("ToDoA is equal ToDoC", A.equals(C));
		assertFalse("ToDoB is equal ToDoC", B.equals(C));
		assertTrue("ToDoA is not equal ToDoA", A.equals(A));
	}
	
}

