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

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "MY_SubProcess", name = "MY_SubProcess", hidden = false)
public class MY_SubProcessModel implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<MY_SubProcessModelOutput> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "input")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "item")
    @jakarta.validation.Valid()
    private org.acme.cc_approval.model.Item item;

    public org.acme.cc_approval.model.Item getItem() {
        return item;
    }

    public void setItem(org.acme.cc_approval.model.Item item) {
        this.item = item;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "output")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "approved")
    @jakarta.validation.Valid()
    private java.lang.Boolean approved;

    public java.lang.Boolean getApproved() {
        return approved;
    }

    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "input")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "receiver")
    @jakarta.validation.Valid()
    private org.acme.cc_approval.model.Customer receiver;

    public org.acme.cc_approval.model.Customer getReceiver() {
        return receiver;
    }

    public void setReceiver(org.acme.cc_approval.model.Customer receiver) {
        this.receiver = receiver;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "input")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sender")
    @jakarta.validation.Valid()
    private org.acme.cc_approval.model.Customer sender;

    public org.acme.cc_approval.model.Customer getSender() {
        return sender;
    }

    public void setSender(org.acme.cc_approval.model.Customer sender) {
        this.sender = sender;
    }

    @Override()
    public MY_SubProcessModelOutput toModel() {
        MY_SubProcessModelOutput result = new MY_SubProcessModelOutput();
        result.setId(getId());
        result.setApproved(getApproved());
        return result;
    }
}
