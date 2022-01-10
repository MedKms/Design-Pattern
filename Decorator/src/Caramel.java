public class Caramel extends  DecorateurIngredient{
    Caramel(Boisson boisson){
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+", Caramel";
    }
    public double cout(){
        return boisson.cout()+0.8;
    }
}
