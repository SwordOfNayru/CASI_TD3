public class App {
    public static void main(String[] args) throws Exception {
        Commande commande = new Commande();

        Dessert uno = new Chantilly(FruitsRouges.getInstance());
        Dessert dos = new Fraise(new Chantilly(FruitsRouges.getInstance()));
        Dessert tres = TripleChocolats.getInstance();
        Dessert quatro = new Chantilly(new Chocolat(TripleChocolats.getInstance()));

        commande.addDessert(uno);
        commande.addDessert(dos);
        commande.addDessert(tres);
        commande.addDessert(quatro);

        System.out.println(commande.editerFacture());
    }
}
