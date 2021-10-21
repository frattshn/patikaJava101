import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        Book b1= new Book("Hayvan Çiftliği", 158, "Yazar1", "1958");
        Book b2= new Book("1984", 255, "Yazar2", "1988");
        Book b3= new Book("Şeker Portakalı", 200, "Yazar3", "1978");
        Book b4= new Book("Kürk Mantolu Madonna", 240, "Yazar4", "2000");
        Book b5= new Book("Uçurtma Avcısı", 500, "Yazar5", "2010");


        TreeSet<Book> books= new TreeSet<>(new OrderNameComparator());
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        for(Book book : books){
            System.out.println(book.getBookName());
        }

        System.out.println("--------------------------------------------------");


        TreeSet<Book> books2= new TreeSet<>(new OrderPageComparator());
        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);

        for(Book book : books2){
            System.out.println(book.getBookName()+" "+book.getPage());
        }




    }
}
