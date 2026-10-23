public class Medlem {
    private int medlemsnummer;
    private String namn;
    private String epost;


    public Medlem(int medlemsnummer, String namn, String epost) {
        this.medlemsnummer = medlemsnummer;
        this.namn = namn;
        this.epost = epost;
    }
    public int getMedlemsnummer() {
        return medlemsnummer;
    }

    public String getNamn() {
        return namn;
    }
    public String getEpost() {
        return epost;
    }
    public void visaInfo() {
        System.out.println("Medlemsnummer: " + this.medlemsnummer);
        System.out.println("Namn: " + this.namn);
        System.out.println("Epost: " + this.epost);
    }
}
