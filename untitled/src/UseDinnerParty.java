import java.util.Scanner;

public class UseDinnerParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Party aParty = new Party();
        DinnerParty aDinnerParty = new DinnerParty();

        aParty.setGuests(getGuests("party", scanner));
        aParty.displayInvitation();

        aDinnerParty.setGuests(getGuests("dinner party", scanner));
        aDinnerParty.setDinnerChoice(getDinnerChoice(scanner));
        aDinnerParty.displayInvitation();

        scanner.close();
    }

    public static int getGuests(String type, Scanner scanner) {
        System.out.print("Enter number of guests for the " + type + " >> ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int getDinnerChoice(Scanner scanner) {
        System.out.print("Enter the menu option -- 1 for chicken or 2 for Vegi >> ");
        return Integer.parseInt(scanner.nextLine());
    }
}
