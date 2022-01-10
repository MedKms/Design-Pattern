public abstract class DecorateurIngredient extends Boisson{
    protected Boisson boisson;
    DecorateurIngredient(Boisson boisson){
        this.boisson=boisson;
    }
    public abstract String getDescription();
}
