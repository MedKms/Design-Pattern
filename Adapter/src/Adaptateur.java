public class Adaptateur implements Standard{
    private Impladaptee impladaptee=new Impladaptee();
    @Override
    public void operation(int a, int b) {
        int nb=impladaptee.operation2(a,b);
        impladaptee.operation3(nb);
    }
}
