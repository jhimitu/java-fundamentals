package inheritance;

import java.util.List;

public class Review {
    private String author;
    private String body;
    private int stars;

    public Review() {

    }

    public Review(String author, String body, int stars) {
        this.setAuthor(author);
        this.setBody(body);
        this.setStars(stars);
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
        return String.format("%s \n" +
                "author: %s\n" +
                "stars: %d \n", this.body, this.author, this.stars);
    }
}
