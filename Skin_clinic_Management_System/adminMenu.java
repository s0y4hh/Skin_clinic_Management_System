import java.util.Scanner;
public class adminMenu{

	public void adminMainMenu(){
	Scanner scan = new Scanner(System.in);

	NameBanner NAMEBANNER = new NameBanner("ADMIN PANEL");
	NAMEBANNER.show();
	// DISPLAY ALL THE OPTION TO THE ADMIN
	System.out.println("[ 1 ] -- Patient Records" + 
	"\n[ 2 ] -- Inventory Management" +
	"\n[ 3 ] -- Appointment Schedules");
	int adminChoice;
	while (true) {
    try {
    	// GET THE ADMIN INPUT GREATER THAN 1 AND NOT GREATER THAN 3
    	System.out.print("Enter option: ");
        adminChoice = scan.nextInt();
        if (adminChoice >= 1 && adminChoice <= 3) {
            break; // BREAK THE LOOP WHEN THE ADMIN INPUT BETWEEN 1 AND 3
        } else {
            System.out.println("\nPlease enter a valid input between 1 and 3.\n");
        }
    } catch (Exception e) {
        System.out.println("\nPlease enter a valid input between 1 and 3.\n");
        scan.next(); // THIS IS TO AVOID INFINITE LOOP
    }
}

	if (adminChoice == 1){
		// ALL SERVICES CURRENTLY NOT AVAILABLE
		// WILL ADD MORE SERVICES SOON
		System.out.print("\nPatients Record Currently not available!!\n");

	}else if (adminChoice == 2){
		System.out.print("\nInventory currently not available!!\n");

	}else{
		System.out.print("\nNo Appointment Schedule at the moment!!\n");
	}



	}



}