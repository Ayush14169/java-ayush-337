class book {

    static int noOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed;

    static{
        noOfBooks=0;
    }
    {
        noOfBooks++;
    }
    
    book(String isbn,String author,String title){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
    }
    book(String isbn){
        this(isbn, "unknown", "unknown");
    }

    static int getnoOfBooks(){
        return noOfBooks;
    }

    void BorrowBook(){
        if (isBorrowed){
            System.out.println("The book is already borrowed.");
        }
        else{
            this.isBorrowed=true;
            System.out.println("Enjoy the book.");
        }
    }

    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed the book.");
        }
        else{
            System.out.println("The book is already in the library.");
        }
    }
    public static void main(String[] args) {
        book godaan = new book("1", "premchand", "godaan");
        book mybook = new book("2");
        System.out.println(book.noOfBooks);
        godaan.BorrowBook();
        mybook.BorrowBook();
        godaan.returnBook();
    }
}
