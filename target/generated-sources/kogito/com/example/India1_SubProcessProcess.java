package com.example;

import com.example.India1_SubProcessModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("India1_SubProcess")
@io.quarkus.runtime.Startup()
public class India1_SubProcessProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.India1_SubProcessModel> {

    @jakarta.inject.Inject()
    @jakarta.inject.Named("CheckBlacklist")
    org.kie.kogito.process.Process<CheckBlacklistModel> processCheckBlacklist;

    @jakarta.inject.Inject()
    public India1_SubProcessProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public India1_SubProcessProcess() {
    }

    @Override()
    public com.example.India1_SubProcessProcessInstance createInstance(com.example.India1_SubProcessModel value) {
        return new com.example.India1_SubProcessProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.India1_SubProcessProcessInstance createInstance(java.lang.String businessKey, com.example.India1_SubProcessModel value) {
        return new com.example.India1_SubProcessProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.India1_SubProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.India1_SubProcessModel value) {
        return new com.example.India1_SubProcessProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.India1_SubProcessModel createModel() {
        return new com.example.India1_SubProcessModel();
    }

    public com.example.India1_SubProcessProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.India1_SubProcessModel) value);
    }

    public com.example.India1_SubProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.India1_SubProcessModel) value);
    }

    public com.example.India1_SubProcessProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.India1_SubProcessProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.India1_SubProcessProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.India1_SubProcessProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("India1_SubProcess", true);
        factory.variable("sender", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("sender", "sender", "ItemSubjectRef", "_senderItem"));
        factory.variable("receiver", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("receiver", "receiver", "ItemSubjectRef", "_receiverItem"));
        factory.variable("item", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Item.class), java.util.Map.of("item", "item", "ItemSubjectRef", "_itemItem"));
        factory.variable("approved", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("approved", "approved", "ItemSubjectRef", "_approvedItem"));
        factory.variable("receiverName", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("receiverName", "receiverName", "ItemSubjectRef", "_receiverNameItem"));
        factory.variable("username", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("ItemSubjectRef", "_usernameItem", "username", "username"));
        factory.name("India1_SubProcess");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_573F3C1A-BE3F-447A-8DE2-671A8A1B1C0B"));
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.name("Post");
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.metaData("UniqueId", "_573F3C1A-BE3F-447A-8DE2-671A8A1B1C0B");
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.metaData("elementname", "Post");
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.metaData("NodeType", "ScriptTask");
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.metaData("x", 812);
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.metaData("width", 154);
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.metaData("y", 122);
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.metaData("height", 102);
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.action(kcontext -> {
            org.acme.cc_approval.model.Customer sender = (org.acme.cc_approval.model.Customer) kcontext.getVariable("sender");
            org.acme.cc_approval.model.Customer receiver = (org.acme.cc_approval.model.Customer) kcontext.getVariable("receiver");
            org.acme.cc_approval.model.Item item = (org.acme.cc_approval.model.Item) kcontext.getVariable("item");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            java.lang.String receiverName = (java.lang.String) kcontext.getVariable("receiverName");
            System.out.println("****************** India1_SubProcess Post");
            System.out.println("shipment.sender:" + sender);
            System.out.println("shipment.receiver:" + receiver);
            System.out.println("shipment.item:" + item);
            System.out.println("shipment.approved:" + approved);
            System.out.println("receiverName:" + receiverName);
            System.out.println("****************** India1_SubProcess Post");
        });
        actionNode_573F3C1A_BE3F_447A_8DE2_671A8A1B1C0B.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83"));
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.name("Pre");
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("UniqueId", "_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83");
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("elementname", "Pre");
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("NodeType", "ScriptTask");
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("x", 416);
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("width", 154);
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("y", 122);
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("height", 102);
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.action(kcontext -> {
            org.acme.cc_approval.model.Customer sender = (org.acme.cc_approval.model.Customer) kcontext.getVariable("sender");
            org.acme.cc_approval.model.Customer receiver = (org.acme.cc_approval.model.Customer) kcontext.getVariable("receiver");
            org.acme.cc_approval.model.Item item = (org.acme.cc_approval.model.Item) kcontext.getVariable("item");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            java.lang.String username = (java.lang.String) kcontext.getVariable("username");
            username = receiver.getName();
            System.out.println("****************** Pre");
            System.out.println("shipment.sender:" + sender);
            System.out.println("shipment.receiver:" + receiver);
            System.out.println("shipment.item:" + item);
            System.out.println("shipment.approved:" + approved);
            System.out.println("username:" + username);
            System.out.println("****************** Pre");
        });
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_70C6F442_D62B_44CD_B31F_E59115835E1F = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70C6F442-D62B-44CD-B31F-E59115835E1F"));
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.name("End");
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.terminate(false);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("UniqueId", "_70C6F442-D62B-44CD-B31F-E59115835E1F");
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("x", 1035);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("width", 56);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("y", 145);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("height", 56);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C = factory.subProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_2F3BFD62-540C-451F-AA24-6108A41D9B3C"));
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.name("Check Blacklist");
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.processId("CheckBlacklist");
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.processName("");
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.waitForCompletion(true);
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.independent(false);
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<CheckBlacklistModel>() {

            public CheckBlacklistModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                com.example.CheckBlacklistModel model = new com.example.CheckBlacklistModel();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<CheckBlacklistModel> createInstance(CheckBlacklistModel model) {
                return (org.kie.kogito.process.ProcessInstance<CheckBlacklistModel>) app.get(org.kie.kogito.process.Processes.class).processById("CheckBlacklist").createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, CheckBlacklistModel model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                outputs.put("approved", model.getApproved());
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("username", "username", "java.lang.String", null)), new org.jbpm.workflow.core.impl.DataDefinition("_2F3BFD62-540C-451F-AA24-6108A41D9B3C_usernameInputX", "username", "String", null), null, null));
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("receiver", "receiver", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_2F3BFD62-540C-451F-AA24-6108A41D9B3C_receiverInputX", "receiver", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_2F3BFD62-540C-451F-AA24-6108A41D9B3C_approvedOutputX", "approved", "Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("approved", "approved", "java.lang.Boolean", null), null, null));
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("UniqueId", "_2F3BFD62-540C-451F-AA24-6108A41D9B3C");
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("elementname", "Check Blacklist");
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("x", 614);
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("width", 154);
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("y", 122);
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("height", 102);
        subProcessNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D"));
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.name("Start");
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.interrupting(false);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("UniqueId", "_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D");
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("x", 291);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("width", 56);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("y", 145);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("height", 56);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_2F3BFD62-540C-451F-AA24-6108A41D9B3C"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_573F3C1A-BE3F-447A-8DE2-671A8A1B1C0B"), "_F50D0EF8-0726-44E5-A6EF-435D42C5F408");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83"), "_919DB135-B823-4D6E-A41A-1E0856D4B330");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_573F3C1A-BE3F-447A-8DE2-671A8A1B1C0B"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70C6F442-D62B-44CD-B31F-E59115835E1F"), "_0DE9E845-D538-428C-A738-CB3FF0A33D2B");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_2F3BFD62-540C-451F-AA24-6108A41D9B3C"), "_E35C380A-37C6-4124-A3BC-154047DA1C88");
        factory.validate();
        return factory.getProcess();
    }

    protected void registerListeners() {
        services.getSignalManager().addEventListener("CheckBlacklist", completionEventListener);
    }
}
