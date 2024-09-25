package com.example;

import com.example.MY_SubProcessModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;
import org.jbpm.process.core.datatype.impl.type.ListDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("MY_SubProcess")
@io.quarkus.runtime.Startup()
public class MY_SubProcessProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.MY_SubProcessModel> {

    public MY_SubProcessProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.LogService_log__9238CB34_9D72_4FD3_8A74_6A3887F11229_Handler(), new org.kie.kogito.handlers.LogService_log__CCA349BB_329B_4184_9B32_E00CD1E03483_Handler(), new org.kie.kogito.handlers.LogService_log__745B1ADD_5558_4C29_8C81_AB94B8DE4BCB_Handler(), new org.kie.kogito.handlers.LogService_log__7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83_Handler(), new org.kie.kogito.handlers.CoffeeService_getCoffees__923A6C2A_212E_4474_8BAB_3C19A24D2DEA_Handler());
    }

    @jakarta.inject.Inject()
    public MY_SubProcessProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.LogService_log__9238CB34_9D72_4FD3_8A74_6A3887F11229_Handler logService_log__9238CB34_9D72_4FD3_8A74_6A3887F11229_Handler, org.kie.kogito.handlers.LogService_log__CCA349BB_329B_4184_9B32_E00CD1E03483_Handler logService_log__CCA349BB_329B_4184_9B32_E00CD1E03483_Handler, org.kie.kogito.handlers.LogService_log__745B1ADD_5558_4C29_8C81_AB94B8DE4BCB_Handler logService_log__745B1ADD_5558_4C29_8C81_AB94B8DE4BCB_Handler, org.kie.kogito.handlers.LogService_log__7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83_Handler logService_log__7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83_Handler, org.kie.kogito.handlers.CoffeeService_getCoffees__923A6C2A_212E_4474_8BAB_3C19A24D2DEA_Handler coffeeService_getCoffees__923A6C2A_212E_4474_8BAB_3C19A24D2DEA_Handler) {
        super(app, java.util.Arrays.asList(logService_log__9238CB34_9D72_4FD3_8A74_6A3887F11229_Handler, logService_log__CCA349BB_329B_4184_9B32_E00CD1E03483_Handler, logService_log__745B1ADD_5558_4C29_8C81_AB94B8DE4BCB_Handler, logService_log__7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83_Handler, coffeeService_getCoffees__923A6C2A_212E_4474_8BAB_3C19A24D2DEA_Handler), correlations);
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
        factory.variable("approved", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("approved", "approved", "ItemSubjectRef", "_approvedItem"));
        factory.variable("coffees", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.util.List.class), java.util.Map.of("coffees", "coffees", "ItemSubjectRef", "_coffeesItem"));
        factory.name("MY_SubProcess");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("Compensation", true);
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.addCompensationContext("MY_SubProcess");
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483 = factory.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CCA349BB-329B-4184-9B32-E00CD1E03483"));
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.name("Cancel Brew Coffee");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.workName("org.acme.cc_approval.service.LogService_log__CCA349BB_329B_4184_9B32_E00CD1E03483_Handler");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.workParameter("Interface", "org.acme.cc_approval.service.LogService");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.workParameter("NodeName", "Cancel Brew Coffee");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.workParameter("Operation", "log");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.workParameter("implementation", "Java");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.workParameter("interfaceImplementationRef", "org.acme.cc_approval.service.LogService");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.workParameter("operationImplementationRef", "log");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_CCA349BB-329B-4184-9B32-E00CD1E03483_msgInputX", "msg", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("0dfb7442-2545-46e9-8dca-21a4ce13b554", "EXPRESSION (Cancel Brew Coffee)", "java.lang.Object", "Cancel Brew Coffee"), new org.jbpm.workflow.core.impl.DataDefinition("_CCA349BB-329B-4184-9B32-E00CD1E03483_msgInputX", "msg", "String", null))), null));
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.done();
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("UniqueId", "_CCA349BB-329B-4184-9B32-E00CD1E03483");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("Implementation", "Java");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("elementname", "Cancel Brew Coffee");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("Type", "Service Task");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("isForCompensation", true);
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("OperationRef", "_CCA349BB-329B-4184-9B32-E00CD1E03483_ServiceOperation");
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("x", 651);
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("width", 154);
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("y", 286);
        workItemNode_CCA349BB_329B_4184_9B32_E00CD1E03483.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB = factory.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_745B1ADD-5558-4C29-8C81-AB94B8DE4BCB"));
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.name("Cancel Get Coffee");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.workName("org.acme.cc_approval.service.LogService_log__745B1ADD_5558_4C29_8C81_AB94B8DE4BCB_Handler");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.workParameter("Interface", "org.acme.cc_approval.service.LogService");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.workParameter("NodeName", "Cancel Get Coffee");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.workParameter("Operation", "log");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.workParameter("implementation", "Java");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.workParameter("interfaceImplementationRef", "org.acme.cc_approval.service.LogService");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.workParameter("operationImplementationRef", "log");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_745B1ADD-5558-4C29-8C81-AB94B8DE4BCB_msgInputX", "msg", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("a823a67d-e0b9-4c58-9cb7-bcdb82e40f07", "EXPRESSION (Cancel Get Coffee)", "java.lang.Object", "Cancel Get Coffee"), new org.jbpm.workflow.core.impl.DataDefinition("_745B1ADD-5558-4C29-8C81-AB94B8DE4BCB_msgInputX", "msg", "String", null))), null));
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.done();
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("UniqueId", "_745B1ADD-5558-4C29-8C81-AB94B8DE4BCB");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("Implementation", "Java");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("elementname", "Cancel Get Coffee");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("Type", "Service Task");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("isForCompensation", true);
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("OperationRef", "_745B1ADD-5558-4C29-8C81-AB94B8DE4BCB_ServiceOperation");
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("x", 438);
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("width", 154);
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("y", 285);
        workItemNode_745B1ADD_5558_4C29_8C81_AB94B8DE4BCB.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA = factory.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_923A6C2A-212E-4474-8BAB-3C19A24D2DEA"));
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.name("Brew Coffee (Microservice Call via REST API)");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.workName("org.acme.cc_approval.service.CoffeeService_getCoffees__923A6C2A_212E_4474_8BAB_3C19A24D2DEA_Handler");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.workParameter("Interface", "org.acme.cc_approval.service.CoffeeService");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.workParameter("NodeName", "Brew Coffee (Microservice Call via REST API)");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.workParameter("Operation", "getCoffees");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.workParameter("implementation", "Java");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.workParameter("interfaceImplementationRef", "org.acme.cc_approval.service.CoffeeService");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.workParameter("operationImplementationRef", "getCoffees");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_923A6C2A-212E-4474-8BAB-3C19A24D2DEA_coffeesOutputX", "coffees", "java.util.Collection", null)), new org.jbpm.workflow.core.impl.DataDefinition("coffees", "coffees", "java.util.List", null), null, null));
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.done();
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.metaData("UniqueId", "_923A6C2A-212E-4474-8BAB-3C19A24D2DEA");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.metaData("Implementation", "Java");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.metaData("elementname", "Brew Coffee (Microservice Call via REST API)");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.metaData("Type", "Service Task");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.metaData("OperationRef", "_923A6C2A-212E-4474-8BAB-3C19A24D2DEA_ServiceOperation");
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.metaData("x", 644);
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.metaData("width", 154);
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.metaData("y", 107);
        workItemNode_923A6C2A_212E_4474_8BAB_3C19A24D2DEA.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83 = factory.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83"));
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.name("Get Coffee (Microservice Call via REST API)");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.workName("org.acme.cc_approval.service.LogService_log__7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83_Handler");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.workParameter("Interface", "org.acme.cc_approval.service.LogService");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.workParameter("NodeName", "Get Coffee (Microservice Call via REST API)");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.workParameter("Operation", "log");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.workParameter("implementation", "Java");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.workParameter("interfaceImplementationRef", "org.acme.cc_approval.service.LogService");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.workParameter("operationImplementationRef", "log");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83_magInputX", "mag", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("5a157484-9afe-4e1a-8feb-2f93acfe4e3f", "EXPRESSION (Logging microservice invocation)", "java.lang.Object", "Logging microservice invocation"), new org.jbpm.workflow.core.impl.DataDefinition("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83_magInputX", "mag", "String", null))), null));
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.done();
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("UniqueId", "_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("Implementation", "Java");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("elementname", "Get Coffee (Microservice Call via REST API)");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("Type", "Service Task");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("OperationRef", "_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83_ServiceOperation");
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("x", 436);
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("width", 154);
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("y", 108);
        workItemNode_7E3702E2_0CF5_4EB1_AC1B_FD9175B9BF83.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_70C6F442_D62B_44CD_B31F_E59115835E1F = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70C6F442-D62B-44CD-B31F-E59115835E1F"));
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.name("End");
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.terminate(false);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("UniqueId", "_70C6F442-D62B-44CD-B31F-E59115835E1F");
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("x", 1085);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("width", 56);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("y", 135);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.metaData("height", 56);
        endNode_70C6F442_D62B_44CD_B31F_E59115835E1F.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_2F3BFD62-540C-451F-AA24-6108A41D9B3C"));
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.name("Can Drink Coffee");
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("UniqueId", "_2F3BFD62-540C-451F-AA24-6108A41D9B3C");
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("elementname", "Can Drink Coffee");
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("NodeType", "ScriptTask");
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("x", 866);
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("width", 154);
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("y", 112);
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.metaData("height", 102);
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.action(kcontext -> {
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            approved = true;
            kcontext.setVariable("approved", true);
            System.out.println("****************** MY_SubProcess");
            System.out.println("approved:" + approved);
            System.out.println("****************** MY_SubProcess");
        });
        actionNode_2F3BFD62_540C_451F_AA24_6108A41D9B3C.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D"));
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.name("Start");
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.interrupting(true);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("UniqueId", "_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D");
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("x", 291);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("width", 56);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("y", 130);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.metaData("height", 56);
        startNode_C1C1B5B1_FE57_4B46_BC70_71829B9E9A2D.done();
        org.jbpm.ruleflow.core.factory.EventSubProcessNodeFactory<?> eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6 = factory.eventSubProcessNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5D0DA0F6-1833-4969-A00D-D194C25B22C6"));
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.name("Error Handler");
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.metaData("UniqueId", "_5D0DA0F6-1833-4969-A00D-D194C25B22C6");
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.metaData("elementname", "Error Handler");
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.metaData("x", 361);
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.metaData("width", 783);
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.metaData("y", 466);
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.metaData("height", 307);
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.keepActive(true);
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.event("Error-java.lang.RuntimeException");
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.addCompensationContext("MY_SubProcess");
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.autoComplete(true);
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_A5F70960_6D10_4618_9585_245CC914DBC0 = eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A5F70960-6D10-4618-9585-245CC914DBC0"));
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.name("Can't Drink Coffee");
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.metaData("UniqueId", "_A5F70960-6D10-4618-9585-245CC914DBC0");
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.metaData("elementname", "Can't Drink Coffee");
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.metaData("NodeType", "ScriptTask");
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.metaData("x", 397);
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.metaData("width", 154);
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.metaData("y", 91);
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.metaData("height", 102);
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.action(kcontext -> {
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            approved = false;
            kcontext.setVariable("approved", false);
            System.out.println("****************** MY_SubProcess");
            System.out.println("approved:" + approved);
            System.out.println("****************** MY_SubProcess");
        });
        actionNode_A5F70960_6D10_4618_9585_245CC914DBC0.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229 = eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9238CB34-9D72-4FD3-8A74-6A3887F11229"));
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.name("Cancel Transaction");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.workName("org.acme.cc_approval.service.LogService_log__9238CB34_9D72_4FD3_8A74_6A3887F11229_Handler");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.workParameter("Interface", "org.acme.cc_approval.service.LogService");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.workParameter("NodeName", "Cancel Transaction");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.workParameter("Operation", "log");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.workParameter("implementation", "Java");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.workParameter("interfaceImplementationRef", "org.acme.cc_approval.service.LogService");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.workParameter("operationImplementationRef", "log");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(), new org.jbpm.workflow.core.impl.DataDefinition("_9238CB34-9D72-4FD3-8A74-6A3887F11229_msgInputX", "msg", "String", null), java.util.Arrays.asList(new org.jbpm.workflow.core.node.Assignment(null, new org.jbpm.workflow.core.impl.DataDefinition("34178b0e-ad94-4516-892f-753f61be86f8", "EXPRESSION (Cancel Shipment)", "java.lang.Object", "Cancel Shipment"), new org.jbpm.workflow.core.impl.DataDefinition("_9238CB34-9D72-4FD3-8A74-6A3887F11229_msgInputX", "msg", "String", null))), null));
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.done();
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.metaData("UniqueId", "_9238CB34-9D72-4FD3-8A74-6A3887F11229");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.metaData("Implementation", "Java");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.metaData("elementname", "Cancel Transaction");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.metaData("Type", "Service Task");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.metaData("OperationRef", "_9238CB34-9D72-4FD3-8A74-6A3887F11229_ServiceOperation");
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.metaData("x", 185);
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.metaData("width", 154);
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.metaData("y", 91);
        workItemNode_9238CB34_9D72_4FD3_8A74_6A3887F11229.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB = eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B09B29C2-85B3-4525-B1EA-BF6C0E0FE0AB"));
        endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB.name("End");
        endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB.terminate(false);
        endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB.action(kcontext -> {
            kcontext.getProcessInstance().signalEvent("Compensation", "implicit:_5D0DA0F6-1833-4969-A00D-D194C25B22C6");
        });
        endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB.metaData("UniqueId", "_B09B29C2-85B3-4525-B1EA-BF6C0E0FE0AB");
        endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB.metaData("x", 640);
        endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB.metaData("width", 56);
        endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB.metaData("y", 114);
        endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB.metaData("height", 56);
        endNode_B09B29C2_85B3_4525_B1EA_BF6C0E0FE0AB.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA = eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_95390FAF-B746-4E14-A3C8-B75078ACCDEA"));
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.name("Start");
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.interrupting(true);
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.metaData("FaultCode", "java.lang.RuntimeException");
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.metaData("UniqueId", "_95390FAF-B746-4E14-A3C8-B75078ACCDEA");
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.metaData("TriggerType", "Signal");
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.metaData("x", 64);
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.metaData("width", 56);
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.metaData("y", 114);
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.metaData("TriggerRef", "java.lang.RuntimeException");
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.metaData("MessageType", "java.lang.RuntimeException");
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.metaData("height", 56);
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.done();
        startNode_95390FAF_B746_4E14_A3C8_B75078ACCDEA.trigger("java.lang.RuntimeException", java.util.Arrays.asList());
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9238CB34-9D72-4FD3-8A74-6A3887F11229"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A5F70960-6D10-4618-9585-245CC914DBC0"), "_F8BB52CD-04EE-4E3C-9F56-8DE1A660C463");
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_95390FAF-B746-4E14-A3C8-B75078ACCDEA"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9238CB34-9D72-4FD3-8A74-6A3887F11229"), "_F7A03292-D87C-4DE7-B44E-E8E7EBC66FBD");
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_A5F70960-6D10-4618-9585-245CC914DBC0"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_B09B29C2-85B3-4525-B1EA-BF6C0E0FE0AB"), "_D09D85B7-3755-4336-83D4-E679B2EAF92F");
        eventSubProcessNode_5D0DA0F6_1833_4969_A00D_D194C25B22C6.done();
        org.jbpm.ruleflow.core.factory.BoundaryEventNodeFactory<?> boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375 = factory.boundaryEventNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_99A84E7F-F961-40E6-B251-75A822EEC375"));
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.metaData("UniqueId", "_99A84E7F-F961-40E6-B251-75A822EEC375");
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.metaData("EventType", "compensation");
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.metaData("x", 923);
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.metaData("width", 56);
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.metaData("y", 290);
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.metaData("AttachedTo", "_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83");
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.metaData("height", 56);
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.name("BoundaryEvent");
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.eventType("Compensation");
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.attachedTo("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83");
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.scope(null);
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.addCompensationHandler("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83");
        boundaryEventNode_99A84E7F_F961_40E6_B251_75A822EEC375.done();
        org.jbpm.ruleflow.core.factory.BoundaryEventNodeFactory<?> boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A = factory.boundaryEventNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9DA40055-B760-426C-9DB1-0B199461E24A"));
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.metaData("UniqueId", "_9DA40055-B760-426C-9DB1-0B199461E24A");
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.metaData("EventType", "compensation");
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.metaData("x", 703);
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.metaData("width", 56);
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.metaData("y", 181);
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.metaData("AttachedTo", "_923A6C2A-212E-4474-8BAB-3C19A24D2DEA");
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.metaData("height", 56);
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.name("BoundaryEvent");
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.eventType("Compensation");
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.attachedTo("_923A6C2A-212E-4474-8BAB-3C19A24D2DEA");
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.scope(null);
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.addCompensationHandler("_923A6C2A-212E-4474-8BAB-3C19A24D2DEA");
        boundaryEventNode_9DA40055_B760_426C_9DB1_0B199461E24A.done();
        factory.errorExceptionHandler("Error-java.lang.RuntimeException", "java.lang.RuntimeException", null);
        factory.association(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_9DA40055-B760-426C-9DB1-0B199461E24A"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_CCA349BB-329B-4184-9B32-E00CD1E03483"), "");
        factory.association(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_99A84E7F-F961-40E6-B251-75A822EEC375"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_745B1ADD-5558-4C29-8C81-AB94B8DE4BCB"), "");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_923A6C2A-212E-4474-8BAB-3C19A24D2DEA"), "_E35C380A-37C6-4124-A3BC-154047DA1C88");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_C1C1B5B1-FE57-4B46-BC70-71829B9E9A2D"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_7E3702E2-0CF5-4EB1-AC1B-FD9175B9BF83"), "_919DB135-B823-4D6E-A41A-1E0856D4B330");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_2F3BFD62-540C-451F-AA24-6108A41D9B3C"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_70C6F442-D62B-44CD-B31F-E59115835E1F"), "_F50D0EF8-0726-44E5-A6EF-435D42C5F408");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_923A6C2A-212E-4474-8BAB-3C19A24D2DEA"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_2F3BFD62-540C-451F-AA24-6108A41D9B3C"), "_DFF537E8-82E9-4126-A195-21C26E6FFF9B");
        factory.validate();
        return factory.getProcess();
    }
}
