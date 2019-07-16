Action Name:
    createAVIObject.

Description:
	This action contains a REST POST call to AVI API in order to deploy an object on AVI Controller.

Inputs:
   - restHost     -> Host of the controller.
   - objectType   -> object type for API
   - objectName   -> Name of the created object for return JSON response.
   - configString -> Which is a object string in JSON format.
   - version 	  -> AVI API Version.
   - Tenant       -> AVI Controller Tenant name.

Outputs:
    The output of this action is created AVI object response in JSON format.