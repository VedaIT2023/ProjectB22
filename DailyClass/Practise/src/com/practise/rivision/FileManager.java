package com.practise.rivision;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("----File Reading started----");
		try {
			File myFile = new File("sample.json");
			
			Scanner myReader = new Scanner(myFile);
			
			
			while(myReader.hasNextLine()) {
				System.out.println(myReader.next());
			}	
			
			System.out.println(myFile.getAbsolutePath());
			System.out.println(myFile.getName());
			myReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("----File Reading End----");
		
		//File
		//FileReader
		
//		Exception
//		ArithmeticException
//		IOException
//		FileNotFoundException
		
//		createANewFile();
//		deleteAFile("mydoc.txt");
		writeToFIle("mydoc.txt", "New file created");
	}
	
	public static void createANewFile() {
		
		
		try {
			
			File docFile = new File("mydoc.txt");
			if(docFile.createNewFile()) {
				System.out.println("New file created");
			}else{
				System.out.println("File already Existed");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public static void deleteAFile(String fileName) {
		
		try {
			File delFile = new File(fileName);
			if(delFile.delete()) {
				System.out.println("File deleted");
			}else {
				System.out.println("File not found");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	
	public static void writeToFIle(String filePath,String content) {
		
		try {
			FileWriter docInfo = new FileWriter(filePath);
			docInfo.write(content);			
			docInfo.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
