package com.example;

import com.example.India1_SubProcessModel;

public class India1_SubProcessProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<India1_SubProcessModel> {

    public India1_SubProcessProcessInstance(com.example.India1_SubProcessProcess process, India1_SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public India1_SubProcessProcessInstance(com.example.India1_SubProcessProcess process, India1_SubProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public India1_SubProcessProcessInstance(com.example.India1_SubProcessProcess process, India1_SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public India1_SubProcessProcessInstance(com.example.India1_SubProcessProcess process, India1_SubProcessModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public India1_SubProcessProcessInstance(com.example.India1_SubProcessProcess process, India1_SubProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(India1_SubProcessModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(India1_SubProcessModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
