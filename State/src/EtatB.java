public class EtatB extends Etat{
    public EtatB(ClasseAvecEtat classeAvecEtat) {
        super(classeAvecEtat);
    }

    @Override
    public void operationA() {
        System.out.println("Impossible de passe vers B=>A");
    }

    @Override
    public void operationB() {
        System.out.println("Déja dans l'etat B");
    }

    @Override
    public void operationC() {
        classeAvecEtat.setEtat(new EtatC(classeAvecEtat));
        System.out.println("Changement d'etat de B => C");
    }

    @Override
    public void doAction() {
        System.out.println("Etat Courant: B");

    }
}
