

package com.mycompany.registration;
import java.util.*;


public class Registration {
    private String fname;
    private String lname;
    private String username;
    private int age;
    private String captcha;
    
    
    public Registration(string fname,string lname,string Username,int age,string captcha){
        this.username = username;
        this.age = age;
        this.captcha = captcha;
        this.fname = fname;
        this.lname = lname;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String fname = "";
        String lname = "";
        System.out.println("Please enter your name: ");
        String username = "";
        
       try{
           String fname = [a-z A-Z]
           String lname = [a-z A-Z]
           
       }catch(NotOnlyAlphaException e){
           System.out.println("Your name contains numbers or symbols ");
       }
       
       String username = "";
       System.out.println("Please enter your username: ");
       
        if(username.length()<3){
               throw new ShortStringException("Username must have 3 or more characters");
        
        }else{
            System.out.println("The Username you have typed  is: " + username);
        }
        
        try{
            int age=<17 
                   
        }catch(TooYoungException e){
            System.out.println("Not allowed under 18 years old");
        }
           
       }
            
            
       
    
public String getFname() {
         return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }
            
    public String getLname() {
         return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        
        }
    public int getAge(){
        return age;
        }
        
        public void setAge(int age){
            this.age = age;
        }

}
