public class Magazine extends Item{

    private double issueNumber;

    public Magazine(String title, String author, int publicationYear, double issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    // Getter and setter for issueNumber
    public double getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        System.out.println( "Magazine Name : "+getTitle());
        System.out.println( "Author : " +getAuthor());
        System.out.println("Publication Year : "+ getPublicationYear());
        System.out.println("Issue Number : "+ getIssueNumber());
    }

    public void updateInfo(String title, String author, int publicationYear, int issueNumber) {
        commonUpdateInfo(title,author,publicationYear);
        setIssueNumber(issueNumber);

    }
}
