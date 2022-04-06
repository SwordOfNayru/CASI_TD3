public class TripleChocolats extends CoupeGlacee {

    private static TripleChocolats instance;

    private TripleChocolats() {
        super(Parfum.CHOCOBLANC, Parfum.CHOCOLAIT, Parfum.CHOCONOIR);
        this.prix = 6f;
        this.description = "des fruits rouges";
    }

    public static TripleChocolats getInstance() {
        if (TripleChocolats.instance == null) {
            TripleChocolats.instance = new TripleChocolats();
        }
        return instance;
    }

}
