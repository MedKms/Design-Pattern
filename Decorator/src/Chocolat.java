public class Chocolat extends  DecorateurIngredient{
    public Chocolat(Boisson boisson){
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+", Chocolat";
    }
    public double cout(){
        return boisson.cout()+0.5;
    }
}
