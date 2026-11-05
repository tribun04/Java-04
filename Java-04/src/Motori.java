public class Motori {
    private int fuqiaKF;
    private boolean ndezur;

    public Motori(int fuqiaKF, boolean ndezur) {
        this.fuqiaKF = fuqiaKF;
        this.ndezur = ndezur;
    }

    public void ndize() {
        ndezur = true;
    }

    public void fike() {
        ndezur = false;
    }

    public boolean isNdezur() {
        return ndezur;
    }
}