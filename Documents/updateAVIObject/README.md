Action Name:
    updateAVIObject.

Description:
	This action contains a REST PUT call to AVI API in order to UPDATE an object on AVI Controller.

Inputs:
   - restHost         -> Host of the controller.
   - objectType       -> object type for API
   - objectName       -> UUID of the created object for update object.
   - Tenant           -> AVI Controller Tenant name.
   - version          -> AVI API version.
   - configString     -> JSON object for update.

Outputs:
    This action returns the updated AVI object.
    