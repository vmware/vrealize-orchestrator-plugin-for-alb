Action Name:
    readvROResourceElements.

Description:
	This action is contains default values in resource elements.

Inputs:
   - fileContent      -> resource element file name.
   - enterKey         -> Key of specific value from the file.

Outputs:
    The output of this action is return value from resource elements based on user inputs.
    ex. 
       field = lb_algorithm
       returns -> "LB_ALGORITHM_LEAST_CONNECTIONS"
    