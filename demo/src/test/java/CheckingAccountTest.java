
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.CheckingAccount;

public class CheckingAccountTest {

    CheckingAccount newAccount = new CheckingAccount("unknonw", 5);

    CheckingAccount mariaAccount = new CheckingAccount("Maria", 200);
    CheckingAccount joaoAccount = new CheckingAccount("Joao", 100);

    @Test
    public void objectNotNullTest() {
        assertNotNull(joaoAccount);
        assertNotNull(mariaAccount);
    }

    @Test
    public void getBalance_FromBothAccounts_balanceIsdifferent() {
        assertNotEquals(mariaAccount.getBalance(), joaoAccount.getBalance());
    }

    @Test
    public void mariaWithdrawsFromTheAccount_haveSameBalanceHasJoao() {
        mariaAccount.withdraw(100);
        assertEquals(mariaAccount.getBalance(), joaoAccount.getBalance());
    }

    @Test
    public void joaoMakesADepositTohisTheAccount_has50moreThanMaria() {

        mariaAccount.withdraw(100);
        joaoAccount.deposit(50);
        assertEquals(mariaAccount.getBalance() + 50, joaoAccount.getBalance());
    }

    @Test
    public void tryToWithdrawMoreThanTheCurrentBalance() {
        assertThrows(IllegalArgumentException.class, () -> mariaAccount.withdraw(201));
    }

    @Test
    public void withDrawFromTheAccount_shouldReturnTrue() {
        assertTrue(100 == mariaAccount.withdraw(100));
        assertTrue(0 == joaoAccount.withdraw(100));
    }

    @Test
    public void withDrawFromTheAccountMoreThanIhaveInBalace_shouldReturnTrue() {
        assertThrows(IllegalArgumentException.class, () -> joaoAccount.withdraw(1000));

    }

    @Test
    public void DepositTest() {
        assertEquals(10, newAccount.deposit(5));
    }

    @Test
    public void WithdrawTest() {
        assertEquals(0, newAccount.withdraw(5));
        assertThrows(IllegalArgumentException.class, () -> newAccount.withdraw(10));

    }

}
