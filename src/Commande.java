import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Commande {

    private ArrayList<CoupeGlacee> lignes;

    public Commande() {
        this.lignes = new ArrayList<CoupeGlacee>();
    }

    public void addCoupeeGlace(CoupeGlacee coupe) {
        this.lignes.add(coupe);
    }

    public String editerFacture() {
        String sorti = "";

        float sum = 0f;

        for (CoupeGlacee ligne : lignes) {
            sorti = sorti + String.format("%s + %f\n", ligne.toString(), ligne.getPrix());
            sum += ligne.getPrix();
        }

        sorti = sorti + String.format("Total %f", sum);

        return sorti;
    }

}
