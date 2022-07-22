package hackathonBayview;

public class MainClass {

	public static void main(String[] args) {
			String s = "[Title] [Author] [Categories] [Short Summary] [Pages] [Rating] [Link]";
			Book book = new Book(s);
			System.out.print(book.getAuthor());


	}

}
