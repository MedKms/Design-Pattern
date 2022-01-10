public class Application {
    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy(new StrategyImpl2());
        context.appliqueStrategy();
    }
}
