public class ClasseAvecEtat {
    private Etat etat;

    public ClasseAvecEtat() {
        etat =new EtatA(this);
    }

    public void OperationEtatA(){
        etat.operationA();
    }
    public void OperationEtatB(){
        etat.operationB();
    }
    public void OperationEtatC(){
        etat.operationC();
    }
    public void doAction(){
        etat.doAction();
    }
    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public Etat getEtat() {
        return etat;
    }
}
