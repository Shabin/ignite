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

package org.apache.ignite.testsuites;

import junit.framework.TestSuite;
import org.apache.ignite.internal.processors.authentication.AuthenticationConfigurationClusterTest;
import org.apache.ignite.internal.processors.authentication.AuthenticationOnNotActiveClusterTest;
import org.apache.ignite.internal.processors.authentication.AuthenticationProcessorNodeRestartTest;
import org.apache.ignite.internal.processors.authentication.AuthenticationProcessorSelfTest;
import org.apache.ignite.internal.processors.cache.WalModeChangeAdvancedSelfTest;
import org.apache.ignite.internal.processors.cache.WalModeChangeCoordinatorNotAffinityNodeSelfTest;
import org.apache.ignite.internal.processors.cache.WalModeChangeSelfTest;
import org.apache.ignite.internal.processors.cache.distributed.CacheExchangeMergeTest;
import org.apache.ignite.internal.processors.cache.distributed.CachePartitionStateTest;
import org.apache.ignite.internal.processors.cache.distributed.GridCachePartitionEvictionDuringReadThroughSelfTest;
import org.apache.ignite.internal.processors.cache.distributed.IgniteCacheThreadLocalTxTest;
import org.apache.ignite.internal.processors.cache.distributed.IgniteOptimisticTxSuspendResumeMultiServerTest;
import org.apache.ignite.internal.processors.cache.distributed.IgniteOptimisticTxSuspendResumeTest;
import org.apache.ignite.internal.processors.cache.distributed.IgnitePessimisticTxSuspendResumeTest;
import org.apache.ignite.internal.processors.cache.persistence.IgnitePdsCacheAssignmentNodeRestartsTest;
import org.apache.ignite.internal.processors.cache.transactions.TxRollbackOnTimeoutNearCacheTest;
import org.apache.ignite.internal.processors.cache.transactions.TxRollbackOnTimeoutNoDeadlockDetectionTest;
import org.apache.ignite.internal.processors.cache.transactions.TxRollbackOnTimeoutTest;

/**
 * Test suite.
 */
public class IgniteCacheTestSuite6 extends TestSuite {
    /**
     * @return IgniteCache test suite.
     * @throws Exception Thrown in case of the failure.
     */
    public static TestSuite suite() throws Exception {
        TestSuite suite = new TestSuite("IgniteCache Test Suite part 6");

        suite.addTestSuite(CachePartitionStateTest.class);

        suite.addTestSuite(GridCachePartitionEvictionDuringReadThroughSelfTest.class);
        suite.addTestSuite(IgniteOptimisticTxSuspendResumeTest.class);
        suite.addTestSuite(IgniteOptimisticTxSuspendResumeMultiServerTest.class);
        suite.addTestSuite(IgnitePessimisticTxSuspendResumeTest.class);

        suite.addTestSuite(CacheExchangeMergeTest.class);

        suite.addTestSuite(TxRollbackOnTimeoutTest.class);
        suite.addTestSuite(TxRollbackOnTimeoutNoDeadlockDetectionTest.class);
        suite.addTestSuite(TxRollbackOnTimeoutNearCacheTest.class);
        suite.addTestSuite(IgniteCacheThreadLocalTxTest.class);

        suite.addTestSuite(IgnitePdsCacheAssignmentNodeRestartsTest.class);

        suite.addTestSuite(WalModeChangeSelfTest.class);
        suite.addTestSuite(WalModeChangeCoordinatorNotAffinityNodeSelfTest.class);
        suite.addTestSuite(WalModeChangeAdvancedSelfTest.class);

//        TODO enable this test after IGNITE-6753, now it takes too long
//        suite.addTestSuite(IgniteOutOfMemoryPropagationTest.class);

        suite.addTestSuite(AuthenticationConfigurationClusterTest.class);
        suite.addTestSuite(AuthenticationProcessorSelfTest.class);
        suite.addTestSuite(AuthenticationOnNotActiveClusterTest.class);
        suite.addTestSuite(AuthenticationProcessorNodeRestartTest.class);

        return suite;
    }
}
