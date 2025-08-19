package iut.bad;

public class Homme extends Humain {

    public Homme(String nom, String prenom, int age) {
        super(nom, prenom, age); 
    }

    public static void main(String[] args) {
        Homme h = new Homme("Dupont", "Jean", 25);
        h.details();
    }
}
