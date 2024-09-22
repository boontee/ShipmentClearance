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

import java.util.Map;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "ReviewClearanceResult", processName = "ShipmentClearance")
public class ShipmentClearance__1A242378_7234_407F_ACB5_2EAD61B340E2_TaskInput {

    public static ShipmentClearance__1A242378_7234_407F_ACB5_2EAD61B340E2_TaskInput fromMap(Map<String, Object> params) {
        ShipmentClearance__1A242378_7234_407F_ACB5_2EAD61B340E2_TaskInput item = new ShipmentClearance__1A242378_7234_407F_ACB5_2EAD61B340E2_TaskInput();
        item.item = (org.acme.cc_approval.model.Item) params.get("item");
        item.approved = (java.lang.Boolean) params.get("approved");
        item.receiver = (org.acme.cc_approval.model.Customer) params.get("receiver");
        item.sender = (org.acme.cc_approval.model.Customer) params.get("sender");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.acme.cc_approval.model.Item item;

    public org.acme.cc_approval.model.Item getItem() {
        return item;
    }

    public void setItem(org.acme.cc_approval.model.Item item) {
        this.item = item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private java.lang.Boolean approved;

    public java.lang.Boolean getApproved() {
        return approved;
    }

    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.acme.cc_approval.model.Customer receiver;

    public org.acme.cc_approval.model.Customer getReceiver() {
        return receiver;
    }

    public void setReceiver(org.acme.cc_approval.model.Customer receiver) {
        this.receiver = receiver;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.acme.cc_approval.model.Customer sender;

    public org.acme.cc_approval.model.Customer getSender() {
        return sender;
    }

    public void setSender(org.acme.cc_approval.model.Customer sender) {
        this.sender = sender;
    }
}
//Task input for user task 'Review Clearance Result' in process 'ShipmentClearance'
