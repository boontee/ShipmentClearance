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
package org.kie.kogito.app;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.kie.kogito.config.ConfigBean;
import org.kie.kogito.event.cloudevents.CloudEventMeta;
import org.kie.kogito.event.EventKind;

public class DecisionCloudEventMetaFactory {

    @jakarta.inject.Inject()
    ConfigBean config;

    private CloudEventMeta buildCloudEventMeta(String type, String sourceSuffix, EventKind kind) {
        String source = kind == EventKind.PRODUCED ? Stream.of(config.getServiceUrl(), sourceSuffix).filter(s -> s != null && !s.isEmpty()).collect(Collectors.joining("/")) : "";
        return new CloudEventMeta(type, source, kind);
    }

    @jakarta.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_CONSUMED_DecisionRequest() {
        return new CloudEventMeta("DecisionRequest", "", EventKind.CONSUMED);
    }

    @jakarta.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_PRODUCED_DecisionResponseError_UnknownModel() {
        String source = Optional.of(config.getServiceUrl()).filter(s -> s != null && !s.isEmpty()).orElse("__UNKNOWN_SOURCE__");
        return new CloudEventMeta("DecisionResponseError", source, EventKind.PRODUCED);
    }

    @jakarta.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_PRODUCED_PRODUCED_DecisionResponseError_Credit_32Card_32Eligibility_32Validation() {
        return buildCloudEventMeta("DecisionResponseError", "Credit+Card+Eligibility+Validation", org.kie.kogito.event.EventKind.PRODUCED);
    }

    @jakarta.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_PRODUCED_PRODUCED_DecisionResponse_Credit_32Card_32Eligibility_32Validation() {
        return buildCloudEventMeta("DecisionResponse", "Credit+Card+Eligibility+Validation", org.kie.kogito.event.EventKind.PRODUCED);
    }

    @jakarta.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_PRODUCED_PRODUCED_DecisionResponse_SubProcess_32Routing_32Decision() {
        return buildCloudEventMeta("DecisionResponse", "SubProcess+Routing+Decision", org.kie.kogito.event.EventKind.PRODUCED);
    }

    @jakarta.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_PRODUCED_PRODUCED_DecisionResponseFull_SubProcess_32Routing_32Decision() {
        return buildCloudEventMeta("DecisionResponseFull", "SubProcess+Routing+Decision", org.kie.kogito.event.EventKind.PRODUCED);
    }

    @jakarta.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_PRODUCED_PRODUCED_DecisionResponseError_SubProcess_32Routing_32Decision() {
        return buildCloudEventMeta("DecisionResponseError", "SubProcess+Routing+Decision", org.kie.kogito.event.EventKind.PRODUCED);
    }

    @jakarta.enterprise.inject.Produces()
    public CloudEventMeta buildCloudEventMeta_PRODUCED_PRODUCED_DecisionResponseFull_Credit_32Card_32Eligibility_32Validation() {
        return buildCloudEventMeta("DecisionResponseFull", "Credit+Card+Eligibility+Validation", org.kie.kogito.event.EventKind.PRODUCED);
    }
}
