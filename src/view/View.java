package view;

/**
 * Created by wookie on 4/29/16.
 */
public class View {
    public static final String INPUT_DATA_REQUEST = "Input a proper value for ";
    public static final String NAME = "Name";
    public static final String SURNAME = "Surname";
    public static final String MIDDLENAME = "Middle name";
    public static final String NICKNAME = "Nickname";
    public static final String COMMENTARY = "Commentary";
    public static final String GROUP = "Group";
    public static final String PHONE_NUMBER = "Phone number";
    public static final String CELL_PHONE_NUMBER = "Cellphone number";
    public static final String EMAIL = "email";
    public static final String SKYPE = "skype";
    public static final String ADRESS = "Adress";
    public static final String INTRODUCTION_DATE = "Introduction date";
    public static final String LAST_CHANGE_DATE = "Last change date";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String INDEX = "Index";
    public static final String TOWN = "Town";
    public static final String STREET = "Street";
    public static final String HOME_NUMBER = "Home number";
    public static final String FLAT_NUMBER = "Flat number";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printBigMessage(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String m : message) {
            concatString = concatString.append(m);
        }

        this.printMessage(concatString.toString());
    }
}
