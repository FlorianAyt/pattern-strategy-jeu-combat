public abstract class Personnage {
    protected ComportementArme comportement;

    public abstract void combattre();
    public abstract void setComportement(ComportementArme comportement);
}
