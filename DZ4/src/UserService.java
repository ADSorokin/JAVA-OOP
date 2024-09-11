
import java.util.List;

public interface UserService <T extends User> {

public void addItem(T t);
public void deleteItem(int index);



    void updateItem(int index, T t);
public List<T> getAllItem();
}
