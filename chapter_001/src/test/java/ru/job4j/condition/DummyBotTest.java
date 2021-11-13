package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        assertEquals(
                DummyBot.answer("Привет, Бот."),
                "Привет, умник."
        );
    }

    @Test
    public void whenByeBot() {
        assertEquals(
                DummyBot.answer("Пока."),
                "До скорой встречи."
        );
    }

    @Test
    public void whenUnknownBot() {
        assertEquals(
                DummyBot.answer("Сколько будет 2 + 2?"),
                "Это ставит меня в тупик. Задайте другой вопрос."
        );
    }
}
