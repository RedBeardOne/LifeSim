package family;

import packageinterface.IHumanObserver;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mama implements IHumanObserver {
    private Child chilhod;
   public Mama(Child chilhod){
        this.chilhod= chilhod;
    }
    @Override
    public void born(LocalDateTime dateTime, int width, boolean gender) {
        if (gender){
            String name = "We call him John";
            System.out.println(name);
            chilhod.setName(name);
            chilhod.setGender(gender);
        }

    }

    @Override
    public void kindergarten(int age, String title, String adress) {
        System.out.println("Nice, i like " + title);
    }

    @Override
    public void school(String title, boolean booling, int averageRating) {
        if (title.equals("Boyko")) {
            System.out.println("It best in our city");
        }
        if (booling) {
            System.out.println("We have to change school");
        }
        if (averageRating > 11) {
            System.out.println("You have to do harder");
        } else {
            System.out.println("a lot of motivation");
        }
    }

    @Override
    public void university(String title, double averageRatin, String spesialization) {
        System.out.println (spesialization + "are you sure it good chose?");
    }

    @Override
    public void work(BigDecimal salary, String position) {
        BigDecimal compara = new BigDecimal("1000");
        if (salary.compareTo(compara) >=0) {
            BigDecimal persent = new BigDecimal("0.1");
            BigDecimal rest = salary.multiply(persent);
            System.out.println("Some money for parents " + rest);
        }
    }

    @Override
    public void drive(boolean driverLicence, String car) {
        if (driverLicence){
            System.out.println("Bring us some potato");
        }
    }

    @Override
    public void family(String spouse) {
        System.out.println("At least, we happy for you and "+spouse);
    }

    @Override
    public void kids(LocalDate dateTime, int width, boolean gender) {
        System.out.println("Happy cry");
    }

    @Override
    public void death(LocalDate death, String reason) {
        System.out.println("He died at "+reason);
    }
}
