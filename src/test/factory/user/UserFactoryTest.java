package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import com.sun.tools.javac.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    @Test
    public void buildUser() {
        User user = UserFactory.buildUser("124@mail.com ","Voornaam ", "Agternaam");
        Assert.checkNonNull(user);
        Assert.checkNonNull(user.getFirstName());
        Assert.checkNonNull(user.getLastName());
        Assert.checkNonNull(user.getUserEmail());
    }
}