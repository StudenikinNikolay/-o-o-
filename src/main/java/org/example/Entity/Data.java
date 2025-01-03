/**
 * @author Nikolay Studenikin
 */

package org.example.Entity;

import org.example.Model.Human;
import org.example.Model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
public class Data implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Person one = Person.builder().human(Human.builder()
                        .name("Сергей")
                        .surname("Лавров")
                        .age(73)
                        .build())
                .phoneNumber("+7 (951) 652-01-53")
                .cityOfLiving("Москва")
                .build();

        Person two = Person.builder().human(Human.builder()
                        .name("Михаил")
                        .surname("Мишустин")
                        .age(61)
                        .build())
                .phoneNumber("+7 (906) 873-13-56")
                .cityOfLiving("Питер")
                .build();


    }
}
