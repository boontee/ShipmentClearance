package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@jakarta.enterprise.context.ApplicationScoped()
public class LogService_log__CCA349BB_329B_4184_9B32_E00CD1E03483_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.cc_approval.service.LogService service;

    public LogService_log__CCA349BB_329B_4184_9B32_E00CD1E03483_Handler() {
        this(new org.acme.cc_approval.service.LogService());
    }

    @jakarta.inject.Inject()
    public LogService_log__CCA349BB_329B_4184_9B32_E00CD1E03483_Handler(org.acme.cc_approval.service.LogService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        service.log((java.lang.String) workItem.getParameter("msg"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.emptyMap());
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.cc_approval.service.LogService_log__CCA349BB_329B_4184_9B32_E00CD1E03483_Handler";
    }
}
