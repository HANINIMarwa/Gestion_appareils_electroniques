package tp4;

import tp4.AppareilElectronique;

public class Smartphone extends AppareilElectronique {
    private double tailleecran;

    public Smartphone(String marque, String modele, double prix, double tailleecran) {
        super(marque, modele, prix);
        this.tailleecran = tailleecran;
    }

    public double getTailleecran() {
        return tailleecran;
    }

    public void setTailleecran(double tailleecran) {
        this.tailleecran = tailleecran;
    }
    @Override
    public void afficherinfos(){
        super.afficherinfos();
        System.out.println("tailleecran: " + tailleecran );
    }
}
