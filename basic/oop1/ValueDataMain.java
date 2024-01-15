package oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        addValue(valueData);
        addValue(valueData);
        addValue(valueData);
    }

    static void addValue(ValueData valueData) {
        valueData.value++;
        System.out.println("value 증가 / 현재 value : " + valueData.value);
    }
}
