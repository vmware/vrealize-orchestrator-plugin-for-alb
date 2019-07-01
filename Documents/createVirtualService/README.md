Action Name:
    createVirtualService.

Description:
	This action contains a REST POST call to AVI API in order to deploy an object on AVI Controller.

Inputs:
   - restHost       	 -> Host of Controller.
   - objectType   		 -> object type for API(healthmonitor).
   - objectName   		 -> Name of the created object for return JSON response.
   - version 	  		   -> AVI API Version.
   - Tenant 	  		   -> AVI Controller Tenant name.
   - serverCloud       -> Cloud server of AVI Controller.
   - CreateSSL         -> Check box for create SSL Certificate.
   - SSLCertificate    -> Add existing SSL Certificate.
   - CertName          -> If new certificate want to create. 
   - vsVIp             -> Check boc for create VsVIP.
   - existingVIP       -> Add existing VsVip.
   - poolOrPoolgroup   -> Check Pool or PoolGroup.
   - poolgroupname     -> Name of PoolGroup.
   - poolName          -> Pool Name.
   - serviceEngine     -> Add existing service engine.
   - SSLCert           -> Check box for select SSL Certificate. 
   - ApplicationProfile-> Add Application Profile Name(HTTP or HTTPS).
   - networkProfile    -> Existing network profile name.
   - Name              -> Name of virtual service.
   - servicePort       -> Virtual Service port.
   - IPAddress         -> IPaddress for virtual service.
   - dataScriptName    -> Existing datascripts.
   - rollbackList      -> List for put all created object in one list.
   

Outputs:
    The output of this action is created AVI object response in JSON format.