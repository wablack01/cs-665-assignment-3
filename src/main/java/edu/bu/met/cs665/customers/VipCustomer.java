/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: VipCustomer.java
 * Description: This class is responsible for the methods and attributes of a VipCustomer.
 */

package edu.bu.met.cs665.customers;

/**
 * This is the VipCustomer class. It represents a VIP
 * customer that can receive emails from the application.
 */
public class VipCustomer extends Customer{

  /**
   * Create a new VipCustomer with the given name
   * @param name the VipCustomer's name
   */
  public VipCustomer(String name) {
    super(name);
  }
}
