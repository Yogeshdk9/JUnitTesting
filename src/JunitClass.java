import static org.junit.Assert.*;

import java.sql.*;

import javax.swing.*;
import org.junit.Test;

import cafeteria.core.*;
import cafeteria.dao.*;
import cafeteria.ui.BillingApp;
import cafeteria.ui.users.*;

public class JunitClass {
	
	CustomerLoginDialog cld;
	OrderDAO o;
	FoodDAO f;
	Customer c;
	@Test
    public void testCustomerEmail() {   
        assertEquals(true,Customer.isemailValid("yogesh2018dk@gmail.com"));
        assertEquals(false,Customer.isemailValid("yogesh1234"));
	}
	
	
	@Test
	public void testCustomerPassword(){
	       assertEquals(true,Customer.isPasswordValid("yogesh@1234"));
	        assertEquals(false,Customer.isPasswordValid("1234"));
	    }
	
	@Test
	public void testDBConnection() throws Exception {
		assertNotNull(DBConnection.createConnection());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "yogileo@10");
	}
	
	@Test
	public void testJFrames() {
		Object JTextField = new JTextField();
		assertNotNull(JTextField);
		
	}
	public void testJButton(){
		assertEquals(32,CustomerSignUpDialog.JButtonHeight());
		assertEquals(158,CustomerSignUpDialog.JButtonWidth());
	}
}
