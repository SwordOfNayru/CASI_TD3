import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Commande {

    private ArrayList<Dessert> lignes;

    public Commande() {
        this.lignes = new ArrayList<Dessert>();
    }

    public void addDessert(Dessert coupe) {
        this.lignes.add(coupe);
    }

    public String editerFacture() {
        String sorti = "";

        float sum = 0f;

        for (Dessert ligne : lignes) {
            sorti = sorti + String.format("%s + %f\n", ligne.toString(), ligne.getPrix());
            sum += ligne.getPrix();
        }

        sorti = sorti + String.format("Total %f", sum);

        return sorti;
    }

}
