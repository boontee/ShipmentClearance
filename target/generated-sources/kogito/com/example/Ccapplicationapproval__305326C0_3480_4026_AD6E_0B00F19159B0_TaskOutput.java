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

@UserTask(taskName = "reviewApplication", processName = "ccapplicationapproval")
public class Ccapplicationapproval__305326C0_3480_4026_AD6E_0B00F19159B0_TaskOutput implements MapOutput {

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> params = new HashMap<>();
        params.put("approval", this.approval);
        return params;
    }

    public static Ccapplicationapproval__305326C0_3480_4026_AD6E_0B00F19159B0_TaskOutput fromMap(Map<String, Object> params) {
        com.example.Ccapplicationapproval__305326C0_3480_4026_AD6E_0B00F19159B0_TaskOutput result = new Ccapplicationapproval__305326C0_3480_4026_AD6E_0B00F19159B0_TaskOutput();
        result.approval = (java.lang.String) params.get("approval");
        return result;
    }

    @UserTaskParam(value = ParamType.OUTPUT)
    private java.lang.String approval;

    public java.lang.String getApproval() {
        return approval;
    }

    public void setApproval(java.lang.String approval) {
        this.approval = approval;
    }
}
//Task output for user task 'Review Application' in process 'ccapplicationapproval'
