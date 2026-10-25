import java.util.Scanner;

public class Main {
    public void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice=1;
        while(!(choice==0)){
            System.out.println("Choose between: 1. add a member | 2. List all members | 3. Search a member" +
                    " | 4. Exit program");
            choice=scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("add member");
                    break;
                case 2:
                    System.out.println("List all members");
                    break;
                case 3:
                    System.out.println("Search all members");
                    break;
                case 4:
                    System.out.println("Goodbye");
                    choice=0;
                    break;
            }
        }
    }
}