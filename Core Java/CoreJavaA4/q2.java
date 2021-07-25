package CoreJavaA4;

import java.util.ArrayList;

@FunctionalInterface
interface satisfied{
	public ArrayList<q2> getList(ArrayList<q2> ord);
}

public class q2 {
	private int totalPrice;
    private String status;
    

    public q2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Solution_02 [totalPrice=" + totalPrice + ", status=" + status + "]";
	}
	public static ArrayList<q2> listOfOrders(ArrayList<q2> orders) {
    	satisfied st = (list)->{
    		ArrayList<q2> list2 = new ArrayList<>();
    		for(q2 ob: list) {
    			if((ob.getTotalPrice() > 10000) && (ob.getStatus().equals("ACCEPTED") || ob.getStatus().equals("COMPLETED") )) {
    				list2.add(ob);
    			}
    		}
    		return list2;
    		};
    	
    	ArrayList<q2> lis = st.getList(orders);
    	
    	return lis;
    }
	
    public static void main(String[] args) {
    	q2 od1 = new q2(10020,"ACCEPTED");
    	q2 od2 = new q2(8000,"COMPLETED");
    	q2 od3 = new q2(12000,"ACCEPTED");
    	q2 od4 = new q2(120,"ACCEPTED");
    	q2 od5 = new q2(60000,"COMPLETED");
    	q2 od6 = new q2(1230,"ACCEPTED");
    	q2 od7 = new q2(10002,"ACCEPTED");
    	q2 od8 = new q2(11000,"PROCESSING");
    	
    	ArrayList<q2> ords = new ArrayList<q2>();
    	ords.add(od1);
    	ords.add(od2);
    	ords.add(od3);
    	ords.add(od4);
    	ords.add(od5);
    	ords.add(od6);
    	ords.add(od7);
    	ords.add(od8);
    	
    	ArrayList<q2> ords2 = listOfOrders(ords);
    	for(q2 ob : ords2) {
    		System.out.println(ob);
    	}
    }

}
