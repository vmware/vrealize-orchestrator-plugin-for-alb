Action Name:
    readvROResourceElements.

Description:
	This action is contains default values in resource elements.

Inputs:
   - resourceName          -> resource element name.
   - keyName               -> Key of specific value from the resource element.
   - appProfile            -> Name of the application profile.

Outputs:
    The output of this action is return value from resource elements based on user inputs.
    ex. 
       field = lb_algorithm
       returns -> "LB_ALGORITHM_LEAST_CONNECTIONS"
    
