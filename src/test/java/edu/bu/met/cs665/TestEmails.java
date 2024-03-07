/**
 * Name: WALKER BLACK
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/07/2024
 * File Name: TestEmail.java
 * Description: This class is responsible for testing the email generation app.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.customers.*;
import edu.bu.met.cs665.emails.*;
import edu.bu.met.cs665.factories.CustomerEmailFactory;
import edu.bu.met.cs665.factories.EmailFactory;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;

public class TestEmails {
  public TestEmails(){}

  /**
   * Test the CustomerEmailFactory creates the correct
   * CustomerEmail based on the Customer type
   */
  @Test
  public void testEmailFactory() {
    EmailFactory customerEmailFactory = new CustomerEmailFactory();

    Customer businessCustomer = new BusinessCustomer("BizCorp");
    Customer frequentCustomer = new FrequentCustomer("Tom");
    Customer newCustomer = new NewCustomer("Sarah");
    Customer returningCustomer = new ReturningCustomer("Maddy");
    Customer vipCustomer = new VipCustomer("Charlie");

    Email businessCustomerEmail = customerEmailFactory.createEmail(businessCustomer);
    Email frequentCustomerEmail = customerEmailFactory.createEmail(frequentCustomer);
    Email newCustomerEmail = customerEmailFactory.createEmail(newCustomer);
    Email returningCustomerEmail = customerEmailFactory.createEmail(returningCustomer);
    Email vipCustomerEmail = customerEmailFactory.createEmail(vipCustomer);

    assertTrue(businessCustomerEmail instanceof BusinessCustomerEmail);
    assertTrue(frequentCustomerEmail instanceof FrequentCustomerEmail);
    assertTrue(newCustomerEmail instanceof NewCustomerEmail);
    assertTrue(returningCustomerEmail instanceof ReturningCustomerEmail);
    assertTrue(vipCustomerEmail instanceof VipCustomerEmail);
  }

  /**
   * Test that an Email is delivered to the correct customer
   */
  @Test
  public void testSendingEmails() {
    EmailFactory customerEmailFactory = new CustomerEmailFactory();

    Customer businessCustomer = new BusinessCustomer("BizCorp");
    Customer frequentCustomer = new FrequentCustomer("Tom");
    Customer newCustomer = new NewCustomer("Sarah");
    Customer returningCustomer = new ReturningCustomer("Maddy");
    Customer vipCustomer = new VipCustomer("Charlie");

    Email businessCustomerEmail = customerEmailFactory.createEmail(businessCustomer);
    Email frequentCustomerEmail = customerEmailFactory.createEmail(frequentCustomer);
    Email newCustomerEmail = customerEmailFactory.createEmail(newCustomer);
    Email returningCustomerEmail = customerEmailFactory.createEmail(returningCustomer);
    Email vipCustomerEmail = customerEmailFactory.createEmail(vipCustomer);

    businessCustomerEmail.sendTo(businessCustomer);
    frequentCustomerEmail.sendTo(frequentCustomer);
    newCustomerEmail.sendTo(newCustomer);
    returningCustomerEmail.sendTo(returningCustomer);
    vipCustomerEmail.sendTo(vipCustomer);

    assertSame(businessCustomerEmail, businessCustomer.getLastEmail());
    assertSame(frequentCustomerEmail, frequentCustomer.getLastEmail());
    assertSame(newCustomerEmail, newCustomer.getLastEmail());
    assertSame(returningCustomerEmail, returningCustomer.getLastEmail());
    assertSame(vipCustomerEmail, vipCustomer.getLastEmail());
  }

  /**
   * Test that the content of each CustomerEmail type is
   * unique and matches the expected content.
   */
  @Test
  public void testEmailContent() {
    EmailFactory customerEmailFactory = new CustomerEmailFactory();

    Customer businessCustomer = new BusinessCustomer("BizCorp");
    Customer frequentCustomer = new FrequentCustomer("Tom");
    Customer newCustomer = new NewCustomer("Sarah");
    Customer returningCustomer = new ReturningCustomer("Maddy");
    Customer vipCustomer = new VipCustomer("Charlie");

    Email businessCustomerEmail = customerEmailFactory.createEmail(businessCustomer);
    Email frequentCustomerEmail = customerEmailFactory.createEmail(frequentCustomer);
    Email newCustomerEmail = customerEmailFactory.createEmail(newCustomer);
    Email returningCustomerEmail = customerEmailFactory.createEmail(returningCustomer);
    Email vipCustomerEmail = customerEmailFactory.createEmail(vipCustomer);

    businessCustomerEmail.sendTo(businessCustomer);
    frequentCustomerEmail.sendTo(frequentCustomer);
    newCustomerEmail.sendTo(newCustomer);
    returningCustomerEmail.sendTo(returningCustomer);
    vipCustomerEmail.sendTo(vipCustomer);

    String businessExpectedContent = "Dear " + businessCustomer.getName() +
            ", Thank you for letting our business help your business.";
    String frequentExpectedContent = "Dear " + frequentCustomer.getName() +
            ", Thank you for being a frequent customer.";
    String newExpectedContent = "Dear " + newCustomer.getName() +
            ", Welcome to our business.";
    String returningExpectedContent = "Dear " + returningCustomer.getName() +
            ", Welcome back to our business.";
    String vipExpectedContent = "Dear " + vipCustomer.getName() +
            ", Thank you for being a VIP customer!";

    assertEquals(businessExpectedContent, businessCustomer.getLastEmail().read());
    assertEquals(frequentExpectedContent, frequentCustomer.getLastEmail().read());
    assertEquals(newExpectedContent, newCustomer.getLastEmail().read());
    assertEquals(returningExpectedContent, returningCustomer.getLastEmail().read());
    assertEquals(vipExpectedContent, vipCustomer.getLastEmail().read());
  }
}
