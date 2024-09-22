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

@UserTask(taskName = "reviewApplication", processName = "ccapplicationapproval")
public class Ccapplicationapproval__305326C0_3480_4026_AD6E_0B00F19159B0_TaskInput {

    public static Ccapplicationapproval__305326C0_3480_4026_AD6E_0B00F19159B0_TaskInput fromMap(Map<String, Object> params) {
        Ccapplicationapproval__305326C0_3480_4026_AD6E_0B00F19159B0_TaskInput item = new Ccapplicationapproval__305326C0_3480_4026_AD6E_0B00F19159B0_TaskInput();
        item.applicant = (org.acme.cc_approval.model.Applicant) params.get("applicant");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.acme.cc_approval.model.Applicant applicant;

    public org.acme.cc_approval.model.Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(org.acme.cc_approval.model.Applicant applicant) {
        this.applicant = applicant;
    }
}
//Task input for user task 'Review Application' in process 'ccapplicationapproval'
