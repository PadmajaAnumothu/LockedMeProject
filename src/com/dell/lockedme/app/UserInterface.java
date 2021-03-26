package com.dell.lockedme.app;

import com.dell.lockedme.modules.OptionsMenu;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		welcomeScreen();
		OptionsMenu.optionsMenu();	

	}

	public static void welcomeScreen() {
		// TODO Auto-generated method stub
		System.out.println("########################################################");
		System.out.println("##                                                    ##");
		System.out.println("##         WELCOME TO LOCKED ME APPLICATION           ##");
		System.out.println("##                 VERSION 1.0                        ##");
		System.out.println("##         Developer - Padmaja Anumothu               ##");
		System.out.println("##                                                    ##");
		System.out.println("########################################################\n");
		
	}
	
	public static void exitScreen() {
		// TODO Auto-generated method stub
		System.out.println("\n########################################################");
		System.out.println("##                                                    ##");
		System.out.println("##         THANKS FOR VISITING LOCKED ME APPLICATION  ##");
		System.out.println("##                                                    ##");		
		System.out.println("########################################################\n");
		
	}


}
