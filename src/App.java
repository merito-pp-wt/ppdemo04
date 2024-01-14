import java.util.Scanner;
public class App {
    public String readString(String message) {
        Scanner sc;
        String answer;

        sc = new Scanner(System.in);
        System.out.print(message);
        answer = sc.nextLine();

        return answer;
    }

    public void letterOpening() {
        String name;
        String salutation;

        name = readString("Podaj swoje imię: ");
        if ( name.endsWith("a") ) {
            salutation = "Szanowna Pani ";
        } else {
            salutation = "Szanowny Pan ";
        }

        System.out.println(salutation + name + ",");
    }
}
