package homework5;

public class HumanDAOInMemory implements IHumanDAO {
    private static int count_id = 1;
    private final Human[] humans = new Human[10];

    @Override
    public Human create(Human human) {
        human.setId(count_id);
        humans[count_id] = human;
        count_id++;
        return human;
    }

    @Override
    public Human findById(int id) {
        return humans[id];
    }

    @Override
    public void update(Human human) {
        humans[human.getId()] = human;
    }

    @Override
    public void delete(int id) {
        humans[id] = null;
    }

    @Override
    public void dowenload() {

    }

}
