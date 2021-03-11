public class Reine extends Personnage{
    public Reine(){
        this.comportement = new ComportementPoignard();
    }
    @Override
    public void combattre(){
        System.out.println("Je suis une reine");
        this.comportement.utiliserArme();
    }
    @Override
    public void setComportement(ComportementArme comportement){
        this.comportement = comportement;
    }
}
