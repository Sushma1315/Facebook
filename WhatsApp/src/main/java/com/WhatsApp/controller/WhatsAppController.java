package com.WhatsApp.controller;

import java.util.Scanner;

import com.WhatsApp.Entity.WhatsAppUser;
import com.WhatsApp.service.WhatsAppService;
import com.WhatsApp.service.WhatsAppServiceInterface;

public class WhatsAppController implements WhatsAppControllerInterface {
	public static void main(String[] args) {
	}
	@Override
	public void createProfileController() {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name");
		String name=scan.next();
		System.out.println("Enter password");
		String password=scan.next();
		System.out.println("Enter email");
		String email=scan.next();
		System.out.println("Enter address");
		String address=scan.next();
		
		WhatsAppUser wu=new WhatsAppUser();
		wu.setName(name);
		wu.setPassword(password);
		wu.setEmail(email);
		wu.setAddress(address);
		
		
		WhatsAppServiceInterface ws=new WhatsAppService();
		int i=ws.createProfileService(wu);
		if(i>0) {
			System.out.println("Profile created");
		}
		else {
			System.out.println("Profile not created");
		}
		
	}

	@Override
	public void viewProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchProfileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllprofileController() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginProfileController() {
		// TODO Auto-generated method stub
		
	}

}

