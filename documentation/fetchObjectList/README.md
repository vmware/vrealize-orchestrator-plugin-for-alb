Action Name:
    fetchIPGroup.

Description:
	This action contains a REST GET call in order to fetch AVI Objects names from the Controller.

Inputs:
   - hostController   -> Host of the controller.
   - objectType 	    -> object type for API
   - Tenant 		      -> AVI Controller Tenant name.
   - searchPGNames    -> PGNames of servers.

Outputs:
    The output of this action is return list of objects names.
    ex. 
       returns -> ["vs_1", "vs_2",...]
    