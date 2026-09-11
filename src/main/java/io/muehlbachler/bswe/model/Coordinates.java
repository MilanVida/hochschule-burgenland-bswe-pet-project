package io.muehlbachler.bswe.model;

import jakarta.persistence.Embeddable;
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
@EqualsAndHashCode
@ToString
@Embeddable

/**
 * Coordinates class
 * Contains three variables, representing the three values of coordination
 * Using Lombok, Setter and Getter, ToString, Constructors, etc. are provided
 */
public class Coordinates {
    /*Longitude: Geographic position*/
    private double longitude;
    /*Latitude: Geographic position*/
    private double latitude;
    /*Elevation: Geographic position*/
    private float elevation;
}
