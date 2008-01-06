/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.io.comparator;

import java.io.File;
import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * Test case for {@link ExtensionFileComparator}.
 */
public class ExtensionFileComparatorTest extends ComparatorAbstractTestCase {

    /**
     * Run the test.
     *
     * @param args arguments
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * Create a test suite.
     *
     * @return The test suite
     */
    public static Test suite() {
        return new TestSuite(ExtensionFileComparatorTest.class);
    }

    /**
     * Construct a new test case with the specified name.
     *
     * @param name Name of the test
     */
    public ExtensionFileComparatorTest(String name) {
        super(name);
    }

    /** @see junit.framework.TestCase#setUp() */
    protected void setUp() throws Exception {
        super.setUp();
        comparator = ExtensionFileComparator.EXTENSION_COMPARATOR;
        reverse = ExtensionFileComparator.EXTENSION_REVERSE;
        equalFile1 = new File("foo.txt");
        equalFile2 = new File("bar.txt");
        lessFile   = new File("DEF.doc");
        moreFile   = new File("ABC.txt");
    }
}
