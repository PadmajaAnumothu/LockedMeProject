package com.dell.lockedme.modules;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import com.dell.lockedme.constants.Constants;

public class FileOperations {

	public static boolean addFileName() {
		System.out.println("Please enter file name to add: \n");
		Scanner sc = new Scanner(System.in);
		try {
		      FileWriter myWriter = new FileWriter(Constants.fileName,true);
		      myWriter.write("\n"+sc.nextLine());
		      myWriter.close();
		      sc.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		    }
		return false;
	}

	public static boolean deleteFileName() {
		System.out.println("Please enter file name to delte: \n");
		Scanner sc = new Scanner(System.in);
		
		try {
			Path path = Paths.get(Constants.fileName);
			Charset charset = StandardCharsets.UTF_8;

			String content = new String(Files.readAllBytes(path), charset);
			String deleteFileName = sc.nextLine();
			if(content.contains(deleteFileName)) {
			
			content = content.replaceAll(deleteFileName, "");
			Files.write(path, content.getBytes(charset));
			System.out.println("File name '"+deleteFileName +"' deleted successfully \n");
			} else {
				System.out.println("\n File name not found \n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			 System.out.println("An error occurred.");
		}
		sc.close();
		return false;
	}

	public static boolean searchFileName() {
		System.out.println("Please enter file name to Search : \n");
		Scanner sc = new Scanner(System.in);
		
		try {
			Path path = Paths.get(Constants.fileName);
			Charset charset = StandardCharsets.UTF_8;

			String content = new String(Files.readAllBytes(path), charset);
			String deleteFileName = sc.nextLine();
			if(content.contains(deleteFileName)) {			
			//content = content.replaceAll(deleteFileName, "");
			//Files.write(path, content.getBytes(charset));
			System.out.println("File name '"+deleteFileName +"' found successfully \n");
			} else {
				System.out.println("\n File name not found \n");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			 System.out.println("An error occurred.");
		}
		sc.close();
		return false;
	}

	public static boolean ListAllFiles() {
		// TODO Auto-generated method stub
		System.out.println("List of file names");
		Scanner sc = null;
		try {
			sc = new Scanner(new File(Constants.fileName));
			while (sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("An error occured while reading the file");
		}
		sc.close();

		return false;
		
	}
}
