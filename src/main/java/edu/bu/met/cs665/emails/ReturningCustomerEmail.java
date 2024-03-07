/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: ReturningCustomerEmail.java
 * Description: This class is responsible for the methods and attributes of ReturningCustomerEmail.
 */

package edu.bu.met.cs665.emails;

/**
 * This is the ReturningCustomerEmail class. It represents an Email sent
 * to a ReturningCustomer
 */
public class ReturningCustomerEmail extends CustomerEmail {
  private static final String template = "Welcome back to our business.";

  /**
   * Create a new ReturningCustomerEmail by sending the template to the super class.
   */
  public ReturningCustomerEmail() {
    super(template);
  }
}
