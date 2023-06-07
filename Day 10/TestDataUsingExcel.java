package com.testingframework.day10;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.example.excel.ExcelUtility;

public class TestDataUsingExcel {
  @Test
  public void addMethod(double num1, double num2) {
	  double result=num1+ num2;
  }
  @DataProvider
  public Object[][] testdata() throws IOException{
	  Object[][] data=ExcelUtility.readExcel();
	  return data;
  }
}
