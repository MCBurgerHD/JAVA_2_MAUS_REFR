package CovidContactTracing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    final Person[] persons = ReadData.readPersonFile("Resources/ContactListTestData1");
    Person p0 = persons[0];



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
    void addTraceName_test() {
        p0.addTraceName("Maria");
        p0.addTraceName("Bob");
        assertEquals("Tracing: Maria -> Bob -> Max Mustermann",p0.getTraceNames());
    }

    @Test
    void ValidPerson_test() {
        Person pTest1 = Person.validPerson("PosiTIVe;0,0;0000000001;m;46;Max;Mustermann;Waldstrasse 7 3100 St. Pölten NOE",";",false);
        assertEquals(equals(pTest1,p0),true);
    }




}