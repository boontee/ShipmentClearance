package com.example;

import com.example.MY_SubProcessModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("MY_SubProcess")
@io.quarkus.runtime.Startup()
public class MY_SubProcessProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.MY_SubProcessModel> {

    @jakarta.inject.Inject()
    public MY_SubProcessProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public MY_SubProcessProcess() {
    }

    @Override()
    public com.example.MY_SubProcessProcessInstance createInstance(com.example.MY_SubProcessModel value) {
        return new com.example.MY_SubProcessProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.MY_SubProcessProcessInstance createInstance(java.lang.String businessKey, com.example.MY_SubProcessModel value) {
        return new com.example.MY_SubProcessProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.MY_SubProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.MY_SubProcessModel value) {
        return new com.example.MY_SubProcessProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.MY_SubProcessModel createModel() {
        return new com.example.MY_SubProcessModel();
    }

    public com.example.MY_SubProcessProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.MY_SubProcessModel) value);
    }

    public com.example.MY_SubProcessProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.MY_SubProcessModel) value);
    }

    public com.example.MY_SubProcessProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.MY_SubProcessProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.MY_SubProcessProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.MY_SubProcessProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("MY_SubProcess", true);
        factory.variable("sender", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("customTags", "input", "sender", "sender", "ItemSubjectRef", "_senderItem"));
        factory.variable("receiver", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("customTags", "input", "receiver", "receiver", "ItemSubjectRef", "_receiverItem"));
        factory.variable("item", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Item.class), java.util.Map.of("item", "item", "customTags", "input", "ItemSubjectRef", "_itemItem"));
        factory.variable("approved", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("approved", "approved", "customTags", "output", "ItemSubjectRef", "_approvedItem"));
        factory.name("MY_SubProcess");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83"));
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.name("Microservice1");
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("UniqueId", "_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83");
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("elementname", "Microservice1");
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("NodeType", "ScriptTask");
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("x", 419);
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("width", 154);
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("y", 122);
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("height", 102);
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.action(kcontext -> {
        });
        actionNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_70C6F442_D62B_44CD_B31F_E59115835E1F = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70C6F442-D62B-44CD-B31F-E59115835E1F"));
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.name("End");
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.terminate(false);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("UniqueId", "_70C6F442-D62B-44CD-B31F-E59115835E1F");
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("x", 1005);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("width", 56);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("y", 145);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("height", 56);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_2F3BFD62-540C-451F-AA24-6108A41D9B3C"));
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.name("Microservice2");
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("UniqueId", "_2F3BFD62-540C-451F-AA24-6108A41D9B3C");
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("elementname", "Microservice2");
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("NodeType", "ScriptTask");
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("x", 712);
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("width", 154);
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("y", 122);
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("height", 102);
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.action(kcontext -> {
        });
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D"));
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.name("Start");
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.interrupting(false);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("UniqueId", "_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D");
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("x", 291);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("width", 56);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("y", 145);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("height", 56);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83"), "_919DB135-B823-4D6E-A41A-1E0856D4B330");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_2F3BFD62-540C-451F-AA24-6108A41D9B3C"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70C6F442-D62B-44CD-B31F-E59115835E1F"), "_F50D0EF8-0726-44E5-A6EF-435D42C5F408");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_2F3BFD62-540C-451F-AA24-6108A41D9B3C"), "_E35C380A-37C6-4124-A3BC-154047DA1C88");
        factory.validate();
        return factory.getProcess();
    }
}
