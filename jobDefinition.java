public class jobDefinition {
    private String name;
    private String surname;
    private int identityNo;

    public jobDefinition(String name, String surname, int identityNo) {
        this.name = name;
        this.surname = surname;
        this.identityNo = identityNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getIdentityNo(){
        return identityNo;
    }

    public void setIdentityNo(int identityNo) {
        this.identityNo = identityNo;
    }
    void nameBadge(){
        System.out.println("name:" + name);
        System.out.println("surname:" + surname);
        System.out.println("identity no:" + identityNo);
    }
}
