package com.example;

import com.example.CcapplicationapprovalModel;

public class CcapplicationapprovalProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<CcapplicationapprovalModel> {

    public CcapplicationapprovalProcessInstance(com.example.CcapplicationapprovalProcess process, CcapplicationapprovalModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public CcapplicationapprovalProcessInstance(com.example.CcapplicationapprovalProcess process, CcapplicationapprovalModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public CcapplicationapprovalProcessInstance(com.example.CcapplicationapprovalProcess process, CcapplicationapprovalModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public CcapplicationapprovalProcessInstance(com.example.CcapplicationapprovalProcess process, CcapplicationapprovalModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public CcapplicationapprovalProcessInstance(com.example.CcapplicationapprovalProcess process, CcapplicationapprovalModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(CcapplicationapprovalModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(CcapplicationapprovalModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
