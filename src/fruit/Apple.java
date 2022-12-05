package fruit;

public class Apple {
	int price;
	int grade;
	boolean clean;
	
	public void wash() {
		clean = true;
	}
	
	public void ate() {
		price -= 800;
	}
}
