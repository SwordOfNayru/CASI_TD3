import java.util.ArrayList;
import java.util.List;

public abstract class CoupeGlacee implements Dessert {
    protected float prix;
    protected String description;
    protected List<Parfum> listParfum;

    protected CoupeGlacee(Parfum... parfums) {
        this.listParfum = new ArrayList<Parfum>();
        for (Parfum parfum : parfums) {
            listParfum.add(parfum);
        }
    }

    public float getPrix() {
        return this.prix;
    };

    public String getDescription() {
        return this.description;
    }

    public List<Parfum> getParfums() {
        return listParfum;
    }

    public String toString() {
        String parfums = "";
        for (Parfum parfum : listParfum) {
            parfums = parfums + " " + parfum.toString();
        }

        return String.format("Coupe%s", parfums);
    }
}
