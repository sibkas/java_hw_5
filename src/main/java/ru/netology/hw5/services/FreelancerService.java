package ru.netology.hw5.services;

public class FreelancerService {

     //income - доход за месяц работы
     //expense - обязательные расходы
     //threshold - минимальная сумма на счету, чтобы можно было отдохнуть
     //@return количество месяцев отдыха за год (12 мес)

    public int calculate(int income, int expense, int threshold) {
        int count = 0; // месяцев отдыха
        int money = 0; // денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                // Можем отдыхать
                count++; // Отдыхаем в этом месяце
                money = money - expense; // Тратим расходы на отдых
                money = money / 3; // Ещё тратим 1/3 остатка
            } else {
                // Работаем
                money = money + income - expense;
            }
        }
        return count;
    }
}
