package ContactBook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Contact {

    private String name;
    private String dateOfBirth;
    private String phoneNumber;
    private int age;

    public Contact(String name, String phoneNumber, String dateOfBirth) throws ParseException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be Null of left Blank.");
        }
        if (phoneNumber ==null||phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("PhoneNumber cannot be Null of left Blank.");
        }

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.age = toAge(dateOfBirth);

    }

    public Contact(Contact Source) {
        this.name = Source.name;
        this.phoneNumber = Source.phoneNumber;
        this.dateOfBirth = Source.dateOfBirth;
        this.age = Source.age;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be Null of left Blank.");
        }
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        this.dateOfBirth = dateOfBirth;
        setAge(toAge(dateOfBirth));      //****//
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null||phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("PhoneNumber cannot be Null of left Blank.");
        }
        if(phoneNumber.length()<10){
            throw new IllegalArgumentException("Phone number must of 10 digits");
        }
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;                 //caller should not be allowed to alter age therefor private..
    }

    public int toAge(String dateOfBirth) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        format.setLenient(false);

        Date todate = format.parse(dateOfBirth);//String to DateFormat conversion.
        long mili = todate.getTime();// date to MIllisec conversion.

        long diff = new Date().getTime() - format.parse(dateOfBirth).getTime();// Diffrence between Date of birth and todays time in milisec.

        return age = (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365); //Conversion of millisec to Year.
    }

    public String toString() {
        return "Name :" + this.name + "\n"
                + "Phone Number :" + this.phoneNumber + "\n"
                + "Date Of Birthg :" + this.dateOfBirth + "\n"
                + "Age :" + this.age + "\n";
    }
}
