## avi-vrealize-orchestrator-plugin
Avi vRealize Orchestrator Plugin

- This project contains AVI vRO Plugin.
- To install plugin on the VRO, follow the steps

##Clone the repo to your local
> https://github.com/avinetworks/avi-vrealize-orchestrator-plugin.git


## Installing plugin to vRealize Orchestrator

    * Open controller in browser(e.g. https://10.79.170.170:8281/vco/)
   ![alt text](images/login.png)
    
    * Click on Orchestrator Control Center.
   ![alt text](images/control_center.png)
    
    * Cick on Manage Plug-ins & Browse Plugin
   ![alt text](images/manage_plugins.png)
    
    * Select the dar file from the location where we clone the repo.
   ![alt text](images/browse.png)
    
    * Click on install 
   ![alt text](images/install.png)
    * After installation, Open Orchestrator.
    
    * Refresh the VRO you can see the workflow under Workflows tab inside Library > vro folder and actions under Actions tab inside com.vmware.actions folder
   
   ![alt text](images/refresh_vro.png)

   * Afrer refresh, Check workflows. There will be new imported workflows.
```  

