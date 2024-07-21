package homework5;

import java.io.*;

public class HumanDAOInFileMemory implements IHumanDAO {

    private final int[] idRez = new int[10];
    private Human[] humans = new Human[10];

    public HumanDAOInFileMemory() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/Владимир/Desktop/Новая папка/maxima_homework/homework5/humans.txt"));
            String line;
            int id = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lines = line.split("/");
                id = Integer.parseInt(lines[0]);
                getHumans()[id] = new Human(lines[1], lines[2], lines[3], Integer.parseInt(lines[4]));
                getHumans()[id].setId(id);
            }
            int a = 0;
            for (int i = 0; i < getHumans().length; i++) {
                if (getHumans()[i] == null) {
                    idRez[a] = i;
                    a++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public Human[] getHumans() {
      return humans;
    }

  public void setHumans(Human[] humans) {
       this.humans = humans;
   }


    @Override
    public Human create(Human human) {
        int id = 0;
        for (int i = 0; i < getHumans().length; i++) {
            if (idRez[id] != -1) {
                id = idRez[i];
                idRez[i] += 1;
                break;

            }

        }getHumans()[id] = human;
        human.setId(id);
        return human;
    }


    @Override
    public Human findById(int id) {
        if (id > getHumans().length - 1) {
            System.out.println("Введен не коректный id");
        } else {
            return getHumans()[id];
        }
        return null;
    }


    @Override
    public void update(Human human) {
        getHumans()[human.getId()] = human;

    }

    @Override
    public void delete(int id) {
        int j = 0;
        Human[] newArr = new Human[getHumans().length - 1];
        for (int i = 0; i < getHumans().length; i++) {
            if (getHumans()[i] != null && id != getHumans()[i].getId()) {
                    newArr[j] = getHumans()[i];
                    j++;

                }
            }setHumans(newArr);
    }


    @Override
    public void dowenload() {

        try {
            //Данная реализация направлена на быстродействие,
            // за счет того, что записывает сначала все в буфер, а потом разом все пишет в файл
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:/Users/Владимир/Desktop/Новая папка/maxima_homework/homework5/humans.txt", true));
            for (Human human : getHumans()) {
                    if (human != null) {
                        bufferedWriter.write(human.toString() + "\n");
                        bufferedWriter.flush();

                    }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}