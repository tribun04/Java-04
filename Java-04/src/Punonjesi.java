class Punonjesi {
    protected String emri;
    protected double pagaBaze;
    protected int vitetEPunes;

    public Punonjesi(String emri, double pagaBaze, int vitetEPunes) {
        this.emri = emri;
        this.pagaBaze = pagaBaze;
        this.vitetEPunes = vitetEPunes;
    }

    public double llogaritPagen() {
        return pagaBaze + (vitetEPunes * 10);
    }

    @Override
    public String toString() {
        return "Emri: " + emri +
                ", Paga: " + llogaritPagen() + " EUR";
    }
}

class Menaxheri extends Punonjesi {
    private double bonusi;

    public Menaxheri(String emri, double pagaBaze,
                     int vitetEPunes, double bonusi) {
        super(emri, pagaBaze, vitetEPunes);
        this.bonusi = bonusi;
    }

    @Override
    public double llogaritPagen() {
        return super.llogaritPagen() + bonusi;
    }

    @Override
    public String toString() {
        return "Menaxheri - " + super.toString() +
                ", Bonusi: " + bonusi + " EUR";
    }
}

class Praktikanti extends Punonjesi {

    public Praktikanti(String emri, double pagaBaze,
                       int vitetEPunes) {
        super(emri, pagaBaze, vitetEPunes);
    }

    @Override
    public double llogaritPagen() {
        return super.llogaritPagen() * 0.60;
    }

    @Override
    public String toString() {
        return "Praktikanti - " + super.toString();
    }
}