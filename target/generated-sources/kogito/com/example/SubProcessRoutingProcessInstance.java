package com.example;

import com.example.SubProcessRoutingModel;

public class SubProcessRoutingProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<SubProcessRoutingModel> {

    public SubProcessRoutingProcessInstance(com.example.SubProcessRoutingProcess process, SubProcessRoutingModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public SubProcessRoutingProcessInstance(com.example.SubProcessRoutingProcess process, SubProcessRoutingModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public SubProcessRoutingProcessInstance(com.example.SubProcessRoutingProcess process, SubProcessRoutingModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public SubProcessRoutingProcessInstance(com.example.SubProcessRoutingProcess process, SubProcessRoutingModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public SubProcessRoutingProcessInstance(com.example.SubProcessRoutingProcess process, SubProcessRoutingModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(SubProcessRoutingModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(SubProcessRoutingModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
