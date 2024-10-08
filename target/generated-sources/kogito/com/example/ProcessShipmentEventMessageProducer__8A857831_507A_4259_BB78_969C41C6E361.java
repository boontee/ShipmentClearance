/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.example;

import org.kie.kogito.internal.process.runtime.KogitoProcessInstance;
import org.kie.kogito.event.EventEmitter;
import org.kie.kogito.event.impl.AbstractMessageProducer;
import jakarta.inject.Inject;

@io.quarkus.runtime.Startup
public class ProcessShipmentEventMessageProducer__8A857831_507A_4259_BB78_969C41C6E361 extends AbstractMessageProducer<org.acme.cc_approval.model.Shipment> {

    @Inject
    EventEmitter emitter;

    @jakarta.annotation.PostConstruct
    public void init() {
        init(emitter, "processedtravellers");
    }
}
