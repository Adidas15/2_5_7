//Aditya Das and Jonathan Adrian
public class MediaLib
{
  private Book book;

  private Movie movie;

  private Song song;

  private String date;

  public MediaLib() {
    date = Dater.getDate();
  }

  public void addBook(Book b)
  {
    //Step 23
    if (book==null){
      numEntries+=1;  //Step 15
      book = b; 
    }
    else {
      System.out.println("You already entered a book!");
    }
      
  }

  public void changeBook(Book b) {
    book = b;
  }

  public void addMovie(Movie m) {
    //Step 23
    if (movie==null){
      numEntries+=1;  //Step 15
      movie = m;
    }
    else {
      System.out.println("You already entered a movie!");
    }
     
  }

  public void changeMovie(Movie m) {
    movie = m;
  }

  public void addSong(Song s) {
    //Step 23
    if (song==null){
      numEntries+=1;  //Step 15
      song = s;
    }
    else {
      System.out.println("You already entered a song!");
    }
     
  }

  public void changeSong(Song s) {
    song = s;
  }

  public String toString() 
  {
    String info = owner + "'s Library was created on " + date + " .";
    info += " It contains: \n";
    if (book!=null) {
      info += book.toString();
    }
    if (movie!=null){
      info += movie.toString();
    } 
    if (song!=null){
      info += song.toString();
    }
    return info;
  }

  //Step 5
  public static String owner = "PLTW";
  
  /*//Step 2
  public static String getOwner() {
    //Step 6
    return owner;
  }

  //Step 8
  public static void changeOwner(String ow) {
    owner = ow;
  }*/

  //Step 12
  private static int numEntries = 0;

  //Step 13
  public static int getNumEntries() {
    //System.out.println("Test: Owner is " + owner);
    //System.out.println("test: Book is " + book);
    return numEntries;
  }

  



}