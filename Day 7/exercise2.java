package com.day7;

//import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class exercise2 {
	int num1=32;
	int num2=12;
  @Test(priority=-1)
  public void add() {
	  int sum=num1+num2;
	  Assert.assertEquals(sum, 44);
  }
  @Test(priority=0)
  public void subtract()
  {
	  int sub=num1-num2;
	  Assert.assertEquals(sub, 20);
  }
  
  @Test(priority=1)
  public void multiply()
  {
	  int mul=num1*num2;
	  Assert.assertEquals(mul, 384 );
  }
  
  @Test(priority=2)
  public void divide()
  {
	  int div=num1/num2;
	  Assert.assertEquals(div, 2);
  }
}
