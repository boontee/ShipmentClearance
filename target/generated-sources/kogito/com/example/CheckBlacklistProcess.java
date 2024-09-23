package com.example;

import com.example.CheckBlacklistModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;
import org.jbpm.process.core.datatype.impl.type.BooleanDataType;

@jakarta.enterprise.context.ApplicationScoped()
@jakarta.inject.Named("CheckBlacklist")
@io.quarkus.runtime.Startup()
public class CheckBlacklistProcess extends org.kie.kogito.process.impl.AbstractProcess<com.example.CheckBlacklistModel> {

    public CheckBlacklistProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        this(app, correlations, new org.kie.kogito.handlers.AuditService_auditUser__E5D17755_D671_43ED_BD7D_F6538933069C_Handler(), new org.kie.kogito.handlers.UserService_get__08C87A94_E5F4_41B4_A38B_3305342E916B_Handler());
    }

    @jakarta.inject.Inject()
    public CheckBlacklistProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations, org.kie.kogito.handlers.AuditService_auditUser__E5D17755_D671_43ED_BD7D_F6538933069C_Handler auditService_auditUser__E5D17755_D671_43ED_BD7D_F6538933069C_Handler, org.kie.kogito.handlers.UserService_get__08C87A94_E5F4_41B4_A38B_3305342E916B_Handler userService_get__08C87A94_E5F4_41B4_A38B_3305342E916B_Handler) {
        super(app, java.util.Arrays.asList(auditService_auditUser__E5D17755_D671_43ED_BD7D_F6538933069C_Handler, userService_get__08C87A94_E5F4_41B4_A38B_3305342E916B_Handler), correlations);
        activate();
    }

    public CheckBlacklistProcess() {
    }

    @Override()
    public com.example.CheckBlacklistProcessInstance createInstance(com.example.CheckBlacklistModel value) {
        return new com.example.CheckBlacklistProcessInstance(this, value, this.createProcessRuntime());
    }

    public com.example.CheckBlacklistProcessInstance createInstance(java.lang.String businessKey, com.example.CheckBlacklistModel value) {
        return new com.example.CheckBlacklistProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public com.example.CheckBlacklistProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, com.example.CheckBlacklistModel value) {
        return new com.example.CheckBlacklistProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public com.example.CheckBlacklistModel createModel() {
        return new com.example.CheckBlacklistModel();
    }

    public com.example.CheckBlacklistProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((com.example.CheckBlacklistModel) value);
    }

    public com.example.CheckBlacklistProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (com.example.CheckBlacklistModel) value);
    }

    public com.example.CheckBlacklistProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.CheckBlacklistProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public com.example.CheckBlacklistProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new com.example.CheckBlacklistProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("CheckBlacklist", true);
        factory.variable("traveller", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.User.class), java.util.Map.of("traveller", "traveller", "ItemSubjectRef", "_travellerItem"));
        factory.variable("username", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), java.util.Map.of("ItemSubjectRef", "_usernameItem", "username", "username"));
        factory.variable("approved", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.Boolean.class), java.util.Map.of("approved", "approved", "ItemSubjectRef", "_approvedItem"));
        factory.variable("receiver", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.acme.cc_approval.model.Customer.class), java.util.Map.of("receiver", "receiver", "ItemSubjectRef", "_receiverItem"));
        factory.name("CheckBlacklist");
        factory.packageName("com.example");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_84FFBC52-9D06-4EA5-ADCA-381F4FD43378"));
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.name("Pre");
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.metaData("UniqueId", "_84FFBC52-9D06-4EA5-ADCA-381F4FD43378");
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.metaData("elementname", "Pre");
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.metaData("NodeType", "ScriptTask");
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.metaData("x", 519);
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.metaData("width", 154);
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.metaData("y", 138);
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.metaData("height", 102);
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.action(kcontext -> {
            java.lang.String username = (java.lang.String) kcontext.getVariable("username");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            org.acme.cc_approval.model.Customer receiver = (org.acme.cc_approval.model.Customer) kcontext.getVariable("receiver");
            if (username == null) {
                username = receiver.getName();
                kcontext.setVariable("username", username);
                kcontext.setVariable("receiverName", username);
            }
            approved = false;
            kcontext.setVariable("approved", false);
            System.out.println("****************** CheckBlacklist Pre");
            System.out.println("shipment.receiver:" + receiver);
            System.out.println("shipment.approved:" + approved);
            System.out.println("username:" + username);
            System.out.println("****************** CheckBlacklist Pre");
        });
        actionNode_84FFBC52_9D06_4EA5_ADCA_381F4FD43378.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DBEE6DB2-0A61-4591-9B37-F2EE40A71892"));
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.name("Rejected");
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.metaData("UniqueId", "_DBEE6DB2-0A61-4591-9B37-F2EE40A71892");
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.metaData("elementname", "Rejected");
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.metaData("NodeType", "ScriptTask");
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.metaData("x", 1209);
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.metaData("width", 154);
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.metaData("y", 133);
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.metaData("height", 102);
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.action(kcontext -> {
            org.acme.cc_approval.model.User traveller = (org.acme.cc_approval.model.User) kcontext.getVariable("traveller");
            java.lang.String username = (java.lang.String) kcontext.getVariable("username");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            approved = false;
            kcontext.setVariable("approved", false);
            System.out.println("****************** Rejected");
            System.out.println("username:" + username);
            System.out.println("approved:" + approved);
            System.out.println("blacklist record:" + traveller);
            System.out.println("****************** Rejected");
        });
        actionNode_DBEE6DB2_0A61_4591_9B37_F2EE40A71892.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52 = factory.actionNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_99EC13D6-2899-45A2-8AD9-5F17E8AD0D52"));
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.name("Approved");
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.metaData("UniqueId", "_99EC13D6-2899-45A2-8AD9-5F17E8AD0D52");
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.metaData("elementname", "Approved");
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.metaData("NodeType", "ScriptTask");
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.metaData("x", 1208);
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.metaData("width", 154);
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.metaData("y", 274);
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.metaData("height", 102);
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.action(kcontext -> {
            org.acme.cc_approval.model.User traveller = (org.acme.cc_approval.model.User) kcontext.getVariable("traveller");
            java.lang.String username = (java.lang.String) kcontext.getVariable("username");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            approved = true;
            kcontext.setVariable("approved", true);
            System.out.println("****************** Approved");
            System.out.println("username:" + username);
            System.out.println("approved:" + approved);
            System.out.println("blacklist record:" + traveller);
            System.out.println("****************** Approved");
        });
        actionNode_99EC13D6_2899_45A2_8AD9_5F17E8AD0D52.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655 = factory.startNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5A1A031B-CA99-4CB7-BC07-A730CE95D655"));
        startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655.name("StartProcess");
        startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655.interrupting(true);
        startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655.metaData("UniqueId", "_5A1A031B-CA99-4CB7-BC07-A730CE95D655");
        startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655.metaData("elementname", "StartProcess");
        startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655.metaData("x", 434);
        startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655.metaData("width", 56);
        startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655.metaData("y", 161);
        startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655.metaData("height", 56);
        startNode_5A1A031B_CA99_4CB7_BC07_A730CE95D655.done();
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B = factory.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_08C87A94-E5F4-41B4-A38B-3305342E916B"));
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.name("Check Blacklist");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.workName("org.acme.cc_approval.service.UserService_get__08C87A94_E5F4_41B4_A38B_3305342E916B_Handler");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.workParameter("Interface", "org.acme.cc_approval.service.UserService");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.workParameter("NodeName", "Check Blacklist");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.workParameter("Operation", "get");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.workParameter("implementation", "Java");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.workParameter("interfaceImplementationRef", "org.acme.cc_approval.service.UserService");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.workParameter("operationImplementationRef", "get");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("username", "username", "java.lang.String", null)), new org.jbpm.workflow.core.impl.DataDefinition("_08C87A94-E5F4-41B4-A38B-3305342E916B_ParameterInputX", "Parameter", "String", null), null, null));
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_08C87A94-E5F4-41B4-A38B-3305342E916B_ResultOutputX", "Result", "org.acme.cc_approval.model.User", null)), new org.jbpm.workflow.core.impl.DataDefinition("traveller", "traveller", "org.acme.cc_approval.model.User", null), null, null));
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.done();
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.metaData("UniqueId", "_08C87A94-E5F4-41B4-A38B-3305342E916B");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.metaData("Implementation", "Java");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.metaData("elementname", "Check Blacklist");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.metaData("Type", "Service Task");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.metaData("OperationRef", "_08C87A94-E5F4-41B4-A38B-3305342E916B_ServiceOperation");
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.metaData("x", 706);
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.metaData("width", 154);
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.metaData("y", 138);
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.metaData("height", 102);
        workItemNode_08C87A94_E5F4_41B4_A38B_3305342E916B.onActionScript("onEntry", "java", "/*if (username == null){\n    username = receiver.getName();\n}\n\napproved = false;\n*/\nSystem.out.println(\"****************** CheckBlacklist EntryAction\");\nSystem.out.println(\"username:\" + username );\nSystem.out.println(\"approved:\" + approved );\nSystem.out.println(\"****************** CheckBlacklist EntryAction\");\n", (org.kie.kogito.internal.process.runtime.KogitoProcessContext kcontext) -> {
            java.lang.String username = (java.lang.String) kcontext.getVariable("username");
            java.lang.Boolean approved = (java.lang.Boolean) kcontext.getVariable("approved");
            /*if (username == null){
    username = receiver.getName();
}

approved = false;
*/
            System.out.println("****************** CheckBlacklist EntryAction");
            System.out.println("username:" + username);
            System.out.println("approved:" + approved);
            System.out.println("****************** CheckBlacklist EntryAction");
        });
        org.jbpm.ruleflow.core.factory.WorkItemNodeFactory<?> workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C = factory.workItemNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E5D17755-D671-43ED-BD7D-F6538933069C"));
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.name("Audit Customer");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.workName("org.acme.cc_approval.service.AuditService_auditUser__E5D17755_D671_43ED_BD7D_F6538933069C_Handler");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.workParameter("Interface", "org.acme.cc_approval.service.AuditService");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.workParameter("NodeName", "Audit Customer");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.workParameter("Operation", "auditUser");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.workParameter("implementation", "Java");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.workParameter("interfaceImplementationRef", "org.acme.cc_approval.service.AuditService");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.workParameter("operationImplementationRef", "auditUser");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("traveller", "traveller", "org.acme.cc_approval.model.User", null)), new org.jbpm.workflow.core.impl.DataDefinition("_E5D17755-D671-43ED-BD7D-F6538933069C_ParameterInputX", "Parameter", "org.acme.cc_approval.model.User", null), null, null));
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.done();
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.metaData("UniqueId", "_E5D17755-D671-43ED-BD7D-F6538933069C");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.metaData("Implementation", "Java");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.metaData("elementname", "Audit Customer");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.metaData("Type", "Service Task");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.metaData("OperationRef", "_E5D17755-D671-43ED-BD7D-F6538933069C_ServiceOperation");
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.metaData("x", 1002);
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.metaData("width", 154);
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.metaData("y", 138);
        workItemNode_E5D17755_D671_43ED_BD7D_F6538933069C.metaData("height", 102);
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_95885F94_555D_485A_BB86_5E835B9C3389 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_95885F94-555D-485A-BB86-5E835B9C3389"));
        endNode_95885F94_555D_485A_BB86_5E835B9C3389.name("End");
        endNode_95885F94_555D_485A_BB86_5E835B9C3389.terminate(false);
        endNode_95885F94_555D_485A_BB86_5E835B9C3389.metaData("UniqueId", "_95885F94-555D-485A-BB86-5E835B9C3389");
        endNode_95885F94_555D_485A_BB86_5E835B9C3389.metaData("x", 1418);
        endNode_95885F94_555D_485A_BB86_5E835B9C3389.metaData("width", 56);
        endNode_95885F94_555D_485A_BB86_5E835B9C3389.metaData("y", 297);
        endNode_95885F94_555D_485A_BB86_5E835B9C3389.metaData("height", 56);
        endNode_95885F94_555D_485A_BB86_5E835B9C3389.done();
        org.jbpm.ruleflow.core.factory.SplitFactory<?> splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2 = factory.splitNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_13BAF867-3CA8-4C6F-85C6-D3FD748D07D2"));
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.name("Customer found?");
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.type(2);
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.metaData("UniqueId", "_13BAF867-3CA8-4C6F-85C6-D3FD748D07D2");
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.metaData("elementname", "Customer found?");
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.metaData("x", 893);
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.metaData("width", 56);
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.metaData("y", 161);
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.metaData("Default", null);
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.metaData("height", 56);
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_99EC13D6-2899-45A2-8AD9-5F17E8AD0D52"), "_BF17E37C-6984-4F27-9B6A-A9880E95B019", "DROOLS_DEFAULT", "java", kcontext -> {
            org.acme.cc_approval.model.User traveller = (org.acme.cc_approval.model.User) kcontext.getVariable("traveller");
            return traveller == null;
        }, 0, false);
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.constraint(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E5D17755-D671-43ED-BD7D-F6538933069C"), "_4EFC11AE-52BB-4EEF-B241-CFAAE4B7AE93", "DROOLS_DEFAULT", "java", kcontext -> {
            org.acme.cc_approval.model.User traveller = (org.acme.cc_approval.model.User) kcontext.getVariable("traveller");
            return traveller != null;
        }, 0, false);
        splitNode_13BAF867_3CA8_4C6F_85C6_D3FD748D07D2.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode_FD4D7A19_558E_4347_8CFE_376792FEDA57 = factory.endNode(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_FD4D7A19-558E-4347-8CFE-376792FEDA57"));
        endNode_FD4D7A19_558E_4347_8CFE_376792FEDA57.name("End");
        endNode_FD4D7A19_558E_4347_8CFE_376792FEDA57.terminate(false);
        endNode_FD4D7A19_558E_4347_8CFE_376792FEDA57.metaData("UniqueId", "_FD4D7A19-558E-4347-8CFE-376792FEDA57");
        endNode_FD4D7A19_558E_4347_8CFE_376792FEDA57.metaData("x", 1423);
        endNode_FD4D7A19_558E_4347_8CFE_376792FEDA57.metaData("width", 56);
        endNode_FD4D7A19_558E_4347_8CFE_376792FEDA57.metaData("y", 161);
        endNode_FD4D7A19_558E_4347_8CFE_376792FEDA57.metaData("height", 56);
        endNode_FD4D7A19_558E_4347_8CFE_376792FEDA57.done();
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_5A1A031B-CA99-4CB7-BC07-A730CE95D655"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_84FFBC52-9D06-4EA5-ADCA-381F4FD43378"), "_DBA10C00-6407-4EF5-9D85-01177AE8F39F");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E5D17755-D671-43ED-BD7D-F6538933069C"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DBEE6DB2-0A61-4591-9B37-F2EE40A71892"), "_4EB288EA-3135-4B97-BB46-E77159F78832");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_13BAF867-3CA8-4C6F-85C6-D3FD748D07D2"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_99EC13D6-2899-45A2-8AD9-5F17E8AD0D52"), "_BF17E37C-6984-4F27-9B6A-A9880E95B019");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_84FFBC52-9D06-4EA5-ADCA-381F4FD43378"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_08C87A94-E5F4-41B4-A38B-3305342E916B"), "_7912DA4F-0B77-4BED-A4B0-9F5E1A3156E6");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_13BAF867-3CA8-4C6F-85C6-D3FD748D07D2"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_E5D17755-D671-43ED-BD7D-F6538933069C"), "_4EFC11AE-52BB-4EEF-B241-CFAAE4B7AE93");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_99EC13D6-2899-45A2-8AD9-5F17E8AD0D52"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_95885F94-555D-485A-BB86-5E835B9C3389"), "_12E33B36-641F-4540-97D2-DAC8AFC1FD22");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_08C87A94-E5F4-41B4-A38B-3305342E916B"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_13BAF867-3CA8-4C6F-85C6-D3FD748D07D2"), "_52A670E9-9448-4BDA-8589-FC646BC41FC7");
        factory.connection(org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_DBEE6DB2-0A61-4591-9B37-F2EE40A71892"), org.jbpm.ruleflow.core.WorkflowElementIdentifierFactory.fromExternalFormat("_FD4D7A19-558E-4347-8CFE-376792FEDA57"), "_9A8258CB-643D-491A-937A-3381BE189A5D");
        factory.validate();
        return factory.getProcess();
    }
}
