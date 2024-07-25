# maankuliApp
java
Copy code
import java.util.ArrayList;
import java.util.List;

// Class representing an App
class App {
    private String name;
    private double averageRating;
    private List<String> reviews;

    public App(String name) {
        this.name = name;
        this.averageRating = 0.0;
        this.reviews = new ArrayList<>();
    }

    // Method to add a rating (assumes rating is out of 5)
    public void addRating(double rating) {
        if (rating < 0 || rating > 5) {
            System.out.println("Invalid rating. Rating must be between 0 and 5.");
            return;
        }

        double totalRating = this.averageRating * this.reviews.size();
        this.reviews.add("Rating: " + rating);
        this.averageRating = (totalRating + rating) / this.reviews.size();

        System.out.println("Rating added successfully.");
    }

    // Method to add a review
    public void addReview(String review) {
        this.reviews.add(review);
        System.out.println("Review added successfully.");
    }

    // Method to display app details
    public void displayAppDetails() {
        System.out.println("App Name: " + this.name);
        System.out.println("Average Rating: " + this.averageRating);
        System.out.println("Reviews:");
        for (String review : this.reviews) {
            System.out.println("- " + review);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of App
        App myApp = new App("My Awesome App");

        // Adding ratings and reviews
        myApp.addRating(4.5);
        myApp.addReview("This app is great!");
        myApp.addRating(3.5);
        myApp.addReview("Could be better, but still good.");

        // Displaying app details
        myApp.displayAppDetails();
    }
}
