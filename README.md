

Detyra 6 – Gjeje gabimin  (10 pikë)

public class Llogaria {
    private double bilanci;
    public Llogaria(double bilanci) { this.bilanci = bilanci; }
}

public class LlogariKursimi extends Llogaria {
    private double interesi;

    public LlogariKursimi(double interesi) {
        this.interesi = interesi;
        // Gabimi 1: Mungon super(bilanci) per te thirrur konstruktorin e klases prind.
    }

    public void shtoInteresin() {
        bilanci = bilanci + bilanci * interesi;
        // Gabimi 2: Bilanci eshte private dhe nuk mund te perdoret direkt ne klasen femije.
    }
}

Detyra 7 – Reflektim
Shkruani “titullin e lajmit” tuaj për javën dhe 3–4 fjali: ku në projektet që ju interesojnë (lojëra, aplikacione, web) do të përdornit trashëgiminë?

Detyra e 7

El Clasico Barcelona kunder Real Madridit
Per shembull nese do te krijoja nje program per
futbollin klasen prind do ta quaja ElClasico ndersa klasat femije do te ishin Barcelona dhe RealMadrid
Klasa prind do ti permbante te dhenat e perbashketa te ndeshjes si stadiumi dhe emri i ndeshjes
Barcelona dhe Real Madridi do ti trashegonin keto te dhena por secila do ti kishte edhe karakteristikat e veta
Keshtu programi do te ishte me i thjeshte dhe me i organizuar pa pasur nevoje ta perserisja te njejtin kod



Detyra 2 – Teori: IS-A dhe HAS-A
(a) Dallimi mes trashegimise dhe kompozimit

Trashegimia (IS-A) perdoret kur nje klase eshte nje lloj i nje klase tjeter Kompozimi (HAS-A) perdoret kur nje klase ka nje objekt te nje klase tjeter

(b) Shembuj nga sistemi i spitalit

IS-A (Trashegimia)
Mjeku IS-A Person
Infermieri IS-A Person
Pacienti IS-A Person
HAS-A (Kompozimi)
Spitali HAS-A Mjek
Spitali HAS-A Dhome
Pacienti HAS-A DosjeMjekesore
(c) Pse Stack extends Vector konsiderohet gabim


Stack extends Vector konsiderohet gabim sepse stack duhet te lejoje vetem veprimet e pirgut LIFO (Last In First Out) dhe jo te gjitha veprimet qe ofron vector Per kete arsye kompozimi eshte me i pershtatshem se trashegimia
