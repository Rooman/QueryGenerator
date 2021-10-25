package com.luxoft.querygenerator.sql;

import com.luxoft.querygenerator.entity.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqlQueryGeneratorTest {
    @Test
    public void testFindAllReturnValidQuery() {
        SqlQueryGenerator sqlQueryGenerator = new SqlQueryGenerator();
        String expected = "SELECT id, person_name, salary FROM persons;";

        String actual = sqlQueryGenerator.findAll(Person.class);

        assertEquals(expected, actual);
    }
}

/*
* public class Person {
    private int id;
    private String name;
    private double salary;
}

* */