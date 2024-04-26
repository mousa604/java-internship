public class DVD extends Item{

    private int duration; // Duration in minutes

    public DVD(String title, String author, int publicationYear, int duration) {
        super(title, author, publicationYear);
        this.duration = duration;
    }

    // Getter and setter for duration
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Override displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("DVD Name : "+ getTitle());
        System.out.println("Author : " + getAuthor());
        System.out.println("Publication Year : "+ getPublicationYear());
        System.out.println("Duration : "+ getDuration() + " minutes");
    }

    public void updateInfo(String title, String author, int publicationYear, int duration) {
        commonUpdateInfo(title,author,publicationYear);
        setDuration(duration);

    }
}
