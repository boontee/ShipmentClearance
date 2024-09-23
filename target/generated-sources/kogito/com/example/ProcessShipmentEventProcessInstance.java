package com.example;

import com.example.ProcessShipmentEventModel;

public class ProcessShipmentEventProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<ProcessShipmentEventModel> {

    public ProcessShipmentEventProcessInstance(com.example.ProcessShipmentEventProcess process, ProcessShipmentEventModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public ProcessShipmentEventProcessInstance(com.example.ProcessShipmentEventProcess process, ProcessShipmentEventModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public ProcessShipmentEventProcessInstance(com.example.ProcessShipmentEventProcess process, ProcessShipmentEventModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public ProcessShipmentEventProcessInstance(com.example.ProcessShipmentEventProcess process, ProcessShipmentEventModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public ProcessShipmentEventProcessInstance(com.example.ProcessShipmentEventProcess process, ProcessShipmentEventModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(ProcessShipmentEventModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(ProcessShipmentEventModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
