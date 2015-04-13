import java.util.ArrayList;

/**
 * Created by jc302404 on 13/04/15.
 */
public class TodoList {
    private ArrayList<String> uncompletedItems;
    private ArrayList<String> completedItems;

    public TodoList(){
        uncompletedItems = new ArrayList<String>();
        completedItems = new ArrayList<String>();

    }
    public void add(String item){
        uncompletedItems.add(item);

    }
    public String getcompleted(){
        return completedItems.toString();

    }

    public void markCompleted(String item){
        if (uncompletedItems.contains(item)) {
            uncompletedItems.remove(item);
            completedItems.add(item);
        }
    }


    public int count(){
        return uncompletedItems.size();

    }
}
