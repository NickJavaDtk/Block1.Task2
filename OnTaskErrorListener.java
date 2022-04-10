package Study.lyumbda.task2;

@FunctionalInterface
public interface OnTaskErrorListener<T, N> {
    N onError(T t);
}
