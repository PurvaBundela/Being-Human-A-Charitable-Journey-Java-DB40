package Business;


import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author panchi
 */
public class ConfigureASystem {
    
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
  
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        Person person = new Person();
        
        person.setName("SysAdmin");
        person.setAge(23);
        person.setBirthdate("09-Dec-1991");
        person.setContactNum(1234567890);
        person.setGender("Female");
        
        system.getPersonDirectory().getPersonList().add(person);
       
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
        
        return system;
    }
    
}
