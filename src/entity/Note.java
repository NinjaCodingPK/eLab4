package entity;

import controller.Regulars;

import java.util.Date;

/**
 * Entity class. Each "set" method of this class always renew "lastChangeDate" parameter.
 * Created by wookie on 4/29/16.
 */
public class Note {
    private String surname;
    private String name;
    private String middleName;
    private String nickname;
    private String commentary;
    private Group group;
    private String phoneNumber;
    private String cellPhoneNumber;
    private String email;
    private String skype;
    private Adress adress;
    private String introductionDate;
    private String lastChangeDate;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
        this.setLastChangeDate(Regulars.DATE_FORMAT.format(new Date()));
    }

    public String getIntroductionDate() {
        return introductionDate;
    }

    public void setIntroductionDate(String introductionDate) {
        this.introductionDate = introductionDate;
    }

    public String getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }
}

