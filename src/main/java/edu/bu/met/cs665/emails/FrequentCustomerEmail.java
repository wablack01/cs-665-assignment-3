/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: FrequentCustomerEmail.java
 * Description: This class is responsible for the methods and attributes of a FrequentCustomerEmail.
 */

package edu.bu.met.cs665.emails;

/**
 * This is the FrequentCustomerEmail class. It represents an Email sent
 * to a FrequentCustomer
 */
public class FrequentCustomerEmail extends CustomerEmail {
  private static final String template = "Thank you for being a frequent customer.";

  /**
   * Create a new FrequentCustomerEmail by sending the template to the super class
   */
  public FrequentCustomerEmail() {
    super(template);
  }
}
