package TaskOne.src;

public class Main {

    public static void main(String[] args) {

        TodoList todoList = new TodoList("data/todo.csv");

        todoList.runDialog();
    }
}
