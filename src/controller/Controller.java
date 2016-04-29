package controller;


import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import view.View;
import model.Notebook;
import entity.Note;
import entity.Adress;
import entity.Group;

/**
 * Created by wookie on 4/29/16.
 */
public class Controller {
    private View view;
    private Notebook notebook;

    public Controller(Notebook notebook, View view) {
        this.view = view;
        this.notebook = notebook;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        inputNewNote(sc);
    }

    /**
     * Make new entry into notebook
     * @param sc System.in Scanner
     */
    private void inputNewNote(Scanner sc) {
        Note note = new Note();
        Adress adress = new Adress();
        note.setSurname(inputValidString(sc, Regulars.REGEX_NAME, View.SURNAME));
        note.setName(inputValidString(sc, Regulars.REGEX_NAME, View.NAME));
        note.setMiddleName(inputValidString(sc, Regulars.REGEX_NAME, View.MIDDLENAME));
        note.setNickname(inputValidString(sc, Regulars.REGEX_STRING, View.NICKNAME));
        note.setCommentary(inputValidString(sc, Regulars.REGEX_COMMENTARY, View.COMMENTARY));
        note.setGroup(Group.valueOf(inputValidString(sc, Regulars.REGEX_GROUP, View.GROUP)));
        note.setPhoneNumber(inputValidString(sc, Regulars.REGEX_HOME_PHONE, View.PHONE_NUMBER));
        note.setCellPhoneNumber(inputValidString(sc, Regulars.REGEX_CELL_PHONE, View.CELL_PHONE_NUMBER));
        note.setEmail(inputValidString(sc, Regulars.REGEX_MAIL, View.EMAIL));
        note.setSkype(inputValidString(sc, Regulars.REGEX_STRING, View.SKYPE));
        adress.setIndex(inputValidString(sc, Regulars.REGEX_INDEX, View.INDEX));
        adress.setTown(inputValidString(sc, Regulars.REGEX_NAME, View.TOWN));
        adress.setStreet(inputValidString(sc, Regulars.REGEX_NAME, View.STREET));
        adress.setHomeNumber(inputValidString(sc, Regulars.REGEX_NUMBER, View.HOME_NUMBER));
        adress.setFlatNumber(inputValidString(sc, Regulars.REGEX_NUMBER, View.FLAT_NUMBER));
        note.setAdress(adress);
        note.setIntroductionDate(Regulars.DATE_FORMAT.format(new Date()));


        this.notebook.addNote(note);
        view.printMessage(this.notebook.getNotebook().get(0).getGroup().toString());
    }

    /**
     *
     * @param sc System.in Scanner
     * @param regexp regular expression for date validation
     * @param message String message
     * @return valid String for entity class
     */
    private String inputValidString(Scanner sc, String regexp,  String message) {
        Pattern p = Pattern.compile(regexp);
        Matcher m;

//        while( ! sc.hasNext(p)) {
//            System.out.println("No");
//            sc.next();
//        }

        String temp;
        do {
            view.printBigMessage(View.INPUT_DATA_REQUEST, message);
            temp = sc.next();
            m =  p.matcher(temp);
        } while(!m.matches());

        //return sc.next(p);
        return temp;
    }

}
