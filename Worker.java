package Study.lyumbda.task2;

import java.util.function.Function;

public class Worker {
    public OnTaskDoneListener callback;
    public OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }


    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " NOT DONE");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
