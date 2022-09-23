package firstproject;
import java.util.*;

public class ClientApp {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int ch;
		
		do
		{
		LockedMe.displayMenu();
		System.out.println("Enter your choice");
		ch= Integer.parseInt(sc.nextLine());
		switch(ch)
		{
		case 1: LockedMe.getAllFiles();
				break;
		case 2: LockedMe.createFiles();
				break;
		case 3: LockedMe.deleteFiles();
				break;
		case 4: LockedMe.searchFiles();
				break;
				
		} 
				
	}
	while(ch>0);
	
		sc.next();
		sc.close();
	
	}

}
