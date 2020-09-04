package creational.abstract_factory;

import org.junit.Assert;
import org.junit.Test;

public class ApplePayPaymentServicesFactoryTest {

    @Test
    public void shouldCreateApplePayPaymentCreator() {
        //given
        ApplePayPaymentServicesFactory applePayPaymentServiceFactory = new ApplePayPaymentServicesFactory();

        //when
        PaymentCreator paymentCreator = applePayPaymentServiceFactory.createPaymentCreator();

        //then
        Assert.assertTrue(paymentCreator instanceof ApplePayPaymentCreator);
    }

    @Test
    public void shouldCreateApplePayPaymentFinisher() {
        //given
        ApplePayPaymentServicesFactory applePayPaymentServiceFactory = new ApplePayPaymentServicesFactory();

        //when
        PaymentFinisher paymentFinisher = applePayPaymentServiceFactory.createPaymentFinisher();

        //then
        Assert.assertTrue(paymentFinisher instanceof ApplePayPaymentFinisher);
    }
}
