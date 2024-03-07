/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/06/2024
 * File Name: Main.java
 * Description: This main class demonstrates the app functionality.
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.emails.Email;
import edu.bu.met.cs665.factories.CustomerEmailFactory;
import edu.bu.met.cs665.factories.EmailFactory;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   */
  public static void main(String[] args) {
    EmailFactory customerEmailFactory = new CustomerEmailFactory();
    Customer businessCustomer = new BusinessCustomer("BizCorp");
    Email businessCustomerEmail = customerEmailFactory.createEmail(businessCustomer);
    System.out.println("Business customer email before sending: " + businessCustomerEmail.read());

    businessCustomerEmail.sendTo(businessCustomer);
    System.out.println("Business customer email after sending to BizCorp: "
            + businessCustomer.getLastEmail().read());
  }
}
