/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaProject;

/**
 *
 * @author U212058
 */
public class main {
   public static void main(String args[]){
       User user = new User("test", "test@example.com", "1234567890", "2000-01-01", "test123");
       /*user.setname("user1");
       user.setemail("abc20@gmail.com");
       user.setphonenumber("011-2233445");
       user.setdateOfBirth("2005/09/11");
       user.setpassword("abcd1234");*/
       
       // Print initial details
       System.out.println("Username: " + user.getname());
       System.out.println("Email: " + user.getemail());
       System.out.println("Phone_number: " +user.getphonenumber());
       
       // Update some info
       user.setemail("testemail@example.com");
       user.setpassword("newpass456");

       // Print updated info
       System.out.println("Updated Email: " + user.getemail());
       System.out.println("Updated Password: " + user.getpassword());
     
      /* System.out.println(user.getname());
       System.out.println(user.getemail());
       System.out.println(user.getphonenumber());
       System.out.println(user.getdateOfBirth());
       System.out.println(user.getpassword());*/
   }
}
