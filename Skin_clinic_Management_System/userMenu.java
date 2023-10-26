import java.util.Scanner;
public class userMenu{
	public void UserMenu(){
		clientServices cS = new clientServices();
		Scanner scan = new Scanner(System.in);

		NameBanner NAMEBANNER = new NameBanner("DERMATIQUE LOUNGE SKIN CLINIC SERVICES");
		NAMEBANNER.show();
			// DISPLAY ALL THE OPTION TO THE ADMIN
	System.out.println("[ 1 ] -- Services" + 
	"\n[ 2 ] -- Schedule an appointment" +
	"\n[ 3 ] -- Medical billing");
	int choice;
	while (true){
		    try {
    	// GET THE ADMIN INPUT GREATER THAN 1 AND NOT GREATER THAN 3
    	System.out.print("Enter option: ");
        choice = scan.nextInt();

        if (choice >= 0 && choice <= 3) {
            break; // BREAK THE LOOP WHEN THE ADMIN INPUT BETWEEN 1 AND 3
        } else {
            System.out.println("\nPlease enter a valid input between 0 and 3.\n");
        }
    } catch (Exception e) {
        System.out.println("\nPlease enter a valid input between 0 and 3.\n");
        scan.next(); // THIS IS TO AVOID INFINITE LOOP
    }
	}

	switch(choice){
	case 1:
		clientServices clientService = new clientServices();
		clientService.services();
		break;
	case 2:
		System.out.print("Sorry this service is not available yet");
		break;
	case 3:
		System.out.print("Sorry this service is not available yet");
		break;
	}


	}
}