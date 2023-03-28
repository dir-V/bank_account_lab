import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    BankAccount bankAccount;
    @BeforeEach
    public void setUp(){
        bankAccount = new BankAccount("Vincent", "Adeola", "31/07/2001", 9009910);
    }

    @Test
    public void canDeposit(){
        int actual = bankAccount.deposit(20);
        int expected = 20;

        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canWithdraw(){
        int actual = bankAccount.withdrawal(80);
        int expected = -80;

        assertThat(actual).isEqualTo(expected);
    }
    @Test
    public void canPayInterest(){
        int actual = bankAccount.interest(0.25);
        int expected = 0;

        assertThat(actual).isEqualTo(bankAccount);
    }


}
