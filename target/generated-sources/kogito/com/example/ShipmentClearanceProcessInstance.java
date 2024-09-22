package com.example;

import com.example.ShipmentClearanceModel;

public class ShipmentClearanceProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<ShipmentClearanceModel> {

    public ShipmentClearanceProcessInstance(com.example.ShipmentClearanceProcess process, ShipmentClearanceModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public ShipmentClearanceProcessInstance(com.example.ShipmentClearanceProcess process, ShipmentClearanceModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public ShipmentClearanceProcessInstance(com.example.ShipmentClearanceProcess process, ShipmentClearanceModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public ShipmentClearanceProcessInstance(com.example.ShipmentClearanceProcess process, ShipmentClearanceModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public ShipmentClearanceProcessInstance(com.example.ShipmentClearanceProcess process, ShipmentClearanceModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(ShipmentClearanceModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(ShipmentClearanceModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
