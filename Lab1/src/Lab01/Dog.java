package Lab01;
/**
 * This class represents a dog with a name, approximate age, type,
 * weight, length and adopted
 */
public class Dog {
  private String name;
  private int age;
  private String type;
  private int weight;
  private int length;
  private boolean adopted;

  /**
   * Constructs a Dog object and initializes it to a name, approximate age, type,
   * weight, length and adopted
   *
   * @param name      the name of this dog
   * @param age       the age of this dog
   * @param type      the type of this dog
   * @param weight    the weight of this dog
   * @param length    the length of this dog
   * @param adopted   if the dog is adopted or not
   */
  public Dog(String name, int age, String type, int weight, int length, boolean adopted) {
    this.name = name;
    this.age = age;
    this.type = type;
    this.weight = weight;
    this.length = length;
    this.adopted = adopted;
  }

  /**
   * Get the name of this dog
   *
   * @return the the name of this dog
   */
  public String getName() {
    return name;
  }

  /**
   * Get the age of this dog
   *
   * @return the age of this dog
   */
  public int getAge() {
    return age;
  }

  /**
   * Get the type of this dog
   *
   * @return the type of this dog
   */
  public String getType() {
    return type;
  }

  /**
   * Get the weight of this dog
   *
   * @return the weight of this dog
   */
  public int getWeight() {
    return weight;
  }

  /**
   * Get the length of this dog
   *
   * @return the length of this dog
   */
  public int getLength() {
    return length;
  }

  /**
   * Get whether this dog is adopted or not
   * true as adopted
   * false as not adoptef
   *
   * @return whether this dog is adopted or not
   */
  public boolean isAdopted() {
    return adopted;
  }
}
