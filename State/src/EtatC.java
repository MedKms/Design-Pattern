public class EtatC extends Etat{

    public EtatC(ClasseAvecEtat classeAvecEtat) {
        super(classeAvecEtat);
    }

    @Override
    public void operationA() {
        classeAvecEtat.setEtat(new EtatA(classeAvecEtat));
        System.out.println("Changemene d'etat de C vers A");
    }

    @Override
    public void operationB() {
        classeAvecEtat.setEtat(new EtatB(classeAvecEtat));
        System.out.println("Changemene d'etat de C vers B");
    }

    @Override
    public void operationC() {
        System.out.println("Déja dans l'etat C");
    }

    @Override
    public void doAction() {
        System.out.println("Etat Courant: C");
    }
}
