public class DinnerParty extends Party {
    private int dinnerChoice;

    public void setDinnerChoice(int choice) {
        dinnerChoice = choice;
    }

    public int getDinnerChoice() {
        return dinnerChoice;
    }

    public void displayInvitation() {
        super.displayInvitation();
        System.out.println("Menu option " + dinnerChoice + " will be served");
    }
}
