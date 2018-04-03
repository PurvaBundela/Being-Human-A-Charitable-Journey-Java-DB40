/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.Random;

import java.util.Random;

/**
 *
 * @author palakagrawal
 */
public class VitalSigns {
    private int donationInterval;
    private int weight;
    private int height;
    private String bloodpressure;
    private String diabetic;
    private String hivAids;
    private int age;
    private String eligibility;

    public int getDonationInterval() {
        return donationInterval;
    }

    public void setDonationInterval(int donationInterval) {
        this.donationInterval = donationInterval;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public String getDiabetic() {
        return diabetic;
    }

    public void setDiabetic(String diabetic) {
        this.diabetic = diabetic;
    }

    public String getHivAids() {
        return hivAids;
    }

    public void setHivAids(String hivAids) {
        this.hivAids = hivAids;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }
    
    public String generateString(Random rng, String characters, int length) {
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }

    //Random generater for range min to max
    public int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    // initializing diabetes status 
    public String initializeDiabetes() {
        String[] array = {"Yes", "No"};
        String isDiabetic = array[randInt(0, 1)];

        return isDiabetic;
    }
    
    // initializing diabetes status 
    public int initializeHeight() {
        Integer[] intArray = {148, 154,168};
        int height = intArray[randInt(0, 2)];

        return height;
    }
    
    // initializing HIV Aids status 
    public String initializeHIV() {
        String[] array = {"Yes", "No"};
        String isHIVSuspected = array[randInt(0, 1)];

        return isHIVSuspected;
    }
    // initializing BloodPressure status 
    public String initializeBP() {
        String[] array = {"Low", "Normal","High"};
        String isBP = array[randInt(0, 2)];

        return isBP;
    }

    
    
    
}
