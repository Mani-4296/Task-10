package task.guvi;

import java.util.Scanner;

public class Tea {
	
	private boolean milkAdded;
    private boolean sugarAdded;
    
    public Tea() {
    	this.milkAdded = false;
    	this.sugarAdded = false;
    }
    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves...");
    }
    public void addMilk() {
    	if(!milkAdded) {
    		System.out.println("Milk added to basic tea");
    		milkAdded =true;
    	}else {
    		System.out.println("Milk already added to basic tea");
    	}
    }
    public void addSugar() {
    	if(!sugarAdded) {
    		System.out.println("Sugar Added to basic tea");
    		sugarAdded = true;
    	}else {
    		System.out.println("Sugar already added to basic tea");
    	}
    }   	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want milk to be added on tea? (True or False) ");
		boolean milk = Boolean.parseBoolean(input.nextLine());
		System.out.println("Do you want sugar to be added on tea ? (True or False) ");
		boolean sugar = Boolean.parseBoolean(input.nextLine());
		input.close();
		Tea tea = new Tea();
		tea.prepareTea();
		if(milk) {
		tea.addMilk();
		}else {
			System.out.println("Milk already added to basic tea");
		}
		if(sugar) {
		tea.addSugar();
     	}else {
     		System.out.println("Sugar already added to basic tea");
     	}
}
}