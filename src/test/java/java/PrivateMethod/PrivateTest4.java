package java.PrivateMethod;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(PowerMockRunner.class)
@PrepareForTest(TimeUitl.class)
public class PrivateTest4 {

    @Mock
    Student student;

    @InjectMocks
    private PrivateMethod privateMethod;

    @Before
    public void setup(){

        initMocks(this);

    }

    @Test
    public void testPrivate() throws Exception {

        String  timetest = "hello just a test";

        PowerMockito.mockStatic(TimeUitl.class);

        Mockito.when(TimeUitl.getTime(student)).thenReturn(timetest);

        String hellotest = "hello";

        String actual = Whitebox.invokeMethod(privateMethod,"parseStringtoInt",hellotest,student);

        System.out.println("actual is: " + actual);

    }
}
