/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import javax.swing.Icon;

/**
 *
 * @author palakagrawal
 */
public class Person {
    
    private String name;
    private String birthdate;
    private String gender;
    private int age;
    private long contactNum;
    private String emailID;
    private int id;
    private static int count = 1;
    private Icon image;
    private VitalSigns vitalSign;
    
    private PersonAddress personAddress;

    public Person() {
        id = count;
        count++;
        personAddress = new PersonAddress();
        vitalSign = new VitalSigns();
        
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getContactNum() {
        return contactNum;
    }

    public void setContactNum(long contactNum) {
        this.contactNum = contactNum;
    }

    public PersonAddress getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(PersonAddress personAddress) {
        this.personAddress = personAddress;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
    
}
