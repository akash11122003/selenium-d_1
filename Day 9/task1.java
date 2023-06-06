package com.day9;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class task1 {
	
	CalculatorLogic cl=new CalculatorLogic();
  @Test(dataProvider="addValues")
  public void addMethod(int a, int b, int expected)
{
	  int result=cl.add(a,b);
	  Assert.assertEquals(expected, result);
}
  @DataProvider
  public Object[][] addValues()
  {
	  return new Object[][]
	  {
		  {1,2,4},{3,12,15}
	  };
  }

  @Test(dataProvider="subValues")
  public void subMethod(int a,int b,int output)
  {
	  int result=cl.sub(a,b);
	  Assert.assertEquals(output, result);
  }
  @DataProvider
  public Object[][] subValues()
  {
	  return new Object[][]
			  {
		  {5,4,1},{9,7,3}
			  };
  }
  
  @Test(dataProvider="mulValues")
  public void mulMethod(int a,int b,int output)
  {
	  int result=cl.mul(a,b);
	  Assert.assertEquals(output, result);
  }
  @DataProvider
  public Object[][] mulValues()
  {
	  return new Object[][]
			  {
		  {1,2,2},{2,3,5}
			  };
  }
  
  
  @Test(dataProvider="divValues")
  public void divMethod(int a,int b,int output)
  {
	  int result=cl.div(a,b);
	  Assert.assertEquals(output, result);
  }
  @DataProvider
  public Object[][] divValues()
  {
	  return new Object[][]
			  {
		  {4,2,2},{10,3,5}
			  };
  }
}
