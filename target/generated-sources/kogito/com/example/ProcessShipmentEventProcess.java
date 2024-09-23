package com.example;

import com.example.ProcessShipmentEventModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("ProcessShipmentEvent")
@io.quarkus.runtime.Startup()
public class ProcessShipmentEventProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.ProcessShipmentEventModel> {

    @jakarta.inject.Inject()
    @jakarta.inject.Named("ShipmentClearance")
    org.kie.kogito.process.Process<ShipmentClearanceModel> processShipmentClearance;

    @jakarta.inject.Inject()
    com.example.ProcessShipmentEventMessageProducer__8A857831_507A_4259_BB78_969C41C6E361 producer__8A857831_507A_4259_BB78_969C41C6E361;

    @jakarta.inject.Inject()
    public ProcessShipmentEventProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public ProcessShipmentEventProcess() {
    }

    @Override()
    public com.example.ProcessShipmentEventProcessInstance createInstance(com.example.ProcessShipmentEventModel value) {
        return new com.example.ProcessShipmentEventProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.ProcessShipmentEventProcessInstance createInstance(java.lang.String businessKey, com.example.ProcessShipmentEventModel value) {
        return new com.example.ProcessShipmentEventProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.ProcessShipmentEventProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.ProcessShipmentEventModel value) {
        return new com.example.ProcessShipmentEventProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.ProcessShipmentEventModel createModel() {
        return new com.example.ProcessShipmentEventModel();
    }

    public com.example.ProcessShipmentEventProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.ProcessShipmentEventModel) value);
    }

    public com.example.ProcessShipmentEventProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.ProcessShipmentEventModel) value);
    }

    public com.example.ProcessShipmentEventProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ProcessShipmentEventProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.ProcessShipmentEventProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ProcessShipmentEventProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("ProcessShipmentEvent", true);
        factory.variable("sender", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("sender", "sender", "ItemSubjectRef", "_senderItem"));
        factory.variable("receiver", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("receiver", "receiver", "ItemSubjectRef", "_receiverItem"));
        factory.variable("item", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Item.class), java.util.Map.of("item", "item", "ItemSubjectRef", "_itemItem"));
        factory.variable("approved", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("approved", "approved", "ItemSubjectRef", "_approvedItem"));
        factory.variable("shipment", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Shipment.class), java.util.Map.of("shipment", "shipment", "ItemSubjectRef", "_shipmentItem"));
        factory.variable("traveller", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Traveller.class), java.util.Map.of("traveller", "traveller", "ItemSubjectRef", "_travellerItem"));
        factory.variable("status", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("ItemSubjectRef", "_statusItem", "status", "status"));
        factory.name("ProcessShipmentEvent");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.newCorrelationMessage("_z2t50VvcED2orYU9QK4bXw", "travellers", "org.acme.cc_approval.model.Shipment");
        factory.newCorrelationMessage("_z2t50FvcED2orYU9QK4bXw", "processedtravellers", "org.acme.cc_approval.model.Shipment");
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_76E1C2A5-AB07-4071-904D-C27E32A1D1F4"));
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.name("Start");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.interrupting(false);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_76E1C2A5-AB07-4071-904D-C27E32A1D1F4_eventOutputX", "event", "org.acme.cc_approval.model.Shipment", null)), new org.jbpm.workflow.core.impl.DataDefinition("shipment", "shipment", "org.acme.cc_approval.model.Shipment", null), null, null));
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("TriggerMapping", "shipment");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("UniqueId", "_76E1C2A5-AB07-4071-904D-C27E32A1D1F4");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("TriggerType", "ConsumeMessage");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("EventType", "message");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("MessageRef", "_z2t50VvcED2orYU9QK4bXw");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("TriggerRef", "travellers");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("x", 302);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("width", 56);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("y", 153);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("MappingVariable", "shipment");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("TriggerMappingInput", "event");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("MessageType", "org.acme.cc_approval.model.Shipment");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("height", 56);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.done();
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.trigger("travellers", java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_76E1C2A5-AB07-4071-904D-C27E32A1D1F4_eventOutputX", "event", "org.acme.cc_approval.model.Shipment", null)), new org.jbpm.workflow.core.impl.DataDefinition("shipment", "shipment", "org.acme.cc_approval.model.Shipment", null), null, null)));
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1A242378-7234-407F-ACB5-2EAD61B340E2"));
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.name("Post");
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("UniqueId", "_1A242378-7234-407F-ACB5-2EAD61B340E2");
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("elementname", "Post");
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("NodeType", "ScriptTask");
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("x", 880);
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("width", 154);
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("y", 130);
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("height", 102);
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.action(kcontext -> {
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            org.acme.cc_approval.model.Shipment shipment = (org.acme.cc_approval.model.Shipment) kcontext.getVariable("shipment");
            java.lang.String status = (java.lang.String) kcontext.getVariable("status");
            status = new String("APPROVED");
        });
        actionNode_1A242378_7234_407F_ACB5_2EAD61B340E2.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960 = factory.subProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_53F3E01B-BA27-4323-AC03-7DD72FFD3960"));
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.name("Shipment Clearance");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.processId("ShipmentClearance");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.processName("");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.waitForCompletion(true);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.independent(true);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<ShipmentClearanceModel>() {

            public ShipmentClearanceModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                com.example.ShipmentClearanceModel model = new com.example.ShipmentClearanceModel();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<ShipmentClearanceModel> createInstance(ShipmentClearanceModel model) {
                return (org.kie.kogito.process.ProcessInstance<ShipmentClearanceModel>) app.get(org.kie.kogito.process.Processes.class).processById("ShipmentClearance").createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, ShipmentClearanceModel model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                outputs.put("approved", model.getApproved());
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("sender", "sender", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_53F3E01B-BA27-4323-AC03-7DD72FFD3960_senderInputX", "sender", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("receiver", "receiver", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_53F3E01B-BA27-4323-AC03-7DD72FFD3960_receiverInputX", "receiver", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("item", "item", "org.acme.cc_approval.model.Item", null)), new org.jbpm.workflow.core.impl.DataDefinition("_53F3E01B-BA27-4323-AC03-7DD72FFD3960_itemInputX", "item", "org.acme.cc_approval.model.Item", null), null, null));
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_53F3E01B-BA27-4323-AC03-7DD72FFD3960_approvedOutputX", "approved", "Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("approved", "approved", "java.lang.Boolean", null), null, null));
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("UniqueId", "_53F3E01B-BA27-4323-AC03-7DD72FFD3960");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("elementname", "Shipment Clearance");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("x", 667);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("width", 154);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("y", 130);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("height", 102);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_8A857831_507A_4259_BB78_969C41C6E361 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8A857831-507A-4259-BB78-969C41C6E361"));
        endNode_8A857831_507A_4259_BB78_969C41C6E361.name("End");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.terminate(false);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.action(new org.jbpm.process.instance.impl.actions.ProduceEventAction<org.acme.cc_approval.model.Shipment>("processedtravellers", "shipment", () -> producer__8A857831_507A_4259_BB78_969C41C6E361));
        endNode_8A857831_507A_4259_BB78_969C41C6E361.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("shipment", "shipment", "org.acme.cc_approval.model.Shipment", null)), new org.jbpm.workflow.core.impl.DataDefinition("_8A857831-507A-4259-BB78-969C41C6E361_eventInputX", "event", "org.acme.cc_approval.model.Shipment", null), null, null));
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("UniqueId", "_8A857831-507A-4259-BB78-969C41C6E361");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("TriggerType", "ProduceMessage");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("Variable", "shipment");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("EventType", "message");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("TriggerRef", "processedtravellers");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("MappingVariableInput", "event");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("x", 1169);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("width", 56);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("y", 153);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("MappingVariable", "shipment");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("MessageType", "org.acme.cc_approval.model.Shipment");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("height", 56);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4D75A3DF-F292-419B-8947-3394F3F6761B"));
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.name("Pre");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("UniqueId", "_4D75A3DF-F292-419B-8947-3394F3F6761B");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("elementname", "Pre");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("NodeType", "ScriptTask");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("x", 469);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("width", 154);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("y", 130);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("height", 102);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.action(kcontext -> {
            org.acme.cc_approval.model.Customer sender = (org.acme.cc_approval.model.Customer) kcontext.getVariable("sender");
            org.acme.cc_approval.model.Customer receiver = (org.acme.cc_approval.model.Customer) kcontext.getVariable("receiver");
            org.acme.cc_approval.model.Item item = (org.acme.cc_approval.model.Item) kcontext.getVariable("item");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            org.acme.cc_approval.model.Shipment shipment = (org.acme.cc_approval.model.Shipment) kcontext.getVariable("shipment");
            org.acme.cc_approval.model.Traveller traveller = (org.acme.cc_approval.model.Traveller) kcontext.getVariable("traveller");
            if (shipment != null) {
                /*
sender = shipment.getSender();
receiver = shipment.getReceiver().create();
approved = shipment.isApproved();
item = shipment.getItem();
*/
                kcontext.setVariable("sender", shipment.getSender());
                kcontext.setVariable("receiver", shipment.getReceiver());
                kcontext.setVariable("item", shipment.getItem());
                /**
                 * receiver = new org.acme.cc_approval.model.Customer
                 * (
                 *   shipment.getSender().getName(),
                 *   shipment.getSender().getTelephoneNumber(),
                 *   shipment.getSender().getEmail(),
                 *   shipment.getSender().getAddress(),
                 *   shipment.getSender().getPostalCode(),
                 *   shipment.getSender().getState(),
                 *   shipment.getSender().getCountry()
                 *
                 * );
                 */
            }
            System.out.println("****************** ProcessShipmentEvent Pre");
            //System.out.println("incoming event:" + traveller );
            System.out.println("incoming event:" + shipment);
            System.out.println("incoming shipment.sender:" + sender);
            System.out.println("incoming shipment.receiver:" + receiver);
            System.out.println("incoming shipment.item:" + item);
            System.out.println("****************** ProcessShipmentEvent Pre");
        });
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_53F3E01B-BA27-4323-AC03-7DD72FFD3960"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1A242378-7234-407F-ACB5-2EAD61B340E2"), "_9F304B61-D772-4926-B388-D98E469356C3");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4D75A3DF-F292-419B-8947-3394F3F6761B"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_53F3E01B-BA27-4323-AC03-7DD72FFD3960"), "_E31A7200-CCC8-44F9-BD27-DA41E28AF854");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1A242378-7234-407F-ACB5-2EAD61B340E2"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8A857831-507A-4259-BB78-969C41C6E361"), "_EA6180F5-8F7B-4601-BDF2-9BD2A58D44F5");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_76E1C2A5-AB07-4071-904D-C27E32A1D1F4"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4D75A3DF-F292-419B-8947-3394F3F6761B"), "_4F4B94D1-8F83-40FA-88C6-6F554BDC6025");
        factory.validate();
        return factory.getProcess();
    }

    protected void registerListeners() {
        services.getSignalManager().addEventListener("ShipmentClearance", completionEventListener);
    }
}
