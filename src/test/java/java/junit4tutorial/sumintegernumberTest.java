package java.junit4tutorial;

import juni4tutorial.SumNumber;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class sumintegernumberTest
{
    private int arithnumber1;
    private int arithnumber2;
    private int totalarithnumber;
    private SumNumber sumNumber;

    public sumintegernumberTest(int arithnumber1, int arithnumber2, int totalint){
//        super();
        this.arithnumber1 = arithnumber1;
        this.arithnumber2 = arithnumber2;
        this.totalarithnumber = totalint;

    }

    @Before
    public void initializer(){
        sumNumber = new SumNumber();
    }


    @Parameterized.Parameters
    public static Collection getIntParamter()
    {
        return Arrays.asList(new Object[][]  {{1,2,3},{2,3,5},{2,5,6}});
    }

    @Test
    public void  testSumNumber(){

        System.out.println("Sum of number equals =: "+ totalarithnumber);
//        Assert.assertEquals(totalarithnumber, sumNumber.sumintegernumber(arithnumber1, arithnumber2));
//
      assertThat(totalarithnumber).isEqualTo(sumNumber.sumintegernumber(arithnumber1,arithnumber2));
    }

}
