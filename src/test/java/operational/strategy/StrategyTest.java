package operational.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class StrategyTest {

    @Test
    public void shouldUseGooglePay() {
        //given
        PBLPaymentCreatorService pblPaymentCreatorService = new PBLPaymentCreatorService();
        GooglePayStrategy paymentOperatorStrategy = Mockito.spy(GooglePayStrategy.class);
        pblPaymentCreatorService.setPaymentOperatorStrategy(paymentOperatorStrategy);

        //when
        pblPaymentCreatorService.createPayment();

        //then
        Mockito.verify(paymentOperatorStrategy).createPayment();
    }

    @Test
    public void shouldUseApplePay() {
        //given
        PBLPaymentCreatorService pblPaymentCreatorService = new PBLPaymentCreatorService();
        ApplePayStrategy paymentOperatorStrategy = Mockito.spy(ApplePayStrategy.class);
        pblPaymentCreatorService.setPaymentOperatorStrategy(paymentOperatorStrategy);

        //when
        pblPaymentCreatorService.createPayment();

        //then
        Mockito.verify(paymentOperatorStrategy).createPayment();
    }
}
