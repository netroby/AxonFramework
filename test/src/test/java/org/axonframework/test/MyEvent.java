/*
 * Copyright (c) 2010-2011. Axon Framework
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

package org.axonframework.test;

import org.axonframework.domain.DomainEvent;

/**
 * @author Allard Buijze
 */
public class MyEvent extends DomainEvent {

    private static final long serialVersionUID = -8646752013150772644L;
    private final Integer someValue;
    private final byte[] someBytes;

    public MyEvent(Integer someValue) {
        this(someValue, new byte[]{});
    }

    public MyEvent(Integer someValue, byte[] someBytes) {
        this.someValue = someValue;
        this.someBytes = someBytes;
    }

    public Integer getSomeValue() {
        return someValue;
    }

    public byte[] getSomeBytes() {
        return someBytes;
    }
}
