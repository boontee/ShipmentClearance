package com.example;

import com.example.MY_SubProcessModel;

public class MY_SubProcessProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<MY_SubProcessModel> {

    public MY_SubProcessProcessInstance(com.example.MY_SubProcessProcess process, MY_SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public MY_SubProcessProcessInstance(com.example.MY_SubProcessProcess process, MY_SubProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public MY_SubProcessProcessInstance(com.example.MY_SubProcessProcess process, MY_SubProcessModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public MY_SubProcessProcessInstance(com.example.MY_SubProcessProcess process, MY_SubProcessModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public MY_SubProcessProcessInstance(com.example.MY_SubProcessProcess process, MY_SubProcessModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(MY_SubProcessModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(MY_SubProcessModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
