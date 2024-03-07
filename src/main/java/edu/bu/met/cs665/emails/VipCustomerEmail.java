/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: VipCustomerEmail.java
 * Description: This class is responsible for the methods and attributes of a VipCustomerEmail.
 */

package edu.bu.met.cs665.emails;

/**
 * This is the VipCustomerEmail class. It represents an Email sent
 * to a VipCustomer
 */
public class VipCustomerEmail extends CustomerEmail {
  private static final String template = "Thank you for being a VIP customer!";

  /**
   * Create a new VipCustomerEmail by sending the template to the super class.
   */
  public VipCustomerEmail() {
    super(template);
  }
}
