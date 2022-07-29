
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("My First Java Program");
	}

	
	public static int findMax(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(max <arr[i])
				max= arr[i];
		}
		return max;
	}
}
