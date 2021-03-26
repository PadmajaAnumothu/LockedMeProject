package com.dell.lockedme.modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.dell.lockedme.app.UserInterface;

public class OptionsMenu {

	public static void optionsMenu(){
		System.out.println("Please select any of the below choices");
		System.out.println("1. List all file names in ascending order");
		System.out.println("2. Add / Delete / Search a file");
		System.out.println("3. Exit the application");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		boolean flag = true;
		
		while(flag) {
			switch(input) {
			case 1 : 
				flag = FileOperations.ListAllFiles();	
				UserInterface.exitScreen();
				break;
			case 2 :
				System.out.println("Please select any choice from the below list");
				System.out.println("1. Add file ");
				System.out.println("2. Delete file");
				System.out.println("3. Search file");
				input = sc.nextInt();
				switch(input) {
				case 1 : 
					flag = FileOperations.addFileName();
					UserInterface.welcomeScreen();
					break;
				case 2 :
					flag = FileOperations.deleteFileName();
					UserInterface.exitScreen();
					break;
				case 3 :
					flag = FileOperations.searchFileName();
					UserInterface.exitScreen();
					break;
				default :
					System.out.println("Please select valid choice from the below list");
					System.out.println("1. Add file ");
					System.out.println("2. Delete file");
					System.out.println("3. Search file");
					input = sc.nextInt();
					break;
				}									
				break;
			case 3 :
				flag = false;
				UserInterface.exitScreen();
				break;
			default :
				System.out.println("Please select valied choice from the below list");
				System.out.println("1. List all file names in ascending order");
				System.out.println("2. Add / Delete / Search a file");
				System.out.println("3. Exit the Applocation");
				input = sc.nextInt();
				flag = true;
			}		
		}
		sc.close();		
	}	
}
