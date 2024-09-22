package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@jakarta.enterprise.context.ApplicationScoped()
public class AuditService_auditUser__E5D17755_D671_43ED_BD7D_F6538933069C_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.cc_approval.service.AuditService service;

    public AuditService_auditUser__E5D17755_D671_43ED_BD7D_F6538933069C_Handler() {
        this(new org.acme.cc_approval.service.AuditService());
    }

    @jakarta.inject.Inject()
    public AuditService_auditUser__E5D17755_D671_43ED_BD7D_F6538933069C_Handler(org.acme.cc_approval.service.AuditService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.auditUser((org.acme.cc_approval.model.User) workItem.getParameter("Parameter"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.emptyMap());
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.cc_approval.service.AuditService_auditUser__E5D17755_D671_43ED_BD7D_F6538933069C_Handler";
    }
}
