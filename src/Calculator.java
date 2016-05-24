
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int add(String str) {
		int number = 0;
		if (str.length() == 0) {
			number = 0;
		}
		if (str.length() == 1){
			number=Integer.parseInt(str);
		}
		return number;
	}
}
