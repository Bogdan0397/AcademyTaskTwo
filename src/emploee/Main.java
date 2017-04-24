package emploee;

import static emploee.Emploee.getTotalSum;

/**
 * Created by koqfl on 24.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Emploee obj1 = new Emploee("Ivan",30,80);
        Emploee obj2 = new Emploee("Petro",40,160);
        Emploee obj3 = new Emploee("Taras",50,70);

        obj1.changeRate(40);

        System.out.println(obj2.bonuses());

        System.out.println(obj1.salary());
        System.out.println(obj2.salary());
        System.out.println(obj3.salary());

        System.out.println(obj3.toString());

        System.out.println(getTotalSum());

    }
}
