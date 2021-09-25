package Lab01;

/**
 * This class represents an Email with username and domain
 */
public class Email {
  private String username;
  private String domain;

  /**
   * Constructs an Email object and initializes it to the given username and domain
   *
   * @param username      the username of this email
   * @param domain        the domain of this email
   */
  public Email(String username, String domain) {
    this.username = username;
    this.domain = domain;
  }

  /**
   * Get the username of this email
   *
   * @return the username of this email
   */
  public String getUsername() {
    return username;
  }

  /**
   * Get the domain of this email
   *
   * @return the domain of this email
   */
  public String getDomain() {
    return domain;
  }
}
