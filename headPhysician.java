public class headPhysician extends jobDefinition{
    private String appellation;
    private String speciality;
    private int serviceTime;


    public headPhysician(String name, String surname, int identityNo, String appellation, String speciality, int serviceTime) {
        super(name, surname, identityNo);
        this.appellation = appellation;
        this.serviceTime = serviceTime;
        this.speciality = speciality;
    }
    void work() throws InterruptedException {
        String s = "Head physician: " + getName() + "oversees doctors' annual leave";
        Thread.sleep(3000);
        String s1 = "Head physician: " + getName() + "supervising laboratory services";
        Thread.sleep(3000);
        System.out.println(s);
        System.out.println(s1);
    }

    @Override
    void nameBadge() {
        super.nameBadge();
        System.out.println("Appellation: " + appellation);
        System.out.println("Speciality: " + speciality);
        System.out.println("Service time: " + serviceTime);
    }
}
