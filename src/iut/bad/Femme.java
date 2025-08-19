package iut.bad;

public class Femme {
    // Attributs
    private String nom;
    private String prenom;
    private int age;

    // Constructeur
    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    // Méthode pour afficher les infos
    public void details() {
        System.out.println("Nom : " + nom + ", Prénom : " + prenom + ", Âge : " + age);
    }

    // Programme de test
    public static void main(String[] args) {
        Femme f = new Femme("Martin", "Sophie", 22);
        f.details();
    }
}
