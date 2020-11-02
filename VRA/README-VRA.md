    
## Integrating vRealize Orchestrator with VRA
   This document will cover how to integrate Avi VRO Plugin in VRA to configure custom resource. This custom resource then can be used in VRA Blueprint as Load Balancer and configure Avi Controller using VRA Blueprints. 
There are example workflows in the AVI VRO Plugin explicitly to configure VRA custom resource under Library --> Avi --> VRA. With the help of these workflows you will be able to configure Custom resource for Avi LB equivalent to cloud agnostic LB and Custom resource for Avi LB equivalent to NSX-T LB.         
     
  ##Pre-Requisit :
   
   For the integration we need VRO instance with Avi VRO plugin installed on it.
   To install Avi VRO plugin on the VRO instance please refer the given wiki.
   [Adding VRO plugin into VRO](https://github.com/avinetworks/avi-vrealize-orchestrator-plugin/blob/master/README.md)
    
   ##Integration
    To integrate VRO with VRA please follow the below process:
    Open the Cloud Assembly.
    Click on Infrastructure Tab.
   ![alt text](VRA/images/cloud_assembly.png)
        
    On the Infrastructure tab from the side scroll down to the Connection > Integration. 
   ![alt text](VRA/images/integration.png)
        
     Click on ADD INTEGRATION.
   ![alt text](VRA/images/new_integration.png)
        
     Select vRealize Orchestratoe from the options.
   ![alt text](VRA/images/select_vro.png)
       
     Fill in the details of the VRO instance required to be linked with VRA and click on ADD button.
       
   ![alt text](VRA/images/vro_details.png)
    
     Now click on the Design Tab.
   ![alt text](VRA/images/design.png)
       
     Click on the Custom Resources and provide the name of the custom resource and other details.
   ![alt text](VRA/images/new_custom_resource.png)
       
     Now we need to select Lifecycle Actions. for this you just need to search 
     for the workflows which were created in the vRO(inside Library -> Avi -> VRA folder).
     For NSX-T LB use Create Virtual Service NSX-T LB. 
     For Cloud agnostic LB use Create Virtual Service Cloud Agnostic LB.
   ![alt text](VRA/images/lifecycle_workflows.png)
       
     After selecting lifecycle actions you can see the preview like this.
   ![alt text](VRA/images/lifecycle_preview.png)
       
     You can add day 2 operation using Additional actions.
   ![alt text](VRA/images/day_2_operations.png)
       
     Click on the Cloud Template.
   ![alt text](VRA/images/cloud_template.png)
       
     After Creating custom resource Click on the Cloud Templates.
   ![alt text](VRA/images/new_blueprint.png)
       
     Click on New Form and select Blank Canvas.
   ![alt text](VRA/images/blueprint_details.png)
       
     Now you have to select the custom resource that we have created. 
   ![alt text](VRA/images/custom_resource_selection.png)
       
     Once the custom resource is selected we need to provide all the necessary inputs. 
     We can directly provide inputs in the Code section or inside Properties click 
     On show all propertis and provide values.
   ![alt text](VRA/images/blueprint_inputs.png)
       
     After providing all the necessary input click on Deploy, provide deployment details and click on DEPLOY. 
   ![alt text](VRA/images/deployment_details.png)
       
   ### Workflow inputs
    
   Create Virtual Service Cloud Agnostic LB
    
    | Variable             | Required |  Description                 |
    | -------------------- | -------- | -----------------------------|
    | controller           | Yes      |  Controller IP               |
    | server_cloud         | Yes      |  Server Cloud Name           | 
    | name                 | Yes      |  Virtual Service name        |
    | application_profile  | Yes      |  Application Profile Name    |
    | service_port         | Yes      |  Virtual Service port        |
    | vip                  | Yes      |  VIP IP                      |
    | pool_servers         | Yes      |  Pool servers list           |
    | instance_port        | Yes      |  Instance Port               |
    | health_monitor_type  | Yes      |  Health Monitor Type         |
    | response_code        | Yes      |  Health Monitor Response code|
    | command              | Yes      |  Command for HM type External|
    | request              | Yes      |  DNS query or UDP request    |
    
   Create Virtual Service NSX-T LB
     
     
    | Variable             | Required |  Description                 |
    | -------------------- | -------- | -----------------------------|
    | controller           | Yes      |  Controller IP               |
    | server_cloud         | Yes      |  Server Cloud Name           | 
    | name                 | Yes      |  Virtual Service name        |
    | application_profile  | Yes      |  Application Profile Name    |
    | service_port         | Yes      |  Virtual Service port        |
    | vip                  | Yes      |  VIP IP                      |
    | network              | Yes      |  tier1_lr for NSXT LB        |
    | network_profile      | Yes      |  Network profile             |
    | pool_servers         | Yes      |  Pool servers list           |
    | instance_port        | Yes      |  Instance Port               |
    | health_monitor_type  | Yes      |  Health Monitor Type         |
    | response_code        | Yes      |  Health Monitor Response code|
    | command              | Yes      |  Command for HM type External|
    | request              | Yes      |  DNS query or UDP request    |
    
    
   Delete Virtual Service
    
    | Variable             | Required |  Description                 |
    | -------------------- | -------- | -----------------------------|
    |virtual_service_object| Yes      |  Virtual Service Object      |      
        
   ScaleIn Virtual Service
   
    | Variable             | Required |  Description                 |
    | -------------------- | -------- | -----------------------------|
    |virtual_service_object| Yes      |  Virtual Service Object      |  
    
   ScaleOut Virtual Service
    
    | Variable             | Required |  Description                 |
    | -------------------- | -------- | -----------------------------|
    |virtual_service_object| Yes      |  Virtual Service Object      |  
    
       
       
    ```  
    
