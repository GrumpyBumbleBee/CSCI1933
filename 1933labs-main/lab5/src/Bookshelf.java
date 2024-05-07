public class Bookshelf {
    private Book[] bookshelf;
    private int nextEmpty;

    public Bookshelf(int n) {
        bookshelf = new Book[n];
        //System.out.println(bookshelf);
    }

    public Bookshelf() {
        bookshelf = new Book[20];
        //System.out.println(bookshelf);
    }

    public Bookshelf(Book[] bookArray) {
        bookshelf = bookArray;
    }

    public boolean add(Book newBook) {
        if (nextEmpty == 0) {
            //System.out.println(bookshelf);
            for (int i = 0; i < bookshelf.length; i++) {
                if (bookshelf[i] == null) {
                    nextEmpty = i;
                    bookshelf[i] = newBook;
                    if (nextEmpty < bookshelf.length - 1) {
                        nextEmpty++;
                    }
                    break;
                }
            }
            return true;
        } else if (nextEmpty != 0) {
            bookshelf[nextEmpty] = newBook;
            if (nextEmpty < bookshelf.length - 1) {
                nextEmpty++;
            }
            return true;
        }
        return false;
    }

    public Bookshelf getBooksByAuthor(String author) {
        int temp = 0;
        Bookshelf newBookshelf;
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i].getAuthor().equals(author)) {
                temp++;
            }
        }
        newBookshelf = new Bookshelf();
        newBookshelf.bookshelf = new Book[temp];
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i].getAuthor().equals(author)) {
                newBookshelf.add(bookshelf[i]);
            }

        }
        return newBookshelf;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < bookshelf.length; i++) {
            output += bookshelf[i].getTitle() + ", " + bookshelf[i].getAuthor() + ", " + bookshelf[i].getRating() + "\n";
        }
        return output;
    }

    public void sort(char sortBy){
        //int result;
        int i, j;
        Book n;
        //int counter = 0;

        for (i = 1; i < bookshelf.length; i++){
            n = bookshelf[i];
            for (j = i - 1; j >= 0 && n.compareTo(bookshelf[j],sortBy)<0; j--) {
                //counter++;
                bookshelf[j + 1] = bookshelf[j];
            }
            bookshelf[j + 1] = n;

        }
//        switch(sortBy) {
//            case 'a':
//            case 'A':
//
//                //result = author.compareTo(other.getAuthor());
//                break;
//            case 't':
//            case 'T':
//                //result = title.compareTo(other.getTitle());
//                break;
//            case 'r':
//            case 'R':
//                //result = (int) (1000 * (other.getRating() - rating));
//                break;
//            default:
//                result = 0;
//                break;
        }

        //return result;


    public static void main(String[] args) {
        Bookshelf bs = new Bookshelf(5);
        //System.out.println(bs.bookshelf);
        bs.add(new Book("Eragon", "Christopher Paolini", 10.0));
        bs.add(new Book("Eldest", "Christopher Paolini", 10.0));
        bs.add(new Book("Brisingr", "Christopher Paolini", 10.0));
        bs.add(new Book("Inheritance", "Christopher Paolini", 10.0));
        bs.add(new Book("Dracula", "Bram Stoker", 7.5));
        bs.sort('a');
        System.out.println(bs);
//        Bookshelf goodbooks = bs.getBooksByAuthor("Christopher Paolini");
//        System.out.println(goodbooks);
    }

}


