package firstproject;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LockedMe
{
	static final String projectFilesPath= "C:\\Users\\trupti.bhadane\\Trupti1";
	public static void displayMenu()
	{
		System.out.println("************************************************");
		System.out.println("\tWelcome to LockedMe Secure App");
		System.out.println("\tDeveloped By: Trupti");
		System.out.println("************************************************");
		System.out.println("\t1. Display All Files");
		System.out.println("\t2. Add new File");
		System.out.println("\t3. Delete the files");
		System.out.println("\t4. Search the file");
		
	}

	public static void getAllFiles()
	{
		File folder = new File(projectFilesPath);
		File[] listofFiles = folder.listFiles();
		
		if(listofFiles.length>0)
		{
			System.out.println("Files list is displayed below: \n");
			for(var l:listofFiles)
			{
				System.out.println(l.getName());
			}
		}
		else
		{
			System.out.println("Folder is empty");
		}
	}
	public static void createFiles()
	
	{
		try
	
	{
		Scanner sc= new Scanner(System.in);
		String fileName;
		System.out.println("Enter the file name: ");
		fileName= sc.nextLine();
		
		int linesCount;
		System.out.println("Enter how many lines in the files: ");
		linesCount=Integer.parseInt(sc.nextLine());
		
		FileWriter fw= new FileWriter(projectFilesPath+"\\"+fileName);
		for(int i=1;i<=linesCount;i++)
		{
			System.out.println("Enter file line:");
			fw.write(sc.nextLine()+"\n");
		}
		System.out.println("File created succefully");
		fw.close();
			
		}
		catch(Exception e)
		{
			
		}
		
	}
	public static void deleteFiles()
	{
		Scanner sc= new Scanner(System.in);
		String fileName;
		System.out.println("Enter file name which want to be deleted: ");
		fileName = sc.nextLine();
		File f = new File(projectFilesPath+"\\"+fileName);
		if(f.exists())
		{
			f.delete();
			System.out.println("File deleted successfully");
		}
		else
		{
			System.out.println("File does not exist");
		}
		
	}
	public static void searchFiles() 
	{
		
		Scanner sc= new Scanner(System.in);
		String fileName;
		System.out.println("Enter file name which want to be search: ");
		fileName = sc.nextLine();
		File f1 = new File(projectFilesPath+"\\"+fileName);
		if(f1.exists())
		{
			System.out.println("File exist");
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
}
	
