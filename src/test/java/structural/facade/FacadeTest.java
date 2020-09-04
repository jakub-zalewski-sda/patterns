package structural.facade;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FacadeTest {

    @Mock
    private PaymentFactory paymentFactory;

    @Mock
    private PaymentOperatorPaymentCreator paymentOperatorPaymentCreator;

    @Mock
    private PaymentNotifier paymentNotifier;

    @Mock
    private OldSystemPaymentRepository oldSystemPaymentRepository;

    @Test
    public void shouldProcessPaymentCreationFlow() {
        //given
        PaymentCreator paymentCreator = new PaymentCreator(
            paymentFactory, paymentOperatorPaymentCreator, paymentNotifier, oldSystemPaymentRepository);

        String basketId = "12345";

        Payment payment = new Payment("1234");
        Mockito.when(paymentFactory.createPayment(basketId)).thenReturn(payment);

        //when
        Payment paymentFromCreation = paymentCreator.createPayment(basketId);

        //then
        Assert.assertEquals(paymentFromCreation, payment);
        Mockito.verify(paymentFactory).createPayment(basketId);
        Mockito.verify(paymentOperatorPaymentCreator).create(payment);
        Mockito.verify(paymentNotifier).notifyPaymentCreated(payment);
        Mockito.verify(oldSystemPaymentRepository).save(payment);
    }
}
