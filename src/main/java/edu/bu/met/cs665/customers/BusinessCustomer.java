/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: BusinessCustomer.java
 * Description: This class is responsible for the methods and attributes of a BusinessCustomer.
 */

package edu.bu.met.cs665.customers;

/**
 * This is the BusinessCustomer class. It represents a business.
 * customer that can receive emails from the application.
 */
public class BusinessCustomer extends Customer {

  /**
   * Create a new BusinessCustomer with the given name.
   * @param name the BusinessCustomer's name
   */
  public BusinessCustomer(String name) {
    super(name);
  }
}
