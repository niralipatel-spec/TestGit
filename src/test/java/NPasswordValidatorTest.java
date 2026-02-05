

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import test.test1.PasswordValidator;

/**
 *
 * @author Nirali
 */
public class NPasswordValidatorTest {
    
    public NPasswordValidatorTest() {
    }
    
   @Test
   public void testCheckLength(){
       System.out.println("checkLengthGood");
       String password = "mylingpassword";//>8 lrngth
       assertEquals(true, PasswordValidator.checkLength(password));
   }
   
   @Test
   public void testCheckLengthBad(){
       System.out.println("checkLengthBad");
       String password = "pass";//<8 lrngth
       assertEquals(false, PasswordValidator.checkLength(password));
   }
   @Test
   public void testCheckLengthBoundry(){
       System.out.println("checkLengthBoundry");
       String password = "password";
       assertEquals(true, PasswordValidator.checkLength(password));
   }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
