package inheritance;

public class Review {
    private String author;
    private String body;
    private int stars;

    public Review() {

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String toString() {
        String result = "";
        return String.format("Review: %s \n" +
                "author: %s\n" +
                "stars: %d", this.body, this.author, this.stars);
    }
}
