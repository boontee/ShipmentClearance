package com.example;

import com.example.ShipmentClearanceModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("ShipmentClearance")
@io.quarkus.runtime.Startup()
public class ShipmentClearanceProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.ShipmentClearanceModel> {

    @jakarta.inject.Inject()
    @jakarta.inject.Named("SubProcessRouting")
    org.kie.kogito.process.Process<SubProcessRoutingModel> processSubProcessRouting;

    @jakarta.inject.Inject()
    public ShipmentClearanceProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public ShipmentClearanceProcess() {
    }

    @Override()
    public com.example.ShipmentClearanceProcessInstance createInstance(com.example.ShipmentClearanceModel value) {
        return new com.example.ShipmentClearanceProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.ShipmentClearanceProcessInstance createInstance(java.lang.String businessKey, com.example.ShipmentClearanceModel value) {
        return new com.example.ShipmentClearanceProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.ShipmentClearanceProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.ShipmentClearanceModel value) {
        return new com.example.ShipmentClearanceProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.ShipmentClearanceModel createModel() {
        return new com.example.ShipmentClearanceModel();
    }

    public com.example.ShipmentClearanceProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.ShipmentClearanceModel) value);
    }

    public com.example.ShipmentClearanceProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.ShipmentClearanceModel) value);
    }

    public com.example.ShipmentClearanceProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ShipmentClearanceProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.ShipmentClearanceProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.ShipmentClearanceProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("ShipmentClearance", true);
        factory.variable("sender", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("sender", "sender", "ItemSubjectRef", "_senderItem"));
        factory.variable("receiver", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("receiver", "receiver", "ItemSubjectRef", "_receiverItem"));
        factory.variable("item", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Item.class), java.util.Map.of("item", "item", "ItemSubjectRef", "_itemItem"));
        factory.variable("approved", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("approved", "approved", "ItemSubjectRef", "_approvedItem"));
        factory.name("ShipmentClearance");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E6E2C685-CF60-4FAD-9A0D-C06C9D2A57E9"));
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.name("Notify Approved");
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.metaData("UniqueId", "_E6E2C685-CF60-4FAD-9A0D-C06C9D2A57E9");
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.metaData("elementname", "Notify Approved");
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.metaData("NodeType", "ScriptTask");
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.metaData("x", 1213);
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.metaData("width", 154);
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.metaData("y", 46);
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.metaData("height", 102);
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.action(kcontext -> {
            org.acme.cc_approval.model.Customer sender = (org.acme.cc_approval.model.Customer) kcontext.getVariable("sender");
            org.acme.cc_approval.model.Customer receiver = (org.acme.cc_approval.model.Customer) kcontext.getVariable("receiver");
            org.acme.cc_approval.model.Item item = (org.acme.cc_approval.model.Item) kcontext.getVariable("item");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            System.out.println("******************");
            System.out.println("shipment.sender:" + sender);
            System.out.println("shipment.receiver:" + receiver);
            System.out.println("shipment.item:" + item);
            System.out.println("shipment.approved:" + approved);
            System.out.println("******************");
        });
        actionNode_E6E2C685_CF60_4FAD_9A0D_C06C9D2A57E9.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_90ECA2EF-528C-4EA6-BC14-C1C53F7A5967"));
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.name("Notify Rejected");
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.metaData("UniqueId", "_90ECA2EF-528C-4EA6-BC14-C1C53F7A5967");
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.metaData("elementname", "Notify Rejected");
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.metaData("NodeType", "ScriptTask");
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.metaData("x", 1223);
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.metaData("width", 154);
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.metaData("y", 214);
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.metaData("height", 102);
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.action(kcontext -> {
            org.acme.cc_approval.model.Customer sender = (org.acme.cc_approval.model.Customer) kcontext.getVariable("sender");
            org.acme.cc_approval.model.Customer receiver = (org.acme.cc_approval.model.Customer) kcontext.getVariable("receiver");
            org.acme.cc_approval.model.Item item = (org.acme.cc_approval.model.Item) kcontext.getVariable("item");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            System.out.println("******************");
            System.out.println("shipment.sender:" + sender);
            System.out.println("shipment.receiver:" + receiver);
            System.out.println("shipment.item:" + item);
            System.out.println("shipment.approved:" + approved);
            System.out.println("******************");
        });
        actionNode_90ECA2EF_528C_4EA6_BC14_C1C53F7A5967.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_76E1C2A5-AB07-4071-904D-C27E32A1D1F4"));
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.name("Start");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.interrupting(true);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("UniqueId", "_76E1C2A5-AB07-4071-904D-C27E32A1D1F4");
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("x", 302);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("width", 56);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("y", 148);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.metaData("height", 56);
        startNode_76E1C2A5_AB07_4071_904D_C27E32A1D1F4.done();
        org.jbpm.ruleflow.core.factory.HumanTaskNodeFactory<?> humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2 = factory.humanTaskNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1A242378-7234-407F-ACB5-2EAD61B340E2"));
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.name("Review Clearance Result");
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.workParameter("ActorId", "admin");
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.workParameter("NodeName", "Review Clearance Result");
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.workParameter("Skippable", "false");
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.workParameter("TaskName", "ReviewClearanceResult");
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_1A242378-7234-407F-ACB5-2EAD61B340E2_TaskNameInputX", "TaskName", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("09713338-81a8-42b5-8faa-b09d52016831", "EXPRESSION (ReviewClearanceResult)", "java.lang.Object", "ReviewClearanceResult"), new org.jbpm.workflow.core.impl.DataDefinition("_1A242378-7234-407F-ACB5-2EAD61B340E2_TaskNameInputX", "TaskName", "Object", null))), null));
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("sender", "sender", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_1A242378-7234-407F-ACB5-2EAD61B340E2_senderInputX", "sender", "org.acme.cc_approval.model.Customer", null), null, null));
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("receiver", "receiver", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_1A242378-7234-407F-ACB5-2EAD61B340E2_receiverInputX", "receiver", "org.acme.cc_approval.model.Customer", null), null, null));
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("item", "item", "org.acme.cc_approval.model.Item", null)), new org.jbpm.workflow.core.impl.DataDefinition("_1A242378-7234-407F-ACB5-2EAD61B340E2_itemInputX", "item", "org.acme.cc_approval.model.Item", null), null, null));
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("approved", "approved", "java.lang.Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("_1A242378-7234-407F-ACB5-2EAD61B340E2_approvedInputX", "approved", "Boolean", null), null, null));
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_1A242378-7234-407F-ACB5-2EAD61B340E2_SkippableInputX", "Skippable", "Object", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("b5ed4376-c75d-4ea0-9f26-d2bb2918c9f8", "EXPRESSION (false)", "java.lang.Object", "false"), new org.jbpm.workflow.core.impl.DataDefinition("_1A242378-7234-407F-ACB5-2EAD61B340E2_SkippableInputX", "Skippable", "Object", null))), null));
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_1A242378-7234-407F-ACB5-2EAD61B340E2_approvedOutputX", "approved", "Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("approved", "approved", "java.lang.Boolean", null), null, null));
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.done();
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("UniqueId", "_1A242378-7234-407F-ACB5-2EAD61B340E2");
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("elementname", "Review Clearance Result");
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("x", 882);
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("width", 154);
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("y", 125);
        humanTaskNode_1A242378_7234_407F_ACB5_2EAD61B340E2.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_CA63DF6A_BE1D_4E02_9031_A78D3140DF22 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CA63DF6A-BE1D-4E02-9031-A78D3140DF22"));
        endNode_CA63DF6A_BE1D_4E02_9031_A78D3140DF22.name("End");
        endNode_CA63DF6A_BE1D_4E02_9031_A78D3140DF22.terminate(true);
        endNode_CA63DF6A_BE1D_4E02_9031_A78D3140DF22.metaData("UniqueId", "_CA63DF6A-BE1D-4E02-9031-A78D3140DF22");
        endNode_CA63DF6A_BE1D_4E02_9031_A78D3140DF22.metaData("x", 1457);
        endNode_CA63DF6A_BE1D_4E02_9031_A78D3140DF22.metaData("width", 56);
        endNode_CA63DF6A_BE1D_4E02_9031_A78D3140DF22.metaData("y", 237);
        endNode_CA63DF6A_BE1D_4E02_9031_A78D3140DF22.metaData("height", 56);
        endNode_CA63DF6A_BE1D_4E02_9031_A78D3140DF22.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_35310A1E-3D5C-4A64-8F3D-E5A5AB244ECB"));
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.name("Split");
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.type(2);
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.metaData("UniqueId", "_35310A1E-3D5C-4A64-8F3D-E5A5AB244ECB");
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.metaData("x", 1081);
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.metaData("width", 56);
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.metaData("y", 148);
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.metaData("Default", null);
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.metaData("height", 56);
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E6E2C685-CF60-4FAD-9A0D-C06C9D2A57E9"), "_C535E2E4-801E-4DC6-89E8-FE627A1B5CD1", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            return approved == true;
        }, 0, false);
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_90ECA2EF-528C-4EA6-BC14-C1C53F7A5967"), "_5DBD14E7-41AB-402D-9968-7A9E328721EA", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            return approved == false;
        }, 0, false);
        splitNode_35310A1E_3D5C_4A64_8F3D_E5A5AB244ECB.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960 = factory.subProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_53F3E01B-BA27-4323-AC03-7DD72FFD3960"));
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.name("Country Specific Clearance");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.processId("SubProcessRouting");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.processName("");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.waitForCompletion(true);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.independent(true);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<SubProcessRoutingModel>() {

            public SubProcessRoutingModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                com.example.SubProcessRoutingModel model = new com.example.SubProcessRoutingModel();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<SubProcessRoutingModel> createInstance(SubProcessRoutingModel model) {
                return (org.kie.kogito.process.ProcessInstance<SubProcessRoutingModel>) app.get(org.kie.kogito.process.Processes.class).processById("SubProcessRouting").createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, SubProcessRoutingModel model) {
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
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("UniqueId", "_53F3E01B-BA27-4323-AC03-7DD72FFD3960");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("elementname", "Country Specific Clearance");
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("x", 677);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("width", 154);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("y", 125);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.metaData("height", 102);
        subProcessNode_53F3E01B_BA27_4323_AC03_7DD72FFD3960.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_8A857831_507A_4259_BB78_969C41C6E361 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8A857831-507A-4259-BB78-969C41C6E361"));
        endNode_8A857831_507A_4259_BB78_969C41C6E361.name("End");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.terminate(true);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("UniqueId", "_8A857831-507A-4259-BB78-969C41C6E361");
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("x", 1462);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("width", 56);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("y", 69);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.metaData("height", 56);
        endNode_8A857831_507A_4259_BB78_969C41C6E361.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4D75A3DF-F292-419B-8947-3394F3F6761B"));
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.name("Pre");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("UniqueId", "_4D75A3DF-F292-419B-8947-3394F3F6761B");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("elementname", "Pre");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("NodeType", "ScriptTask");
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("x", 454);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("width", 154);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("y", 125);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.metaData("height", 102);
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.action(kcontext -> {
            org.acme.cc_approval.model.Customer sender = (org.acme.cc_approval.model.Customer) kcontext.getVariable("sender");
            org.acme.cc_approval.model.Customer receiver = (org.acme.cc_approval.model.Customer) kcontext.getVariable("receiver");
            org.acme.cc_approval.model.Item item = (org.acme.cc_approval.model.Item) kcontext.getVariable("item");
            System.out.println("****************** ShipmentClearance Pre");
            System.out.println("incoming shipment.sender:" + sender);
            System.out.println("incoming shipment.receiver:" + receiver);
            System.out.println("incoming shipment.item:" + item);
            System.out.println("****************** ShipmentClearance Pre");
        });
        actionNode_4D75A3DF_F292_419B_8947_3394F3F6761B.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_35310A1E-3D5C-4A64-8F3D-E5A5AB244ECB"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E6E2C685-CF60-4FAD-9A0D-C06C9D2A57E9"), "_C535E2E4-801E-4DC6-89E8-FE627A1B5CD1");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_35310A1E-3D5C-4A64-8F3D-E5A5AB244ECB"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_90ECA2EF-528C-4EA6-BC14-C1C53F7A5967"), "_5DBD14E7-41AB-402D-9968-7A9E328721EA");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_53F3E01B-BA27-4323-AC03-7DD72FFD3960"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1A242378-7234-407F-ACB5-2EAD61B340E2"), "_9F304B61-D772-4926-B388-D98E469356C3");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_90ECA2EF-528C-4EA6-BC14-C1C53F7A5967"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CA63DF6A-BE1D-4E02-9031-A78D3140DF22"), "_6FBB3CF0-7C97-4D30-8FA7-CFC6AB6CABAD");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_1A242378-7234-407F-ACB5-2EAD61B340E2"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_35310A1E-3D5C-4A64-8F3D-E5A5AB244ECB"), "_EA6180F5-8F7B-4601-BDF2-9BD2A58D44F5");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4D75A3DF-F292-419B-8947-3394F3F6761B"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_53F3E01B-BA27-4323-AC03-7DD72FFD3960"), "_E31A7200-CCC8-44F9-BD27-DA41E28AF854");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E6E2C685-CF60-4FAD-9A0D-C06C9D2A57E9"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_8A857831-507A-4259-BB78-969C41C6E361"), "_ECD7F5A4-6043-48E4-AEE6-F56DA13ECB09");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_76E1C2A5-AB07-4071-904D-C27E32A1D1F4"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4D75A3DF-F292-419B-8947-3394F3F6761B"), "_4F4B94D1-8F83-40FA-88C6-6F554BDC6025");
        factory.validate();
        return factory.getProcess();
    }

    protected void registerListeners() {
        services.getSignalManager().addEventListener("SubProcessRouting", completionEventListener);
    }
}
