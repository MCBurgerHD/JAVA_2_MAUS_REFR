
package CovidContactTracing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static CovidContactTracing.ContactTracing.getAllPersonsFromArrayPositiveNegative;
import static org.junit.jupiter.api.Assertions.*;

class ContactTracingTest {

    public boolean equals(Person p1, Person p2){
        if (p1.getFirstname().equals(p2.getFirstname())){
            if (p1.getLastname().equals(p2.getLastname())){
                if (p1.getAddress().equals(p2.getAddress())){
                    if (p1.getTraceNames().equals(p2.getTraceNames())){
                        if (p1.isCoronaTestPositiv()==p2.isCoronaTestPositiv()){
                            if (String.valueOf(p1.getGender()).equals(String.valueOf(p2.getGender()))){
                                if (p1.getPosition().getX() ==p2.getPosition().getX() && p1.getPosition().getY() ==p2.getPosition().getY()){
                                    return true;
                                }
                            }
                        }
                    }
                }

            }

        }
        return false;
    }

    @Test
    void getAllPersonsFromArrayPositiveNegative_test() {
        final Person pTest = new Person("Max", "Mustermann", 46, 'm', new Address(3100, "St. Pölten", "NOE", "Waldstrasse7"), 1, new Position(0, 0), true);
        final Person[] persons = ReadData.readPersonFile("./Resources/ContactListTestData1");
        final Person[] p = getAllPersonsFromArrayPositiveNegative(persons, true);

        assertEquals(equals(pTest,p[0]),true);
    }


}

