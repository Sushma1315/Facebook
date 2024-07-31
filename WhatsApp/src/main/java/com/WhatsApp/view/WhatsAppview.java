package com.WhatsApp.view;

import java.util.Scanner;

import com.WhatsApp.controller.WhatsAppController;
import com.WhatsApp.controller.WhatsAppControllerInterface;

public class WhatsAppview {
	
	public static void main(String[] args) {
		System.out.println("Main Menu");
		System.out.println("press 1 to create profile");
		System.out.println("press 2 to view profile");
		System.out.println("press 3 to edit profile");
		System.out.println("press 4 to delete profile");
		System.out.println("press 5 to search profile");
		System.out.println("press 6 to viewAll profile");
		System.out.println("press 7 to loginprofile");
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter yor choice");
		int c=scan.nextInt();
		
		WhatsAppControllerInterface wc=new WhatsAppController();
		
		switch(c) {
		case 1:wc.createProfileController();
			break;
		case 2:wc.viewProfileController();
			break;
		case 3:wc.editProfileController();
			break;
		case 4:wc.deleteProfileController();
			break;
		case 5:wc.searchProfileController();
			break;
		case 6:wc.viewAllprofileController();
			break;
		case 7:wc.loginProfileController();
			break;
		default:
			System.out.println("Wrong choice");
				
		}
		
		
		
		
	}
	
	
	
	

}
