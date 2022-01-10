public class Application {
    public static void main(String[] args) {
        Standard standard1=new StandardImpl1();
        standard1.operation(3,2);
        Standard standard2=new Adaptateur();
        standard2.operation(3,4);
    }
}
