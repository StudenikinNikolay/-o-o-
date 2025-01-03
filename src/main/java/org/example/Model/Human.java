/**
 * @author Nikolay Studenikin
 */

package org.example.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Embeddable
public class Human implements Serializable {
    @Column(length = 50, name = "name", nullable = false)
    private String name;
    @Column(length = 50, name = "surname", nullable = false)
    private String surname;
    @Column(length = 3, name = "age", nullable = false)
    private int age;
}