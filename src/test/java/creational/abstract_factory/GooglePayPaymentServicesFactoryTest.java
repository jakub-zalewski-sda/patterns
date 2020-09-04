package creational.abstract_factory;

import org.junit.Assert;
import org.junit.Test;

public class GooglePayPaymentServicesFactoryTest {

    @Test
    public void shouldCreateGooglePayPaymentCreator() {
        //given
        GooglePayPaymentServicesFactory googlePayPaymentServicesFactory = new GooglePayPaymentServicesFactory();

        //when
        PaymentCreator paymentCreator = googlePayPaymentServicesFactory.createPaymentCreator();

        //then
        Assert.assertTrue(paymentCreator instanceof GooglePayPaymentCreator);
    }

    @Test
    public void shouldCreateGooglePayPaymentFinisher() {
        //given
        GooglePayPaymentServicesFactory googlePayPaymentServicesFactory = new GooglePayPaymentServicesFactory();

        //when
        PaymentFinisher paymentFinisher = googlePayPaymentServicesFactory.createPaymentFinisher();

        //then
        Assert.assertTrue(paymentFinisher instanceof GooglePayPaymentFinisher);
    }
}
