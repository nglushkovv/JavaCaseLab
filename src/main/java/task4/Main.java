package task4;

public class Main {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();

        observableStringBuilder.addObserver(newState -> System.out.println("Состояние изменено: " + newState));

        observableStringBuilder.append("Тест ");
        observableStringBuilder.append("1232423414");
        observableStringBuilder.insert(7, "Наблюдатель ");
        observableStringBuilder.delete(7, 18);
    }
}
