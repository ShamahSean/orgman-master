package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import com.sun.tools.javac.util.Assert;
import org.junit.Test;

public class OrganisationUserFactoryTest {

    @Test
    public void buildOrganisationUser() {
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser(" "," ");
        Assert.checkNonNull(organisationUser.getOrgCode());
        Assert.checkNonNull(organisationUser.getUserEmail());
    }
}