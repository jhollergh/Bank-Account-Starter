package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestBankAccount {

    @Test
    public void nullConstructor() {
        String description = "Checking if constructing with no parameters yields correct instance variables";
        BankAccount mySavings = new BankAccount();
        try{
            assertEquals(0.0, mySavings.getBalance(), 0.01);
            assertEquals(0.0, mySavings.getAPR(), 0.01);
            System.out.println( description + " - passed");
        }catch(AssertionError e){
            System.out.println(description + " - failed");

            throw e;
        }
    }

    @Test
    public void testBalance() {
        String description = "Checking first parameter in constructor is balance (getBalance)";
        BankAccount mySavings = new BankAccount(200, 0.05);
        try{
            assertEquals(200.0, mySavings.getBalance(), 0.01);
            System.out.println( description + " - passed");
        }catch(AssertionError e){
            System.out.println(description + " - failed");

            throw e;
        }
    }

    @Test
    public void testDeposit() {
        String description = "Adding 300 to an initial balance of 200 (deposit)";
        BankAccount mySavings = new BankAccount(200, 0.05);
        mySavings.deposit(300);
        try{
            assertEquals(500.0, mySavings.getBalance(), 0.01);
            System.out.println( description + " - passed");
        }catch(AssertionError e){
            System.out.println(description + " - failed");

            throw e;
        }
    }

    @Test
    public void testMonthlyInterest() {
        String description = "Adding 2 months of 5% annual interest (addMonthlyInterest)";
        BankAccount mySavings = new BankAccount(500, 0.05);
        mySavings.addMonthlyInterest(2);
        try{
            assertEquals(504.175, mySavings.getBalance(), 0.01);
            System.out.println( description + " - passed");
        }catch(AssertionError e){
            System.out.println(description + " - failed");

            throw e;
        }
    }

    @Test
    public void testYearlyInterest() {
        String description = "Adding 1 year of 5% annual interest to 100";
        BankAccount mySavings = new BankAccount(100, 0.05);
        mySavings.addYearlyInterest(1);
        try{
            assertEquals(105.12, mySavings.getBalance(), 0.01);
            System.out.println( description + " - passed");
        }catch(AssertionError e){
            System.out.println(description + " - failed");

            throw e;
        }
    }

    @Test
    public void testAddInterestAndDeposit() {
        String description = "Adding 3 months of 5% annual interest with a 12 dollar deposit at the end of each year (addInterestAndDeposit)";
        BankAccount mySavings = new BankAccount(100, 0.05);
        mySavings.addInterestAndDeposit(3, 12);
        try{
            assertEquals(137.41, mySavings.getBalance(), 0.01);
            System.out.println( description + " - passed");
        }catch(AssertionError e){
            System.out.println(description + " - failed");
            throw e;
        }
    }

    @Test
    public void checkNotEquals() {
        String description = "Check if two accounts with different balances are equal";
        BankAccount mySavings1 = new BankAccount(100, 0.05);
        BankAccount mySavings2 = new BankAccount(101, 0.05);

        try{
            boolean isEqual = mySavings1.equals(mySavings2);
            assert(!isEqual);
            System.out.println( description + " - passed");
        }catch(AssertionError e){
            System.out.println(description + " - failed");
            throw e;
        }
    }

    @Test
    public void checkEquals() {
        String description = "Check if two accounts with very close balances are equal";
        BankAccount mySavings1 = new BankAccount(100, 0.05);
        BankAccount mySavings2 = new BankAccount(100.001, 0.05);

        try{
            boolean isEqual = mySavings1.equals(mySavings2);
            assert(isEqual);
            System.out.println( description + " - passed");
        }catch(AssertionError e){
            System.out.println(description + " - failed");
            throw e;
        }
    }
}
