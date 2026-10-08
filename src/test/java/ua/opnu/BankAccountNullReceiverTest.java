package ua.opnu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountNullReceiverTest {
    @Test
    void transferWithNullReceiverMustNotDebitSender() {
        BankAccount sender = new BankAccount();
        sender.balance = 100.0;
        sender.transactionFee = 5.0;

        assertFalse(sender.transfer(null, 20.0));
        assertEquals(100.0, sender.getBalance(), 0.001);
    }

    @Test
    void validTransferMustStillWork() {
        BankAccount sender = new BankAccount();
        sender.balance = 100.0;
        sender.transactionFee = 5.0;
        BankAccount receiver = new BankAccount();
        receiver.balance = 30.0;

        assertTrue(sender.transfer(receiver, 20.0));
        assertEquals(75.0, sender.getBalance(), 0.001);
        assertEquals(50.0, receiver.getBalance(), 0.001);
    }
}
