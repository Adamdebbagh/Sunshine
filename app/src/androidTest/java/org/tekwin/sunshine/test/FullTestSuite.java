package org.tekwin.sunshine.test;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;

/**
 * Created by adamdebbagh on 1/19/15.
 */
public class FullTestSuite {
    public static Test suite() {
        return new TestSuiteBuilder(FullTestSuite.class)
                .includeAllPackagesUnderHere().build();
    }


    public FullTestSuite() {
        super();
    }

}
