package CH07.designpatterns.collections.iterator_builtin;

import java.util.ArrayList;
import java.util.Iterator;

public class NetProtect implements Menu {
	ArrayList<String> menuItems;
 
	public NetProtect() {
		menuItems = new ArrayList<String>();
    
		addItem("Alcatel");
		addItem("/configure filter match-list port-list \"udp-base-ports\" create port 17");
		addItem("/configure filter match-list port-list \"udp-base-ports\" create port 19");
		addItem("/configure filter match-list port-list \"udp-base-ports\" create port 80");
		addItem("/configure filter match-list port-list \"udp-base-ports\" create port 111");
		addItem("/configure filter match-list port-list \"udp-base-ports\" create port 520");
		addItem("/configure filter match-list port-list \"udp-base-ports\" create port 1900");
		addItem("/configure filter match-list port-list \"udp-base-ports\" create port 20005");
		addItem("/configure filter match-list port-list \"tcp-base-ports\" create port 17");
		addItem("/configure filter match-list port-list \"tcp-base-ports\" create port 2700");
		addItem(" ");
		addItem("/configure filter ip-filter 301 create description \"Alex_Passion_of_the_Mattress_Network_Protect\"");
		addItem("/configure filter ip-filter 301 scope exclusive");
		addItem("/configure filter ip-filter 301 entry 10 create description \"block-udp-base\"");
		addItem("/configure filter ip-filter 301 entry 10 match protocol udp port port-list \"udp-base-ports\"");
		addItem("/configure filter ip-filter 301 entry 10 action drop");
		addItem("/configure filter ip-filter 301 entry 20 create description \"block-tcp-base\"");
		addItem("/configure filter ip-filter 301 entry 20 match protocol tcp port port-list \"tcp-base-ports\"");
		addItem("/configure filter ip-filter 301 entry 20 action drop");
		addItem("/configure filter ip-filter 301 entry 100 create match");
		addItem("/configure filter ip-filter 301 entry 100 action forward");
		addItem("exit");
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
		return "network protection list";
	}

	// other menu methods here
}
