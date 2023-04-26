import com.easy.FizzBuzz;
import com.easy.SqrtX;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UnitTest {
  //  private SqrtX sqrtX;

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SqrtX s = (SqrtX) context.getBean("mySqrt");
        int result = s.mySqrt(4);

        Assert.assertEquals(result, 2);
        FizzBuzz f = (FizzBuzz) context.getBean("fizzBuzz");
        System.out.println(f.fizzBuzz(15));
    }
}
