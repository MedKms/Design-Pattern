public class Proxy implements Abstraction{
    private Implementation implementation;
    @Override
    public void operation() {
        System.out.println("Verification des conditions d'àccés par le proxy ");
        implementation=new Implementation();
        implementation.operation();
    }
}
