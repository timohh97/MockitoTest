import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

public class TaschenrechnerTest {

    @Test
    public void testRechne()
    {
        Service s = Mockito.mock(Service.class);

        Mockito.when(s.add(2,5)).thenReturn(7);

        Taschenrechner t= new Taschenrechner(s);

        assertTrue(t.rechne(2,5)==7);

        verify(s).add(2,5);

    }
}
