package packageinterface;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IHumanObserver {
    void born(LocalDateTime dateTime, int weight, boolean gender);

    void kindergarten(int age, String title, String adress);

    void school (String title, boolean booling, int averageRating);

    void university(String title, double averageRatin, String spesialization);

    void work (BigDecimal salary, String position);

    void drive (boolean driverLicence, String car);

    void family (String spouse);

    void kids (LocalDate dateTime, int width, boolean gender);

    void death ( LocalDate death, String reason);
}
