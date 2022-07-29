
public class Dish {
	public String dishName;
	public int price;
	public Boolean isAvailable;
	
	public Dish(String dishName, int B) {
		this.dishName=dishName;
		this.price=B;
		this.isAvailable= true;
	}
	
	public void removeDish(String dishName) {
		
		if (dishName == null){
			throw new IllegalArgumentException();
		}
		else if((this.dishName.equalsIgnoreCase(dishName)) && (dishName != null)) {
			isAvailable = false;
		}

	}
}
