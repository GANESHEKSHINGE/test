package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
  }
@Test 
public void login() {
	System.out.println("this is loginpage");
}
@Test(dependsOnMethods= {"login"})
public void username() {
	System.out.println("this is signup page");
}
@Test(timeOut=5000)
public void login1() {
	System.out.println("gggg");
}
@Test()
public void test123() {
	Assert.fail();
}


}