/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

public class Account {
    public static void main(String[] args) throws java.io.IOException, java.text.ParseException {
    Account l = new Account("Bank account");
    Date d = new Date();
    Transaction t;
    for (int i = 0; i <= MAXTRANSACTIONS; i++) {                      // '<=' is an error
      t = new Transaction(d, "test", 100, "test");
      try {
	l.makeEntry(t);                                                      
      } catch (ArrayFullException a) {
	System.err.println(a + " account exceeded " + a.arraySize + " entries");
	System.exit(1);
      }
    }                                                                  
    System.out.println("Finished main successfully");                  
  }
}
