import java.util.Scanner;

public class Main {
    public void main (String[] args){
        Register medlemsregister = new Register();
        Scanner scanner = new Scanner(System.in);
        int choice=1;
        while(!(choice==0)){
            System.out.println("Choose between: 1. Add a member | 2. List all members | 3. Search for a member" +
                    " | 4. Exit program");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Add member");
                    System.out.println("Write the member's name");
                    String medlemsnamn=scanner.next();
                    System.out.println("Write the member's number");
                    int medlemsnummer=scanner.nextInt();
                    System.out.println("Write the members email");
                    String medlemsemejl=scanner.next();
                    Medlem nymedlem=new Medlem(medlemsnummer,medlemsnamn,medlemsemejl);
                    medlemsregister.laggTillMedlem(nymedlem);
                    break;
                case 2:
                    System.out.println("List all members");
                    medlemsregister.visaAllaMedlemmar();
                    break;
                case 3:
                    System.out.println("Search all members");
                    System.out.println("Which member do you want to search for?");
                    String medlemssoknamn=scanner.next();
                    medlemsregister.sokMedlem(medlemssoknamn);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    choice=0;
                    break;
            }
        }
    }
}