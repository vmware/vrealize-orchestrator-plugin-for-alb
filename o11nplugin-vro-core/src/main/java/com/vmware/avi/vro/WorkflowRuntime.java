package com.vmware.avi.vro;


import org.springframework.stereotype.Service;

import com.vmware.o11n.plugin.sdk.annotation.VsoConstructor;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;

/***
 * This class acts as a service in Plugin. It performs the actions from the
 * workflow and perform rollback if needed.
 * 
 * @author tushar
 *
 */
@VsoObject(create = false, name = "WorkflowRuntime")
@VsoFinder(name = Constants.FINDER_VRO_WORKFLOW_RUNTIME, idAccessor = "getObjectID()")
@Service
public class WorkflowRuntime {
	private AviVroClient aviVroClient;
	private String workflowId;
	
	public String getObjectID() {
		return this.workflowId;
	}
	
	@VsoMethod
	public AviVroClient getAviVroClient() {
		return aviVroClient;
	}
	@VsoMethod
	public void setAviVroClient(AviVroClient aviVroClient) {
		this.aviVroClient = aviVroClient;
	}
	@VsoMethod
	public String getWorkflowId() {
		return workflowId;
	}
	@VsoMethod
	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}
	
	
}
