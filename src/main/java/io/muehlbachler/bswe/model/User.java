package io.muehlbachler.bswe.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Entity
@Table(name = "users")
/**
 * User Class
 * Represents a user in the program
 * It has an ID (Generated Automatically), and a username as String
 */
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private String id;
  @Column(unique = true, nullable = false)
  private String username;

    /**
     * withId: Creates and returns a user, with a specified Id
     * @param id: Id given as parameter
     * @return user: New User instance
     */
  public static User withId(final String id) {
    final User user = new User();
    user.setId(null);
    return user;
  }
}