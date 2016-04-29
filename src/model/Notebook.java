package model;

import entity.Note;

import java.util.ArrayList;

/**
 *
 * Created by wookie on 4/29/16.
 */
public class Notebook {
    private ArrayList<Note> notebook;

    public Notebook() {
        notebook = new ArrayList<>();
    }

    public void addNote(Note note) {
        notebook.add(note);
    }

    public ArrayList<Note> getNotebook() {
        return notebook;
    }

    public void setNotebook(ArrayList<Note> note) {
        this.notebook = note;
    }
}
