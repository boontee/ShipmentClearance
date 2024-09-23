package com.example;

import com.example.ShipmentClearanceStubModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("ShipmentClearanceStub")
@io.quarkus.runtime.Startup()
public class ShipmentClearanceStubProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.ShipmentClearanceStubModel> {

    @jakarta.inject.Inject()
    public ShipmentClearanceStubProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public ShipmentClearanceStubProcess() {
    }

    @Override()
    public com.example.ShipmentClearanceStubProcessInstance createInstance(com.example.ShipmentClearanceStubModel value) {
        return new com.example.ShipmentClearanceStubProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.ShipmentClearanceStubProcessInstance createInstance(java.lang.String businessKey, com.example.ShipmentClearanceStubModel value) {
        return new com.example.ShipmentClearanceStubProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.ShipmentClearanceStubProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.ShipmentClearanceStubModel value) {
        return new com.example.ShipmentClearanceStubProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.ShipmentClearanceStubModel createModel() {
        return new com.example.ShipmentClearanceStubModel();
    }

    public com.example.ShipmentClearanceStubProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.ShipmentClearanceStubModel) value);
    }

    public com.example.ShipmentClearanceStubProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.ShipmentClearanceStubModel) value);
    }

    public com.example.ShipmentClearanceStubProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ShipmentClearanceStubProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.ShipmentClearanceStubProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ShipmentClearanceStubProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("ShipmentClearanceStub", true);
        factory.variable("sender", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("customTags", "input", "sender", "sender", "ItemSubjectRef", "_senderItem"));
        factory.variable("receiver", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("customTags", "input", "receiver", "receiver", "ItemSubjectRef", "_receiverItem"));
        factory.variable("item", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Item.class), java.util.Map.of("item", "item", "customTags", "input", "ItemSubjectRef", "_itemItem"));
        factory.variable("approved", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("approved", "approved", "ItemSubjectRef", "_approvedItem"));
        factory.name("ShipmentClearanceStub");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_76E1C2A5-AB07-4071-904D-C27E32A1D1F4"));
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.name("Start");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.interrupting(false);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("UniqueId", "_76E1C2A5-AB07-4071-904D-C27E32A1D1F4");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("x", 302);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("width", 56);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("y", 148);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("height", 56);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_8A857831_507A_4259_BB78_969C41C6E361 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8A857831-507A-4259-BB78-969C41C6E361"));
        endNode_8A857831_507A_4259_BB78_969C41C6E361.name("End");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.terminate(true);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("UniqueId", "_8A857831-507A-4259-BB78-969C41C6E361");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("x", 800);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("width", 56);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("y", 148);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("height", 56);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4D75A3DF-F292-419B-8947-3394F3F6761B"));
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.name("Pre");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("UniqueId", "_4D75A3DF-F292-419B-8947-3394F3F6761B");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("elementname", "Pre");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("NodeType", "ScriptTask");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("x", 477);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("width", 154);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("y", 125);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("height", 102);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.action(kcontext -> {
            org.acme.cc_approval.model.Customer sender = (org.acme.cc_approval.model.Customer) kcontext.getVariable("sender");
            org.acme.cc_approval.model.Customer receiver = (org.acme.cc_approval.model.Customer) kcontext.getVariable("receiver");
            org.acme.cc_approval.model.Item item = (org.acme.cc_approval.model.Item) kcontext.getVariable("item");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            /**
             * System.out.println("******************");
             * System.out.println("incoming shipment.sender:" + sender );
             * System.out.println("incoming shipment.receiver:" + receiver );
             * System.out.println("incoming shipment.item:" + item );
             * System.out.println("******************");
             */
            approved = new Boolean(true);
        });
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4D75A3DF-F292-419B-8947-3394F3F6761B"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8A857831-507A-4259-BB78-969C41C6E361"), "_E31A7200-CCC8-44F9-BD27-DA41E28AF854");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_76E1C2A5-AB07-4071-904D-C27E32A1D1F4"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4D75A3DF-F292-419B-8947-3394F3F6761B"), "_4F4B94D1-8F83-40FA-88C6-6F554BDC6025");
        factory.validate();
        return factory.getProcess();
    }
}
