package Study.lyumbda.task2;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start( );
    }
}