Action Name:
    updateVirtualService.

Description:
	This action contains a REST PUT call to AVI API in order to UPDATE an object on AVI Controller.

Inputs:
   - hostController 	  -> Host of Controller.
   - Tenant            -> AVI Controller Tenant name.
   - vsName            -> name of virtual service.
   - Name              -> Updated name of virtual service.(Optional)
   - version           -> AVI API Version.
   - objectType   	  -> object type for API(healthmonitor).
   - enabled           -> Virtual service status.
   - IPAddress         -> Updated IPaddress for virtual service.
   - servicePort       -> Updated Virtual Service port.
   - rollbackList      -> List of privious and updated AVI object.
   

Outputs:
    The output of this action is updated AVI object response in JSON format.