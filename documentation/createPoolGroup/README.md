Action Name:
    createPoolGroup.

Description:
	This action contains a REST POST call to AVI API in order to deploy an object on AVI Controller.

Inputs:
   PoolGroup Inputs:
   - hostController  	 -> Host of Controller.
   - objectType   		 -> object type for API(healthmonitor).
   - objectName   		 -> Name of the created object for return JSON response.
   - version 	  		 -> AVI API Version.
   - Tenant 	  		 -> AVI Controller Tenant name.
   - serverCloud         -> Cloud server of AVI Controller.
   - PoolServers         -> Servers based on user inputs.
   - PoolGroupName       -> PoolGroup name.
   - failActionType      -> Fail action type for create PoolGroup.
   - servers             -> Minimum servers for PoolGroup.
   - rollbackList        -> List for put all created object in one list.

   Pool Inputs: This is for creating pools based on servers added into PoolServers.
   
   - CreatehealthMonitor -> Checkbox for create HealthMonitor.
   - HealthmonitorName   -> Healthmonitor name.
   - healthmonitor       -> If select existing HealthMonitor.
   - loadBalancerAlgo 	 -> Load balancer type.
   - lbConsistentHash    -> Consistent Hash data if Load Balancer type is Consistent Hash.
   - lbCustomHeadername  -> Consistent hash header value.
   - ServerCloud         -> Cloud server of AVI Controller.
   - persistentProfile   -> Existing Persistent Profile.
   - defaultServerPort   -> Set default server port for POOL.
   - poolName            -> Pool name.
   - enabledPool		 -> Pool Status in boolean.
   - PoolServers         -> Set server object to array based on number of servers added by user.
   - serverType          -> Type of server v4 or v6.



Outputs:
    The output of this action is created AVI object response in JSON format.
    ```
	[{
	    "_last_modified": "1561964872771157",
	    "implicit_priority_labels": false,
	    "url": "https://1.1.1.1/api/poolgroup/poolgroup-178b3361-f92c-41da-87b0-1513de3f45a9",
	    "tenant_ref": "https://1.1.1.1/tenant/admin",
	    "uuid": "poolgroup-178b3361-f92c-41da-87b0-1513de3f45a9",
	    "members": [
	      {
	        "pool_ref": "https://1.1.1.1/api/pool/pool-c0d1611d-3b91-4f4b-928f-ba44567fe545",
	        "ratio": 1
	      }
	    ],
	    "cloud_ref": "https://1.1.1.1/api/cloud/cloud-5c3620c9-e301-4c00-948a-be929809141b",
	    "min_servers": 2,
	    "fail_action": {
	      "type": "FAIL_ACTION_CLOSE_CONN"
	    },
	    "name": "poolGroup_1"
	}]
    ```