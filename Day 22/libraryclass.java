class library{
    String[] books;
    int no_of_books;
    library(){
        this.books = new String [50];
        this.no_of_books = 0;
    }
    void addbook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added.");

    }
    void showavailablebooks(){
        System.out.println("Available books are:");
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("*" + book);
        }
    }
    void issuebook(String book){
        for(int i = 0 ; i<this.books.length;i++ ){
            if(this.books[i].equals(book)){
                System.out.println(book+" book has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist.");
    }
    void returnbook(String book){
        addbook(book);
    }
}
public class libraryclass {
    public static void main(String[] args) {
       
        library centrallibrary = new library();
        centrallibrary.addbook("Rich Dad Poor Dad");
        centrallibrary.addbook("Data Structures and Algorithm");
        centrallibrary.addbook("Mathematics");
        centrallibrary.addbook("Introduction to Communication Skills");

        centrallibrary.showavailablebooks();
        centrallibrary.issuebook("Mathematics");
    }
    
}
