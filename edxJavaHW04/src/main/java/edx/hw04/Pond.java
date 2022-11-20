package edx.hw04;

public class Pond {

    public static void main(String[] args) {
        Frog Peepo = new Frog("Peepo");
        Frog Pepe = new Frog("Pepe", 10, 15);
        Frog Peepaw = new Frog("Peepaw", 4.6, 10);
        Frog Kell = new Frog("Kell", 9, 7);

        Fly fly1 = new Fly(1, 3);
        Fly fly2 = new Fly(6);
        Fly fly3 = new Fly(6,8);

        Kell.setSpecies("1331Frogs");
        System.out.println(Peepo.toString());

        Peepo.eat(fly2);
        System.out.println(fly2.toString());

        Peepo.grow(8);
        Peepo.eat(fly2);
        System.out.println(fly2.toString());
        Peepo.eat(fly3);
        System.out.println(fly3.toString());
        System.out.println(Peepo.toString());
        System.out.println(Kell.toString());

        Peepaw.grow(4);
        System.out.println(Peepaw.toString());
        System.out.println(Pepe.toString());

    }
}
