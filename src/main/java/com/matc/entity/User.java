package com.matc.entity;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.log4j.*;


// TODO Add instance variable for the date of birth
// TODO Add a calculation for the user's age. Age should not be stored, it should be calculated only.

/**
 * A class to represent a user.
 *
 * @author pwaite
 */
public class User {
    private String firstName;
    private String lastName;
    private String userid;
    private String dateOfBirth;
    private int age;




    /**
     * Instantiates a new User.
     */
    public User() {
    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param userid    the userid
     * @param dateOfBirth    the dateOfBirth
     */
    public User(String firstName, String lastName, String userid, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userid = userid;
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }




    /**
     * Gets dateOfBirth.
     *
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets dateOfBirth.
     *
     * @param dateOfBirth the dateOfBirth
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public void calculateUserAge() throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
        Date date = formatter.parse(dateOfBirth);

        Calendar dob = Calendar.getInstance();
        dob.setTime(date);


        Calendar today = Calendar.getInstance();
        int curYear = today.get(Calendar.YEAR);
        int curMonth = today.get(Calendar.MONTH);
        int curDay = today.get(Calendar.DAY_OF_MONTH);

        int year = dob.get(Calendar.YEAR);
        int month = dob.get(Calendar.MONTH);
        int day = dob.get(Calendar.DAY_OF_MONTH);

        age = curYear - year;


    }




    @Override
    public String toString() {
        return "User [ " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userid='" + userid + '\'' +
                ", Age='" + age + '\'' +
                ']';
    }


}
