package com.example;

import com.example.SubProcessRoutingModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("SubProcessRouting")
@io.quarkus.runtime.Startup()
public class SubProcessRoutingProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.SubProcessRoutingModel> {

    @jakarta.inject.Inject()
    @jakarta.inject.Named("India2_SubProcess")
    org.kie.kogito.process.Process<India2_SubProcessModel> processIndia2_SubProcess;

    @jakarta.inject.Inject()
    @jakarta.inject.Named("India1_SubProcess")
    org.kie.kogito.process.Process<India1_SubProcessModel> processIndia1_SubProcess;

    @jakarta.inject.Inject()
    @jakarta.inject.Named("MY_SubProcess")
    org.kie.kogito.process.Process<MY_SubProcessModel> processMY_SubProcess;

    @jakarta.inject.Inject()
    public SubProcessRoutingProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public SubProcessRoutingProcess() {
    }

    @Override()
    public com.example.SubProcessRoutingProcessInstance createInstance(com.example.SubProcessRoutingModel value) {
        return new com.example.SubProcessRoutingProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.SubProcessRoutingProcessInstance createInstance(java.lang.String businessKey, com.example.SubProcessRoutingModel value) {
        return new com.example.SubProcessRoutingProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.SubProcessRoutingProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.SubProcessRoutingModel value) {
        return new com.example.SubProcessRoutingProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.SubProcessRoutingModel createModel() {
        return new com.example.SubProcessRoutingModel();
    }

    public com.example.SubProcessRoutingProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.SubProcessRoutingModel) value);
    }

    public com.example.SubProcessRoutingProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.SubProcessRoutingModel) value);
    }

    public com.example.SubProcessRoutingProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.SubProcessRoutingProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.SubProcessRoutingProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.SubProcessRoutingProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("SubProcessRouting", true);
        factory.variable("sender", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("customTags", "input", "sender", "sender", "ItemSubjectRef", "_senderItem"));
        factory.variable("receiver", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("customTags", "input", "receiver", "receiver", "ItemSubjectRef", "_receiverItem"));
        factory.variable("item", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Item.class), java.util.Map.of("item", "item", "customTags", "input", "ItemSubjectRef", "_itemItem"));
        factory.variable("approved", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("approved", "approved", "ItemSubjectRef", "_approvedItem"));
        factory.variable("subprocess", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("subprocess", "subprocess", "ItemSubjectRef", "_subprocessItem"));
        factory.name("SubProcessRouting");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_516D7EC7-2BF1-4280-8755-248B41BCFA56"));
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.name("Post");
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.metaData("UniqueId", "_516D7EC7-2BF1-4280-8755-248B41BCFA56");
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.metaData("elementname", "Post");
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.metaData("NodeType", "ScriptTask");
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.metaData("x", 1125);
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.metaData("width", 154);
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.metaData("y", 145);
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.metaData("height", 102);
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.action(kcontext -> {
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            System.out.println("******************");
            System.out.println("approved:" + approved);
            System.out.println("******************");
        });
        actionNode_516D7EC7_2BF1_4280_8755_248B41BCFA56.done();
        org.jbpm.ruleflow.core.factory.JoinFactory<?> joinNode_77CAAA4B_38E4_4176_9EDD_F0540E53ED49 = factory.joinNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_77CAAA4B-38E4-4176-9EDD-F0540E53ED49"));
        joinNode_77CAAA4B_38E4_4176_9EDD_F0540E53ED49.name("Join");
        joinNode_77CAAA4B_38E4_4176_9EDD_F0540E53ED49.type(2);
        joinNode_77CAAA4B_38E4_4176_9EDD_F0540E53ED49.metaData("UniqueId", "_77CAAA4B-38E4-4176-9EDD-F0540E53ED49");
        joinNode_77CAAA4B_38E4_4176_9EDD_F0540E53ED49.metaData("x", 1035);
        joinNode_77CAAA4B_38E4_4176_9EDD_F0540E53ED49.metaData("width", 56);
        joinNode_77CAAA4B_38E4_4176_9EDD_F0540E53ED49.metaData("y", 170);
        joinNode_77CAAA4B_38E4_4176_9EDD_F0540E53ED49.metaData("height", 56);
        joinNode_77CAAA4B_38E4_4176_9EDD_F0540E53ED49.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51 = factory.subProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_948891B9-27BE-4826-99ED-31B7CE29AE51"));
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.name("MY SubProcess");
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.processId("MY_SubProcess");
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.processName("");
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.waitForCompletion(true);
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.independent(false);
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<MY_SubProcessModel>() {

            public MY_SubProcessModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                com.example.MY_SubProcessModel model = new com.example.MY_SubProcessModel();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<MY_SubProcessModel> createInstance(MY_SubProcessModel model) {
                return (org.kie.kogito.process.ProcessInstance<MY_SubProcessModel>) app.get(org.kie.kogito.process.Processes.class).processById("MY_SubProcess").createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, MY_SubProcessModel model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                outputs.put("approved", model.getApproved());
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("sender", "sender", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_948891B9-27BE-4826-99ED-31B7CE29AE51_senderInputX", "sender", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("receiver", "receiver", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_948891B9-27BE-4826-99ED-31B7CE29AE51_receiverInputX", "receiver", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("item", "item", "org.acme.cc_approval.model.Item", null)), new org.jbpm.workflow.core.impl.DataDefinition("_948891B9-27BE-4826-99ED-31B7CE29AE51_itemInputX", "item", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_948891B9-27BE-4826-99ED-31B7CE29AE51_approvedOutputX", "approved", "Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("approved", "approved", "java.lang.Boolean", null), null, null));
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.metaData("UniqueId", "_948891B9-27BE-4826-99ED-31B7CE29AE51");
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.metaData("elementname", "MY SubProcess");
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.metaData("x", 790);
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.metaData("width", 154);
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.metaData("y", 270);
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.metaData("height", 102);
        subProcessNode_948891B9_27BE_4826_99ED_31B7CE29AE51.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC = factory.subProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_12606697-7BAB-44F6-BB27-2AC7F2C06FEC"));
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.name("India2 SubProcess");
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.processId("India2_SubProcess");
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.processName("");
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.waitForCompletion(true);
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.independent(false);
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<India2_SubProcessModel>() {

            public India2_SubProcessModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                com.example.India2_SubProcessModel model = new com.example.India2_SubProcessModel();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<India2_SubProcessModel> createInstance(India2_SubProcessModel model) {
                return (org.kie.kogito.process.ProcessInstance<India2_SubProcessModel>) app.get(org.kie.kogito.process.Processes.class).processById("India2_SubProcess").createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, India2_SubProcessModel model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                outputs.put("approved", model.getApproved());
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("sender", "sender", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_12606697-7BAB-44F6-BB27-2AC7F2C06FEC_senderInputX", "sender", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("receiver", "receiver", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_12606697-7BAB-44F6-BB27-2AC7F2C06FEC_receiverInputX", "receiver", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("item", "item", "org.acme.cc_approval.model.Item", null)), new org.jbpm.workflow.core.impl.DataDefinition("_12606697-7BAB-44F6-BB27-2AC7F2C06FEC_itemInputX", "item", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_12606697-7BAB-44F6-BB27-2AC7F2C06FEC_approvedOutputX", "approved", "Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("approved", "approved", "java.lang.Boolean", null), null, null));
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.metaData("UniqueId", "_12606697-7BAB-44F6-BB27-2AC7F2C06FEC");
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.metaData("elementname", "India2 SubProcess");
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.metaData("x", 790);
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.metaData("width", 154);
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.metaData("y", 147);
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.metaData("height", 102);
        subProcessNode_12606697_7BAB_44F6_BB27_2AC7F2C06FEC.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90 = factory.ruleSetNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90"));
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.name("SubProcess Routing Decision");
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.decision("https://kie.org/dmn/_9C335DB0-F42D-4D60-A6FC-3B4A33EB3346", "SubProcess Routing Decision", "SubProcess Routing Decision", () -> {
            return app.get(org.kie.kogito.decision.DecisionModels.class).getDecisionModel("https://kie.org/dmn/_9C335DB0-F42D-4D60-A6FC-3B4A33EB3346", "SubProcess Routing Decision");
        });
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_fileNameInputX", "fileName", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("3ec7ef3f-a526-4ada-ada1-1b85290870df", "EXPRESSION (SubProcessRoutingDecision.dmn)", "java.lang.Object", "SubProcessRoutingDecision.dmn"), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_fileNameInputX", "fileName", "java.lang.String", null))), null));
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_namespaceInputX", "namespace", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("f9fbc181-9226-4c07-a7ac-dc28b247504e", "EXPRESSION (https://kie.org/dmn/_9C335DB0-F42D-4D60-A6FC-3B4A33EB3346)", "java.lang.Object", "https://kie.org/dmn/_9C335DB0-F42D-4D60-A6FC-3B4A33EB3346"), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_namespaceInputX", "namespace", "java.lang.String", null))), null));
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_decisionInputX", "decision", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("b3976cc8-cb04-4565-bf0d-9b38eac536a6", "EXPRESSION (SubProcess Routing Decision)", "java.lang.Object", "SubProcess Routing Decision"), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_decisionInputX", "decision", "java.lang.String", null))), null));
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_modelInputX", "model", "java.lang.String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("6f7081b0-2302-4cfb-aee6-c8bb53b81135", "EXPRESSION (SubProcess Routing Decision)", "java.lang.Object", "SubProcess Routing Decision"), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_modelInputX", "model", "java.lang.String", null))), null));
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("sender", "sender", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_SenderInputX", "Sender", "org.acme.cc_approval.model.Customer", null), null, null));
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("receiver", "receiver", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_ReceiverInputX", "Receiver", "org.acme.cc_approval.model.Customer", null), null, null));
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("item", "item", "org.acme.cc_approval.model.Item", null)), new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_ItemInputX", "Item", "org.acme.cc_approval.model.Item", null), null, null));
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90_SubProcessOutputX", "SubProcess", "String", null)), new org.jbpm.workflow.core.impl.DataDefinition("subprocess", "subprocess", "java.lang.String", null), null, null));
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.metaData("UniqueId", "_4AD7E128-0911-4B19-870F-ADEAEA9BDF90");
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.metaData("elementname", "SubProcess Routing Decision");
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.metaData("x", 407);
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.metaData("width", 154);
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.metaData("y", 149);
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.metaData("height", 102);
        ruleSetNode_4AD7E128_0911_4B19_870F_ADEAEA9BDF90.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9 = factory.subProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1AA7B8A-FDB4-4D30-9585-A6C8286DC1F9"));
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.name("India1 SubProcess");
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.processId("India1_SubProcess");
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.processName("");
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.waitForCompletion(true);
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.independent(false);
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<India1_SubProcessModel>() {

            public India1_SubProcessModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                com.example.India1_SubProcessModel model = new com.example.India1_SubProcessModel();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<India1_SubProcessModel> createInstance(India1_SubProcessModel model) {
                return (org.kie.kogito.process.ProcessInstance<India1_SubProcessModel>) app.get(org.kie.kogito.process.Processes.class).processById("India1_SubProcess").createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, India1_SubProcessModel model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                outputs.put("approved", model.getApproved());
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("sender", "sender", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_C1AA7B8A-FDB4-4D30-9585-A6C8286DC1F9_senderInputX", "sender", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("receiver", "receiver", "org.acme.cc_approval.model.Customer", null)), new org.jbpm.workflow.core.impl.DataDefinition("_C1AA7B8A-FDB4-4D30-9585-A6C8286DC1F9_receiverInputX", "receiver", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("item", "item", "org.acme.cc_approval.model.Item", null)), new org.jbpm.workflow.core.impl.DataDefinition("_C1AA7B8A-FDB4-4D30-9585-A6C8286DC1F9_itemInputX", "item", "org.acme.cc_approval.model.Customer", null), null, null));
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_C1AA7B8A-FDB4-4D30-9585-A6C8286DC1F9_approvedOutputX", "approved", "Boolean", null)), new org.jbpm.workflow.core.impl.DataDefinition("approved", "approved", "java.lang.Boolean", null), null, null));
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.metaData("UniqueId", "_C1AA7B8A-FDB4-4D30-9585-A6C8286DC1F9");
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.metaData("elementname", "India1 SubProcess");
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.metaData("x", 790);
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.metaData("width", 154);
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.metaData("y", 19);
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.metaData("height", 102);
        subProcessNode_C1AA7B8A_FDB4_4D30_9585_A6C8286DC1F9.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6A2AC3E6-5847-41F9-8436-A9835C7F9957"));
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.name("Split");
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.type(2);
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.metaData("UniqueId", "_6A2AC3E6-5847-41F9-8436-A9835C7F9957");
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.metaData("x", 673);
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.metaData("width", 56);
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.metaData("y", 170);
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.metaData("Default", null);
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.metaData("height", 56);
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_12606697-7BAB-44F6-BB27-2AC7F2C06FEC"), "_543BB1DC-B8D7-4EBB-A958-C62B2EF532F2", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String subprocess = (java.lang.String) kcontext.getVariable("subprocess");
            return subprocess.toLowerCase().equals("india2");
        }, 0, false);
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_948891B9-27BE-4826-99ED-31B7CE29AE51"), "_7EC2FC8B-62DD-43E9-947C-3EF51206BB18", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String subprocess = (java.lang.String) kcontext.getVariable("subprocess");
            return subprocess.toLowerCase().equals("my");
        }, 0, false);
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1AA7B8A-FDB4-4D30-9585-A6C8286DC1F9"), "_68D78459-5EDB-4E58-9E8A-E61CD91DA435", "DROOLS_DEFAULT", "java", kcontext -> {
            java.lang.String subprocess = (java.lang.String) kcontext.getVariable("subprocess");
            return subprocess.toLowerCase().equals("india1");
        }, 0, false);
        splitNode_6A2AC3E6_5847_41F9_8436_A9835C7F9957.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_70C6F442_D62B_44CD_B31F_E59115835E1F = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70C6F442-D62B-44CD-B31F-E59115835E1F"));
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.name("End");
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.terminate(false);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("UniqueId", "_70C6F442-D62B-44CD-B31F-E59115835E1F");
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("x", 1312);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("width", 56);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("y", 170);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("height", 56);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D"));
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.name("Start");
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.interrupting(true);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("UniqueId", "_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D");
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("x", 284);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("width", 56);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("y", 170);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("height", 56);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_77CAAA4B-38E4-4176-9EDD-F0540E53ED49"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_516D7EC7-2BF1-4280-8755-248B41BCFA56"), "_F55C2499-29D0-45EF-B844-4100C3C630F3");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_948891B9-27BE-4826-99ED-31B7CE29AE51"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_77CAAA4B-38E4-4176-9EDD-F0540E53ED49"), "_A47C0D31-1AC3-48B3-9D8C-EE5DE3FA833B");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_12606697-7BAB-44F6-BB27-2AC7F2C06FEC"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_77CAAA4B-38E4-4176-9EDD-F0540E53ED49"), "_49D8E4B4-5695-40BE-96C6-1701AAA16F39");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1AA7B8A-FDB4-4D30-9585-A6C8286DC1F9"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_77CAAA4B-38E4-4176-9EDD-F0540E53ED49"), "_C6C50F02-49D5-4BC7-97B8-A610AFD8E22E");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6A2AC3E6-5847-41F9-8436-A9835C7F9957"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_948891B9-27BE-4826-99ED-31B7CE29AE51"), "_7EC2FC8B-62DD-43E9-947C-3EF51206BB18");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6A2AC3E6-5847-41F9-8436-A9835C7F9957"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_12606697-7BAB-44F6-BB27-2AC7F2C06FEC"), "_543BB1DC-B8D7-4EBB-A958-C62B2EF532F2");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90"), "_919DB135-B823-4D6E-A41A-1E0856D4B330");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6A2AC3E6-5847-41F9-8436-A9835C7F9957"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1AA7B8A-FDB4-4D30-9585-A6C8286DC1F9"), "_68D78459-5EDB-4E58-9E8A-E61CD91DA435");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_4AD7E128-0911-4B19-870F-ADEAEA9BDF90"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_6A2AC3E6-5847-41F9-8436-A9835C7F9957"), "_24ED5A3D-7F5B-457C-B88B-7E17D5EA120F");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_516D7EC7-2BF1-4280-8755-248B41BCFA56"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70C6F442-D62B-44CD-B31F-E59115835E1F"), "_7C1359E2-2281-4EFC-A924-37046211C9DF");
        factory.validate();
        return factory.getProcess();
    }

    protected void registerListeners() {
        services.getSignalManager().addEventListener("India2_SubProcess", completionEventListener);
        services.getSignalManager().addEventListener("India1_SubProcess", completionEventListener);
        services.getSignalManager().addEventListener("MY_SubProcess", completionEventListener);
    }
}
