package homework5;

public interface IHumanService {

    Human create(Human human);

    Human findById(int id);

    void update(Human human);

    void delete(int id);
    void dowenload();



}
