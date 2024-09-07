package adapter;

public class SquarePeg {

    private double width;

    // Constructor to initialize the width of the square peg
    public SquarePeg(double width) {
        this.width = width;
    }

    // Getter for the width of the square peg
    public double getWidth() {
        return width;
    }

    // Method to calculate the area of the square peg
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}