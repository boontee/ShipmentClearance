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

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "India1_SubProcess", name = "India1_SubProcess", hidden = true)
public class India1_SubProcessModelOutput implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<India1_SubProcessModel> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "item")
    @jakarta.validation.Valid()
    private org.acme.cc_approval.model.Item item;

    public org.acme.cc_approval.model.Item getItem() {
        return item;
    }

    public void setItem(org.acme.cc_approval.model.Item item) {
        this.item = item;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "approved")
    @jakarta.validation.Valid()
    private java.lang.Boolean approved;

    public java.lang.Boolean getApproved() {
        return approved;
    }

    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "receiver")
    @jakarta.validation.Valid()
    private org.acme.cc_approval.model.Customer receiver;

    public org.acme.cc_approval.model.Customer getReceiver() {
        return receiver;
    }

    public void setReceiver(org.acme.cc_approval.model.Customer receiver) {
        this.receiver = receiver;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "sender")
    @jakarta.validation.Valid()
    private org.acme.cc_approval.model.Customer sender;

    public org.acme.cc_approval.model.Customer getSender() {
        return sender;
    }

    public void setSender(org.acme.cc_approval.model.Customer sender) {
        this.sender = sender;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "receiverName")
    @jakarta.validation.Valid()
    private java.lang.String receiverName;

    public java.lang.String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(java.lang.String receiverName) {
        this.receiverName = receiverName;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "username")
    @jakarta.validation.Valid()
    private java.lang.String username;

    public java.lang.String getUsername() {
        return username;
    }

    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    @Override()
    public India1_SubProcessModel toModel() {
        India1_SubProcessModel result = new India1_SubProcessModel();
        result.setId(getId());
        result.setItem(getItem());
        result.setApproved(getApproved());
        result.setReceiver(getReceiver());
        result.setSender(getSender());
        result.setReceiverName(getReceiverName());
        result.setUsername(getUsername());
        return result;
    }
}
