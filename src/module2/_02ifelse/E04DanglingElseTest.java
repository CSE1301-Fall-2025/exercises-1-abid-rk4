package module2._02ifelse;

public class E04DanglingElseTest {
	//Example 4: The indentation is misleading! Run this code
	//and see that it does not work properly. Add {} to the code
	//so that it does function properly.
	public static void main(String[] args) {
		boolean sunny = false;
		boolean hot = true;
		if (sunny){
			System.out.println("Stay home");
		}
			
		else{ // Which if is else attached to??
			System.out.println("Bring your umbrella!");
		}
		if (hot){
				System.out.println("Head for the beach!");
			}
	}
}
