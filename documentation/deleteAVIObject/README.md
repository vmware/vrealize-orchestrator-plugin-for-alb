Action Name:
    deleteAVIObject.

Description:
	This action contains a REST DELETE call to AVI API in order to delete an object on AVI Controller.

Inputs:
   - hostController   -> Host of the controller.
   - objectType       -> object type for API
   - objectName       -> UUID of the created object for delete object.
   - Tenant           -> AVI Controller Tenant name.

Outputs:
    Deleted the AVI object.