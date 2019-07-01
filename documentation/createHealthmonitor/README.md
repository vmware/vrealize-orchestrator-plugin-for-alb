Action Name:
    createHealthmonitor.

Description:
	This action contains a REST POST call to AVI API in order to deploy an object on AVI Controller.

Inputs:
   - restHost     -> Host of Controller.
   - objectType   -> object type for API(healthmonitor).
   - objectName   -> Name of the created object for return JSON response.
   - version 	  -> AVI API Version.
   - Tenant 	  -> AVI Controller Tenant name.
   - monitorType  -> Type of Healthmonitor(HTTP, HTTPS).
   - ResposeCode  -> Response code of healthmonitor for HTTP. 
   - HTTPSRespose -> Response code of healthmonitor for HTTPS.
   - Command 	  ->  Healthmonitor external type script.
   - Request 	  ->  Healthmonitor UDP type Client request data.
   - DNSData 	  ->  DNS Request Name.
   - HealthmonitorName -> Healthmonitor name.
   - rollbackList -> List for put all created object in one list.


Outputs:
    The output of this action is created AVI object response in JSON format.
    ```
	    [
		{
			"uuid": "healthmonitor-27cfcab8-aaf7-4526-8f0a-9eb8c60662fd",
			"receive_timeout": 4,
			"_last_modified": "1561692178623141",
			"url": "https://1.1.1.1/api/healthmonitor/healthmonitor-27cfcab8-aaf7-4526-8f0a-9eb8c60662fd",
			"tenant_ref": "https://1.1.1.1/api/tenant/admin",
			"is_federated": false,
			"failed_checks": 2,
			"tcp_monitor": {
				"tcp_half_open": false
			},
			"send_interval": 10,
			"successful_checks": 2,
			"type": "HEALTH_MONITOR_TCP",
			"name": "HealthMonitor"
		}
	]
    ```