import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant{
    private List<Composant> composants=new ArrayList<>();
    Composite(String nom){
        super(nom);
    }
    public void add(Composant composant){
        composant.level=this.level+1;
        composants.add(composant);
    }
    public void remove(Composant composant){
        composants.remove(composant);
    }
    public List<Composant> getChilds(){
        return  composants;
    }
    @Override
    public void operation() {
        String tab=""; for(int i=0;i<level;i++) tab+="\t";
        System.out.println(tab+"Operation sur l'element ("+nom+")");
        for(Composant composant:composants)
            composant.operation();
    }
}
