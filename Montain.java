public class Montain {
    private final int height;

    public Montain(int height) {
        this.height = height;
    }

    boolean pass(CanClimb canClimb) {
        return canClimb.getClimb() >= height;
    }
}
