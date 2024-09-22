package com.example;

import com.example.CheckBlacklistModel;

public class CheckBlacklistProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<CheckBlacklistModel> {

    public CheckBlacklistProcessInstance(com.example.CheckBlacklistProcess process, CheckBlacklistModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public CheckBlacklistProcessInstance(com.example.CheckBlacklistProcess process, CheckBlacklistModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public CheckBlacklistProcessInstance(com.example.CheckBlacklistProcess process, CheckBlacklistModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public CheckBlacklistProcessInstance(com.example.CheckBlacklistProcess process, CheckBlacklistModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public CheckBlacklistProcessInstance(com.example.CheckBlacklistProcess process, CheckBlacklistModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(CheckBlacklistModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(CheckBlacklistModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
