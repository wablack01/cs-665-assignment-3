/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: CustomerEmail.java
 * Description: This class is responsible for the methods and attributes of a CustomerEmail.
 */

package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.customers.Customer;

/**
 * This is the CustomerEmail class. It defines some standard functionality
 * for implementing the Email interface.
 */
public abstract class CustomerEmail implements Email {
  private String content;

  /**
   * Create a CustomerEmail with the content set to the provided String
   * @param content The content of the Email
   */
  public CustomerEmail(String content) {
    this.content = content;
  }

  /**
   * Insert the Customer name into the content
   * then send the Email to the Customer
   * @param customer The Customer the Email will be sent to
   */
  public void sendTo(Customer customer) {
    this.content = "Dear " + customer.getName() + ", " + content;
    customer.send(this);
  }

  /**
   * Getter for the content of the email
   * @return The content of the email
   */
  public String read() {
    return this.content;
  }
}
