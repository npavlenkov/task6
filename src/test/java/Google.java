import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Google {

    @Test
    void selenideSearchTest() {
        // Открыть google
        open("https://www.google.com/");

        // Ввести Selenide в поиск
        $(byName("q")).setValue("Selenide").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("#search").shouldHave(text("selenide.org"));
    }
    @Test
    void gradleSearchTest() {
        // Открыть google
        open("https://www.yandex.ru/");

        // Ввести Selenide в поиск
        $x("//input[@id = 'text']").setValue("Gradle").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        //$("#search").shouldHave(text("gradle.org"));
}
