public class MediaLib
{
  private Book book;

  public void addBook(Book b)
  {
    book = b;
  }

  public String toString() 
  {
    String info = "";
    info += book.toString();
    return info;
  }
}