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

import java.util.HashMap;
import java.util.Map;
import org.kie.kogito.MapOutput;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "ReviewClearanceResult", processName = "ShipmentClearance")
public class ShipmentClearance__1A242378_7234_407F_ACB5_2EAD61B340E2_TaskOutput implements MapOutput {

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> params = new HashMap<>();
        params.put("approved", this.approved);
        return params;
    }

    public static ShipmentClearance__1A242378_7234_407F_ACB5_2EAD61B340E2_TaskOutput fromMap(Map<String, Object> params) {
        com.example.ShipmentClearance__1A242378_7234_407F_ACB5_2EAD61B340E2_TaskOutput result = new ShipmentClearance__1A242378_7234_407F_ACB5_2EAD61B340E2_TaskOutput();
        result.approved = (java.lang.Boolean) params.get("approved");
        return result;
    }

    @UserTaskParam(value = ParamType.OUTPUT)
    private java.lang.Boolean approved;

    public java.lang.Boolean getApproved() {
        return approved;
    }

    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }
}
//Task output for user task 'Review Clearance Result' in process 'ShipmentClearance'
