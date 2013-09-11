package test.java.helpers;

import main.java.helpers.*;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TextBuilderTest {
  private static TextBuilder textBuilder;
  
  @BeforeSuite
  public void beforeSuite() {
	  textBuilder = new TextBuilder();
  }

  @Test
  public void shouldJoinTwoStrings(){
	  String result = textBuilder.join("a", "b");
	  Assert.assertEquals(result, "a b");
  }
}
