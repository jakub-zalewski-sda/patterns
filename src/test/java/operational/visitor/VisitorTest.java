package operational.visitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class VisitorTest {

    @Test
    public void shouldValidate() {
        //given
        Visitor visitor = Mockito.spy(HTMLValidator.class);
        HTMLFile htmlFile = new HTMLFile();

        //when
        htmlFile.accept(visitor);

        //then
        Mockito.verify(visitor).visit(htmlFile);
    }

    @Test
    public void shouldLog() {
        //given
        Visitor visitor = Mockito.spy(HTMLLogger.class);
        HTMLFile htmlFile = new HTMLFile();

        //when
        htmlFile.accept(visitor);

        //then
        Mockito.verify(visitor).visit(htmlFile);
    }


}
