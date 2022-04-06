public class App {
    public static void main(String[] args) throws Exception {
        Commande commande = new Commande();
        commande.addCoupeeGlace(FruitsRouges.getInstance());
        commande.addCoupeeGlace(FruitsRouges.getInstance());
        commande.addCoupeeGlace(TripleChocolats.getInstance());

        System.out.println(commande.editerFacture());
    }
}
