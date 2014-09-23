package ca.ualberta.cs.ejlo.todolistforandroid.test;

import java.util.Collection;

import ca.ualberta.cs.ejlo.todolistforandroid.ToDoList;
import ca.ualberta.cs.ejlo.todolistforandroid.ToDoItem;

import junit.framework.TestCase;

public class ToDoListTest extends TestCase {

	public void testEmptyToDoList(){
		ToDoList toDoList = new ToDoList();
		Collection<ToDoItem> toDoItems = toDoList.getToDoItems();
		assertTrue("Empty to do list", toDoItems.size() == 0);	
	}
	
	public void testAddToDoItem(){
		ToDoList toDoList = new ToDoList();
		String testText = "Get gundam";
		ToDoItem testItem = new ToDoItem(testText);
		toDoList.addItem(testItem);
		Collection<ToDoItem> toDoItems = toDoList.getToDoItems();
		assertTrue("To do list size", toDoItems.size() == 1);
		assertTrue("To do does not contain test item", toDoItems.contains(testItem));
	}
	
	public void testRemoveToDoItem(){
		ToDoList toDoList = new ToDoList();
		String testText = "Get gundam";
		ToDoItem testItem = new ToDoItem(testText);
		toDoList.addItem(testItem);
		toDoList.removeItem(testItem);
		Collection<ToDoItem> toDoItems = toDoList.getToDoItems();
		assertTrue("To do list size", toDoItems.size() == 0);
		assertFalse("To do still contains test item", toDoItems.contains(testItem));
	}
	
	public void testPopToDoItem(){
		ToDoList toDoList = new ToDoList();
		String testText = "Get gundam";
		ToDoItem testItem = new ToDoItem(testText);
		toDoList.addItem(testItem);
		ToDoItem tempItem = toDoList.popItem(testItem);
		Collection<ToDoItem> toDoItems = toDoList.getToDoItems();
		assertTrue("To do list size", toDoItems.size() == 0);
		assertTrue("To do still contains test item", tempItem == testItem);
	}
	
	//Remember to test for corner cases, like trying to remove something that does not exist
	
}
