import java.util.Scanner;
public class clientServices{
	public void services(){
	NameBanner NAMEBANNER = new NameBanner("SKIN CARE SERVICES");
	NAMEBANNER.show();
	Scanner scan = new Scanner(System.in);

	// DISPLAYING THE OPTIONS FOR THE USER
	System.out.println(" [ 1 ] -- DODGE LASER\n" +
        " [ 2 ] -- FACIAL AND PEELS\n" +
        " [ 3 ] -- WHITENING\n" +
        " [ 4 ] -- ANTI-AGING\n" + 
        " [ 5 ] -- ANTI-ACNE\n" +
        " [ 6 ] -- SCAR TREATMENT\n" + 
        " [ 7 ] -- SLIMMING AND FIRMING\n");

	int choice;
	while (true){
		    try {
    	// GET THE ADMIN INPUT GREATER THAN 1 AND NOT GREATER THAN 7
    	System.out.print("Enter option: ");
        choice = scan.nextInt();

        if (choice >= 0 && choice <= 7) {
            break; // BREAK THE LOOP WHEN THE ADMIN INPUT BETWEEN 1 AND 7
        } else {
            System.out.println("\nPlease enter a valid input between 0 and 7.\n");
        }
    } catch (Exception e) {
        System.out.println("\nPlease enter a valid input between 0 and 7.\n");
        scan.next(); // THIS IS TO AVOID INFINITE LOOP
    }
	}
	switch (choice){
	case 1:
		System.out.print("Sorry this service is not yet available");
		break;
	case 2:
		System.out.print("Sorry this service is not yet available");
		break;
	case 3:
		System.out.print("Sorry this service is not yet available");
		break;
	case 4:
		System.out.print("Sorry this service is not yet available");
		break;
	case 5:
		System.out.print("Sorry this service is not yet available");
		break;
	case 6:
		System.out.print("Sorry this service is not yet available");
		break;
	case 7:
		System.out.print("Sorry this service is not yet available");
		break;
	}


	}
	}
