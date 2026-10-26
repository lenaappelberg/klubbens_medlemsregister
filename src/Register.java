import java.util.ArrayList;

public class Register {
    private ArrayList<Medlem> medlemmar = new ArrayList<>();

    public void laggTillMedlem(Medlem medlem) {
        medlemmar.add(medlem);
    }

    public void visaAllaMedlemmar() {
        if (medlemmar.isEmpty()) {
            System.out.println("Registret är tomt.");
        } else {
            for (Medlem medlem : medlemmar) {
                medlem.visaInfo();
            }
        }
    }
    public void sokMedlem(String namn) {
        for (Medlem medlem : medlemmar) {
            if (medlem.getNamn().equalsIgnoreCase(namn)) {
                medlem.visaInfo();
                return;
            }
        }
        System.out.println("Medlemmen finns inte i registret.");
    }
}


