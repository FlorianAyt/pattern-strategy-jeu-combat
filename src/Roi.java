public class Roi extends Personnage {
    public Roi(){
        this.comportement = new ComportementEpee();
    }
    @Override
    public void combattre(){
        System.out.println("Je suis un roi");
        this.comportement.utiliserArme();
    }

    @Override
    public void setComportement(ComportementArme comportement){
        this.comportement = comportement;
    }
}
