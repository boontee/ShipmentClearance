package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@jakarta.enterprise.context.ApplicationScoped()
public class CoffeeService_getCoffees__923A6C2A_212E_4474_8BAB_3C19A24D2DEA_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.acme.cc_approval.service.CoffeeService service;

    public CoffeeService_getCoffees__923A6C2A_212E_4474_8BAB_3C19A24D2DEA_Handler() {
        this(new org.acme.cc_approval.service.CoffeeService());
    }

    @jakarta.inject.Inject()
    public CoffeeService_getCoffees__923A6C2A_212E_4474_8BAB_3C19A24D2DEA_Handler(org.acme.cc_approval.service.CoffeeService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.getCoffees();
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("coffees", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.acme.cc_approval.service.CoffeeService_getCoffees__923A6C2A_212E_4474_8BAB_3C19A24D2DEA_Handler";
    }
}
