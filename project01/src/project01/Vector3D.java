package project01;

/**
 * This class represents a 3D Vector. A 3D Vector has a title, an author and a price
 */
public class Vector3D {
  private double x;
  private double y;
  private double z;

  /**
   * Construct a Vector3D that has the
   * provided x, y and z
   *
   * @param x the x to be given to this Vector3D
   * @param y the y to be given to this Vector3D
   * @param z the z to be given to this Vector3D
   */
  public Vector3D(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  /**
   * Return the x of this Vector3D
   * @return the x of this Vector3D
   */
  public double getX() {
    return x;
  }

  /**
   * Return the y of this Vector3D
   * @return the y of this Vector3D
   */
  public double getY() {
    return y;
  }

  /**
   * Return the z of this Vector3D
   * @return the z of this Vector3D
   */
  public double getZ() {
    return z;
  }

  /**
   Returns a string representation of this Vector3D with x, y and z
   @return a formatted string
   */
  public String toString() {
    return String.format("(%.2f, %.2f, %.2f)", this.x, this.y, this.z);
  }

  /**
   * Return the magnitude of the Vector
   * @return the magnitude of the Vector
   */
  public double getMagnitude() {
    return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
  }

  /**
   * Return a normalized version of this vector
   * @return a normalized version of this vector
   * @throws IllegalStateException if this operation cannot be completed
   */
  public Vector3D normalize() throws IllegalStateException {
    if (this.getMagnitude() == 0) {
      throw new IllegalStateException("Vector cannot be (0, 0, 0)");
    }
    double magnitude = this.getMagnitude();
    Vector3D normalized = new Vector3D(this.x / magnitude,
        this.y / magnitude, this.z / magnitude);
    return normalized;
  }

  /**
   * Return the result of adding this vector to another vector
   * @param other the other vector to be added
   * @return the result of adding this vector to another vector
   */
  public Vector3D add(Vector3D other) {
    Vector3D newVector = new Vector3D(this.x + other.x,
        this.y + other.y, this.z + other.z);
    return newVector;
  }

  /**
   * Return the result of multiplying this vector by a constant
   * @param constant the constant to be multiplied to
   * @return the result of multiplying this vector by a constant
   */
  public Vector3D multiply(int constant) {
    Vector3D newVector = new Vector3D(this.x * constant,
        this.y * constant, this.z * constant);
    return newVector;
  }

  /**
   * Return the dot product of this vector and another vector
   * @param other the other vector to be product
   * @return the dot product of this vector and another vector
   */
  public double dotProduct(Vector3D other) {
    return this.x * other.x + this.y * other.y + this.z * other.z;
  }

  /**
   * Return the angle between two vectors in degrees
   * @param other the other vector to be calculated with
   * @return the angle between two vectors in degrees
   * @throws IllegalStateException if this operation cannot be completed
   */
  public double angleBetween(Vector3D other) throws IllegalStateException {
    if (this.getMagnitude() == 0 || other.getMagnitude() == 0) {
      throw new IllegalStateException("Vectors cannot be (0, 0, 0)");
    }
    return Math.acos(Math.abs(this.dotProduct(other) / (this.getMagnitude() * other.getMagnitude()))) * 180 / Math.PI;
  }

}
