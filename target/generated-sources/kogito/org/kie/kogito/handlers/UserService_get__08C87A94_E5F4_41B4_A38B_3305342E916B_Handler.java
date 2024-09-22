package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@jakarta.enterprise.context.ApplicationScoped()
public class UserService_get__08C87A94_E5F4_41B4_A38B_3305342E916B_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.cc_approval.service.UserService service;

    public UserService_get__08C87A94_E5F4_41B4_A38B_3305342E916B_Handler() {
        this(new org.acme.cc_approval.service.UserService());
    }

    @jakarta.inject.Inject()
    public UserService_get__08C87A94_E5F4_41B4_A38B_3305342E916B_Handler(org.acme.cc_approval.service.UserService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.get((java.lang.String) workItem.getParameter("Parameter"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("Result", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.cc_approval.service.UserService_get__08C87A94_E5F4_41B4_A38B_3305342E916B_Handler";
    }
}
