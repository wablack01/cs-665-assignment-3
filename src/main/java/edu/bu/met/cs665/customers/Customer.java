/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Customer.java
 * Description: This class is responsible for the methods and attributes of a Customer.
 */

package edu.bu.met.cs665.customers;

import edu.bu.met.cs665.emails.Email;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This is the abstract Customer class. It represents a customer that can
 * receive emails from the application and defines standard attributes
 * and methods for all customers.
 */
public abstract class Customer {

  private String name;
  private Deque<Email> emailHistory = new ArrayDeque<>();

  /**
   * Create a name Customer with the given name
   * @param name the Customer's name
   */
  public Customer(String name) {
    this.name = name;
  }

  /**
   * Getter for the Customer's name
   * @return the Customer's name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Send an Email to this customer and add to their email history
   * @param email the Email sent to this Customer
   */
  public void send(Email email) {
    emailHistory.push(email);
  }

  /**
   * Get the Customer's most recent email from the top of the emailHistory stack
   * @return the Customer's most recent email
   */
  public Email getLastEmail() {
    return this.emailHistory.peek();
  }
}
