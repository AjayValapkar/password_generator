package passwordgenerator.operation;

import java.util.Scanner;

public class passwordoptions{
	passwordInterface genaratePassowrd= new Password();

	public passwordoptions() {
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				String choice = options(sc);
				switch (choice) {
				case "C": {
					System.out.println("Enter the Length Of Password :");
					int length= sc.nextInt();
					System.out.println(genaratePassowrd.generateCharPassword(length));
					break;
				}
				case "N": {
					System.out.println("Enter The Length OF Password :");
					int length= sc.nextInt();
					System.out.println(genaratePassowrd.generateNumberPassword(length));;
					break;
				}
				case "M": {
					System.out.println("Enter The Length Of Password : ");
					int length= sc.nextInt();
					System.out.println(genaratePassowrd.generateCombinePassword(length));
					break;
				}
				default: {
					System.out.println("Thanks");
					break;
				}
				}
			}
		}
	}

	public String options(Scanner sc) {
		System.out.println("How strong password you want");
		System.out.println("Enter C : Only Character Password");
		System.out.println("Enter N : Number Password");
		System.out.println("Enter M : Combine Both Charcter and Number Password");
		return sc.next();
	}

}
