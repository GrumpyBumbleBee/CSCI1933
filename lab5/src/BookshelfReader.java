import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class BookshelfReader {
    private String filename;
    private Bookshelf myBookshelf;

    //    private Book[] bookshelf;
    public static Bookshelf readBooksFromFile(String fileName) throws FileNotFoundException {
        Book[] bookshelf;
        File f = new File(fileName);
        Scanner scanner = new Scanner(f);

        int numLines = 0;
        while (scanner.hasNextLine()) {
            numLines++;
            String s = scanner.nextLine();
        }
        scanner.close();
        bookshelf = new Book[numLines];
        int i = 0;
        scanner = new Scanner(f);
        String[] stringArray;
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            stringArray = s.split(",");
            bookshelf[i] = new Book(stringArray[0], stringArray[1], Double.parseDouble(stringArray[2]));
            i++;

        }
        scanner.close();
        myBookshelf = new Bookshelf(bookshelf);

    }

}

