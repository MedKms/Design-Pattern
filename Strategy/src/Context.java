public class Context {
    public Strategy strategy;
    public void appliqueStrategy(){
        strategy.operationStrategy();
    }
    public void setStrategy(Strategy strategy){
        this.strategy=strategy;
    }
}
