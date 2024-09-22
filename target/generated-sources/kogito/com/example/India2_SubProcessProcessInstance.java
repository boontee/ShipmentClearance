package com.example;

import com.example.India2_SubProcessModel;

public class India2_SubProcessProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<India2_SubProcessModel> {

    public India2_SubProcessProcessInstance(com.example.India2_SubProcessProcess process, India2_SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public India2_SubProcessProcessInstance(com.example.India2_SubProcessProcess process, India2_SubProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public India2_SubProcessProcessInstance(com.example.India2_SubProcessProcess process, India2_SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public India2_SubProcessProcessInstance(com.example.India2_SubProcessProcess process, India2_SubProcessModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public India2_SubProcessProcessInstance(com.example.India2_SubProcessProcess process, India2_SubProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(India2_SubProcessModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(India2_SubProcessModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
