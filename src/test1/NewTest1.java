package test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  Assert.fail();
  }
  @Test(priority=3)
  public void test123() {
	  System.out.println("test 3 is executed");
  }
  @Test(priority=1,invocationCount=3)
  public void test1234()
  {
	  System.out.println("test 1 is executed");
  }
  @Test(priority=2)
  public void test12345() {
	  System.out.println("test 2 is execulted");
  }
  @Test(priority=4,enabled=false)
  public void test16() {
	  System.out.println("123");
  }
}
