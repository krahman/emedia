/**
 * Copyright (C) 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ninja.metrics;

import com.codahale.metrics.MetricRegistry;
import ninja.utils.NinjaProperties;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.mockito.Mock;

public class MetricsServiceImplTest {
    
    @Mock
    NinjaProperties ninjaProperties;
    
    MetricsServiceImpl metricsServiceImpl;
    
    @Mock
    MetricRegistry metricRegistry;

    @Before
    public void before() {
        metricsServiceImpl = new MetricsServiceImpl(metricRegistry, ninjaProperties);
    }
    
    @Test
    public void testSomeMethod() {
    }
    
}
