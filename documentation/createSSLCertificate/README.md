Action Name:
    createSSLCertificate.

Description:
	This action contains a REST POST call to AVI API in order to deploy an object on AVI Controller.

Inputs:
   - hostController  	 -> Host of Controller.
   - objectType   		 -> object type for API(healthmonitor).
   - objectName   		 -> Name of the created object for return JSON response.
   - version 	  		   -> AVI API Version.
   - Tenant 	  		   -> AVI Controller Tenant name.
   - serverCloud       -> Cloud server of AVI Controller.
   - SSLAlgorithm      -> SSL Certificate Algorithm type(EC or RSA).
   - RSAKeySize        -> RSA Key Size.
   - ECKeySize         -> EC key Size.
   - CommonName        -> Common Name for SSL Certificate.
   - CertName          -> Name of the Certificate.
   - rollbackList      -> List for put all created object in one list.

Outputs:
    The output of this action is created AVI object response in JSON format.