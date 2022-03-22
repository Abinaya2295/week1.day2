package week1.day2;


public class Calculator1 {

	private int add(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		return num1 + num2 + num3;
	}
	private int sub(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}
	private double mul(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}
	private float div(float num1, float num2) {
		// TODO Auto-generated method stub
		return num1 / num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator1 cal = new Calculator1();
		System.out.println(cal.add(8, 11, 65));
		System.out.println(cal.sub(8, 3));
		System.out.println(cal.mul(8.9, 15.2));
		System.out.println(cal.div(6.7F, 5F));
	}

}
