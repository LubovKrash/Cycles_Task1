package ru.netology.javaqa;

public class VacationService {
    public int calculate(int income, int expense, int threshold) {
        int money = 0;
        int monthCounter = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отпуск
                money = (money - expense) / 3;
                monthCounter++;
            } else {
                //работа
                money = money + income - expense;
            }

        }
        return monthCounter;
    }
}
