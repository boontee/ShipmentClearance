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

import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.kie.kogito.process.Process;
import org.kie.kogito.addon.quarkus.messaging.common.QuarkusMessageConsumer;
import org.kie.kogito.event.EventReceiver;

@io.quarkus.runtime.Startup
public class ProcessShipmentEventMessageConsumer__76E1C2A5_AB07_4071_904D_C27E32A1D1F4 extends QuarkusMessageConsumer<ProcessShipmentEventModel, org.acme.cc_approval.model.Shipment> {

    @Inject
    @Named("ProcessShipmentEvent")
    Process<ProcessShipmentEventModel> process;

    @Inject
    EventReceiver eventReceiver;

    private Set<String> correlation;

    @jakarta.annotation.PostConstruct
    void init() {
        init(process, "travellers", org.acme.cc_approval.model.Shipment.class, eventReceiver, correlation);
    }

    private ProcessShipmentEventModel eventToModel(org.acme.cc_approval.model.Shipment event) {
        ProcessShipmentEventModel model = new ProcessShipmentEventModel();
        if (event != null) {
            model.setShipment(event);
        }
        return model;
    }

    @Override()
    protected Optional<Function<org.acme.cc_approval.model.Shipment, ProcessShipmentEventModel>> getModelConverter() {
        return Optional.of(this::eventToModel);
    }
}
