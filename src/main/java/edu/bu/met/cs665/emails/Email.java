/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: Email.java
 * Description: This interface defines the methods for an Email
 */

package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.customers.Customer;

/**
 * This is the Email interface and defines methods for using an Email object
 * within the Email Generation application
 */
public interface Email {
  void sendTo(Customer customer);
  String read();
}
