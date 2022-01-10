public class EtatA extends Etat{
    public EtatA(ClasseAvecEtat classeAvecEtat) {
        super(classeAvecEtat);
    }

    @Override
    public void operationA() {
        System.out.println("Classe déja dans l'etat A ");
    }

    @Override
    public void operationB() {
        classeAvecEtat.setEtat(new EtatB(classeAvecEtat));
        System.out.println("Cangement d'etat de A=>B");
    }

    @Override
    public void operationC() {
        System.out.println("Impossible de Passe de A=>C");
    }

    @Override
    public void doAction() {
        System.out.println("Etat Courant: A");
    }
}
