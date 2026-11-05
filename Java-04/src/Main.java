public class Main {
    public static void main(String[] args) {

        // Detyra 1: Punonjesit
        Punonjesi p1 = new Punonjesi("Arben", 500, 3);

        Menaxheri m1 = new Menaxheri(
                "Blerim", 800, 5, 200
        );

        Praktikanti pr1 = new Praktikanti(
                "Driton", 400, 1
        );

        System.out.println(p1);
        System.out.println(m1);
        System.out.println(pr1);


        // Detyra 3: Format
        Forma f1 = new Forma("Bardhe");

        Rrethi r1 = new Rrethi("Kuqe", 5);

        Drejtkendeshi d1 =
                new Drejtkendeshi("Kaltere", 4, 6);

        Katrori k1 = new Katrori("Verdhe", 4);

        System.out.println(f1);
        System.out.println(r1);
        System.out.println(d1);
        System.out.println(k1);


        // Detyra 5: Kompozimi - Vetura dhe Motori
        Motori motori = new Motori(150, false);
        Vetura v = new Vetura(motori);

        v.nisu();
        v.ndalo();
    }
}