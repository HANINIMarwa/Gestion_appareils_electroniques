package tp4;
import tp4.AppareilElectronique;
public class Tablette extends AppareilElectronique{
    private int  capacitebatterie;

    public Tablette(String marque, String modele, double prix, int capacitebatterie) {
        super(marque, modele, prix);
        this.capacitebatterie = capacitebatterie;
    }

    public int getCapacitebatterie() {
        return capacitebatterie;
    }

    public void setCapacitebatterie(int capacitebatterie) {
        this.capacitebatterie = capacitebatterie;
    }
    @Override
    public void afficherinfos(){
        super.afficherinfos();
        System.out.println("capacitebatterie en mAh: " + capacitebatterie );
    }
}
