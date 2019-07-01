Action Name:
    fetchIPGroup.

Description:
	This action contains a REST GET call to AVI API in order to fetch AVI Object value from the Controller.
  based on users inputs.

Inputs:
   - hostController   -> Host of the controller.
   - objectType 	    -> object type for API
   - objectName 	    -> Name of the created object for return JSON response.
   - Tenant 		      -> AVI Controller Tenant name.
   - field            -> user inputs for get specifice object value from JSON response.

Outputs:
    The output of this action is return value from object based on user inputs.
    ex. 
       field = lb_algorithm
       returns -> "LB_ALGORITHM_LEAST_CONNECTIONS"
    