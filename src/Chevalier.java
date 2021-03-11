public class Chevalier extends Personnage{
    public Chevalier(){
        this.comportement = new ComportementArcEtFleches();
    }

    @Override
    public void combattre(){
        System.out.println("Je suis un chevalier");
        this.comportement.utiliserArme();
    }

    @Override
    public void setComportement(ComportementArme comportement){
        this.comportement = comportement;
    }
}
