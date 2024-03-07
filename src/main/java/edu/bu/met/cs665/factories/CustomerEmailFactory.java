/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: CustomerEmailFactory.java
 * Description: This class is responsible for the methods and attributes of a CustomerEmailFactory.
 */

package edu.bu.met.cs665.factories;

import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;
import edu.bu.met.cs665.emails.BusinessCustomerEmail;
import edu.bu.met.cs665.emails.Email;
import edu.bu.met.cs665.emails.FrequentCustomerEmail;
import edu.bu.met.cs665.emails.NewCustomerEmail;
import edu.bu.met.cs665.emails.ReturningCustomerEmail;
import edu.bu.met.cs665.emails.VipCustomerEmail;

/**
 * This is the CustomerEmailFactory class. It creates Emails for different Customer types.
 */
public class CustomerEmailFactory extends EmailFactory {

  /**
   * Create an Email based on the type of Customer.
   * @param customer the Customer the CustomerEmail is for
   * @return the created CustomerEmail
   */
  @Override
  public Email createEmail(Customer customer) {
    if (customer instanceof BusinessCustomer) {
      return new BusinessCustomerEmail();
    } else if (customer instanceof FrequentCustomer) {
      return new FrequentCustomerEmail();
    } else if (customer instanceof NewCustomer) {
      return new NewCustomerEmail();
    } else if (customer instanceof ReturningCustomer) {
      return new ReturningCustomerEmail();
    } else if (customer instanceof VipCustomer) {
      return new VipCustomerEmail();
    } else {
      return null;
    }
  }
}
