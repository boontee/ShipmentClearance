package com.example;

import com.example.ShipmentClearanceStubModel;

public class ShipmentClearanceStubProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<ShipmentClearanceStubModel> {

    public ShipmentClearanceStubProcessInstance(com.example.ShipmentClearanceStubProcess process, ShipmentClearanceStubModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public ShipmentClearanceStubProcessInstance(com.example.ShipmentClearanceStubProcess process, ShipmentClearanceStubModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public ShipmentClearanceStubProcessInstance(com.example.ShipmentClearanceStubProcess process, ShipmentClearanceStubModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public ShipmentClearanceStubProcessInstance(com.example.ShipmentClearanceStubProcess process, ShipmentClearanceStubModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public ShipmentClearanceStubProcessInstance(com.example.ShipmentClearanceStubProcess process, ShipmentClearanceStubModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(ShipmentClearanceStubModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(ShipmentClearanceStubModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
