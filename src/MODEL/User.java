/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author Lenovo
 */
public class User {
    String FirstName;
    String LastName;
    String Email;
    String Comment;
    String Age;
    String PatientType;
    String Gender;
    
    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getComment(){
        return Comment;
    }
    public void setComment(String Comment){
        this.Comment = Comment;
    }
    public String getAge(){
        return Age;
    }
    public void setAge(String Age){
        this.Age = Age;
    }
    public String getPatientType(){
        return PatientType;
    }
    public void setPatientType(String PatientType){
        this.PatientType = PatientType;
    }
    public String Gender(){
        return Gender;
    }
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    public String Email(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
}
