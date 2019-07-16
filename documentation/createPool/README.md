Action Name:
    createPool.

Description:
	This action contains a REST POST call to AVI API in order to deploy an object on AVI Controller.

Inputs:
   - restHost     		 -> Host of Controller.
   - objectType   		 -> object type for API(healthmonitor).
   - objectName   		 -> Name of the created object for return JSON response.
   - version 	  		 -> AVI API Version.
   - Tenant 	  		 -> AVI Controller Tenant name.
   - CreatehealthMonitor -> Checkbox for create HealthMonitor.
   - HealthmonitorName   -> Healthmonitor name.
   - healthmonitor       -> List of the selected multiple HealthMonitors.
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
   - rollbackList        -> List for put all created object in one list.


Outputs:
    The output of this action is created AVI object response in JSON format.
    ```
	[{
		"lb_algorithm": "LB_ALGORITHM_LEAST_CONNECTIONS",
		"use_service_port": false,
		"rewrite_host_header_to_server_name": false,
		"host_check_enabled": false,
		"enabled": true,
		"rewrite_host_header_to_sni": false,
		"delete_server_on_dns_refresh": true,
		"capacity_estimation": false,
		"servers": [{
			"ratio": 1,
			"ip": {
				"type": "V4",
				"addr": "2.3.4.5"
			},
			"hostname": "2.3.4.5",
			"enabled": true,
			"verify_network": false,
			"static": false,
			"resolve_server_by_dns": false,
			"rewrite_host_header": false,
			"port": 70
		}],
		"fewest_tasks_feedback_delay": 10,
		"capacity_estimation_ttfb_thresh": 0,
		"lookup_server_by_name": false,
		"lb_algorithm_hash": "LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS",
		"analytics_profile_ref": "https://1.1.1.1api/analyticsprofile/analyticsprofile-e0219c6a-6100-41bb-9aaf-ca2e2b5d0c5c",
		"_last_modified": "1561693273918416",
		"cloud_ref": "https://1.1.1.1/api/cloud/cloud-5c3620c9-e301-4c00-948a-be929809141b",
		"lb_algorithm_core_nonaffinity": 2,
		"vrf_ref": "https://1.1.1.1/api/vrfcontext/vrfcontext-ebd4b655-bc82-458a-8bdc-bff5ce06160d",
		"application_persistence_profile_ref": "https://1.1.1.1/api/applicationpersistenceprofile/applicationpersistenceprofile-d0f2fc6a-2f14-4faf-813d-7fc7937637c0",
		"inline_health_monitor": true,
		"default_server_port": 80,
		"request_queue_depth": 128,
		"graceful_disable_timeout": 1,
		"sni_enabled": true,
		"server_timeout": 0,
		"request_queue_enabled": false,
		"name": "vs_121_pool",
		"max_concurrent_connections_per_server": 0,
		"url": "https://1.1.1.1/api/pool/pool-0d2c18ac-c33b-4473-8342-9c3b249befc5",
		"tenant_ref": "https://1.1.1.1/api/tenant/admin",
		"uuid": "pool-0d2c18ac-c33b-4473-8342-9c3b249befc5",
		"health_monitor_refs": [
			"https://1.1.1.1/api/healthmonitor/healthmonitor-27cfcab8-aaf7-4526-8f0a-9eb8c60662fd"
		],
		"connection_ramp_duration": 10
	}]
    ```
