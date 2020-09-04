package operational.chain_of_responsibility;

import org.junit.Test;
import org.mockito.Mockito;

public class ChainOfResponsibilityTest {

    @Test
    public void shouldHandlHelpInApplication() {
        //given
        Application application = Mockito.spy(Application.class);
        Form form = new Form(application);
        Button button = new Button(form);

        //when
        button.handleHelp();

        //then
        Mockito.verify(application).handleHelp();
    }
}
