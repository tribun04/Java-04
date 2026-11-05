class Forma {
    protected String ngjyra;

    public Forma(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public double siperfaqja() {
        return 0;
    }

    @Override
    public String toString() {
        return "Ngjyra: " + ngjyra;
    }
}

class Rrethi extends Forma {
    private double rrezja;

    public Rrethi(String ngjyra, double rrezja) {
        super(ngjyra);
        this.rrezja = rrezja;
    }

    @Override
    public double siperfaqja() {
        return Math.PI * rrezja * rrezja;
    }

    @Override
    public String toString() {
        return "Rrethi - " + super.toString()
                + ", Siperfaqja: " + siperfaqja();
    }
}

class Drejtkendeshi extends Forma {
    protected double gjatesia;
    protected double gjeresia;

    public Drejtkendeshi(String ngjyra,
                         double gjatesia, double gjeresia) {
        super(ngjyra);
        this.gjatesia = gjatesia;
        this.gjeresia = gjeresia;
    }

    @Override
    public double siperfaqja() {
        return gjatesia * gjeresia;
    }

    @Override
    public String toString() {
        return "Drejtkendeshi - " + super.toString()
                + ", Siperfaqja: " + siperfaqja();
    }
}

class Katrori extends Drejtkendeshi {

    public Katrori(String ngjyra, double a) {
        super(ngjyra, a, a);
    }

    @Override
    public double siperfaqja() {
        return super.siperfaqja();
    }

    @Override
    public String toString() {
        return "Katrori - " + super.toString();
    }
}

