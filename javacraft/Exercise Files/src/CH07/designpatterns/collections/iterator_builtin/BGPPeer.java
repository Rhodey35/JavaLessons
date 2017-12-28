package CH07.designpatterns.collections.iterator_builtin;

import java.util.ArrayList;
import java.util.Iterator;

public class BGPPeer implements Menu {
	ArrayList<String> menuItems;
 
	public BGPPeer() {
		menuItems = new ArrayList<String>();
    
		addItem("/configure router policy-options abort");
		addItem("/configure router policy-options begin");
		addItem("/configure router policy-options prefix-list peer-$TUN1_BGP_WAN_CPE_SIDE$ prefix $PROTECTED_SUBNETS$ longer");
		addItem("/configure router policy-options commit");
		   
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
		return "BGP peer list ";
	}

	// other menu methods here
}
