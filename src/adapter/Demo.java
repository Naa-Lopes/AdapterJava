package adapter;

public class Demo {
    public static void main(String[] args) {
        // Create a round hole with a radius of 5
        RoundHole hole = new RoundHole(5);
        
        // Create a round peg with a radius of 5
        RoundPeg rpeg = new RoundPeg(5);
        
        // Check if the round peg fits into the round hole
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        // Create square pegs with different widths
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        
        // The following line will not compile because the fits method expects a RoundPeg
        // hole.fits(smallSqPeg); // Won't compile.

        // Use adapters to allow square pegs to fit into the round hole
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        
        // Check if the square peg (with width 2) fits into the round hole
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        
        // Check if the square peg (with width 20) fits into the round hole
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}