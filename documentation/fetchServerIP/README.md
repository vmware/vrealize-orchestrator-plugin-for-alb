Action Name:
    fetchServerIP.

Description:
	This action contains a REST GET call to AVI API in order to Get AVI PGNetworks details from the controller.

Inputs:
   - hostController     -> Host of the controller.
   - Tenant             -> AVI Controller Tenant name.
   - servers            -> Type of servers(IP Group or Select by networks).
   - AddExistingServers -> Check box for existing servers.
   - IpGroupName        -> Name of the IPGroups
   - PGName             -> VM Name.

Outputs:
    The output of this action is return list of PGNetworks.
    ex. 
       returns -> [
                    {"IP": 1.2.3.4, "Ratio": 1, "Port": 70},
                    {"IP": 1.1.1.1, "Ratio": 3, "Port": 60}, ....]
    