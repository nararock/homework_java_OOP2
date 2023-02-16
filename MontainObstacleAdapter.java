public class MontainObstacleAdapter implements Obstacle {
    private Montain montain;

    public MontainObstacleAdapter(Montain montain) {
        this.montain = montain;
    }

    @Override
    public boolean pass(Participant participant) {
        return montain.pass(participant);
    }
}
