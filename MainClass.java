package hackathonBayview;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MainClass {
	

		

	public static void main(String[] args) throws FileNotFoundException {
	    prompt();


	}
	
	public static void prompt() throws FileNotFoundException
	{
		System.out.println("Please select filter");
		System.out.println("1. Title \n2. Author \n3. Category/Genre \n4. Pages \n5. Rating \nPlease select your filter(s)");
		Scanner sc= new Scanner(System.in);
		String selected = sc.nextLine();
			for(int s =1;s<=5;s++)
			{
				if(selected.contains(Integer.toString(s)))
				{
					selection(s);
				}
			}
	}
		
	
	
	public static void selection(int choice) throws FileNotFoundException
	{
		Library library = new Library();
	    System.out.print(library.completeLibrary());
	    ArrayList<Book> newBooks=library.getBooks();
			
			switch(choice)
			{
				case 1: newBooks=library.getBooksWithTitle(newBooks,pTitle());
					break;
				case 2: newBooks=library.getBooksWithAuthor(newBooks,pTitle());;
					break;
				case 3: newBooks=library.getBooksWithTitle(newBooks,pTitle());;
					break;
				case 4: newBooks=library.getBooksWithTitle(newBooks,pTitle());;
					break;
				case 5: newBooks=library.getBooksWithTitle(newBooks,pTitle());;
			
			}
		System.out.print(newBooks);
		
	}
	public static  String pTitle()
	{
		System.out.println("Please type in the titles name");
		Scanner sc= new Scanner(System.in);
		String selected = sc.nextLine();
		return selected;
		
	}
	public static String pAuthor()
	{
		System.out.println("Please type in the titles name");
		Scanner sc= new Scanner(System.in);
		String selected = sc.nextLine();
		return selected;
	}
	public static void pGenre()
	{
		
	}
	public static void pPages()
	{
		
	}
	public static void pRating()
	{
		
	}
	
	

	
	

}
