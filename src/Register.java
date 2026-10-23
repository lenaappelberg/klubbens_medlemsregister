import java.util.ArrayList;

public class Register {
    private ArrayList<Medlem> medlemmar = new ArrayList<>();

    public void laggTillMedlem(Medlem medlem) {
        medlemmar.add(medlem);
    }
public void visaAllaMedlemmar () {
        for (Medlem medlem : medlemmar) {
            medlem.visaInfo();
        }
}
}

