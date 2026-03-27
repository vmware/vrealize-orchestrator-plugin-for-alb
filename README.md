## vrealize-orchestrator-plugin-for-alb
Avi VMware Aria Automation Orchestrator​ Plugin

- This project contains AVI vRO Plugin.
- To install plugin on the VRO, follow the steps
- To create custom workflows and actions, follow the steps given below.

* Note: All vRO workflows and actions in the AVI plugin are examples of how to create an actions and workflows. Based on these examples, users should create their own actions and workflows.

## Clone the repo to your local
> https://github.com/vmware/vrealize-orchestrator-plugin-for-alb.git

## Installing plugin to VMware Aria Automation Orchestrator 8.18.1 or newer​

    * Download the dar file from https://github.com/vmware/vrealize-orchestrator-plugin-for-alb/releases/download/22.1.3.post3/o11nplugin-vro-22.1.3.3.RELEASE.dar
    * Enter the IP or FQDN of vRO instance in browser (https://vro-fqdn/vco) and Start the Automation Orchestrator Client
   ![alt text](https://github.com/user-attachments/assets/55a0c7a3-18cd-4682-adcc-c7108ab5099e)
    
    * Go to System Settings and Click Open on Plug-ins card
   ![alt text](https://github.com/user-attachments/assets/662ffaa8-dc72-4d26-b08c-642cf4216bde)
    
    * Click Add Plug-in and A wizard will open up
   ![alt text](https://github.com/user-attachments/assets/d07e7692-2927-4c89-a64c-9d049af84997)
    
    * Upload the plug-in from Git repo and Click Next
   ![alt text](https://github.com/user-attachments/assets/a9cc49be-a653-4e9d-9b68-7d5c6b3a941a)

    * Accept EULA (if available) and Click Accept and Install (after installation VRO will restart this may take some time)
   ![alt text](https://github.com/user-attachments/assets/ea053213-c26e-40bb-81c3-7647fe29ae7e)

    * Wait for Services to come back.

   ![alt text](https://github.com/user-attachments/assets/61967944-0d96-4c44-ae27-0571bf08182e)

    * Refresh the VRO and Check Inventory for Avi Plug-in.
   
   ![alt text](https://github.com/user-attachments/assets/4a5237e6-5f00-472a-af1e-596d92ba9ab9)

    * Afrer refresh, you can see the workflow under Workflows tab inside Library > Avi folder and actions under Actions tab inside com.vmware.avi folder.
   ![alt text](images/library.png)


## Installing plugin to VMware Aria Automation Orchestrator 8.18 or older​

    * Download the dar file from https://github.com/vmware/vrealize-orchestrator-plugin-for-alb/releases/download/22.1.3.post3/o11nplugin-vro-22.1.3.3.RELEASE.dar
    * Enter the Ip of Vro instance in browser and click on Orchestrator Control Center.
   ![alt text](images/control_center.png)
    
    * Cick on Manage Plug-ins & Browse Plugin
   ![alt text](images/manage_plugins.png)
    
    * Upload the downloaded dar file from the git repo.
   ![alt text](images/upload_dar.png)
    
    * Click on install.(after installation VRO will restart this may take some time)
   ![alt text](images/install_plugin.png)
   
    * After installation, Open Orchestrator.
    
    * Refresh the VRO.
   
   ![alt text](images/refresh_vro.png)

    * Afrer refresh, you can see the workflow under Workflows tab inside Library > Avi folder and actions under Actions tab inside com.vmware.avi folder.
   ![alt text](images/library.png)


## Below are the steps to create custom workflows and actions using AVI vRO plugin.

Some actions we have already provided to create objects like, Virtual Service, VsVip, Pool and HealthMonitor. 
Actions are JavaScript functions. Actions can take multiple input parameters and have a single return value. 
To create any specific objects on the AVI controller using vRO action user should use Java models for the same.

### Example to create an action in vRO appliance.

* Every action should have **workflowRuntime** input parameter which will have the session object of the AVI controller. 
Below example will create an HealthMonitor object on the AVI controller using vRO actions and AVI vRO plugin.
User can map all parameters to the object using getter and setter methods.
Refer AVI controller API documentation which can find https://<controller_ip>/swagger/#/ to check mandatory/default fields for AVI objects.
- For the below example input parameters are,
    * Tenant, HealthMonitorName, workflowRuntime

```javascript
// Create HealthMonitor object with input parameters
healthMonitorObj = new AviHealthMonitor();
healthMonitorObj.setTenantRef("/api/tenant?name="+Tenant);
healthMonitorObj.setName(HealthMonitorName);
healthMonitorObj.setType("HEALTH_MONITOR_PING");
healthMonitorObj.setSendInterval(20);
// Get created session client for AVI contoller
client = workflowRuntime.getAviVroClient();
client.addObject(healthMonitorObj, workflowRuntime.getWorkflowId(), Tenant);    
response = client.executeWorkflow(workflowRuntime.getWorkflowId());
return response;
```

### Example to create vRO workflows.

* Every workflow should have **initVroWorkflow** action to get AVI controller session object using controller IP/fqdn.
* **initVroWorkflow** action will return **workflowRuntime** object which can be used in the workflow to create all added
AVI objects on the controller in the last step of workflow.
* **finishVroWorkflow** action will create all added objects in one go. This action internally used the **workflowRuntime**
object, this object will have all objects data.
* Please, refer the workflows that are present in the AVI vRO plugin to create custom workflows.
* We have provided **Reconfigure Virtual Service** workflow to update virtualservice data. We have added some basic configuration in this workflow to update virtual service fields. User can add any additional parameters in this workflow and map that parameter to the action.

Reconfigure Virtual Service Workflow Inputs:
    All fields are autopopulated based on virtual service object in this workflow. Below are the basic input parameters for the workflow.

    | Variable              |   Description                     |
    | --------------------  |  ---------------------------------|
    |virtual_service_object |   Virtual Service Object          |
    | controller            |   Controller IP                   |
    | server_cloud          |   Server Cloud Name               | 
    | name                  |   Virtual Service name            |
    | application_profile   |   Application Profile Name        |
    | service_port          |   Virtual Service port            |
    | vip                   |   VIP IP                          |
    | pool_servers          |   Pool servers list               |
    | instance_port         |   Instance Port                   |
    | health_monitor_name   |   Health Monitor Name             |
    | time_out              |   Health Monitor Timeout          |
    | send_interval         |   Health Monitor Send Interval    | 
    | successful_check      |   Health Monitor Successful Check |
    | failed_check          |   Health Monitor Failed Check     |


Example mapping of inputs for workflow and action will look like below,
![alt text](images/inputs_mapping.png)

```

