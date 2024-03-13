package com.javaws.client;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.List;

import com.javaws.services.WSAuthentification;
import com.javaws.services.WSAuthentificationService;


public class ServiceWebClient {
	private static AuthUI authUi;
	private static WSAuthentification stub;
	private static WSAuthentificationService service ;
	private static AuthMessageUI authMessage;
	public static void main(String[] args) {
		 authUi = new AuthUI();
		 authMessage = new AuthMessageUI();
		authUi.display();
		try {
		service = new WSAuthentificationService();
		stub = service.getWSAuthentificationPort();
		System.out.println("Connected to the server");
	} catch (Exception e) {
		System.out.println("Error while connecting to the server");
		
	}
		addListener();
	}
//	
	
//	
	private static void addListener() {
    	ActionListener authActioner = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String login = authUi.getLogin();
				String password = authUi.getPassword();
				boolean isValidate = stub.validate(login, password);
				if(isValidate) {
					System.out.println("Welcome "+login);
					authMessage.display("Authentification reussie");
					
				}else {
					System.out.println("Login or password is incorrect");
					authMessage.display("Authentification echoue");
				}
			};
    	};
    	
    	authUi.setAddActionListener(authActioner);
//    	quiter
    	ActionListener quiterActioner = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
    		
    	};
    	authUi.setQuiterActionListener(quiterActioner);
    }

	
}
