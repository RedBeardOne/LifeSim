package family;

import com.sun.source.tree.IfTree;
import packageinterface.IHumanObserver;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Papa implements IHumanObserver {
    private Child chilhod;

    public Papa(Child chilhod) {
        this.chilhod = chilhod;
    }

    @Override
    public void born(LocalDateTime dateTime, int width, boolean gender) {
        if (!gender) {
            String name = "We call her Anett";
            System.out.println(name);
            chilhod.setName(name);
            chilhod.setGender(gender);
        }
    }

    @Override
    public void kindergarten(int age, String title, String adress) {
        System.out.println("We will send to kindergarten called" + title);
    }

    @Override
    public void school(String title, boolean booling, int averageRating) {
        if (title.equals("Boyko")) {
            System.out.println("Omg, it so expensive");
        }
        if (booling) {
            System.out.println("We have to change school");
        }
        if (averageRating > 9) {
            System.out.println("You are good");
        } else {
            System.out.println("some motivation");
        }
    }

    @Override
    public void university(String title, double averageRatin, String spesialization) {
        System.out.println(title + " nice chose");
    }

    @Override
    public void work(BigDecimal salary, String position) {
        BigDecimal compara = new BigDecimal("1000");
        if (salary.compareTo(compara) <=0) {
            System.out.println("Need to change job");
        }
    }

    @Override
    public void drive(boolean driverLicence, String car) {
        if (driverLicence){
            System.out.println("Ole");
        }
    }

    @Override
    public void family(String spouse) {
        System.out.println("We happy for you and "+spouse);
    }

    @Override
    public void kids(LocalDate dateTime, int width, boolean gender) {
        if (gender){
        System.out.println("It will be our helper");
    }}

    @Override
    public void death(LocalDate death, String reason) {
        System.out.println("He died at "+reason);
    }
}
