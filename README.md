## Bank - Class Diagram
```
Class Bank:
  //Atributes:
    + numAccount;
    # type;
    - Client;
    - balance;
    - status;

  //Methods
    + oppenAccount();
    + closeAccount();
    + deposit();
    + booty();
    + payMonthlyFee();

  // Special Methods
   + constructor
   + Getters and Setters
```
Notes: 
  1. Account type - oppenAccount():
     - CC (Current account) -> If a current account is created, R$ 50.00 will be added to the customer.
     - CP (savings account) -> If a savings account is created, R$ 150.00 will be added to the customer.
      
  2. If an account is closed - closeAccount():
     - The money in the account must first be withdrawn in full.
     - If the customer is in debt with the bank, he will not be able to close it.
     
  3.  deposit()
      - Account must be open to deposit.
      
  5.  booty()
      - Account must be open to withdraw, you must have money in the account.
      - Do not allow a withdrawal greater than the money available in the account.

 6. payMonthlyFee()
    - Monthly fee is deducted directly from the balance as soon as the method is called.
    - CC = R$ 12.00 Monthly payment.
    - CP = R$ 20.00 Monthly payment.
