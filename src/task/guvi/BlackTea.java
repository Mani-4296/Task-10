package task.guvi;

public class BlackTea extends Tea {

	public void prepareTea() {
		System.out.println("Preparing black tea with hot water, black tea leaves, sugar");
	}
	public static void main(String[] args) {
		BlackTea Tea = new BlackTea();
		Tea.prepareTea();		
	}
}
