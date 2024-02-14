package task.guvi;

public class GreenTea extends Tea{
	
	public void prepareTea() {
		System.out.println("Preparing green tea with hot water and Green tea leaves");
	}

	public static void main(String[] args) {
		GreenTea tea = new GreenTea();
		tea.prepareTea();

	}

}
