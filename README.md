## vrealize-orchestrator-plugin-for-alb
Avi VMware Aria Automation Orchestrator​ Plugin

- This project contains AVI vRO Plugin.
- To install plugin on the VRO, follow the steps

* Note: All vRO workflows and actions in the AVI plugin are examples of how to create an actions and workflows. Based on these examples, users should create their own actions and workflows.

## Clone the repo to your local
> https://github.com/vmware/vrealize-orchestrator-plugin-for-alb.git


## Installing plugin to vRealize Orchestrator

    * Enter the Ip of Vro instance in browser
    
    * Click on Orchestrator Control Center.
   ![alt text](images/control_center.png)
    
    * Cick on Manage Plug-ins & Browse Plugin
   ![alt text](images/manage_plugins.png)
    
    * Select the downloaded dar file from the git repo.
   ![alt text](images/browse.png)
    
    * Click on install.(after installation VRO will restart this may take some time)
   ![alt text](images/install.png)
   
    * After installation, Open Orchestrator.
    
    * Refresh the VRO.
   
   ![alt text](images/refresh_vro.png)

   * Afrer refresh, you can see the workflow under Workflows tab inside Library > vro folder and actions under Actions tab inside com.vmware.actions folder.
```  

