package family;

import packageinterface.IHumanObserver;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Human {
    private IHumanObserver[] observer;

    public void setOservers(IHumanObserver... observer) {
        this.observer = observer;
    }

    public static String setNameSpouse(boolean gender) {
        String spName = "";
        if (gender) {
            spName = "Anette";
        } else {
            spName = "John";
        }
        return spName;
    }


    public void live() {
        for (IHumanObserver iHumanObserver : observer) {
            boolean isMale  = true;
            Class clazz =iHumanObserver.getClass();
            System.out.println( clazz.getName()+":");
            iHumanObserver.born(LocalDateTime.now(), 51, isMale);
            String nameS = setNameSpouse(isMale);
            iHumanObserver.kindergarten(2, "Malyatko", "Shewchekko 30,");
            iHumanObserver.school("Boyko", false, 11);
            iHumanObserver.university("KPI", 4.5, "Authomatization");
            iHumanObserver.work(new BigDecimal("4000"), "engineer");
            iHumanObserver.drive(true, "prius");
            iHumanObserver.family(nameS);
            iHumanObserver.kids( LocalDate.of(2040, Month.AUGUST, 12), 51, false);
            iHumanObserver.death(LocalDate.of(2060, Month.JANUARY, 30), "natural causes");
            System.out.println();
        }
    }
}
