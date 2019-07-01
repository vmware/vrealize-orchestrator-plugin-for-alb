Action Name:
    fetchAVIUUID.

Description:
	This action contains a REST GET call to AVI API in order to Get AVI Object ID from the Controller.

Inputs:
   - restHost         -> Host of the controller.
   - objectType 	    -> object type for API
   - objectName 	    -> Name of the created object for return JSON response.
   - version 		      -> AVI API Version.
   - Tenant 		      -> AVI Controller Tenant name.

Outputs:
    The output of this action is a UUID of AVI object.
    return UUID -> "vsvip-bdb12193-1e97-4256-ada8-b75eba09c1de"