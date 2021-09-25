package Lab01;

/**
 * This class represents a person with a first name, last name, a
 * year of birth, phone number and an email
 */
public class Person {
  private String firstName;
  private String lastName;
  private int yearOfBirth;
  private String phoneNumber;
  private Email email;
 
  /**
   * Constructs a Person object and initializes it to the given first name, last
   * name, year of birth, phone number and an email
   * 
   * @param firstName   the first name of this person
   * @param lastName    the last name of this person
   * @param yearOfBirth the year of birth of this person
   * @param phoneNumber the phone number of this person
   * @param email       the email of this person
   */
  public Person(String firstName, String lastName, int yearOfBirth, String phoneNumber, Email email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.yearOfBirth = yearOfBirth;
    this.phoneNumber = phoneNumber;
    this.email = email;
  }
 
  /**
   * Get the first name of this person
   * 
   * @return the first name of this person
   */
  public String getFirstName() {
    return this.firstName;
  }
 
  /**
   * Return the last name of this person
   * 
   * @return the last name of this person
   */
  public String getLastName() {
    return this.lastName;
  }
 
  /**
   * Return the year of birth of this person
   * 
   * @return the year of birth of this person
   */
  public int getYearOfBirth() {
    return this.yearOfBirth;
  }
 
  /**
   * Return the age of this person in 2020
   * 
   * @return the age of this person in 2020
   */
  public int getAge() {
    return 2020 - this.yearOfBirth;
  }
 
  /**
   * Return the full name of this person
   * 
   * @return the full name of this person
   */
  public String getFullName() {
    return this.firstName + " " + this.lastName;
  }

  /**
   * Return the phone number of this person
   *
   * @return the phone number of this person
   */
  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  /**
   * Return the email of this person
   *
   * @return the email of this person
   */
  public Email getEmail() {
    return this.email;
  }
}