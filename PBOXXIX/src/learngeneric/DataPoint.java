package learngeneric;

public class DataPoint<T extends Number> {
    T[] numbers;
    DataPoint(T[] numbers) {
        this.numbers = numbers;
    }
}
