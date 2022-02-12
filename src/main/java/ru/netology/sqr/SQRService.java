package ru.netology.sqr;

public class SQRService {
    public int counterNumbers(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit) {
                counter++;
            }
            if (i * i > upperLimit) {
                counter--;
            }
        }
        return counter;
    }
}
