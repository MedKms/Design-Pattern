import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements Sujet {
    private float temperature;
    private float humidite;
    private float pression;
    private List<Observateur> observateurs=new ArrayList<>();
    @Override
    public void enregistrerObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    @Override
    public void SupprimerObservateur(Observateur observateur) {
        int i=observateurs.indexOf(observateur);
        if(i>=0) observateurs.remove(i);
    }

    @Override
    public void notifierObservateurs() {
        for(Observateur observateur:observateurs){
            observateur.actualiser(temperature,humidite,pression);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidite() {
        return humidite;
    }

    public float getPression() {
        return pression;
    }
    private void setMesures(float t,float h,float p){
        this.temperature=t;
        this.humidite=h;
        this.pression=p;
        notifierObservateurs();
    }
}
