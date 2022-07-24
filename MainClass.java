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
	    ArrayList<Book> newBooks=library.getBooks();
	    boolean check=true;
		while(check)
		{
			switch(choice)
			{
				case 1: newBooks=library.getBooksWithTitle(newBooks,pTitle());
					break;
				case 2: newBooks=library.getBooksWithAuthor(newBooks,pAuthor());
					break;
				case 3: newBooks=library.getBooksWithGenre(newBooks,pGenre());
					break;
				case 4: newBooks=library.getBooksWithPages(newBooks,lPages(),hPages());
					break;
				case 5: newBooks=library.getBooksWithRating(newBooks,pRating());
			}
			System.out.print("Do you wish to add more filters? " );
		    Scanner sc= new Scanner(System.in);
			String selected = sc.nextLine();
			if(selected.equals("y"))
			{
				System.out.println("Please select another filter");
				System.out.println("1. Title \n2. Author \n3. Category/Genre \n4. Pages \n5. Rating \nPlease select your filter");
				Scanner redo= new Scanner(System.in);
				choice = sc.nextInt();
			}
			else
			{
				check=false;
			}
			
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
public static String pGenre()
	{
		System.out.println("1. Fantasy \n2. Sci-fi \n3.Dystopian\n4.Mystery \n5.Horror/Thriller \n6.Historical Fiction \n7.Short Story \n8.Manga \n9.Memoir and Autobiographies \n10.Self-Help \n11.How-To books \n12 Cultural Novels");
		System.out.println("Please type in the number genre you want name");
		Scanner sc= new Scanner(System.in);
		String selected = sc.nextLine();
		switch(Integer.parseInt(selected))
		{
			case 1: return "Fantasy";
				
			case 2: return "Sci-Fi";
				
			case 3: return "Dystopian";
				
			case 4: return "Mystery";
			
			case 5: return "Horror";
			
			case 6: return "Historical Fiction";
			
			case 7: return "Short Story";
			
			case 8: return "Manga";
				
			case 9: return "Memoir & Autobiography";
			
			case 10: return "Self-Help";
			
			case 11: return "How-To";
		
			case 12: return "Cultural";
			
			default: return "Fantasy";//Just chose a random one and it is the first one
		}
	}
	
	public static int hPages()
	{
		System.out.println("What is the maximum amount of pages?");
		Scanner sc= new Scanner(System.in);
		int high = sc.nextInt();
		return high;
	}
	public static int lPages()
	{
		System.out.println("What is the minumum amount of pages?");
		Scanner sc= new Scanner(System.in);
		int low = sc.nextInt();
		return low;
	}
	public static double pRating()
	{
		System.out.println("What is the lowest rating?");
		Scanner sc= new Scanner(System.in);
		double rate = sc.nextInt();
		return rate;
	}
	
	
	

	
	

}
