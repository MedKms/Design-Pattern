public abstract class  Etat {
    protected ClasseAvecEtat classeAvecEtat;

    public Etat(ClasseAvecEtat classeAvecEtat) {
        this.classeAvecEtat = classeAvecEtat;
    }
    public abstract void operationA();
    public abstract void operationB();
    public abstract void operationC();
    public abstract void doAction();

}
