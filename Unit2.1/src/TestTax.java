
public class TestTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NJTax t = new NJTax(); // creating an instance of Tax
		
		t.grossIncome=80000;
		t.dependents=2;
		t.state="NJ";
		
		double yourTax = t.calcTax(); // calc Tax
		
		// print result
		
		System.out.println("Your tax is " + yourTax);

	}

}
