package test.java;

import main.java.utils.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CalculadoraTest {
  private static Calculadora calc;

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println ("1 beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println ("1 afterSuite");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println ("  2 beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println ("  2 afterTest");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println ("    3 beforeClass");
	  this.calc = new Calculadora();
  }

  @AfterClass
  public void afterClass() {
	  System.out.println ("    3 afterClass");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println ("      4 beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println ("      4 afterMethod");
  }

  @Test
  public void shouldSumTwoNumbers(){
	  System.out.println ("shouldSumTwoNumbers");
	  int result = calc.soma(1, 3);
	  Assert.assertEquals(result,4);
  }
  
  @Test
  public void shouldSumNegativeNumbers(){
	  System.out.println ("shouldSumNegativeNumbers");
	  int result = calc.soma(-34, -16);
	  Assert.assertEquals(result,-50);
  }
}
