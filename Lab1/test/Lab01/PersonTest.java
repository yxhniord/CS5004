package Lab01;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class for the Person class
 */
public class PersonTest {
 
  private Person john;
  private Person sally;
  private Email johnEmail;
  private Email sallyEmail;
 
  @Before
  public void setUp() {
    this.johnEmail = new Email("john", "gmail");
    this.sallyEmail = new Email("sally", "gmail");
    this.john = new Person("John", "Doe", 1945, "111111", johnEmail);
    this.sally = new Person("Sally", "Ride", 1951, "222222", sallyEmail);
  }
 
  @Test
  public void testFirst() {
    assertEquals("John", this.john.getFirstName());
    assertEquals("Sally", this.sally.getFirstName());
  }
 
  @Test
  public void testAge() {
    assertEquals(75, this.john.getAge());
    assertEquals(69, this.sally.getAge());
  }
 
  @Test
  public void testFullName() {
    assertEquals("John Doe", this.john.getFullName());
    assertEquals("Sally Ride", this.sally.getFullName());
  }

  @Test
  public void testPhoneNumber() {
    assertEquals("111111", this.john.getPhoneNumber());
    assertEquals("222222", this.sally.getPhoneNumber());
  }

  @Test
  public void testEmail() {
    assertEquals(johnEmail, john.getEmail());
    assertEquals(sallyEmail, sally.getEmail());
  }
}