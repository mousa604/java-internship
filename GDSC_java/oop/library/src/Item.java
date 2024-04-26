public abstract class Item {
    private String title;
    private String author;
    private int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    // Abstract method to display information
    public abstract void displayInfo();

    protected  void commonUpdateInfo(String title, String author, int publicationYear){
        setTitle(title);
        setAuthor(getAuthor());
        setPublicationYear(publicationYear);
    }



}
