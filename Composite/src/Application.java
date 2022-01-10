public class Application {
    public static void main(String[] args) {
        Composite racine=new Composite("Composite 1");
        Composite composite2=new Composite("Composite 2");
        racine.add(composite2);
        racine.add(new Element("Element 1"));
        racine.add(new Element("Element 2"));
        racine.add(new Composite("Composite 3"));
        composite2.add(new Element("Element 4"));
        racine.operation();
    }
}
