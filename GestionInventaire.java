package tp4;
import java.util.ArrayList;
import tp4.Smartphone;
import tp4.OrdinateurPortable;
import tp4.Tablette;
import tp4.AppareilElectronique;
public class GestionInventaire {
    //ArrayList<AppareilElectronique> A;
   //A new ArrayList<AppareilElectronique>  ;

    ArrayList<AppareilElectronique> S = new ArrayList<>();
    ArrayList<AppareilElectronique> T = new ArrayList<>();
    ArrayList<AppareilElectronique> O = new ArrayList<>();

    // ajouter des appareils:
    public void add(AppareilElectronique a) {
        GestionInventaire.add(a);  // Add the device to the ArrayList of inventory
        System.out.println("Appareil ajouté : " + a.getMarque() + " " + a.getModele());
    }

}
