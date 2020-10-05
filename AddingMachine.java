package cse360assignment02;

/**
 * Represents a machine to add and subtract numbers
 */
public class AddingMachine {
  private int total;
  private String history;
  
  /**
   * Constructs an object of class AddingMachine
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  /**
   * Gets the total stored in the AddingMachine
   * @return    the total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Adds the value to the total stored in the AddingMachine
   * @param value   the value to add
   */
  public void add (int value) {
    total += value;
    history += " + " + value;
  }

  /**
   * Subtracts the value from the total stored in the AddingMachine
   * @param value   the value to subtract
   */
  public void subtract (int value) {
    total -= value;
    history += " - " + value;
  }

  /**
   * Returns a string containing a history of transactions
   * @return    transaction history
   */
  public String toString () {
    return history;
  }

  /**
   * Clears the transaction history
   */
  public void clear() {
      total = 0;
      history = "0";
  }
}