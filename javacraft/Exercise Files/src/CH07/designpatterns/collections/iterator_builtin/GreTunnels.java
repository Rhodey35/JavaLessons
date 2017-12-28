package CH07.designpatterns.collections.iterator_builtin;

import java.util.ArrayList;
import java.util.Iterator;

public class GreTunnels implements Menu {
	ArrayList<String> menuItems;
 
	public GreTunnels() {
		menuItems = new ArrayList<String>();
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" tunnel create");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" description \"$CUSTOMER_NAME$ | $BAN$ | $PID$ | $TUNNEL_DESIGNATION$\"");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" address $TUN1_BGP_WAN_LV3_SIDE$/30");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ create");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ingress filter ip 25");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ egress qos $QOS_ID$");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ egress filter ip $TUN10_GRE_FILTER$");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ip-tunnel \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" create");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ip-tunnel \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" dest-ip $TUN1_BGP_WAN_CPE_SIDE$");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ip-tunnel \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" gre-header");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ip-tunnel \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" source $LEVEL3_SOURCE_IP$");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ip-tunnel \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" remote-ip $CUSTOMER_WAN_IP$");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ip-tunnel \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" delivery-service 3356");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ip-tunnel \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" clear-df-bit");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ip-tunnel \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" ip-mtu 1476");
		addItem("/configure service vprn 25 interface \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" sap tunnel-1.private:$SOURCE_LAST_OCTET$ ip-tunnel \"gre-$TUN1_BGP_WAN_CPE_SIDE$\" no shutdown");
		addItem("/configure filter match-list ip-prefix-list \"customer-gre\" create prefix $CUSTOMER_WAN_IP$/32");

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
		return "GRE tunnel list ";
	}

	// other menu methods here
}
