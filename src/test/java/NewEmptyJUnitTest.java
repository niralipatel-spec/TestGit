/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import test.test1.UnitTestDemo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nirali
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
   @Test
   public void testGreet(){
       UnitTestDemo utd = new UnitTestDemo();
       assertEquals("Hello World!", utd.testGreet());
       
   }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
