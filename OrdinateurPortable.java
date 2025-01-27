package tp4;
import tp4.AppareilElectronique;
public class OrdinateurPortable extends AppareilElectronique{
    private int ram;

    public OrdinateurPortable(String marque, String modele, double prix, int ram) {
        super(marque, modele, prix);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    @Override
    public void afficherinfos(){
        super.afficherinfos();
        System.out.println("RAM en Go: " + ram );
    }
}
