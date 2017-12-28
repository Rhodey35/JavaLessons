package CH07.designpatterns.collections.iterator_builtin;

import java.util.*;

public class Cafe {

	public static void main(String args[]) {
		//PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		//DinerMenu dinerMenu = new DinerMenu();
		BGPPeer bgplist = new BGPPeer();
		NetProtect netprotect = new NetProtect();
		GreTunnels grelist = new GreTunnels();
		Prefixlist prefixlist = new Prefixlist();
		
		// with iterators
		//Iterator<String> pancakeIterator = pancakeHouseMenu.createIterator();
		//Iterator<String>  dinerIterator = dinerMenu.createIterator();
		Iterator<String> bgplistIterator = bgplist.createIterator();
		Iterator<String> netprotectIterator = netprotect.createIterator();
		Iterator<String> gretunnelsIterator = grelist.createIterator();
		Iterator<String> prefixlistIterator = prefixlist.createIterator();

		//System.out.println("\nMENU (with iterators)\n----\nBREAKFAST");
		//printMenu(pancakeIterator);
		
		//System.out.println("\nLUNCH");
		//printMenu(dinerIterator); 

		System.out.println("\ncustomer BGP list");
		printMenu(bgplistIterator); 

		System.out.println("\ncustomer NetProtect list");
		printMenu(netprotectIterator); 
		
		System.out.println("\ncustomer GRE list");
		printMenu(gretunnelsIterator); 
		
		System.out.println("\ncustomer prefix list");
		printMenu(prefixlistIterator); 
		
	}
 
	private static void printMenu(Iterator<String> iterator) {
		while (iterator.hasNext()) {
			String menuItem = (String)iterator.next();
			System.out.println(menuItem);

		}
	}
}
