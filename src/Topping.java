public abstract class Topping implements Dessert {

    protected Dessert base;

    protected float prix;

    protected String label;

    protected Topping(Dessert base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return this.base.toString() + " " + this.label;
    }

    @Override
    public float getPrix() {
        return this.base.getPrix() + this.prix;
    }

}
