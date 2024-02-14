package task.guvi;

public class HerbalTea extends Tea{
	
	public void prepareTea() {
		System.out.println("Preparing herbal tea with hot water and herbal leaves");
	}

	public static void main(String[] args) {
		HerbalTea tea = new HerbalTea();
		tea.prepareTea();	
	}

}
