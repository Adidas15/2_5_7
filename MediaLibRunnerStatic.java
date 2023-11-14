//Aditya Das and Jonathan Adrian
public class MediaLibRunnerStatic {
    public static void main(String[] args) {
        //Step 1
        //System.out.println(MediaLib.getOwner() + "'s Library");
        MediaLib.owner = "Adi";
        //System.out.println(MediaLib.owner + "'s Library");
        //Step 14
        //System.out.println("Entries: "+ MediaLib.getNumEntries());


        //Step 16
        MediaLib myLib = new MediaLib();
        Book myBook = new Book("Lord of the Rings", "Tolkien");
        myLib.addBook(myBook);

        MediaLib otrLib = new MediaLib();
        Movie otrMovie = new Movie("Mission Impossible", 1.75);
        otrLib.addMovie(otrMovie);
        Movie anotherMovie = new Movie("Mission Impossible 2", 2);
        //otrLib.addMovie(anotherMovie); //Step 22
        otrLib.changeMovie(anotherMovie);
        //Step 17
        System.out.println("Entries: " + MediaLib.getNumEntries());  
        System.out.println(myLib.toString());
        System.out.println(otrLib.toString());

        
    }
}
