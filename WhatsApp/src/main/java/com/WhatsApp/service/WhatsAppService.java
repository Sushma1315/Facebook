package com.WhatsApp.service;

import com.WhatsApp.DAO.WhatsAppDAO;
import com.WhatsApp.DAO.WhatsAppDAOInterface;
import com.WhatsApp.Entity.WhatsAppUser;

public class WhatsAppService implements WhatsAppServiceInterface {

	@Override
	public int createProfileService(WhatsAppUser wi) {
		// TODO Auto-generated method stub
		
		WhatsAppDAOInterface wd=new WhatsAppDAO();
		
		int i=wd.createProfileDAO();
		return 0;
	}

}
