/**
 * Created by jc302404 on 13/04/15.
 */
public class TestTodo {
    public static void main(String[] args) {
        TodoList todo = new TodoList();
        System.out.println("size after creating (expected value: 0)"+ "actual: " + todo );
        todo.add("buy milk");
        todo.add("mow the lawn");
        todo.add("buy an oculus rift");
        System.out.println("size after adding (expected value: 3)" + "actual: " + todo.count());
    }
}
