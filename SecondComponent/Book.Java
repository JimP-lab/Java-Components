Import java.utill.ArrayList;
public class Book
{
private String title;
private String author;
private String ISBN;
private static ArrayList <Book> bookcollection = new ArrayList < Book > ();
public Book(String title, String author, String ISBN)
{
this.title= title;
this.author= author;
this.ISBN = ISBN;
}
public void set_Author(String author)
{
this.author = author;
}
public String get_ISBN()
{
return ISBN;
}
public void set_ISBN(String ISBN)
{
this.ISBN= ISBN;
}
public static void add_Book(Book Book)
{
bookCollection.add(book);
}
public static void remove_Book(Book book)
{
bookCollection.remove(book);
}
public static ArrayList < Book > get_BookCollection()
{
return bookCollection;
}
public class Main 
{
public static void main (String [] args)
{
Book book1= new Book(" maths");
Book book2= new Book ("Science");

Book.add_Book (book1);
Book. add_Book (book2);

ArrayList <Book> bookCollection = Book.get_BookCollection();
System.out.println("List of book:");

for (Book book: bookCollection)
{
System.out.println(book.get_title () + "by" + book.get_Author() + ", ISBN: " +
book.get_ISBN());
}
Book.remove_Book(book1);
System.out.println("/nAfter removing " + book1.get_Title() + ":");
System.out.println (" List of books: ");
for (Book book: bookCollection)
{
System.out.println(book.get_Title () + "by" + book.get_Author () + ",ISBN:"+
book.get_ISBN());
}
}
}

}