/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/**
 *
 * @author YAGNIK
 */
public class PersonDirectory {
    
    private ArrayList<Person> Personlist;

    public PersonDirectory() {
        this.Personlist = new ArrayList<Person>();
        //Default admin
        Person a = new Person();
        a.NEUID = null;
        a.Name = "user";
        a.UserID = "abcadmin";
        a.Password = hashPassword("1234");
        a.emailid = "abc.xyz@northeastern.edu";
        a.isAdmin = true;
        a.isEnabled = true;
        this.Personlist.add(a);
        
        //Default User
        Person u = new Person();
        u.NEUID = "00001";
        u.Name = "admin";
        u.UserID = "abcuser";
        u.Password = hashPassword("1234");
        u.emailid = "abc.xyz@northeastern.edu";
        u.isAdmin = false;
        u.isEnabled = true;
        this.Personlist.add(u);
        
    }
    
    

    public ArrayList<Person> getPersonlist() {
        return Personlist;
    }

    public void setPersonlist(ArrayList<Person> Personlist) {
        this.Personlist = Personlist;
    }
    
    
    public Person addPerson(){
        Person person = new Person();
        Personlist.add(person);
        return person;
    }
    
    public void deletePerson(Person person){
        Personlist.remove(person);
        
    }
    
    public Person searchPerson(String NEUID){
        for(Person person: Personlist){
            if(person.getNEUID().equals(NEUID)){
                return person;
            }
        }
        return null;
    }
        public void disableUser(String neuid){
        for (int i = 0; i < Personlist.size(); i++) {
            Person person = Personlist.get(i);
            if (person.NEUID != null && person.NEUID.equals(neuid)) {
                person.setIsEnabled(false); // Disabling the user
                return; // Exit the loop once the update is done
            }
        }
    }
    
    public boolean updateUser(Person u){
           for (int i = 0; i < Personlist.size(); i++) {
            Person person = Personlist.get(i);
            if (person.NEUID != null && person.NEUID.equals(u.NEUID)) {
                if(person.previousPass!= null && person.previousPass.contains(u.Password)){
                    return false;
                }
                if(person.previousPass != null){
                    //Adding previous passwords
                    u.previousPass.addAll(person.previousPass);
                }
                
                if(!person.Password.equals(u.Password)){
                    u.previousPass.add(person.Password);
                }
                
                Personlist.set(i, u);
                return true;
            }
        }
        return false;
    };
    
        public Person getUserByUsernamePass(String username, String password){
            for (int i = 0; i < Personlist.size(); i++) {
            Person person = Personlist.get(i);
            if (person.Name.equals(username) && person.Password.equals(password)) {
                return person;
            }
        }
        return null;
    }
public  String hashPassword(String password) {
    try {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        md.update(password.getBytes());
        byte[] rbt = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : rbt) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    } catch (NoSuchAlgorithmException e) {
        // Handle the NoSuchAlgorithmException (e.g., log it or return an error message)
        e.printStackTrace(); // For demonstration purposes
    }
    return null;
}
}



