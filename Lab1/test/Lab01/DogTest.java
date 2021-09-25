package Lab01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class for the Dog class
 */
public class DogTest {

  private Dog dog1;
  private Dog dog2;

  @Before
  public void setUp() {
    this.dog1 = new Dog("dog1", 1, "little", 2, 2, true);
    this.dog2 = new Dog("dog2", 2, "big", 3, 3, false);
  }

  @Test
  public void testName() {
    assertEquals("dog1", dog1.getName());
    assertEquals("dog2", dog2.getName());
  }

  @Test
  public void testAge() {
    assertEquals(1, dog1.getAge());
    assertEquals(2, dog2.getAge());
  }

  @Test
  public void testType() {
    assertEquals("little", dog1.getType());
    assertEquals("big", dog2.getType());
  }

  @Test
  public void testWeight() {
    assertEquals(2, dog1.getWeight());
    assertEquals(3, dog2.getWeight());
  }

  @Test
  public void testLength() {
    assertEquals(2, dog1.getLength());
    assertEquals(3, dog2.getLength());
  }

  @Test
  public void testAdopted() {
    assertTrue(dog1.isAdopted());
    assertFalse(dog2.isAdopted());
  }
}