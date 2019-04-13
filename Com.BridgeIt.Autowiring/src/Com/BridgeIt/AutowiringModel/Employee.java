package Com.BridgeIt.AutowiringModel;

public class Employee {
private Address address;

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}
public void showAddress() {
	System.out.println("Addresss of employee"+address);
}

@Override
public String toString() {
	return "Employee [address=" + address + "]";
}

}
