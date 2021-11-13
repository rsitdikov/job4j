package ru.job4j.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = List.of(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertEquals(map.get("3sfe"), new Order("3sfe", "Dress"));
    }
}