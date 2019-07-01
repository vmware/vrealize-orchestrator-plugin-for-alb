Action Name:
    fetchAVIObject.

Description:
	This action contains a REST POST call to AVI API in order to fetched an object from AVI Controller.

Inputs:
   - hostController   -> Host of the controller.
   - objectType       -> object type for API
   - objectName 	  -> Name of the created object for return JSON response.
   - version 		  -> AVI API Version.
   - Tenant 		  -> AVI Controller Tenant name.

Outputs:
    The output of this action is created AVI object response in JSON format.
    ```
    [
	  {
	    "east_west_placement": false,
	    "_last_modified": "1561693275265378",
	    "url": "https://1.1.1.1/api/vsvip/vsvip-bdb12193-1e97-4256-ada8-b75eba09c1de",
	    "tenant_ref": "https://1.1.1.1/api/tenant/admin",
	    "name": "vs_121_vsvip",
	    "cloud_ref": "https://1.1.1.1/api/cloud/cloud-5c3620c9-e301-4c00-948a-be929809141b",
	    "vip": [
	      {
	        "vip_id": "1",
	        "avi_allocated_fip": false,
	        "auto_allocate_ip": false,
	        "enabled": true,
	        "auto_allocate_floating_ip": false,
	        "avi_allocated_vip": false,
	        "auto_allocate_ip_type": "V4_ONLY",
	        "ip_address": {
	          "type": "V4",
	          "addr": "1.2.3.4"
	        }
	      }
	    ],
	    "vrf_context_ref": "https://1.1.1.1/api/vrfcontext/vrfcontext-ebd4b655-bc82-458a-8bdc-bff5ce06160d",
	    "uuid": "vsvip-bdb12193-1e97-4256-ada8-b75eba09c1de"
	  }
	]
    ```