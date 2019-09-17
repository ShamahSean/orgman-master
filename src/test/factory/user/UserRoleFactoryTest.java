package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import com.sun.tools.javac.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void buildUserRole() {
        UserRole userRole = UserRoleFactory.buildUserRole(" ","username","Main");
        Assert.checkNonNull(userRole);
        Assert.checkNonNull(userRole.getRoleId());
        Assert.checkNonNull(userRole.getUserEmail());
    }
}