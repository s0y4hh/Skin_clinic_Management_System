import java.io.*;
public class main{
	public static void main(String[] args)throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// DISPLAYING THE BANNER
	NameBanner NAMEBANNER = new NameBanner("DERMATIQUE LOUNGE SKIN CLINIC");
	NAMEBANNER.show();

	// DISPLAYING THE OPTIONS FOR THE USER
	System.out.println(" [ 0 ] -- Exit\n" +
        " [ 1 ] -- Admin panel login\n" +
        " [ 2 ] -- Main menu");

	// GET THE CHOSEN OPTION OF TJE USER
	int choice;

	while (true){
		    try {
    	// GET THE ADMIN INPUT GREATER THAN 1 AND NOT GREATER THAN 2
    	System.out.print("Enter option: ");
        choice = Integer.parseInt(br.readLine());

        if (choice >= 0 && choice <= 2) {
            break; // BREAK THE LOOP WHEN THE ADMIN INPUT BETWEEN 1 AND 3
        } else {
            System.out.println("\nPlease enter a valid input between 0 and 2.\n");
        }
    } catch (Exception e) {
        System.out.println("\nPlease enter a valid input between 0 and 2.\n");
        br.readLine(); // THIS IS TO AVOID INFINITE LOOP
    }
	}

	if (choice == 0){

		// IF THE CHOICE IS 0 TRY TO IDENTIFY THE OS OF THE USER THEN CLOSE THE TERMINAL BASE ON THEIR OS
	        try {
	        	// GETTING THE OS NAME
	            String os = System.getProperty("os.name").toLowerCase();

	            String thankyou = "\nThank you for using this program!!\n";
	            
	            // IF THE OS IS WINDOWS THEN THIS IS THE WILL BE EXECUTED
	            if (os.contains("win")) {
	          		// COMMAND TOO KILL THE PROCCESS IN THE TERMINAL
	            	System.out.print(thankyou);
	                Runtime.getRuntime().exec("taskkill /f /im cmd.exe");

	             // THIS IS FOR THE MAC OS AND LINUX
	            } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
	                // TERMINAL COMMAND FOR MAC AND LINUX OS TO KILL PROCCESS
	                System.out.print(thankyou);
	                Runtime.getRuntime().exec("pkill -f Terminal");
	            } else {
	                System.out.println("Unsupported operating system: " + os);
	            }
	        } catch (Exception e) {
	        	// PRINT THE DETAILES EXCEPTION IF NONE OF THE CONDITIONS ARE TRUE
	            e.printStackTrace();
	        }
	    }else if(choice == 1){
	    	// CREATING A NEW ADMINLOGIN OBJECT FROM adminLogin CLASS
			adminLogin ADMINLOGIN = new adminLogin();
			ADMINLOGIN.adminlogin();

			// ALSO CREATING ADMINMENU FOR DISPLAYING THE MENU FOR ADMIN SIDE
			adminMenu ADMINMENU = new adminMenu();
			ADMINMENU.adminMainMenu();

		}else if(choice == 2){
			userMenu clientMenu = new userMenu();
			clientMenu.UserMenu();
		}else{
			System.out.print("\nNOT YET PROGRAMMED\n");
	}
	
	}
}