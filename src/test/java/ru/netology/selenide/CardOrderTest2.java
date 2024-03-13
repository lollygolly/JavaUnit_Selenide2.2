package ru.netology.selenide;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/*public class CardOrderTest2 {
    private String dateGenerator(int addedDays, String pattern) {
        return LocalDate.now().plusDays(addedDays).format(DateTimeFormatter.ofPattern(pattern));
    }
    @Test
    void shouldRegisterCardWithDelivery() {
        open("http://localhost:9999/");
        $("[data-test-id='city'] input").setValue("Ке");
        $(".menu-item__control").
    }
}
*/