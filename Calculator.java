package week1.day2;

public class Calculator {

	public int add(int add1, int add2)
	{
		int add3 = add1 + add2;
		return add3;
	}
	private double sub(double sub1, double sub2) {
		// TODO Auto-generated method stub
		double sub3 = sub1 - sub2;
		return sub3;
	}
	private double multiply(double multiply1, double multiply2) {
		// TODO Auto-generated method stub
		double multiply3 = multiply1 * multiply2;
		return multiply3;
	}
	private int div(int div1, int div2) {
		// TODO Auto-generated method stub
		int div3 = div1 / div2;
		return div3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cac = new Calculator();
		System.out.println(cac.add(5, 7));
		System.out.println(cac.sub(7.5, 8.5));
		System.out.println(cac.multiply(9.2, 4));
		System.out.println(cac.div(12, 9));			
	}

}
