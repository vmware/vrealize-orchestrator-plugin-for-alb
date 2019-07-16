Action Name:
    updatePoolGroup.

Description:
	This action contains a REST PUT call to AVI API in order to UPDATE an object on AVI Controller.

Inputs:
   - hostController  	   -> Host of Controller.
   - objectType   		   -> object type for API(healthmonitor).
   - objectName   		   -> Name of the created object for return JSON response.
   - version 	  		     -> AVI API Version.
   - Tenant 	  		     -> AVI Controller Tenant name.
   - PoolGroupName       -> PoolGroup name.
   - PoolGroups          -> Updated PoolGroup name.
   - PGMembers           -> List of pools.
   - rollbackList        -> List of all created and updated objects.



Outputs:
    The output of this action is updated AVI object response in JSON format.
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