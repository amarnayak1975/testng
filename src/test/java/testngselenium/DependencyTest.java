package testngselenium;

import org.testng.annotations.Test;

public class DependencyTest {

    @Test
    public void login() {
        System.out.println("Login Successful");
        assert false;
    }

    @Test(dependsOnMethods = "login")
    public void checkBalance() {
        System.out.println("Check Balance");
    }

    @Test(dependsOnMethods = "checkBalance")
    public void logout() {
        System.out.println("Logout Successful");
    }
}
