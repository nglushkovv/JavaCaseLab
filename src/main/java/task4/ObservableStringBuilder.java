package task4;

import java.util.ArrayList;
import java.util.List;

public class ObservableStringBuilder {
    private final StringBuilder stringBuilder;
    private final List<StringBuilderObserver> observers;

    public ObservableStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.observers = new ArrayList<>();
    }

    public void addObserver(StringBuilderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StringBuilderObserver observer){
        observers.remove(observer);
    }

    private void notifyObservers() {
        String currentState = stringBuilder.toString();
        for (StringBuilderObserver observer : observers) {
            observer.onChange(currentState);
        }
    }

    public ObservableStringBuilder append(String str) {
        stringBuilder.append(str);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder append(char c) {
        stringBuilder.append(c);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        notifyObservers();
        return this;
    }

    public ObservableStringBuilder replace(int start, int end, String str){
        stringBuilder.replace(start, end, str);
        notifyObservers();
        return this;
    }

    public String toString() {
        return stringBuilder.toString();
    }
}