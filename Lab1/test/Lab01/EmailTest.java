package Lab01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class for the Email class
 */
public class EmailTest {

  private Email johnEmail;
  private Email sallyEmail;

  @Before
  public void setUp() {
    this.johnEmail = new Email("john", "gmail");
    this.sallyEmail = new Email("sally", "gmail");
  }

  @Test
  public void getUsername() {
    assertEquals("john", johnEmail.getUsername());
    assertEquals("sally", sallyEmail.getUsername());
  }

  @Test
  public void getDomain() {
    assertEquals("gmail", johnEmail.getDomain());
    assertEquals("gmail", sallyEmail.getDomain());
  }
}