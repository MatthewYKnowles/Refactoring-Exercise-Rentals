package com.greatersum.rental;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class RentalTests {
    @Test
    public void MartinTest() {
        String properResult =
                "Rental Record for martin\n" +
                        "\tRan\t3.5\n" +
                        "\tTrois Couleurs: Bleu\t2\n" +
                        "Amount owed is 5.5\n" +
                        "You earned 2 frequent renter points\n";
        List<MovieRental> rentals = Arrays.asList(new MovieRental("F001", 3), new MovieRental("F002", 1));
        Customer customer = new Customer("martin", rentals);
        RentalInfo info = new RentalInfo();
        String actualResult = info.statement(customer);
        Assert.assertEquals(properResult, actualResult);
    }
}
