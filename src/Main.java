import family.Child;
import family.Human;
import family.Mama;
import family.Papa;
import packageinterface.IHumanObserver;

public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        Child chi = new Child();
        Mama mama = new Mama(chi);
        Papa papa = new Papa(chi);
        human.setOservers(mama, papa);
        human.live();
    }
}
