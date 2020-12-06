package cafeteria.core;

import java.util.regex.*;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	
	public Customer(String fname, String lname, String mail, String pwd){
		firstName = fname;
		lastName = lname;
		email = mail;
		password = pwd;		
	}
	
	public Customer(int id, String fname, String lname, String mail, String pwd){
		this(fname, lname, mail, pwd);
		this.id = id;
	}
	public Customer() {	}
	public static boolean isemailValid(String email) {
		if(email.contains("@")) {
		return true;
		}
		return false;
	}
	public static boolean isPasswordValid(String pass) {
		if(pass.length()>=8) {
			return true;
		}
		return false;
	}
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String name){
		lastName = name;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String name){
		firstName = name;
	}
	
	public String getEmail(){
		return email;
	}
	public void setEmail(String mail){
		email = mail;
	}
	
	public String getPassword(){
		return password;
	}
	public void setPassword(String pwd){
		password = pwd;
	}
	
	public String toString(){
		return String.format("Customer [Id= %s, First name= %s, Last name= %s, E-mail= %s]",
				id, firstName, lastName, email);
	}

}
