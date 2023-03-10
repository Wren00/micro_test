package com.example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@MicronautTest
class SubscriberTest {

    Subscriber subscriber;

    Subscriber nullSubscriber;
    String email = "dorf@gmail.com";
    String username = "test_user";
    String personalName = "Dorf Man";

    @Test
    void testTheConstructor() {
        subscriber = new Subscriber("dorf@gmail.com", "test_user", "Dorf Man");
        nullSubscriber = new Subscriber("nullValues@gmail.com", "null", null);

        Assertions.assertEquals(email, subscriber.getEmail());
        Assertions.assertEquals(username, subscriber.getUsername());
        Assertions.assertEquals(personalName, subscriber.getPersonalName());

        Assertions.assertNull(nullSubscriber.getPersonalName());
    }


}
