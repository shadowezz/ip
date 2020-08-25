public class Todo extends Task {
    public Todo(String name, boolean isComplete) {
        super(name, isComplete, TaskType.TODO);
    }

    @Override
    public String toString() {
        return String.format("[T] %s", super.toString());
    }

    @Override
    public String getDetails() {
        return "";
    }
}
