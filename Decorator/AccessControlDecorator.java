import java.util.Scanner;

public class AccessControlDecorator {
    private final AccessControl accessControl;

    public AccessControlDecorator(AccessControl accessControl) {
        this.accessControl = accessControl;
    }

    public void accessSensitiveData(DataStructure dataStructure) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Syötä salasana: ");
        String password = scanner.nextLine();

        if (accessControl.authenticate(password)) {
            System.out.println("Pääsy sallittu. Sensitiiviset tiedot:");
            for (String data : dataStructure.sensitiveData) {
                System.out.println(data);
            }
        } else {
            System.out.println("Virheellinen salasana. Pääsy evätty.");
        }
    }
}
