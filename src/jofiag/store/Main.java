package jofiag.store;

public class Main {

    public static void main(String[] args) {
        Car Bugatti = new Car("Buggati", "Bleue", 2_000_000);
        Car CamaroSS = new Car("CamaroSS", "Noir malt", 50_000);
        Car MustandGT = new Car("MustangGT", "Blan bleue", 100_000);
        Car Muciellaguo = new Car("Muciellago", "Vert", 500_000);
        Car Gaillardo = new Car("Gaillardo", "Jaune", 400_000);
        Car Porche = new Car("Porche", "Gris", 30_000);

        System.out.println(Bugatti);
        System.out.println(CamaroSS);
        System.out.println(MustandGT);
        System.out.println(Muciellaguo);
        System.out.println(Gaillardo);
        System.out.println(Porche);
    }
}
