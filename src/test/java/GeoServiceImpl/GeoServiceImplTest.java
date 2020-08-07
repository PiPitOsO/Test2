package GeoServiceImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @Test
    void byIpUSA() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        String ip = "96.11.22.33";
        Assertions.assertEquals(Country.USA, geoService.byIp(ip).getCountry());
    }

    @Test
    void byIpRussia() {
        GeoServiceImpl geoService = new GeoServiceImpl();
        String ip = "172.11.22.33";
        Assertions.assertEquals(Country.RUSSIA, geoService.byIp(ip).getCountry());
    }
}