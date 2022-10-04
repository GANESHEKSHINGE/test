package test1;

import org.testng.annotations.Test;

public class groups {
  @Test(groups= {"sanity"})
  public void f() {
	  System.out.println("this is sanity");
  }
  @Test(groups= {"sanity","regression"})
  public void test() {
	  System.out.println("sanity+regression");
  }
  @Test(groups= {"sanity"})
  public void test1() {
	  System.out.println("sanity");
  }
}
