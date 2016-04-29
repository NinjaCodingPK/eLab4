package controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by wookie on 4/29/16.
 */
public abstract class Regulars {
    // date
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
    // for enum
    public static final String REGEX_GROUP = "^First||Second||Third$";
    // 01, 11, 11A
    public static final String REGEX_NUMBER = "^[0-9]{2}[A-Z]?$";
    //  01001
    public static final String REGEX_INDEX = "^[0-9]{5}$";
    // commentary regex (may be empty)
    public static final String REGEX_COMMENTARY = "^[a-zA-Z0-9-_,.]*$";
    // non-empty string
    public static final String REGEX_STRING = "^[a-zA-Z0-9-_]+$";
    // «nick@mail.com»
    public static final String REGEX_MAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    // «http://www.my-site.com»
    public static final String REGEX_URL = "^((https?|ftp)\\:\\/\\/)?([a-z0-9]{1})((\\.[a-z0-9-])|([a-z0-9-]))*\\.([a-z]{2,6})(\\/?)$";
    // «+38(044)555-55-55»
    public static final String REGEX_HOME_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    // 050-555-55-55
    public static final String REGEX_CELL_PHONE = "^\\d{3}-\\d{3}-\\d{2}-\\d{2}$";
    // Name , Surname , Middlename
    public static final String REGEX_NAME = "^[A-Z]{1}[a-z]+$";
}
