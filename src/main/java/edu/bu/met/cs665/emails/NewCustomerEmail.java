/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: NewCustomerEmail.java
 * Description: This class is responsible for the methods and attributes of a NewCustomerEmail.
 */

package edu.bu.met.cs665.emails;

/**
 * This is the NewCustomerEmail class. It represents an Email sent
 * to a NewCustomer
 */
public class NewCustomerEmail extends CustomerEmail {
  private static final String template = "Welcome to our business.";

  /**
   * Create a new NewCustomerEmail by sending the template to the super class
   */
  public NewCustomerEmail() {
    super(template);
  }
}
