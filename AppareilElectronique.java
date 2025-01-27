package tp4;

public class AppareilElectronique {
    private  String marque ;
    private String modele;
    private double prix;


    public AppareilElectronique(String marque, String modele, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void afficherinfos(){
        System.out.println("Marque: " + marque + ", Modèle: " + modele + ", Prix: " + prix + " €");
        }
    }

    }

