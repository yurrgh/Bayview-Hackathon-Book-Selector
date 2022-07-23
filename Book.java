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

		
		for(int i=0;i<6;i++)
		{
			temp=temp.substring(  temp.indexOf("]")+1);
			split=(temp.substring(temp.indexOf("[")+1,temp.indexOf("]") )) ;
			switch(i)
			{
			   case 0: author=split;
			   		break;
				   	
			   case 1: category=split;
		   			break;  
		   		
			   case 2: pages=Integer.parseInt(split);
		   			break;  
		   		
			   case 3: rating=Double.parseDouble(split);
		   			break;
		   			
			   case 4: summary=split;
	   				break;
	   				
			   case 5: link=split;
  					break;
		   			
		   			
				 
			}
		}
	}
	public String getAuthor()
	{
		return author;
	}
	
	public String getTitle()
	{
		return title;
	}
	public String getCategory()
	{
		return category;
	}
	public int getPages()
	{
		return pages;
	}
	public Double getRating()
	{
		return rating;
	}
	public String getSummary()
	{
		return summary;
	}
	public String getLink()
	{
		return link;
	}
	
	public String toString()
	{
		return "Title: " +  this.getTitle() + "\n Author: " + this.getAuthor() + "\nPages: " + this.pages + "\nRating: " + this.rating + "\nSummary: " + this.summary + "\nLink: " + this.link;
	}
	
	
	
	
	
	
	
	
	
}
