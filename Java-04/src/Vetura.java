public class Vetura {
    private Motori motori;

    public Vetura(Motori motori) {
        this.motori = motori;
    }

    public void nisu() {
        motori.ndize();
        System.out.println("Vetura u nis");
    }

    public void ndalo() {
        motori.fike();
        System.out.println("Vetura u ndal");
    }
}