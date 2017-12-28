package CH07.designpatterns.collections.iterator_builtin;

import java.util.ArrayList;
import java.util.Iterator;

public class Prefixlist implements Menu {
	ArrayList<String> menuItems;
 
	public Prefixlist() {
		menuItems = new ArrayList<String>();
    
		addItem("10.10.10.0/24");
		addItem("10.10.20.0/24");
		addItem("10.10.30.0/24");
		addItem("10.10.40.0/24");
	}

	public void addItem(String name)
	{
		menuItems.add(name);
	}
 
	public ArrayList<String> getMenuItems() {
		return menuItems;
	}
  
	public Iterator<String> createIterator() {
		return menuItems.iterator();
	}
  
	public String toString() {
		return "customer prefix list";
	}

	// other menu methods here
}
