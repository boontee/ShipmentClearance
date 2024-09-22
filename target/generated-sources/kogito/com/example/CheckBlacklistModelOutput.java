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

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "CheckBlacklist", name = "CheckBlacklist", hidden = true)
public class CheckBlacklistModelOutput implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<CheckBlacklistModel> {

    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "traveller")
    @jakarta.validation.Valid()
    private org.acme.cc_approval.model.User traveller;

    public org.acme.cc_approval.model.User getTraveller() {
        return traveller;
    }

    public void setTraveller(org.acme.cc_approval.model.User traveller) {
        this.traveller = traveller;
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
    public CheckBlacklistModel toModel() {
        CheckBlacklistModel result = new CheckBlacklistModel();
        result.setId(getId());
        result.setApproved(getApproved());
        result.setReceiver(getReceiver());
        result.setTraveller(getTraveller());
        result.setUsername(getUsername());
        return result;
    }
}
