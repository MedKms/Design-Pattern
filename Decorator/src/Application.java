public class Application {
    public static void main(String[] args) {
        Boisson b=new Chocolat(new Caramel(new Chocolat(new Caramel(new Espresso()))));
        System.out.println(b.getDescription()+" "+b.cout());
    }
}
