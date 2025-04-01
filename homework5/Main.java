package homework5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        IHumanService service = new HumanService(new HumanDAOInFileMemory());

        service.create(new Human("Oleg", "Igonin", "Leopoldovich", 28));
        service.create(new Human("Ivan", "Ivanov", "Ivanovich", 18));
        service.create(new Human("Petr", "Petrov", "Petrovich", 28));
        service.create(new Human("Vladimir", "Vladimirov", "Vladimirivich", 30));
        service.delete(2);
        service.update(new Human("Владимир","Владимиров","Владимирович", 23));
        service.dowenload();
    }

}
