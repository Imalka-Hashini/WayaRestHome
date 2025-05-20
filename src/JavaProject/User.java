/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaProject;

/**
 *
 * @author U212058
 */
public class User {
    private String username;
    private String email;
    private String phone;
    private String dob;
    private String password;


public User(String username,String email,String phone,String dob,String password){
   this.username = username;
   this.email = email;
   this.phone = phone;
   this.dob = dob;
   this.password = password;
}

public String getname(){
    return username;
}
public void setname(String name){
    this.username = name;
}

public String getemail(){
    return email;
}
public void setemail(String email){
    this.email = email;
}

public String getphonenumber(){
    return phone;
}
public void setphonenumber(String phone){
    this.phone = phone;
}

public String getdateOfBirth(){
    return dob;
}
public void setdateOfBirth(String dob){
    this.dob = dob;
}

public String getpassword(){
    return password;
}
public void setpassword(String password){
    this.password = password;
}
}