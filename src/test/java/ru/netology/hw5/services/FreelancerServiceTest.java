package ru.netology.hw5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelancerServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "10_000, 3_000, 20_000"
//    })
    @CsvFileSource (files="src/test/resources/money.csv")
    public void testExample1(int income, int expense, int threshold, int expected) {
        FreelancerService service = new FreelancerService();
        //int income = 10_000;
        //int expense = 3_000;
        //int threshold = 20_000;
        //int expected = 3; // согласно примеру
        int actual = service.calculate(income, expense, threshold);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testExample1() {
//        FreelancerService service = new FreelancerService();
//        int income = 10_000;
//        int expense = 3_000;
//        int threshold = 20_000;
//        int expected = 3; // согласно примеру
//        int actual = service.calculate(income, expense, threshold);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testExample2() {
//        FreelancerService service = new FreelancerService();
//        int income = 100_000;
//        int expense = 60_000;
//        int threshold = 150_000;
//        int expected = 2; // согласно примеру
//        int actual = service.calculate(income, expense, threshold);
//        Assertions.assertEquals(expected, actual);
//    }
}
