package LocalizationServiceImpl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    void locale() {
        LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

        Assertions.assertEquals(localizationService.locale(Country.RUSSIA), "Привет");
        Assertions.assertEquals(localizationService.locale(Country.USA), "Hi");
        Assertions.assertEquals(localizationService.locale(Country.BRAZIL), "Hi");
        Assertions.assertEquals(localizationService.locale(Country.GERMANY), "Hi");
    }
}