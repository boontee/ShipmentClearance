package com.example;

import com.example.MY2_SubProcessModel;

public class MY2_SubProcessProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<MY2_SubProcessModel> {

    public MY2_SubProcessProcessInstance(com.example.MY2_SubProcessProcess process, MY2_SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public MY2_SubProcessProcessInstance(com.example.MY2_SubProcessProcess process, MY2_SubProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public MY2_SubProcessProcessInstance(com.example.MY2_SubProcessProcess process, MY2_SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public MY2_SubProcessProcessInstance(com.example.MY2_SubProcessProcess process, MY2_SubProcessModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public MY2_SubProcessProcessInstance(com.example.MY2_SubProcessProcess process, MY2_SubProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(MY2_SubProcessModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(MY2_SubProcessModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
