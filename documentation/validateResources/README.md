Action Name:
    validateResources.

Description:
	This action check the existing AVI objects.

Inputs:
   - restHost          -> Host of Controller.
   - Tenant            -> AVI Controller Tenant name.
   - version           -> AVI API Version.
   - hmName            -> Name of HealthMonitor.
   - poolName          -> Name of Pool.
   - poolGroupName     -> Name of PoolGroup.
   - SSLCertName       -> Name of SSL Certificate.
   - vsName            -> Name of virtual service.
   

Outputs:
    This action returns boolean value for check existing AVI objects.
    returns -> true