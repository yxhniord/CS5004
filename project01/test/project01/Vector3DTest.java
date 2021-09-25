package project01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit test class for Vector3D
 */
public class Vector3DTest {
  private Vector3D vector;

  @Before
  public void setUp() {
    vector = new Vector3D(1.00, 2.00, 2.00);
  }

  @Test
  public void testToString() {
    String expected = "(1.00, 2.00, 2.00)";
    assertEquals(vector.toString(), expected);
  }

  @Test
  public void testGetMagnitude() {
    double magnitude = vector.getMagnitude();
    assertEquals(3, magnitude, 0.001);
  }

  @Test
  public void testNormalize() {
    assertEquals(1.00 / 3.00,vector.normalize().getX(),0.001);
    assertEquals(2.00 / 3.00,vector.normalize().getY(),0.001);
    assertEquals(2.00 / 3.00,vector.normalize().getZ(),0.001);
  }

  @Test(expected = IllegalStateException.class)
  public void testIllegalNormalize() {
    Vector3D zero = new Vector3D(0, 0, 0);
    Vector3D normalized = zero.normalize();
  }

  @Test
  public void add() {
    Vector3D other = new Vector3D(1.00, 1.00, 1.00);
    Vector3D newVector = vector.add(other);
    assertEquals(2.00, newVector.getX(), 0.001);
    assertEquals(3.00, newVector.getY(), 0.001);
    assertEquals(3.00, newVector.getZ(), 0.001);
  }

  @Test
  public void multiply() {
    Vector3D newVector = vector.multiply(2);
    assertEquals(2.00, newVector.getX(), 0.001);
    assertEquals(4.00, newVector.getY(), 0.001);
    assertEquals(4.00, newVector.getZ(), 0.001);
  }

  @Test
  public void dotProduct() {
    Vector3D other = new Vector3D(1.0, 1.0, 1.0);
    assertEquals(5.00, vector.dotProduct(other), 0.001);
  }

  @Test
  public void angleBetween() {
    Vector3D other = new Vector3D(1.0, 1.0, 1.0);
    assertEquals(15.85, vector.angleBetween(other), 0.1);
  }

  @Test(expected = IllegalStateException.class)
  public void testIllegalAngleBetween() {
    Vector3D zero = new Vector3D(0, 0, 0);
    double angle = vector.angleBetween(zero);
  }
}