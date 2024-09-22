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

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "India2_SubProcess", name = "India2_SubProcess", hidden = true)
public class India2_SubProcessModelOutput implements org.kie.kogito.Model, MapInput, MapInputId, MapOutput, MappableToModel<India2_SubProcessModel> {

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
    @com.fasterxml.jackson.annotation.JsonProperty(value = "coffees")
    @jakarta.validation.Valid()
    private java.util.List coffees;

    public java.util.List getCoffees() {
        return coffees;
    }

    public void setCoffees(java.util.List coffees) {
        this.coffees = coffees;
    }

    @Override()
    public India2_SubProcessModel toModel() {
        India2_SubProcessModel result = new India2_SubProcessModel();
        result.setId(getId());
        result.setApproved(getApproved());
        result.setCoffees(getCoffees());
        return result;
    }
}
