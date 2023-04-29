public class Cardiology extends jobDefinition{
    private String appellation;

    public Cardiology(String appellation, String name, String surname, int identityNo) {
        super(name, surname, identityNo);
        this.appellation = appellation;
    }
    void riskCalculate() throws InterruptedException {
        System.out.println(appellation + "doctor" + getName() + "heart attack calculated by");
        Thread.sleep(3000);
        System.out.println("examination completed");
    }
    void ekg() throws InterruptedException {
        System.out.println(appellation + "doctor" + getName() + "EKG taken by");
        Thread.sleep(3000);
        System.out.println("successfully");
    }

    @Override
    void nameBadge() {
        super.nameBadge();
        System.out.println("Appellation: " + appellation);
    }
}
