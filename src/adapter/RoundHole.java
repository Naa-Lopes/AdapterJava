package adapter;

public class RoundHole {
    private double radius;

    // Constructor to initialize the radius of the round hole
    public RoundHole(double radius) {
        this.radius = radius;
    }

    // Getter for the radius of the round hole
    public double getRadius() {
        return radius;
    }

    // Method to check if a round peg fits into the round hole
    public boolean fits(RoundPeg peg) {
        // Check if the peg's radius is less than or equal to the hole's radius
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }
}