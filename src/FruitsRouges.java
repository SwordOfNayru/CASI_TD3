public class FruitsRouges extends CoupeGlacee {

    private static FruitsRouges instance;

    private FruitsRouges() {
        super(Parfum.CASSIS, Parfum.FRAISE, Parfum.FRAMBOISE);
        this.prix = 5.5f;
        this.description = "des fruits rouges";
    }

    public static FruitsRouges getInstance() {
        if (FruitsRouges.instance == null) {
            FruitsRouges.instance = new FruitsRouges();
        }
        return instance;
    }
}
