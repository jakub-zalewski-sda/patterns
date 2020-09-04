package creational.static_factory_method;

import org.junit.Assert;
import org.junit.Test;

public class EmailNotificationsTest {

    @Test
    public void shouldBuildDefaultEmailNotifications() {
        //when
        EmailNotifications emailNotifications = EmailNotifications.defaultNotifications();

        //then
        Assert.assertTrue(emailNotifications.paymentFinished());
        Assert.assertTrue(emailNotifications.paymentRejected());
        Assert.assertTrue(emailNotifications.paymentNotFinished());
        Assert.assertFalse(emailNotifications.paymentStarted());
    }

    @Test
    public void shouldBuildEmptyEmailNotifications() {
        //when
        EmailNotifications emailNotifications = EmailNotifications.emptyNotifications();

        //then
        Assert.assertNull(emailNotifications.paymentFinished());
        Assert.assertNull(emailNotifications.paymentRejected());
        Assert.assertNull(emailNotifications.paymentNotFinished());
        Assert.assertNull(emailNotifications.paymentStarted());
    }
}
