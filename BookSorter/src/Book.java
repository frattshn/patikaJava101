
public class Book{

    private String bookName;
    private int page;
    private String author;
    private String releaseDate;

    public Book(String bookName, int page, String author, String relaseDate){
        this.bookName= bookName;
        this.page= page;
        this.author= author;
        this.releaseDate= relaseDate;
    }
    

    public String getBookName() {
        return this.bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPage() {
        return this.page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    
}
