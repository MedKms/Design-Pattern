public class Element extends Composant{
    Element(String nom){
        super(nom);
    }
    @Override
    public void operation() {
        String tab="";
        for(int i=0;i<level;i++) tab+="\t";
        System.out.println(tab+"Operation sur l'element ("+nom+")");
    }
}
