package OOPS;

class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorroeed;

    static {
        totalNoOfBooks = 0;
    }

    {   // object in it!
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;

    }
    Book(String isbn){
        this(isbn,"unknown","unknown");
    }
 
    static int getTotalNoOfBook(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        
        if ( isBorroeed ){
            System.out.println("Book already borrowed");
        } else{
            this.isBorroeed = true;
            System.out.println("Book got!! enjoy!!"+ this.title);
        }
    }

    void returnBook(){
        if (isBorroeed){
            this.isBorroeed = false;
            System.out.println("Hope you enjoyedd!!");
        } else{
            System.out.println("Already present in libary!");

        }

    }

    public static void main(String[] args) {
        Book designOfThing = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBook());
        
        designOfThing.borrowBook();
        myBook.borrowBook();
        designOfThing.borrowBook();
        designOfThing.returnBook();
        designOfThing.returnBook();

    }


}


