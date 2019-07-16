Action Name:
    rollBackAction.

Description:
	This action handles the update rollback in order to DELETE the AVI object if workflow fails ain any points.

Inputs:
   - restHost   -> Host of the controller.
   - objectList -> List of created objects.
   
Outputs:
   This action DELETE the AVI objects.