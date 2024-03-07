/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: EmailFactory.java
 * Description: This class is responsible for the methods and attributes of a BusinessCustomerEmail.
 */

package edu.bu.met.cs665.factories;

import edu.bu.met.cs665.emails.Email;
import edu.bu.met.cs665.customers.Customer;

/**
 * This is the abstract EmailFactory class. It defines a method signature
 * that all subclasses will implement to create and return an Email object
 */
public abstract class EmailFactory {
  abstract public Email createEmail(Customer customer);
}
