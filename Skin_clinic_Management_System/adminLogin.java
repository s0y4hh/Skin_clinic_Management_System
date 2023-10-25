import java.io.*;
import java.util.*;
public class adminLogin{

	public void adminlogin(){
	Console console = System.console();
	Scanner scan = new Scanner(System.in);

	// THIS IS THE ADMIN CREDENTIALS
	// WILL USE CRYPTOGRAPHY SOON FOR MORE SECURE CODE
	String usr = "Admin";
	String psswd = "Admin";


	while (true){
		//BANNER FOR ADMIN LOGIN
	NameBanner NAMEBANNER = new NameBanner("ADMIN LOGIN");
	NAMEBANNER.show();
	//GETTING THE ADMIN'S LOGIN CREDENTIALS

	System.out.println();
	System.out.print("Username: ");
	String username = scan.nextLine();
	// GETTING THE PASSWORD AS SECRET SO THIS WILL NOT SHOW IN THE TERMINAL
	char[] password = console.readPassword("Password: ");

	if (username.equals(usr) && psswd.equals(new String(password))){
		System.out.println("\nLOGIN SUCCESSFULLY!!\n");
		break;
		
	}else{
		System.out.println("\n*Wrong Username or Password*\n");}
	}


	}

}
