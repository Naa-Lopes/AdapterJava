package adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    // Constructor to initialize the adapter with a square peg
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate the minimum radius of a circle that can fit the square peg
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}