package shaista.develop.demo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionJava {
	private List addressList;
	private Set addressSet;
	private Map addressMap;
	private Properties addressProp; // ctrl shft o to import
	public List getAddressList() {
		System.out.println("List: " +addressList);
		return addressList;
	}
	public void setAddressList(List addressList) {
		
		this.addressList = addressList;
	}
	public Set getAddressSet() {
		System.out.println("Set: " +addressSet);
		return addressSet;
	}
	public void setAddressSet(Set addressSet) {
		this.addressSet = addressSet;
	}
	public Map getAddressMap() {
		System.out.println("Map: " +addressMap);
		return addressMap;
	}
	public void setAddressMap(Map addressMap) {
		this.addressMap = addressMap;
	}
	public Properties getAddressProp() {
		return addressProp;
	}
	public void setAddressProp(Properties addressProp) {
		System.out.println("Prop: " +addressProp);
		this.addressProp = addressProp;
	}
	
	

}
