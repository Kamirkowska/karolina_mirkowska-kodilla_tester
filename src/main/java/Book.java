public class Book {
    private String author;
    private String title;

    public static Book of(String author,String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }
    public String getTitleAndAuthor(){
        return author + ": "+title;
    }

    public static void main(String [] args){
        Book book = Book.of("Isaac Asimov","The Galaxy");
        Book book1= Book.of("Author 1 name", "Title 1");
        Book book2= Book.of("Author 2 name","Title 2");

        System.out.println(book.getTitleAndAuthor());
        System.out.println(book1.getTitleAndAuthor());
        System.out.println(book2.getTitleAndAuthor());


    }

}