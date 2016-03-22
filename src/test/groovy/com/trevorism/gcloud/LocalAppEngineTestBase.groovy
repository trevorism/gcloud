package com.trevorism.gcloud

import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig
import com.google.appengine.tools.development.testing.LocalServiceTestHelper
import org.junit.After
import org.junit.Before

/**
 * @author tbrooks
 */
abstract class LocalAppEngineTestBase {

    private final LocalServiceTestHelper helper = new LocalServiceTestHelper(new LocalDatastoreServiceTestConfig())

    @Before
    public void setUp() {
        helper.setUp()
    }

    @After
    public void tearDown() {
        helper.tearDown()
    }
}
