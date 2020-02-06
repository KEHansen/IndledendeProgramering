package lektion11;

public class Book1 extends ReadingMatter{
    private String author;

    public Book1(String title, long isbn, String author) {
        super(title, isbn);
        this.author = author;
    }

    public String toString() {
        return super.toString() + "\t" + author;
    }

    @Override
    public void content() {
        super.content();
        System.out.println ("Author: " + author);
    }
}
