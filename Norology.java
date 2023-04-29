public class Norology extends jobDefinition{
    private String institutionOfDiploma;

    public Norology(String name, String surname, int identityNo, String institutionOfDiploma) {
        super(name, surname, identityNo);
        this.institutionOfDiploma = institutionOfDiploma;
    }
    void sleepingDisorder() throws InterruptedException {
        System.out.println("Doctor" + getName() + "being treated for sleep disorders by");
        Thread.sleep(3000);
        System.out.println("successfully");
    }
    void headache() throws InterruptedException {
        System.out.println("Doctor" + getName() + "being treated for headache by");
        Thread.sleep(3000);
        System.out.println("successfully");
    }

    @Override
    void nameBadge() {
        super.nameBadge();
        System.out.println("Institution Of Diploma: " + institutionOfDiploma);
    }
}
