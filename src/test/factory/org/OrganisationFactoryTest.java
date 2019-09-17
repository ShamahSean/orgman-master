package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import com.sun.tools.javac.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {

    @Test
    public void buildOrganisation() {
        Organisation organisation = OrganisationFactory.buildOrganisation("org");
        Assert.checkNonNull(organisation.getOrgCode());
        Assert.checkNonNull(organisation.getOrgName());
    }
}