package ru.job4j.pojo;

import org.junit.Test;

import java.util.Date;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LicenseTest {

    @Test
    public void eqName() {
        License first = new License();
        first.setCode("audio");
        License second = new License();
        second.setCode("audio");
        assertThat(first, is(second));
    }

    @Test
    public void eqCreatedDate() {
        Date date = new Date();
        License first = new License();
        first.setCreated(date);
        License second = new License();
        second.setCreated(date);
        assertThat(first, is(second));
    }

    @Test
    public void eqObjects() {
        Date date = new Date();
        License first = new License();
        first.setCreated(date);
        first.setCode("Code");
        first.setModel("Model");
        first.setOwner("Owner");
        License second = new License();
        second.setCreated(date);
        second.setCode("Code");
        second.setModel("Model");
        second.setOwner("Owner");
        assertThat(first, is(second));
    }
}