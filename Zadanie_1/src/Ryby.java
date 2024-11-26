public class Ryby {

    String gatunek;
    String nazwa;
    String wystepowanie;
    String top = "bul bul";

    public void topienie(int y) {
        System.out.print(top);
        System.out.print(" ");
    }

    public void rybka() {
        System.out.println("Gatunek: " + gatunek);
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Wystepowanie: " + wystepowanie);
        System.out.println(top);
    }

}
