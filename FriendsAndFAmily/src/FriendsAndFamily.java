import java.util.Scanner;
public class FriendsAndFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		do
		{
			System.out.println("\n Enter List Price:");
			double listPrice=input.nextDouble();
			System.out.println("Enter discount % : ");
			int discount=input.nextInt();
			System.out.printf("You will pay only $%2.2f",listPrice-listPrice*discount/100);
			
		}
		while(true);
	}

}
