public class AffichageCondition implements Observateur,Affichage{
    private Sujet donneeMeteo;
    private float temperature;
    private float humidite;

    public AffichageCondition(Sujet donneeMeteo) {
        this.donneeMeteo = donneeMeteo;
        donneeMeteo.enregistrerObservateur(this);
    }

    @Override
    public void actualiser(float temperature, float humidite, float pression) {
        this.temperature=temperature;
        this.humidite=humidite;
       afficher();
    }

    @Override
    public void afficher() {
        System.out.println("Condition actuelles "+temperature+" degés et "+humidite+" % d'himidité");
    }
}
