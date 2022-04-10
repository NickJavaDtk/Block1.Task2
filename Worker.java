package Study.lyumbda.task2;

import java.util.function.Function;

public class Worker {
    public OnTaskDoneListener callback;
    public OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                final int tmp = i;
                OnTaskErrorListener<OnTaskDoneListener, String> taskError = x -> "Task " + tmp + " NOT DONE";
                String s = taskError.onError(callback);
                callback.onDone(s);
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
