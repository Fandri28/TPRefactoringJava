package iut.bad;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    public static void main(String[] args) {
        Femme f = new Femme("Martin", "Sophie", 22);
        f.details();  
    }
}
