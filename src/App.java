public class App {
    public static void main(String[] args) {
       Personnage roi =new Roi();
       roi.combattre();

       roi.setComportement(new ComportementPoignard());
       System.out.println("Changement de comportement");
       roi.combattre();

    }
}
