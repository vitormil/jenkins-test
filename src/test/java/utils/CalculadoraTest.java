package test.java.utils;

import main.java.utils.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculadoraTest {
  private static Calculadora calc;
 
  @BeforeClass
  public void beforeClass() {
	  calc = new Calculadora();
  }

  @Test(groups={"sanity"})
  public void shouldSumTwoNumbers(){
	  int result = calc.soma(1, 3);
	  Assert.assertEquals(result,4);
  }
  
  @Test
  public void shouldSumNegativeNumbers(){
	  int result = calc.soma(-34, -16);
	  Assert.assertEquals(result,-50);
  }
}
