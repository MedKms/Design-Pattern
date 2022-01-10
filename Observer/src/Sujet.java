public interface Sujet {
    public void enregistrerObservateur(Observateur observateur);
    public void SupprimerObservateur(Observateur observateur);
    public void notifierObservateurs();
}
