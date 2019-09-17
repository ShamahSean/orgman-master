package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    @Test
    public void buildUserDemography() {
        UserDemography userDemography = UserDemographyFactory.buildUserDemography("124@mail.com","Mr","Male","Black",new Date());
        Assert.assertNotNull(userDemography.getGenderId());
        Assert.assertNotNull(userDemography.getRaceId());
        Assert.assertNotNull(userDemography);
    }
}