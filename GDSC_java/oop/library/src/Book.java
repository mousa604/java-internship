public class Book extends Item{

    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int numberOfPages) {
        super(title, author, publicationYear);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        System.out.println( "Book Name : "+getTitle());
        System.out.println( "Author : " +getAuthor());
        System.out.println("Publication Year : "+ getPublicationYear());
        System.out.println("Number of Pages : "+ getNumberOfPages()+ " page");
    }


    public void updateInfo(String title, String author, int publicationYear, int numberOfPages) {
        commonUpdateInfo(title,author,publicationYear);
        setPages(numberOfPages);

    }


}
