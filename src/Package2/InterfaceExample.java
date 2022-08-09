package Package2;

interface WaterBottle {
	String color = "blue";

	void fillup();
}

public class InterfaceExample implements WaterBottle {
	
	public static void main(String[] args) {
		InterfaceExample M= new InterfaceExample();
		M.fillup();
	}

	@Override
	public void fillup() {
			
	}
}
