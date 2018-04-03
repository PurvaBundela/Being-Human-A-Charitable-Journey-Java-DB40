/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author palakagrawal
 */
public class UserAccount {
    
    private String username;
    //For storing encrypted Password generated after one way hashing
    private String encryptedPassword;
    private Person person;
    private Role role;
    private WorkQueue workQueue;
    private int id;
    private static int count = 1;

    public UserAccount() {
        id = count;
        count++;
        workQueue = new WorkQueue();
    }

    public int getId() {
        return id;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
    

    public Role getRole() {
        return role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public Person getPerson() {
        return person;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}