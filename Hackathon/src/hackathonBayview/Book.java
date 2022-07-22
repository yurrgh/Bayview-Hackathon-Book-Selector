package hackathonBayview;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Book {
	String title, author, category, link, summary;
	Double rating;
	int pages;

	public Book(String s) {
		String temp=s;
		String split=(temp.substring(temp.indexOf("[")+1,temp.indexOf("]") )) ;
		title=split;

		
		for(int i=0;i<7;i++)
		{
			temp=temp.substring(  temp.indexOf("]")+1);
			split=(temp.substring(temp.indexOf("[")+1,temp.indexOf("]") )) ;
			switch(i)
			{
			   case 0: author=split;
			   		break;
			   		
			   case 1: title = split;
				   	break;
				   	
			   case 2: category=split;
		   			break;  
		   		
			   case 3: summary=split;
		   			break;  
		   		
			   case 4: pages=Integer.parseInt(split);
		   			break;
		   			
			   case 5: rating=Double.parseDouble(split);
	   				break;
		   			
		   			
				 
			}
		}
	}
	public String getAuthor()
	{
		return author;
	}
}