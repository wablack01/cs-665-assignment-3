/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: BusinessCustomerEmail.java
 * Description: This class is responsible for the methods and attributes of a BusinessCustomerEmail.
 */

package edu.bu.met.cs665.emails;


/**
 * This is the BusinessCustomerEmail class. It represents an Email sent
 * to a BusinessCustomer
 */
public class BusinessCustomerEmail extends CustomerEmail {
  private static final String template = "Thank you for letting our business help your business.";

  /**
   * Create a new BusinessCustomerEmail by sending the template to the super class
   */
  public BusinessCustomerEmail() {
    super(template);
  }
}
