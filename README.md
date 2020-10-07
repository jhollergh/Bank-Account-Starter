# Programming Assignment 2 - Bank Account class

### Overview
 In this project your will create your own class that based on what we've discussed together in class. A skeleton of the BankAccount class will be given to you.  It will be your job to fully implement and test the class.

### Due Date:
 The assignment must be submitted by 12:00pm on Friday, October 09. 

### Specifications:
 
 The BankAccount class will specify just two private instance variables: the account’s balance (double) and the account’s annual percentage rate (double).  The BankAccount class will have two constructors and several methods which you will be responsible for fully implementing and properly commenting.  See the attached skeleton of the class.  You must also create a BankAccountTester which you will use to fully test your BankAccount class and compare results of running the methods with expected results.

Here is a summary of the constructors and methods you must implement:

1) The first constructor has no parameters.  It should set default values of 0 for both the initial balance and annual percentage rate of the object.
2) The second constructor has two parameters, initialBalance and initialAPR and must properly set those values.
3) The getBalance() method is a method that requires no parameters and returns the current balance of the object.
4) The setBalance(double newBalance) method sets the object’s balance to the specified newBalance.  It does not return a value.
5) The withdraw(double amount) method subtracts the specified amount from the object’s balance.  It does not return a value.
6) The deposit(double amount) method adds the specified amount to the object’s balance.  It does not return a value.
7) The addMonthlyInterest(int months) adds the appropriate amount of interest to the object’s balance after the indicated number of months has passed.  Assume no additional deposits are made in the time period.  It does not return a value.  Note: All BankAccount objects represent accounts that compound interest monthly.
8) The addYearlyInterest(int years) adds the appropriate amount of interest to the object’s balance after the indicated number of years has passed.  Assume no additional deposits are made in the time period.  It does not return a value.  Note: All BankAccount objects represent accounts that compound interest monthly.

Note:  Monthly compounded interest can be calculated using the formula: B = B<sub>0</sub> ( 1 + (r / 12))<sup>n</sup> where:
* B0 = current balance
* B = new balance
* r = annual interest rate
* n = number of months
	

*For an extra challenge, you may attempt to write the following method, which requires advanced knowledge of recursive methods:*

The **addInterestAndDeposit(int months, double deposit)** method applies interest at the end of each month and a deposit at the end of each month.  There is no explicit mathematical formula to perform this operation quickly – you must write a recursive method.  This is an especially advanced topic.

You will also write a BankAccountTester class that thoroughly tests the construction of BankAccount objects and the methods.  Here is an example of several tests that could be one of many tests performed in your BankAccount class:

    public BankAccountTester {
	
	public static void main(String[] args){

		BankAccount mySavings = new BankAccount(200, 0.05);

		System.out.println(mySavings.getBalance());
		System.out.println(“Expected balance: 200.0”);

		mySavings.deposit(300);
		System.out.println(mySavings.getBalance());
		System.out.println(“Expected balance: 500.0”);

		mySavings.addMonthlyInterest(2);
		System.out.println(mySavings.getBalance());
		System.out.println(“Expected balance: 504.175”);

		mySavings.setBalance(100);
		mySavings.addYearlyInterest(1);
		System.out.println(mySavings.getBalance());
		System.out.println(“Expected balance: 105.12”);

        }
    }


Note, this is just one test of many!  Think about all the other scenarios you should test.  And be thorough.  

Your BankAccount class needs to be **thoroughly commented**.  It should include a header comment that has your name, the date, class and a brief description of the project.  All methods should have comments that follow the standard method commenting structure.


### Submission Details:
  You will submit your project via Github classroom.  Your project will be tested automatically using the tests found in the project, along with additional tests written by Dr. Holler and not shown in the project.
