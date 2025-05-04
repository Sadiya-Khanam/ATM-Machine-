# ATM-Machine-

## Requirements:

 I designed an ATM system where a user can:

 Insert a card and validate a PIN

 Check balance

 Withdraw cash

 ATM has limited cash and can deny transactions

## Based on the scope, the main Use Cases are:

 Insert card

 Validate PIN

 Select operation

 View balance

 Withdraw cash

 Dispense cash

 Eject card

## Classes Overview:

### `ATM`

- Main controller that handles the transaction process.
 
- Validates PIN, checks balance and ATM cash, dispenses money.

### `Card`

- Represents a user's debit/ATM card.
  
- Contains card number, PIN, and linked `BankAccount`.

### `BankAccount`

- Represents a user’s bank account.
  
- Maintains balance and allows debit operations.

### `CashDispenser`

- Represents the ATM's physical cash dispenser.
  
- Manages available cash and handles dispensing logic.

### `User`

- Represents the bank account holder.
  
- Has basic attributes like name, and a linked account.

## Relationships / UML Sketch:

  User → has a → Card

  Card → linked to → BankAccount

  ATM uses Card, CashDispenser, and controls flow
 

## Sample Code Flow:

1. Create a `User` with a `BankAccount`.
   
2. Create a `Card` linked to that account.
   
3. Create an `ATM` with some cash inside.
   
4. Start a transaction using the `ATM.start()` method.
   
5. Print transaction result and remaining balances.
















 
