public class Troll extends Personnage{
    public Troll(){
        this.comportement = new ComportementHache();
    }
    @Override
    public void combattre(){
        System.out.println("Je suis un troll ");
       this.comportement.utiliserArme();
    }
    @Override
    public void setComportement(ComportementArme comportement){
        this.comportement = comportement;
    }
}
