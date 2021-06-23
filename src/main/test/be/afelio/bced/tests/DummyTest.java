package be.afelio.bced.tests;

import org.jahia.services.content.JCRTemplate;
import org.jahia.services.sites.JahiaSite;
import org.jahia.test.framework.AbstractJUnitTest;
import org.jahia.test.utils.TestHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest extends AbstractJUnitTest {

    private final static String SITE_NAME = "tests";

    @Override
    public void beforeClassSetup() throws Exception {
        super.beforeClassSetup();
        final JahiaSite site = TestHelper.createSite(SITE_NAME);
        assertNotNull(site);

        final JCRTemplate jcrTemplate = JCRTemplate.getInstance();
        assertNotNull(jcrTemplate);
    }

    @Override
    public void afterClassSetup() throws Exception {
        super.afterClassSetup();
        TestHelper.deleteSite(SITE_NAME);
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testDummy() {
        assertTrue(true);
    }
}
