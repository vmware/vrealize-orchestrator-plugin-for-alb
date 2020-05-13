package com.vmware.avi.vro;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vmware.o11n.plugin.sdk.spring.AbstractSpringPluginFactory;
import com.vmware.o11n.plugin.sdk.spring.InventoryRef;

import ch.dunes.vso.sdk.api.QueryResult;

/**
 * 
 * @author tushar
 *
 */
public class VroPluginFactory extends AbstractSpringPluginFactory {
	private static final Logger logger = LoggerFactory.getLogger(VroPluginFactory.class);
	public static Map<String, AviVroClient> aviVroClientMap = new HashMap<String, AviVroClient>();
	public static Map<String, String> modelMap = new HashMap<String, String>();

	/***
	 * This method initialize modelMap.
	 * 
	 * @throws ClassNotFoundException
	 */
	public static void initializeModelMap() {
		// VroPluginFactory.fetchClassNames("com.vmware.avi.vro.model");
		VroPluginFactory.modelMap.put("PLUGIN", "Vro");
		VroPluginFactory.modelMap.put("CLIENT", "AviVroClient");
		VroPluginFactory.modelMap.put("PLUGIN_NAME", "Avi");
		VroPluginFactory.modelMap.put("UPGRADESTATUSSUMMARY", "UpgradeStatusSummary");
		VroPluginFactory.modelMap.put("TENANTAPIRESPONSE", "TenantApiResponse");
		VroPluginFactory.modelMap.put("QUERYMATCH", "QueryMatch");
		VroPluginFactory.modelMap.put("HTTPCOOKIEPERSISTENCEPROFILE", "HttpCookiePersistenceProfile");
		VroPluginFactory.modelMap.put("EVENTDETAILSFILTER", "EventDetailsFilter");
		VroPluginFactory.modelMap.put("BACKUPCONFIGURATIONAPIRESPONSE", "BackupConfigurationApiResponse");
		VroPluginFactory.modelMap.put("SEAGENTSTATECACHEPROPERTIES", "SeAgentStateCacheProperties");
		VroPluginFactory.modelMap.put("PERFORMANCELIMITS", "PerformanceLimits");
		VroPluginFactory.modelMap.put("GCPNETWORKCONFIG", "GCPNetworkConfig");
		VroPluginFactory.modelMap.put("SUPPORTEDMIGRATIONS", "SupportedMigrations");
		VroPluginFactory.modelMap.put("IPAMDNSAZUREPROFILE", "IpamDnsAzureProfile");
		VroPluginFactory.modelMap.put("IPREPUTATIONDB", "IPReputationDB");
		VroPluginFactory.modelMap.put("AUTHPROFILEHTTPCLIENTPARAMS", "AuthProfileHTTPClientParams");
		VroPluginFactory.modelMap.put("HTTPREDIRECTACTION", "HTTPRedirectAction");
		VroPluginFactory.modelMap.put("POOLGROUPDEPLOYMENTPOLICY", "PoolGroupDeploymentPolicy");
		VroPluginFactory.modelMap.put("AUTHENTICATIONRULE", "AuthenticationRule");
		VroPluginFactory.modelMap.put("BGPPEER", "BgpPeer");
		VroPluginFactory.modelMap.put("L4POLICIES", "L4Policies");
		VroPluginFactory.modelMap.put("OBJECTACCESSPOLICYRULE", "ObjectAccessPolicyRule");
		VroPluginFactory.modelMap.put("GCPVIPALLOCATION", "GCPVIPAllocation");
		VroPluginFactory.modelMap.put("VCENTERCONFIGURATION", "VCenterConfiguration");
		VroPluginFactory.modelMap.put("CONTROLLERSITEAPIRESPONSE", "ControllerSiteApiResponse");
		VroPluginFactory.modelMap.put("NATPOLICY", "NatPolicy");
		VroPluginFactory.modelMap.put("L4RULEMATCHTARGET", "L4RuleMatchTarget");
		VroPluginFactory.modelMap.put("POOLANALYTICSPOLICY", "PoolAnalyticsPolicy");
		VroPluginFactory.modelMap.put("VSDATASCRIPT", "VSDataScript");
		VroPluginFactory.modelMap.put("ALERTTESTSYSLOGSNMPPARAMS", "AlertTestSyslogSnmpParams");
		VroPluginFactory.modelMap.put("AUTHORIZATIONMATCH", "AuthorizationMatch");
		VroPluginFactory.modelMap.put("CONTROLLERPORTALASSET", "ControllerPortalAsset");
		VroPluginFactory.modelMap.put("SAMLSPCONFIG", "SAMLSPConfig");
		VroPluginFactory.modelMap.put("VCENTERHOSTS", "VcenterHosts");
		VroPluginFactory.modelMap.put("TRAFFICCLONEPROFILE", "TrafficCloneProfile");
		VroPluginFactory.modelMap.put("DEBUGCONTROLLER", "DebugController");
		VroPluginFactory.modelMap.put("SERVERSCALEINPARAMS", "ServerScaleInParams");
		VroPluginFactory.modelMap.put("AUTHPROFILEAPIRESPONSE", "AuthProfileApiResponse");
		VroPluginFactory.modelMap.put("MARATHONSEDEPLOYMENT", "MarathonSeDeployment");
		VroPluginFactory.modelMap.put("CLOUDCONNECTORUSERTESTPARAMS", "CloudConnectorUserTestParams");
		VroPluginFactory.modelMap.put("VIMGRVMRUNTIMEAPIRESPONSE", "VIMgrVMRuntimeApiResponse");
		VroPluginFactory.modelMap.put("GSLBAPIRESPONSE", "GslbApiResponse");
		VroPluginFactory.modelMap.put("ALERTEMAILCONFIG", "AlertEmailConfig");
		VroPluginFactory.modelMap.put("DNSATTACKS", "DnsAttacks");
		VroPluginFactory.modelMap.put("DOSTHRESHOLDPROFILE", "DosThresholdProfile");
		VroPluginFactory.modelMap.put("CUSTOMPARAMS", "CustomParams");
		VroPluginFactory.modelMap.put("HSMSAFENETLUNA", "HSMSafenetLuna");
		VroPluginFactory.modelMap.put("PRIORITYLABELS", "PriorityLabels");
		VroPluginFactory.modelMap.put("AZUREUSERPASSCREDENTIALS", "AzureUserPassCredentials");
		VroPluginFactory.modelMap.put("IPADDR", "IpAddr");
		VroPluginFactory.modelMap.put("IPAMDNSGCPPROFILE", "IpamDnsGCPProfile");
		VroPluginFactory.modelMap.put("CONTROLLERPORTALAUTH", "ControllerPortalAuth");
		VroPluginFactory.modelMap.put("SYSTEMCONFIGURATIONAPIRESPONSE", "SystemConfigurationApiResponse");
		VroPluginFactory.modelMap.put("SECURECHANNELCONFIGURATION", "SecureChannelConfiguration");
		VroPluginFactory.modelMap.put("DNSAAAARDATA", "DnsAAAARdata");
		VroPluginFactory.modelMap.put("ALERTMETRICTHRESHOLD", "AlertMetricThreshold");
		VroPluginFactory.modelMap.put("L4RULEPROTOCOLMATCH", "L4RuleProtocolMatch");
		VroPluginFactory.modelMap.put("NETWORKPROFILEUNION", "NetworkProfileUnion");
		VroPluginFactory.modelMap.put("REPLACESTRINGVAR", "ReplaceStringVar");
		VroPluginFactory.modelMap.put("AUTHENTICATIONMATCH", "AuthenticationMatch");
		VroPluginFactory.modelMap.put("NUAGESDNCONTROLLER", "NuageSDNController");
		VroPluginFactory.modelMap.put("USERACCOUNTPROFILEAPIRESPONSE", "UserAccountProfileApiResponse");
		VroPluginFactory.modelMap.put("APPHDR", "AppHdr");
		VroPluginFactory.modelMap.put("ALBSERVICESACCOUNT", "ALBServicesAccount");
		VroPluginFactory.modelMap.put("WAFAPPLICATIONSIGNATURES", "WafApplicationSignatures");
		VroPluginFactory.modelMap.put("VIMGRSEVMRUNTIME", "VIMgrSEVMRuntime");
		VroPluginFactory.modelMap.put("POOLGROUPDEPLOYMENTPOLICYAPIRESPONSE", "PoolGroupDeploymentPolicyApiResponse");
		VroPluginFactory.modelMap.put("HSMSAFENETCLIENTINFO", "HSMSafenetClientInfo");
		VroPluginFactory.modelMap.put("SCHEDULER", "Scheduler");
		VroPluginFactory.modelMap.put("STATICROUTE", "StaticRoute");
		VroPluginFactory.modelMap.put("JOBENTRYAPIRESPONSE", "JobEntryApiResponse");
		VroPluginFactory.modelMap.put("VIDCINFO", "VIDCInfo");
		VroPluginFactory.modelMap.put("HTTPSTATUSMATCH", "HTTPStatusMatch");
		VroPluginFactory.modelMap.put("WAFPROFILEAPIRESPONSE", "WafProfileApiResponse");
		VroPluginFactory.modelMap.put("SUBJOB", "SubJob");
		VroPluginFactory.modelMap.put("DEBUGDNSOPTIONS", "DebugDnsOptions");
		VroPluginFactory.modelMap.put("NETWORKRUNTIME", "NetworkRuntime");
		VroPluginFactory.modelMap.put("HTTPSECURITYRULE", "HTTPSecurityRule");
		VroPluginFactory.modelMap.put("ANALYTICSPOLICY", "AnalyticsPolicy");
		VroPluginFactory.modelMap.put("SNMPCONFIGURATION", "SnmpConfiguration");
		VroPluginFactory.modelMap.put("NETWORKSECURITYPOLICYAPIRESPONSE", "NetworkSecurityPolicyApiResponse");
		VroPluginFactory.modelMap.put("ERRORPAGEBODYAPIRESPONSE", "ErrorPageBodyApiResponse");
		VroPluginFactory.modelMap.put("HEALTHMONITORAUTHINFO", "HealthMonitorAuthInfo");
		VroPluginFactory.modelMap.put("HTTPREQUESTPOLICY", "HTTPRequestPolicy");
		VroPluginFactory.modelMap.put("GSLBSITE", "GslbSite");
		VroPluginFactory.modelMap.put("AZURECLUSTERINFO", "AzureClusterInfo");
		VroPluginFactory.modelMap.put("IPREPUTATIONTYPEMATCH", "IPReputationTypeMatch");
		VroPluginFactory.modelMap.put("ALERTSYSLOGCONFIGAPIRESPONSE", "AlertSyslogConfigApiResponse");
		VroPluginFactory.modelMap.put("AUTHENTICATIONACTION", "AuthenticationAction");
		VroPluginFactory.modelMap.put("HTTPREWRITELOCHDRACTION", "HTTPRewriteLocHdrAction");
		VroPluginFactory.modelMap.put("VSSCALEINPARAMS", "VsScaleinParams");
		VroPluginFactory.modelMap.put("SEBANDWIDTHLIMIT", "SEBandwidthLimit");
		VroPluginFactory.modelMap.put("SEUPGRADEEVENTS", "SeUpgradeEvents");
		VroPluginFactory.modelMap.put("HTTPRESELECTRESPCODE", "HTTPReselectRespCode");
		VroPluginFactory.modelMap.put("TESTSEDATASTORELEVEL1", "TestSeDatastoreLevel1");
		VroPluginFactory.modelMap.put("DNSPOLICIES", "DnsPolicies");
		VroPluginFactory.modelMap.put("LDAPDIRECTORYSETTINGS", "LdapDirectorySettings");
		VroPluginFactory.modelMap.put("SCPOOLSERVERSTATEINFOAPIRESPONSE", "SCPoolServerStateInfoApiResponse");
		VroPluginFactory.modelMap.put("VIDELETESEREQ", "VIDeleteSEReq");
		VroPluginFactory.modelMap.put("SENSITIVELOGPROFILE", "SensitiveLogProfile");
		VroPluginFactory.modelMap.put("APICVSPLACEMENTREQ", "ApicVSPlacementReq");
		VroPluginFactory.modelMap.put("ALERTEMAILCONFIGAPIRESPONSE", "AlertEmailConfigApiResponse");
		VroPluginFactory.modelMap.put("AUTOSCALEMGRDEBUGFILTER", "AutoScaleMgrDebugFilter");
		VroPluginFactory.modelMap.put("SSLRATING", "SSLRating");
		VroPluginFactory.modelMap.put("CLOUDRUNTIMEAPIRESPONSE", "CloudRuntimeApiResponse");
		VroPluginFactory.modelMap.put("EMAILCONFIGURATION", "EmailConfiguration");
		VroPluginFactory.modelMap.put("SERUNTIMEPROPERTIES", "SeRuntimeProperties");
		VroPluginFactory.modelMap.put("HTTPSECURITYACTIONRATEPROFILE", "HTTPSecurityActionRateProfile");
		VroPluginFactory.modelMap.put("AZUREINFO", "AzureInfo");
		VroPluginFactory.modelMap.put("WAFEXCLUDELISTENTRY", "WafExcludeListEntry");
		VroPluginFactory.modelMap.put("HTTPPOLICYSET", "HTTPPolicySet");
		VroPluginFactory.modelMap.put("VIDCINFOAPIRESPONSE", "VIDCInfoApiResponse");
		VroPluginFactory.modelMap.put("HTTPRESPONSEPOLICY", "HTTPResponsePolicy");
		VroPluginFactory.modelMap.put("CERTIFICATEMANAGEMENTPROFILEAPIRESPONSE",
				"CertificateManagementProfileApiResponse");
		VroPluginFactory.modelMap.put("INTERNALGATEWAYMONITOR", "InternalGatewayMonitor");
		VroPluginFactory.modelMap.put("SSHSEDEPLOYMENT", "SSHSeDeployment");
		VroPluginFactory.modelMap.put("CLOUDCONNECTORDEBUGFILTER", "CloudConnectorDebugFilter");
		VroPluginFactory.modelMap.put("USERACCOUNTPROFILE", "UserAccountProfile");
		VroPluginFactory.modelMap.put("SSLPROFILEAPIRESPONSE", "SSLProfileApiResponse");
		VroPluginFactory.modelMap.put("ROLEAPIRESPONSE", "RoleApiResponse");
		VroPluginFactory.modelMap.put("CLOUDSTACKCONFIGURATION", "CloudStackConfiguration");
		VroPluginFactory.modelMap.put("ROUTINGSERVICE", "RoutingService");
		VroPluginFactory.modelMap.put("HEALTHMONITORSIP", "HealthMonitorSIP");
		VroPluginFactory.modelMap.put("VSSWITCHOVERPARAMS", "VsSwitchoverParams");
		VroPluginFactory.modelMap.put("HTTPLOCALFILE", "HTTPLocalFile");
		VroPluginFactory.modelMap.put("NETWORKPROFILE", "NetworkProfile");
		VroPluginFactory.modelMap.put("DNSCLIENTIPMATCH", "DnsClientIpMatch");
		VroPluginFactory.modelMap.put("ALBSERVICESUSER", "ALBServicesUser");
		VroPluginFactory.modelMap.put("REDISCOVERVCENTERPARAM", "RediscoverVcenterParam");
		VroPluginFactory.modelMap.put("GSLBGEODBENTRY", "GslbGeoDbEntry");
		VroPluginFactory.modelMap.put("NETWORKSECURITYPOLICYACTIONRLPARAM", "NetworkSecurityPolicyActionRLParam");
		VroPluginFactory.modelMap.put("METRICSREALTIMEUPDATE", "MetricsRealTimeUpdate");
		VroPluginFactory.modelMap.put("NETWORKSECURITYRULE", "NetworkSecurityRule");
		VroPluginFactory.modelMap.put("UPGRADESTATUSSUMMARYAPIRESPONSE", "UpgradeStatusSummaryApiResponse");
		VroPluginFactory.modelMap.put("ERRORPAGEPROFILEAPIRESPONSE", "ErrorPageProfileApiResponse");
		VroPluginFactory.modelMap.put("SCVSSTATEINFOAPIRESPONSE", "SCVsStateInfoApiResponse");
		VroPluginFactory.modelMap.put("HOSTHDRMATCH", "HostHdrMatch");
		VroPluginFactory.modelMap.put("DNSPOLICYAPIRESPONSE", "DnsPolicyApiResponse");
		VroPluginFactory.modelMap.put("TIMESTAMP", "TimeStamp");
		VroPluginFactory.modelMap.put("UPGRADESTATUSINFO", "UpgradeStatusInfo");
		VroPluginFactory.modelMap.put("SECURECHANNELMAPPING", "SecureChannelMapping");
		VroPluginFactory.modelMap.put("IPAMDNSPROVIDERPROFILEAPIRESPONSE", "IpamDnsProviderProfileApiResponse");
		VroPluginFactory.modelMap.put("SENSITIVEFIELDRULE", "SensitiveFieldRule");
		VroPluginFactory.modelMap.put("SAMLSERVICEPROVIDERNODE", "SamlServiceProviderNode");
		VroPluginFactory.modelMap.put("CAPTUREFILTERS", "CaptureFilters");
		VroPluginFactory.modelMap.put("ERRORPAGE", "ErrorPage");
		VroPluginFactory.modelMap.put("DEBUGSECPUSHARES", "DebugSeCpuShares");
		VroPluginFactory.modelMap.put("SAMLSERVICEPROVIDERSETTINGS", "SamlServiceProviderSettings");
		VroPluginFactory.modelMap.put("AUTHMAPPINGRULE", "AuthMappingRule");
		VroPluginFactory.modelMap.put("ALERTSCRIPTCONFIGAPIRESPONSE", "AlertScriptConfigApiResponse");
		VroPluginFactory.modelMap.put("HSMTHALESNETHSM", "HSMThalesNetHsm");
		VroPluginFactory.modelMap.put("GSLBSITEDNSVS", "GslbSiteDnsVs");
		VroPluginFactory.modelMap.put("CUMULATIVELICENSE", "CumulativeLicense");
		VroPluginFactory.modelMap.put("VIMGRVCENTERRUNTIMEAPIRESPONSE", "VIMgrVcenterRuntimeApiResponse");
		VroPluginFactory.modelMap.put("VIMGRHOSTRUNTIME", "VIMgrHostRuntime");
		VroPluginFactory.modelMap.put("AZURECONFIGURATION", "AzureConfiguration");
		VroPluginFactory.modelMap.put("ALERTRULE", "AlertRule");
		VroPluginFactory.modelMap.put("TENANT", "Tenant");
		VroPluginFactory.modelMap.put("VNIC", "VNIC");
		VroPluginFactory.modelMap.put("SERVERAUTOSCALEPOLICYAPIRESPONSE", "ServerAutoScalePolicyApiResponse");
		VroPluginFactory.modelMap.put("SECURITYMGRDEBUGFILTER", "SecurityMgrDebugFilter");
		VroPluginFactory.modelMap.put("DEBUGSERVICEENGINEAPIRESPONSE", "DebugServiceEngineApiResponse");
		VroPluginFactory.modelMap.put("ALBSERVICESCONFIGAPIRESPONSE", "ALBServicesConfigApiResponse");
		VroPluginFactory.modelMap.put("DNSCONFIG", "DNSConfig");
		VroPluginFactory.modelMap.put("OPENSTACKHYPERVISORPROPERTIES", "OpenStackHypervisorProperties");
		VroPluginFactory.modelMap.put("USERACTIVITY", "UserActivity");
		VroPluginFactory.modelMap.put("IPADDRMATCH", "IpAddrMatch");
		VroPluginFactory.modelMap.put("BURSTRESOURCE", "BurstResource");
		VroPluginFactory.modelMap.put("DEBUGSEFAULT", "DebugSeFault");
		VroPluginFactory.modelMap.put("CERTIFICATEAUTHORITY", "CertificateAuthority");
		VroPluginFactory.modelMap.put("MICROSERVICECONTAINER", "MicroServiceContainer");
		VroPluginFactory.modelMap.put("FAILACTIONHTTPREDIRECT", "FailActionHTTPRedirect");
		VroPluginFactory.modelMap.put("UPGRADEOPSPARAM", "UpgradeOpsParam");
		VroPluginFactory.modelMap.put("PLACEMENTNETWORK", "PlacementNetwork");
		VroPluginFactory.modelMap.put("COOKIEMATCH", "CookieMatch");
		VroPluginFactory.modelMap.put("CONNECTIONCLEARFILTER", "ConnectionClearFilter");
		VroPluginFactory.modelMap.put("VCENTERINVENTORYDIAGREQ", "VcenterInventoryDiagReq");
		VroPluginFactory.modelMap.put("SSLKEYECPARAMS", "SSLKeyECParams");
		VroPluginFactory.modelMap.put("L4POLICYSETAPIRESPONSE", "L4PolicySetApiResponse");
		VroPluginFactory.modelMap.put("VSDATASCRIPTSET", "VSDataScriptSet");
		VroPluginFactory.modelMap.put("PACKAGEDETAILS", "PackageDetails");
		VroPluginFactory.modelMap.put("VIP", "Vip");
		VroPluginFactory.modelMap.put("TAG", "Tag");
		VroPluginFactory.modelMap.put("IPNETWORKSUBNET", "IPNetworkSubnet");
		VroPluginFactory.modelMap.put("SNMPV3CONFIGURATION", "SnmpV3Configuration");
		VroPluginFactory.modelMap.put("HSMGRDEBUGFILTER", "HSMgrDebugFilter");
		VroPluginFactory.modelMap.put("AWSCONFIGURATION", "AwsConfiguration");
		VroPluginFactory.modelMap.put("OPENSTACKROLEMAPPING", "OpenStackRoleMapping");
		VroPluginFactory.modelMap.put("VIFAULTINJECTION", "VIFaultInjection");
		VroPluginFactory.modelMap.put("SEGROUPRESUMEOPTIONS", "SeGroupResumeOptions");
		VroPluginFactory.modelMap.put("AWSZONENETWORK", "AwsZoneNetwork");
		VroPluginFactory.modelMap.put("MICROSERVICEMATCH", "MicroServiceMatch");
		VroPluginFactory.modelMap.put("IPAMDNSINFOBLOXPROFILE", "IpamDnsInfobloxProfile");
		VroPluginFactory.modelMap.put("MESOSSERESOURCES", "MesosSeResources");
		VroPluginFactory.modelMap.put("ALERTOBJECTLISTAPIRESPONSE", "AlertObjectListApiResponse");
		VroPluginFactory.modelMap.put("WEBHOOK", "Webhook");
		VroPluginFactory.modelMap.put("UDPFASTPATHPROFILE", "UDPFastPathProfile");
		VroPluginFactory.modelMap.put("CLOUD", "Cloud");
		VroPluginFactory.modelMap.put("SERVICEENGINEAPIRESPONSE", "ServiceEngineApiResponse");
		VroPluginFactory.modelMap.put("WAFPOLICY", "WafPolicy");
		VroPluginFactory.modelMap.put("TENCENTCREDENTIALS", "TencentCredentials");
		VroPluginFactory.modelMap.put("SERESOURCES", "SeResources");
		VroPluginFactory.modelMap.put("VIPAUTOSCALEZONES", "VipAutoscaleZones");
		VroPluginFactory.modelMap.put("ADMINAUTHCONFIGURATION", "AdminAuthConfiguration");
		VroPluginFactory.modelMap.put("SERPCPROXYDEBUGFILTER", "SeRpcProxyDebugFilter");
		VroPluginFactory.modelMap.put("VSSPLACEMENT", "VssPlacement");
		VroPluginFactory.modelMap.put("AUTHORIZATIONRULE", "AuthorizationRule");
		VroPluginFactory.modelMap.put("VRFCONTEXT", "VrfContext");
		VroPluginFactory.modelMap.put("APICLIFSRUNTIME", "APICLifsRuntime");
		VroPluginFactory.modelMap.put("SECURECHANNELTOKENAPIRESPONSE", "SecureChannelTokenApiResponse");
		VroPluginFactory.modelMap.put("HTTPAPPLICATIONPROFILE", "HTTPApplicationProfile");
		VroPluginFactory.modelMap.put("WAFPSMLOCATION", "WafPSMLocation");
		VroPluginFactory.modelMap.put("ACTIONGROUPCONFIGAPIRESPONSE", "ActionGroupConfigApiResponse");
		VroPluginFactory.modelMap.put("HTTPSTATUSRANGE", "HTTPStatusRange");
		VroPluginFactory.modelMap.put("VIMGRINTERESTEDENTITY", "VIMgrInterestedEntity");
		VroPluginFactory.modelMap.put("WAFPROFILE", "WafProfile");
		VroPluginFactory.modelMap.put("AUTHPROFILE", "AuthProfile");
		VroPluginFactory.modelMap.put("LOGCONTROLLERMAPPING", "LogControllerMapping");
		VroPluginFactory.modelMap.put("VSDATASCRIPTSETAPIRESPONSE", "VSDataScriptSetApiResponse");
		VroPluginFactory.modelMap.put("ARPTABLEFILTER", "ArpTableFilter");
		VroPluginFactory.modelMap.put("SERVERAUTOSCALEPOLICY", "ServerAutoScalePolicy");
		VroPluginFactory.modelMap.put("HARDWARESECURITYMODULEGROUP", "HardwareSecurityModuleGroup");
		VroPluginFactory.modelMap.put("DNSATTACK", "DnsAttack");
		VroPluginFactory.modelMap.put("SSLCLIENTREQUESTHEADER", "SSLClientRequestHeader");
		VroPluginFactory.modelMap.put("OCICREDENTIALS", "OCICredentials");
		VroPluginFactory.modelMap.put("CLUSTERAPIRESPONSE", "ClusterApiResponse");
		VroPluginFactory.modelMap.put("GSLBGEOLOCATION", "GslbGeoLocation");
		VroPluginFactory.modelMap.put("RATELIMITER", "RateLimiter");
		VroPluginFactory.modelMap.put("HTTPSECURITYACTION", "HTTPSecurityAction");
		VroPluginFactory.modelMap.put("WAFPOSITIVESECURITYMODEL", "WafPositiveSecurityModel");
		VroPluginFactory.modelMap.put("ALERTSYSLOGCONFIG", "AlertSyslogConfig");
		VroPluginFactory.modelMap.put("DEBUGIPADDR", "DebugIpAddr");
		VroPluginFactory.modelMap.put("HTTPPOLICIES", "HTTPPolicies");
		VroPluginFactory.modelMap.put("RATEPROFILE", "RateProfile");
		VroPluginFactory.modelMap.put("CONTENTREWRITEPROFILE", "ContentRewriteProfile");
		VroPluginFactory.modelMap.put("EQUIVALENTLABELS", "EquivalentLabels");
		VroPluginFactory.modelMap.put("IPAMDNSINTERNALPROFILE", "IpamDnsInternalProfile");
		VroPluginFactory.modelMap.put("IPADDRPREFIX", "IpAddrPrefix");
		VroPluginFactory.modelMap.put("DSRPROFILE", "DsrProfile");
		VroPluginFactory.modelMap.put("PROACTIVESUPPORTDEFAULTS", "ProactiveSupportDefaults");
		VroPluginFactory.modelMap.put("SECURECHANNELMETADATA", "SecureChannelMetadata");
		VroPluginFactory.modelMap.put("VRFCONTEXTAPIRESPONSE", "VrfContextApiResponse");
		VroPluginFactory.modelMap.put("VIMGRVCENTERRUNTIME", "VIMgrVcenterRuntime");
		VroPluginFactory.modelMap.put("BACKUPAPIRESPONSE", "BackupApiResponse");
		VroPluginFactory.modelMap.put("DEBUGVIRTUALSERVICESEPARAMS", "DebugVirtualServiceSeParams");
		VroPluginFactory.modelMap.put("UPGRADESTATUSINFOAPIRESPONSE", "UpgradeStatusInfoApiResponse");
		VroPluginFactory.modelMap.put("DEBUGSERVICEENGINE", "DebugServiceEngine");
		VroPluginFactory.modelMap.put("CONTROLLERPORTALREGISTRATION", "ControllerPortalRegistration");
		VroPluginFactory.modelMap.put("AUTOSCALEMESOSSETTINGS", "AutoScaleMesosSettings");
		VroPluginFactory.modelMap.put("CDPLLDPINFO", "CdpLldpInfo");
		VroPluginFactory.modelMap.put("AUTHMATCHGROUPMEMBERSHIP", "AuthMatchGroupMembership");
		VroPluginFactory.modelMap.put("ALERTSCRIPTCONFIG", "AlertScriptConfig");
		VroPluginFactory.modelMap.put("NETWORKSECURITYPOLICY", "NetworkSecurityPolicy");
		VroPluginFactory.modelMap.put("CCPROPERTIES", "CCProperties");
		VroPluginFactory.modelMap.put("VIMGRCONTROLLERRUNTIMEAPIRESPONSE", "VIMgrControllerRuntimeApiResponse");
		VroPluginFactory.modelMap.put("OSHIFTK8SCONFIGURATION", "OShiftK8SConfiguration");
		VroPluginFactory.modelMap.put("DNSRATEPROFILE", "DnsRateProfile");
		VroPluginFactory.modelMap.put("DNSRRSET", "DnsRrSet");
		VroPluginFactory.modelMap.put("IPCOMMUNITY", "IpCommunity");
		VroPluginFactory.modelMap.put("NATPOLICYACTION", "NatPolicyAction");
		VroPluginFactory.modelMap.put("VSDEBUGFILTER", "VsDebugFilter");
		VroPluginFactory.modelMap.put("AWSLOGIN", "AWSLogin");
		VroPluginFactory.modelMap.put("VIPAUTOSCALEGROUP", "VipAutoscaleGroup");
		VroPluginFactory.modelMap.put("TESTSEDATASTORELEVEL3APIRESPONSE", "TestSeDatastoreLevel3ApiResponse");
		VroPluginFactory.modelMap.put("GCPVIPILB", "GCPVIPILB");
		VroPluginFactory.modelMap.put("SEGROUPSTATUS", "SeGroupStatus");
		VroPluginFactory.modelMap.put("DNSINFO", "DnsInfo");
		VroPluginFactory.modelMap.put("COMPRESSIONPROFILE", "CompressionProfile");
		VroPluginFactory.modelMap.put("TACACSPLUSAUTHSETTINGS", "TacacsPlusAuthSettings");
		VroPluginFactory.modelMap.put("MICROSERVICE", "MicroService");
		VroPluginFactory.modelMap.put("TCPATTACKS", "TcpAttacks");
		VroPluginFactory.modelMap.put("FAILACTIONHTTPLOCALRESPONSE", "FailActionHTTPLocalResponse");
		VroPluginFactory.modelMap.put("ALERTTESTEMAILPARAMS", "AlertTestEmailParams");
		VroPluginFactory.modelMap.put("OPENSTACKCONFIGURATION", "OpenStackConfiguration");
		VroPluginFactory.modelMap.put("CIF", "Cif");
		VroPluginFactory.modelMap.put("PROTOCOLMATCH", "ProtocolMatch");
		VroPluginFactory.modelMap.put("VSVIPAPIRESPONSE", "VsVipApiResponse");
		VroPluginFactory.modelMap.put("VIMGRIPSUBNETRUNTIME", "VIMgrIPSubnetRuntime");
		VroPluginFactory.modelMap.put("WAFPOLICYPSMGROUP", "WafPolicyPSMGroup");
		VroPluginFactory.modelMap.put("HTTPVERSIONMATCH", "HTTPVersionMatch");
		VroPluginFactory.modelMap.put("VCENTERCLOUDSTATUSREQ", "VcenterCloudStatusReq");
		VroPluginFactory.modelMap.put("SSLKEYANDCERTIFICATE", "SSLKeyAndCertificate");
		VroPluginFactory.modelMap.put("SCVSSTATEINFO", "SCVsStateInfo");
		VroPluginFactory.modelMap.put("COMPRESSIONFILTER", "CompressionFilter");
		VroPluginFactory.modelMap.put("AUTOSCALEOPENSTACKSETTINGS", "AutoScaleOpenStackSettings");
		VroPluginFactory.modelMap.put("CERTIFICATEMANAGEMENTPROFILE", "CertificateManagementProfile");
		VroPluginFactory.modelMap.put("SERVICEENGINEGROUPAPIRESPONSE", "ServiceEngineGroupApiResponse");
		VroPluginFactory.modelMap.put("WAFPOLICYWHITELIST", "WafPolicyWhitelist");
		VroPluginFactory.modelMap.put("MESOSATTRIBUTE", "MesosAttribute");
		VroPluginFactory.modelMap.put("SSLKEYRSAPARAMS", "SSLKeyRSAParams");
		VroPluginFactory.modelMap.put("AUTHORIZATIONPOLICY", "AuthorizationPolicy");
		VroPluginFactory.modelMap.put("DEBUGVSDATAPLANE", "DebugVsDataplane");
		VroPluginFactory.modelMap.put("CRL", "CRL");
		VroPluginFactory.modelMap.put("CLOUDMETA", "CloudMeta");
		VroPluginFactory.modelMap.put("VSERROR", "VsError");
		VroPluginFactory.modelMap.put("APPLICATION", "Application");
		VroPluginFactory.modelMap.put("APPLEARNINGCONFIDENCEOVERRIDE", "AppLearningConfidenceOverride");
		VroPluginFactory.modelMap.put("SNMPV3USERPARAMS", "SnmpV3UserParams");
		VroPluginFactory.modelMap.put("MESOSCONFIGURATION", "MesosConfiguration");
		VroPluginFactory.modelMap.put("TENANTCONFIGURATION", "TenantConfiguration");
		VroPluginFactory.modelMap.put("CUSTOMTAG", "CustomTag");
		VroPluginFactory.modelMap.put("METRICSMGRDEBUGFILTER", "MetricsMgrDebugFilter");
		VroPluginFactory.modelMap.put("DNSSERVICEAPPLICATIONPROFILE", "DnsServiceApplicationProfile");
		VroPluginFactory.modelMap.put("STATECACHEMGRDEBUGFILTER", "StateCacheMgrDebugFilter");
		VroPluginFactory.modelMap.put("DNSRULEACTIONALLOWDROP", "DnsRuleActionAllowDrop");
		VroPluginFactory.modelMap.put("DEBUGVRF", "DebugVrf");
		VroPluginFactory.modelMap.put("DNSSRVRDATA", "DnsSrvRdata");
		VroPluginFactory.modelMap.put("IPAMDNSOCIPROFILE", "IpamDnsOCIProfile");
		VroPluginFactory.modelMap.put("SSLCERTIFICATE", "SSLCertificate");
		VroPluginFactory.modelMap.put("DEBUGFILTERUNION", "DebugFilterUnion");
		VroPluginFactory.modelMap.put("VIMGRDCRUNTIMEAPIRESPONSE", "VIMgrDCRuntimeApiResponse");
		VroPluginFactory.modelMap.put("WAFPSMMATCHELEMENT", "WafPSMMatchElement");
		VroPluginFactory.modelMap.put("CLUSTERCLOUDDETAILS", "ClusterCloudDetails");
		VroPluginFactory.modelMap.put("AUTHORIZATIONACTION", "AuthorizationAction");
		VroPluginFactory.modelMap.put("TESTSEDATASTORELEVEL1APIRESPONSE", "TestSeDatastoreLevel1ApiResponse");
		VroPluginFactory.modelMap.put("MARATHONCONFIGURATION", "MarathonConfiguration");
		VroPluginFactory.modelMap.put("CAPTUREFILESIZE", "CaptureFileSize");
		VroPluginFactory.modelMap.put("APPLICATIONPERSISTENCEPROFILEAPIRESPONSE",
				"ApplicationPersistenceProfileApiResponse");
		VroPluginFactory.modelMap.put("HTTPCACHECONFIG", "HttpCacheConfig");
		VroPluginFactory.modelMap.put("SERVICE", "Service");
		VroPluginFactory.modelMap.put("DNSCNAMERDATA", "DnsCnameRdata");
		VroPluginFactory.modelMap.put("GSLBSERVICEAPIRESPONSE", "GslbServiceApiResponse");
		VroPluginFactory.modelMap.put("GCPINBANDMANAGEMENT", "GCPInBandManagement");
		VroPluginFactory.modelMap.put("SNMPTRAPPROFILE", "SnmpTrapProfile");
		VroPluginFactory.modelMap.put("TCPFASTPATHPROFILE", "TCPFastPathProfile");
		VroPluginFactory.modelMap.put("PATCHDATA", "PatchData");
		VroPluginFactory.modelMap.put("CONTROLLERPORTALREGISTRATIONAPIRESPONSE",
				"ControllerPortalRegistrationApiResponse");
		VroPluginFactory.modelMap.put("VISEVMOVAPARAMS", "VISeVmOvaParams");
		VroPluginFactory.modelMap.put("CONTROLLERLICENSE", "ControllerLicense");
		VroPluginFactory.modelMap.put("ATTACKMITIGATIONACTION", "AttackMitigationAction");
		VroPluginFactory.modelMap.put("DNSRULEACTIONGSLBSITESELECTION", "DnsRuleActionGslbSiteSelection");
		VroPluginFactory.modelMap.put("AUTHMATCHATTRIBUTE", "AuthMatchAttribute");
		VroPluginFactory.modelMap.put("GCPCONFIGURATION", "GCPConfiguration");
		VroPluginFactory.modelMap.put("HEALTHMONITORUDP", "HealthMonitorUdp");
		VroPluginFactory.modelMap.put("APPLICATIONPERSISTENCEPROFILE", "ApplicationPersistenceProfile");
		VroPluginFactory.modelMap.put("HARDWARESECURITYMODULEGROUPAPIRESPONSE",
				"HardwareSecurityModuleGroupApiResponse");
		VroPluginFactory.modelMap.put("CLOUDCONNECTORUSERAPIRESPONSE", "CloudConnectorUserApiResponse");
		VroPluginFactory.modelMap.put("WAFPOLICYPSMGROUPAPIRESPONSE", "WafPolicyPSMGroupApiResponse");
		VroPluginFactory.modelMap.put("DOSRATELIMITPROFILE", "DosRateLimitProfile");
		VroPluginFactory.modelMap.put("AUTHENTICATIONPOLICY", "AuthenticationPolicy");
		VroPluginFactory.modelMap.put("OPENSTACKVIPNETWORK", "OpenStackVipNetwork");
		VroPluginFactory.modelMap.put("SSLCACHEFILTER", "SSLCacheFilter");
		VroPluginFactory.modelMap.put("VIPAUTOSCALEPOLICY", "VipAutoscalePolicy");
		VroPluginFactory.modelMap.put("CLUSTERNODE", "ClusterNode");
		VroPluginFactory.modelMap.put("CLIENTLOGSTREAMINGCONFIG", "ClientLogStreamingConfig");
		VroPluginFactory.modelMap.put("SNMPTRAPPROFILEAPIRESPONSE", "SnmpTrapProfileApiResponse");
		VroPluginFactory.modelMap.put("JOBENTRY", "JobEntry");
		VroPluginFactory.modelMap.put("SSLPROFILE", "SSLProfile");
		VroPluginFactory.modelMap.put("ABPOOL", "AbPool");
		VroPluginFactory.modelMap.put("HSMSAFENETLUNASERVER", "HSMSafenetLunaServer");
		VroPluginFactory.modelMap.put("GSLBIPADDR", "GslbIpAddr");
		VroPluginFactory.modelMap.put("DEBUGVRFCONTEXT", "DebugVrfContext");
		VroPluginFactory.modelMap.put("LOGCONTROLLERMAPPINGAPIRESPONSE", "LogControllerMappingApiResponse");
		VroPluginFactory.modelMap.put("DNSSERVICEDOMAIN", "DnsServiceDomain");
		VroPluginFactory.modelMap.put("PINGACCESSAGENT", "PingAccessAgent");
		VroPluginFactory.modelMap.put("VIPAUTOSCALECONFIGURATION", "VipAutoscaleConfiguration");
		VroPluginFactory.modelMap.put("PORTALFEATUREOPTIN", "PortalFeatureOptIn");
		VroPluginFactory.modelMap.put("AUTOSCALELAUNCHCONFIGAPIRESPONSE", "AutoScaleLaunchConfigApiResponse");
		VroPluginFactory.modelMap.put("POOLSERVER", "PoolServer");
		VroPluginFactory.modelMap.put("PERMISSION", "Permission");
		VroPluginFactory.modelMap.put("IPADDRPORT", "IpAddrPort");
		VroPluginFactory.modelMap.put("SEPROPERTIESAPIRESPONSE", "SePropertiesApiResponse");
		VroPluginFactory.modelMap.put("OPERATIONALSTATUS", "OperationalStatus");
		VroPluginFactory.modelMap.put("MATCHREPLACEPAIR", "MatchReplacePair");
		VroPluginFactory.modelMap.put("IPREPUTATIONDBAPIRESPONSE", "IPReputationDBApiResponse");
		VroPluginFactory.modelMap.put("DNSRULERLACTION", "DnsRuleRLAction");
		VroPluginFactory.modelMap.put("MICROSERVICEGROUP", "MicroServiceGroup");
		VroPluginFactory.modelMap.put("NATRULE", "NatRule");
		VroPluginFactory.modelMap.put("SERVICEPOOLSELECTOR", "ServicePoolSelector");
		VroPluginFactory.modelMap.put("FEPROXYROUTEPUBLISHCONFIG", "FeProxyRoutePublishConfig");
		VroPluginFactory.modelMap.put("ALERTCONFIG", "AlertConfig");
		VroPluginFactory.modelMap.put("PROXYCONFIGURATION", "ProxyConfiguration");
		VroPluginFactory.modelMap.put("CLIENTLOGFILTER", "ClientLogFilter");
		VroPluginFactory.modelMap.put("TESTSEDATASTORELEVEL3", "TestSeDatastoreLevel3");
		VroPluginFactory.modelMap.put("PKIPROFILE", "PKIProfile");
		VroPluginFactory.modelMap.put("CONNPOOLFILTER", "ConnpoolFilter");
		VroPluginFactory.modelMap.put("URIPARAM", "URIParam");
		VroPluginFactory.modelMap.put("NETWORKAPIRESPONSE", "NetworkApiResponse");
		VroPluginFactory.modelMap.put("DEBUGCONTROLLERAPIRESPONSE", "DebugControllerApiResponse");
		VroPluginFactory.modelMap.put("RANCHERCONFIGURATION", "RancherConfiguration");
		VroPluginFactory.modelMap.put("CLOUDINFO", "CloudInfo");
		VroPluginFactory.modelMap.put("MICROSERVICEGROUPAPIRESPONSE", "MicroServiceGroupApiResponse");
		VroPluginFactory.modelMap.put("LDAPUSERBINDSETTINGS", "LdapUserBindSettings");
		VroPluginFactory.modelMap.put("CONNPOOLPROPERTIES", "ConnPoolProperties");
		VroPluginFactory.modelMap.put("WAFLEARNING", "WafLearning");
		VroPluginFactory.modelMap.put("IPAMDNSPROVIDERPROFILE", "IpamDnsProviderProfile");
		VroPluginFactory.modelMap.put("DEBUGSEAGENT", "DebugSeAgent");
		VroPluginFactory.modelMap.put("APPLICATIONPROFILEAPIRESPONSE", "ApplicationProfileApiResponse");
		VroPluginFactory.modelMap.put("OSHIFTSHAREDVIRTUALSERVICE", "OshiftSharedVirtualService");
		VroPluginFactory.modelMap.put("SECURECHANNELAVAILABLELOCALIPSAPIRESPONSE",
				"SecureChannelAvailableLocalIPsApiResponse");
		VroPluginFactory.modelMap.put("SECURITYPOLICY", "SecurityPolicy");
		VroPluginFactory.modelMap.put("POOL", "Pool");
		VroPluginFactory.modelMap.put("NETWORKSECURITYMATCHTARGET", "NetworkSecurityMatchTarget");
		VroPluginFactory.modelMap.put("PORTMATCH", "PortMatch");
		VroPluginFactory.modelMap.put("DEBUGVIRTUALSERVICE", "DebugVirtualService");
		VroPluginFactory.modelMap.put("VIPPLACEMENTNETWORK", "VipPlacementNetwork");
		VroPluginFactory.modelMap.put("VSMIGRATEPARAMS", "VsMigrateParams");
		VroPluginFactory.modelMap.put("BFDPROFILE", "BfdProfile");
		VroPluginFactory.modelMap.put("APICNETWORKREL", "APICNetworkRel");
		VroPluginFactory.modelMap.put("KEYVALUE", "KeyValue");
		VroPluginFactory.modelMap.put("SAMLSETTINGS", "SamlSettings");
		VroPluginFactory.modelMap.put("BACKUP", "Backup");
		VroPluginFactory.modelMap.put("SEBOOTUPPROPERTIES", "SeBootupProperties");
		VroPluginFactory.modelMap.put("OSHIFTDOCKERREGISTRYMETADATA", "OshiftDockerRegistryMetaData");
		VroPluginFactory.modelMap.put("DNSRULEMATCHTARGET", "DnsRuleMatchTarget");
		VroPluginFactory.modelMap.put("FLOATINGIPSUBNET", "FloatingIpSubnet");
		VroPluginFactory.modelMap.put("CLOUDAPIRESPONSE", "CloudApiResponse");
		VroPluginFactory.modelMap.put("ROLE", "Role");
		VroPluginFactory.modelMap.put("SEBOOTUPCOMPRESSIONPROPERTIES", "SeBootupCompressionProperties");
		VroPluginFactory.modelMap.put("RESPONSEMATCHTARGET", "ResponseMatchTarget");
		VroPluginFactory.modelMap.put("OBJECTACCESSPOLICY", "ObjectAccessPolicy");
		VroPluginFactory.modelMap.put("VIMGRVMRUNTIME", "VIMgrVMRuntime");
		VroPluginFactory.modelMap.put("GSLBPOOL", "GslbPool");
		VroPluginFactory.modelMap.put("RETRYPLACEMENTPARAMS", "RetryPlacementParams");
		VroPluginFactory.modelMap.put("SSLVERSION", "SSLVersion");
		VroPluginFactory.modelMap.put("HTTPRESPONSERULE", "HTTPResponseRule");
		VroPluginFactory.modelMap.put("RATELIMITERACTION", "RateLimiterAction");
		VroPluginFactory.modelMap.put("FILEOBJECTAPIRESPONSE", "FileObjectApiResponse");
		VroPluginFactory.modelMap.put("REBOOTDATA", "RebootData");
		VroPluginFactory.modelMap.put("DISCOVEREDNETWORK", "DiscoveredNetwork");
		VroPluginFactory.modelMap.put("DEBUGVIRTUALSERVICEAPIRESPONSE", "DebugVirtualServiceApiResponse");
		VroPluginFactory.modelMap.put("L4CONNECTIONPOLICY", "L4ConnectionPolicy");
		VroPluginFactory.modelMap.put("WAFRULE", "WafRule");
		VroPluginFactory.modelMap.put("VIADMINCREDENTIALS", "VIAdminCredentials");
		VroPluginFactory.modelMap.put("WAFPOLICYAPIRESPONSE", "WafPolicyApiResponse");
		VroPluginFactory.modelMap.put("DISPATCHERTABLEDUMPCLEAR", "DispatcherTableDumpClear");
		VroPluginFactory.modelMap.put("HEALTHMONITOREXTERNAL", "HealthMonitorExternal");
		VroPluginFactory.modelMap.put("VCENTERCLUSTERS", "VcenterClusters");
		VroPluginFactory.modelMap.put("SIDEBANDPROFILE", "SidebandProfile");
		VroPluginFactory.modelMap.put("HDRPERSISTENCEPROFILE", "HdrPersistenceProfile");
		VroPluginFactory.modelMap.put("ALBSERVICESFILEUPLOAD", "ALBServicesFileUpload");
		VroPluginFactory.modelMap.put("IPTABLERULESET", "IptableRuleSet");
		VroPluginFactory.modelMap.put("GSLBTHIRDPARTYSITE", "GslbThirdPartySite");
		VroPluginFactory.modelMap.put("L4RULE", "L4Rule");
		VroPluginFactory.modelMap.put("SSLCLIENTCERTIFICATEACTION", "SSLClientCertificateAction");
		VroPluginFactory.modelMap.put("GSLBGEODBFILE", "GslbGeoDbFile");
		VroPluginFactory.modelMap.put("WAFCRSAPIRESPONSE", "WafCRSApiResponse");
		VroPluginFactory.modelMap.put("HTTPCACHEOBJFILTER", "HttpCacheObjFilter");
		VroPluginFactory.modelMap.put("SSLKEYANDCERTIFICATEAPIRESPONSE", "SSLKeyAndCertificateApiResponse");
		VroPluginFactory.modelMap.put("PKIPROFILEAPIRESPONSE", "PKIProfileApiResponse");
		VroPluginFactory.modelMap.put("HEALTHMONITORRADIUS", "HealthMonitorRadius");
		VroPluginFactory.modelMap.put("BACKUPCONFIGURATION", "BackupConfiguration");
		VroPluginFactory.modelMap.put("SERVERSCALEOUTPARAMS", "ServerScaleOutParams");
		VroPluginFactory.modelMap.put("TENCENTZONENETWORK", "TencentZoneNetwork");
		VroPluginFactory.modelMap.put("DNSRECORD", "DnsRecord");
		VroPluginFactory.modelMap.put("HSMAWSCLOUDHSM", "HSMAwsCloudHsm");
		VroPluginFactory.modelMap.put("FLOWTABLEPROFILE", "FlowtableProfile");
		VroPluginFactory.modelMap.put("PGDEPLOYMENTRULE", "PGDeploymentRule");
		VroPluginFactory.modelMap.put("CLONESERVER", "CloneServer");
		VroPluginFactory.modelMap.put("SEFAULTINJECTSEPARAM", "SEFaultInjectSeParam");
		VroPluginFactory.modelMap.put("EVENTGENPARAMS", "EventGenParams");
		VroPluginFactory.modelMap.put("CLOUDCONNECTORUSER", "CloudConnectorUser");
		VroPluginFactory.modelMap.put("SEAGENTPROPERTIES", "SeAgentProperties");
		VroPluginFactory.modelMap.put("CLOUDPROPERTIESAPIRESPONSE", "CloudPropertiesApiResponse");
		VroPluginFactory.modelMap.put("TESTSEDATASTORELEVEL2", "TestSeDatastoreLevel2");
		VroPluginFactory.modelMap.put("NETWORKPROFILEAPIRESPONSE", "NetworkProfileApiResponse");
		VroPluginFactory.modelMap.put("GSLBGEODBPROFILEAPIRESPONSE", "GslbGeoDbProfileApiResponse");
		VroPluginFactory.modelMap.put("UPGRADEOPSSTATE", "UpgradeOpsState");
		VroPluginFactory.modelMap.put("DNSNSRDATA", "DnsNsRdata");
		VroPluginFactory.modelMap.put("HTTP2APPLICATIONPROFILE", "HTTP2ApplicationProfile");
		VroPluginFactory.modelMap.put("VIMGRHOSTRUNTIMEAPIRESPONSE", "VIMgrHostRuntimeApiResponse");
		VroPluginFactory.modelMap.put("MATCHTARGET", "MatchTarget");
		VroPluginFactory.modelMap.put("AZURESERVICEPRINCIPALCREDENTIALS", "AzureServicePrincipalCredentials");
		VroPluginFactory.modelMap.put("USERACTIVITYAPIRESPONSE", "UserActivityApiResponse");
		VroPluginFactory.modelMap.put("IPAMDNSTENCENTPROFILE", "IpamDnsTencentProfile");
		VroPluginFactory.modelMap.put("HTTPREQUESTRULE", "HTTPRequestRule");
		VroPluginFactory.modelMap.put("SUBNET", "Subnet");
		VroPluginFactory.modelMap.put("SUBNETRUNTIME", "SubnetRuntime");
		VroPluginFactory.modelMap.put("SINGLELICENSE", "SingleLicense");
		VroPluginFactory.modelMap.put("POOLGROUPAPIRESPONSE", "PoolGroupApiResponse");
		VroPluginFactory.modelMap.put("VCENTERLOGIN", "VcenterLogin");
		VroPluginFactory.modelMap.put("VIMGRCONTROLLERRUNTIME", "VIMgrControllerRuntime");
		VroPluginFactory.modelMap.put("L4POLICYSET", "L4PolicySet");
		VroPluginFactory.modelMap.put("VIMGRCLUSTERRUNTIME", "VIMgrClusterRuntime");
		VroPluginFactory.modelMap.put("CUSTOMIPAMDNSPROFILE", "CustomIpamDnsProfile");
		VroPluginFactory.modelMap.put("VIRTUALSERVICEAPIRESPONSE", "VirtualServiceApiResponse");
		VroPluginFactory.modelMap.put("CLIENTLOGCONFIGURATION", "ClientLogConfiguration");
		VroPluginFactory.modelMap.put("L4RULEACTION", "L4RuleAction");
		VroPluginFactory.modelMap.put("HTTPSWITCHINGACTION", "HTTPSwitchingAction");
		VroPluginFactory.modelMap.put("UDPPROXYPROFILE", "UDPProxyProfile");
		VroPluginFactory.modelMap.put("SECURECHANNELTOKEN", "SecureChannelToken");
		VroPluginFactory.modelMap.put("DNSRULEDNSRRSET", "DnsRuleDnsRrSet");
		VroPluginFactory.modelMap.put("INGATTRIBUTE", "IngAttribute");
		VroPluginFactory.modelMap.put("URIPARAMQUERY", "URIParamQuery");
		VroPluginFactory.modelMap.put("APICLIFSRUNTIMEAPIRESPONSE", "APICLifsRuntimeApiResponse");
		VroPluginFactory.modelMap.put("APICCONFIGURATION", "APICConfiguration");
		VroPluginFactory.modelMap.put("L4RULEPORTMATCH", "L4RulePortMatch");
		VroPluginFactory.modelMap.put("NATPOLICYAPIRESPONSE", "NatPolicyApiResponse");
		VroPluginFactory.modelMap.put("AWSENCRYPTION", "AwsEncryption");
		VroPluginFactory.modelMap.put("SNMPTRAPSERVER", "SnmpTrapServer");
		VroPluginFactory.modelMap.put("DNSRULEACTION", "DnsRuleAction");
		VroPluginFactory.modelMap.put("LINUXSERVERCONFIGURATION", "LinuxServerConfiguration");
		VroPluginFactory.modelMap.put("POOLAPIRESPONSE", "PoolApiResponse");
		VroPluginFactory.modelMap.put("VIRETRIEVEPGNAMES", "VIRetrievePGNames");
		VroPluginFactory.modelMap.put("AVIRESTRESOURCE", "AviRestResource");
		VroPluginFactory.modelMap.put("WAFCONFIG", "WafConfig");
		VroPluginFactory.modelMap.put("AUTOSCALELAUNCHCONFIG", "AutoScaleLaunchConfig");
		VroPluginFactory.modelMap.put("CLUSTERCLOUDDETAILSAPIRESPONSE", "ClusterCloudDetailsApiResponse");
		VroPluginFactory.modelMap.put("NETWORK", "Network");
		VroPluginFactory.modelMap.put("EVENTMAP", "EventMap");
		VroPluginFactory.modelMap.put("GSLBCLIENTIPADDRGROUP", "GslbClientIpAddrGroup");
		VroPluginFactory.modelMap.put("GCPCREDENTIALS", "GCPCredentials");
		VroPluginFactory.modelMap.put("BGPPROFILE", "BgpProfile");
		VroPluginFactory.modelMap.put("SECURECHANNELAVAILABLELOCALIPS", "SecureChannelAvailableLocalIPs");
		VroPluginFactory.modelMap.put("WAFPOLICYWHITELISTRULE", "WafPolicyWhitelistRule");
		VroPluginFactory.modelMap.put("TESTSEDATASTORELEVEL2APIRESPONSE", "TestSeDatastoreLevel2ApiResponse");
		VroPluginFactory.modelMap.put("SECURITYPOLICYAPIRESPONSE", "SecurityPolicyApiResponse");
		VroPluginFactory.modelMap.put("DNSRULEACTIONPOOLSWITCHING", "DnsRuleActionPoolSwitching");
		VroPluginFactory.modelMap.put("GSLB", "Gslb");
		VroPluginFactory.modelMap.put("VCLOUDAIRCONFIGURATION", "VCloudAirConfiguration");
		VroPluginFactory.modelMap.put("VIPGNAMEINFO", "VIPGNameInfo");
		VroPluginFactory.modelMap.put("DNSQUERYNAMEMATCH", "DnsQueryNameMatch");
		VroPluginFactory.modelMap.put("STRINGGROUP", "StringGroup");
		VroPluginFactory.modelMap.put("POOLGROUP", "PoolGroup");
		VroPluginFactory.modelMap.put("RATELIMITERPROFILE", "RateLimiterProfile");
		VroPluginFactory.modelMap.put("BUILDINFO", "BuildInfo");
		VroPluginFactory.modelMap.put("VISETMGMTIPSEREQ", "VISetMgmtIpSEReq");
		VroPluginFactory.modelMap.put("L4RULEACTIONSELECTPOOL", "L4RuleActionSelectPool");
		VroPluginFactory.modelMap.put("HEALTHMONITORTCP", "HealthMonitorTcp");
		VroPluginFactory.modelMap.put("SERVICEENGINE", "ServiceEngine");
		VroPluginFactory.modelMap.put("BGPROUTINGOPTIONS", "BgpRoutingOptions");
		VroPluginFactory.modelMap.put("FAILACTION", "FailAction");
		VroPluginFactory.modelMap.put("FULLCLIENTLOGS", "FullClientLogs");
		VroPluginFactory.modelMap.put("VIMGRSEVMRUNTIMEAPIRESPONSE", "VIMgrSEVMRuntimeApiResponse");
		VroPluginFactory.modelMap.put("VIVMVNICINFO", "VIVmVnicInfo");
		VroPluginFactory.modelMap.put("SEGROUPOPTIONS", "SeGroupOptions");
		VroPluginFactory.modelMap.put("DNSTRANSPORTPROTOCOLMATCH", "DnsTransportProtocolMatch");
		VroPluginFactory.modelMap.put("LINUXCONFIGURATION", "LinuxConfiguration");
		VroPluginFactory.modelMap.put("TCPAPPLICATIONPROFILE", "TCPApplicationProfile");
		VroPluginFactory.modelMap.put("WAFEXCLUSIONTYPE", "WafExclusionType");
		VroPluginFactory.modelMap.put("CLIENTINSIGHTSSAMPLING", "ClientInsightsSampling");
		VroPluginFactory.modelMap.put("GSLBGEODBPROFILE", "GslbGeoDbProfile");
		VroPluginFactory.modelMap.put("PRIORITYLABELSAPIRESPONSE", "PriorityLabelsApiResponse");
		VroPluginFactory.modelMap.put("NTPSERVER", "NTPServer");
		VroPluginFactory.modelMap.put("HTTPCOOKIEDATA", "HTTPCookieData");
		VroPluginFactory.modelMap.put("SERVICEENGINEGROUP", "ServiceEngineGroup");
		VroPluginFactory.modelMap.put("NATADDRINFO", "NatAddrInfo");
		VroPluginFactory.modelMap.put("NETWORKSERVICEAPIRESPONSE", "NetworkServiceApiResponse");
		VroPluginFactory.modelMap.put("PORTRANGE", "PortRange");
		VroPluginFactory.modelMap.put("SSLKEYPARAMS", "SSLKeyParams");
		VroPluginFactory.modelMap.put("ERRORPAGEBODY", "ErrorPageBody");
		VroPluginFactory.modelMap.put("ACTIONGROUPCONFIG", "ActionGroupConfig");
		VroPluginFactory.modelMap.put("VIPGNAMEINFOAPIRESPONSE", "VIPGNameInfoApiResponse");
		VroPluginFactory.modelMap.put("HEALTHMONITORAPIRESPONSE", "HealthMonitorApiResponse");
		VroPluginFactory.modelMap.put("UPGRADEEVENT", "UpgradeEvent");
		VroPluginFactory.modelMap.put("VSDATASCRIPTS", "VSDataScripts");
		VroPluginFactory.modelMap.put("GCPONEARMMODE", "GCPOneArmMode");
		VroPluginFactory.modelMap.put("VSRESYNCPARAMS", "VsResyncParams");
		VroPluginFactory.modelMap.put("PATCHINFO", "PatchInfo");
		VroPluginFactory.modelMap.put("HTTPSECURITYPOLICY", "HTTPSecurityPolicy");
		VroPluginFactory.modelMap.put("ALERTFILTER", "AlertFilter");
		VroPluginFactory.modelMap.put("URIPARAMTOKEN", "URIParamToken");
		VroPluginFactory.modelMap.put("APPLICATIONAPIRESPONSE", "ApplicationApiResponse");
		VroPluginFactory.modelMap.put("CLIENTLOGSTREAMINGFORMAT", "ClientLogStreamingFormat");
		VroPluginFactory.modelMap.put("SSLCERTIFICATEDESCRIPTION", "SSLCertificateDescription");
		VroPluginFactory.modelMap.put("HTTPHDRVALUE", "HTTPHdrValue");
		VroPluginFactory.modelMap.put("PORTALCONFIGURATION", "PortalConfiguration");
		VroPluginFactory.modelMap.put("GSLBSERVICEDOWNRESPONSE", "GslbServiceDownResponse");
		VroPluginFactory.modelMap.put("SAMLIDENTITYPROVIDERSETTINGS", "SamlIdentityProviderSettings");
		VroPluginFactory.modelMap.put("HEALTHMONITORSSLATTRIBUTES", "HealthMonitorSSLAttributes");
		VroPluginFactory.modelMap.put("GCPTWOARMMODE", "GCPTwoArmMode");
		VroPluginFactory.modelMap.put("HTTPSERVERRESELECT", "HTTPServerReselect");
		VroPluginFactory.modelMap.put("PROTOCOLPARSERAPIRESPONSE", "ProtocolParserApiResponse");
		VroPluginFactory.modelMap.put("ALERTRULEMETRIC", "AlertRuleMetric");
		VroPluginFactory.modelMap.put("IMAGE", "Image");
		VroPluginFactory.modelMap.put("DEBUGSEDATAPLANE", "DebugSeDataplane");
		VroPluginFactory.modelMap.put("HTTPHDRDATA", "HTTPHdrData");
		VroPluginFactory.modelMap.put("SSOPOLICYAPIRESPONSE", "SSOPolicyApiResponse");
		VroPluginFactory.modelMap.put("PINGACCESSAGENTAPIRESPONSE", "PingAccessAgentApiResponse");
		VroPluginFactory.modelMap.put("HOSTATTRIBUTES", "HostAttributes");
		VroPluginFactory.modelMap.put("VICONTROLLERVNICINFO", "VIControllerVnicInfo");
		VroPluginFactory.modelMap.put("DNSCONFIGURATION", "DNSConfiguration");
		VroPluginFactory.modelMap.put("MEMBERINTERFACE", "MemberInterface");
		VroPluginFactory.modelMap.put("LDAPAUTHSETTINGS", "LdapAuthSettings");
		VroPluginFactory.modelMap.put("UDPATTACKS", "UdpAttacks");
		VroPluginFactory.modelMap.put("ALERTRULEEVENT", "AlertRuleEvent");
		VroPluginFactory.modelMap.put("HTTPPOLICYSETAPIRESPONSE", "HTTPPolicySetApiResponse");
		VroPluginFactory.modelMap.put("CAPTUREIPC", "CaptureIPC");
		VroPluginFactory.modelMap.put("IPPERSISTENCEPROFILE", "IPPersistenceProfile");
		VroPluginFactory.modelMap.put("HTTPCOOKIEPERSISTENCEKEY", "HttpCookiePersistenceKey");
		VroPluginFactory.modelMap.put("AUTHTACACSPLUSATTRIBUTEVALUEPAIR", "AuthTacacsPlusAttributeValuePair");
		VroPluginFactory.modelMap.put("ANALYTICSPROFILE", "AnalyticsProfile");
		VroPluginFactory.modelMap.put("LINUXSERVERHOST", "LinuxServerHost");
		VroPluginFactory.modelMap.put("SERVERID", "ServerId");
		VroPluginFactory.modelMap.put("VLANINTERFACE", "VlanInterface");
		VroPluginFactory.modelMap.put("PROTOCOLPARSER", "ProtocolParser");
		VroPluginFactory.modelMap.put("HEALTHMONITOR", "HealthMonitor");
		VroPluginFactory.modelMap.put("IPALLOCINFO", "IpAllocInfo");
		VroPluginFactory.modelMap.put("DNSGEOLOCATIONMATCH", "DnsGeoLocationMatch");
		VroPluginFactory.modelMap.put("VISEVMIPCONFPARAMS", "VISeVmIpConfParams");
		VroPluginFactory.modelMap.put("ANALYTICSPROFILEAPIRESPONSE", "AnalyticsProfileApiResponse");
		VroPluginFactory.modelMap.put("VICREATESEREQ", "VICreateSEReq");
		VroPluginFactory.modelMap.put("NATMATCHTARGET", "NatMatchTarget");
		VroPluginFactory.modelMap.put("GEOLOCATION", "GeoLocation");
		VroPluginFactory.modelMap.put("SECURECHANNELMAPPINGAPIRESPONSE", "SecureChannelMappingApiResponse");
		VroPluginFactory.modelMap.put("STREAMINGSYSLOGCONFIG", "StreamingSyslogConfig");
		VroPluginFactory.modelMap.put("VIMGRNWRUNTIMEAPIRESPONSE", "VIMgrNWRuntimeApiResponse");
		VroPluginFactory.modelMap.put("LIF", "Lif");
		VroPluginFactory.modelMap.put("ALERTCONFIGAPIRESPONSE", "AlertConfigApiResponse");
		VroPluginFactory.modelMap.put("WAFPSMRULE", "WafPSMRule");
		VroPluginFactory.modelMap.put("AWSZONECONFIG", "AwsZoneConfig");
		VroPluginFactory.modelMap.put("CUSTOMIPAMDNSPROFILEAPIRESPONSE", "CustomIpamDnsProfileApiResponse");
		VroPluginFactory.modelMap.put("SEPROPERTIES", "SeProperties");
		VroPluginFactory.modelMap.put("DNSPOLICY", "DnsPolicy");
		VroPluginFactory.modelMap.put("ALBSERVICESCONFIG", "ALBServicesConfig");
		VroPluginFactory.modelMap.put("STRINGMATCH", "StringMatch");
		VroPluginFactory.modelMap.put("DNSMXRDATA", "DnsMxRdata");
		VroPluginFactory.modelMap.put("CLOUDFLAVOR", "CloudFlavor");
		VroPluginFactory.modelMap.put("SYSTESTEMAILPARAMS", "SysTestEmailParams");
		VroPluginFactory.modelMap.put("HEALTHMONITORDNS", "HealthMonitorDNS");
		VroPluginFactory.modelMap.put("SERUNTIMECOMPRESSIONPROPERTIES", "SeRuntimeCompressionProperties");
		VroPluginFactory.modelMap.put("NTPAUTHENTICATIONKEY", "NTPAuthenticationKey");
		VroPluginFactory.modelMap.put("SYSTEMCONFIGURATION", "SystemConfiguration");
		VroPluginFactory.modelMap.put("CONTROLLERSITE", "ControllerSite");
		VroPluginFactory.modelMap.put("SEMGRDEBUGFILTER", "SeMgrDebugFilter");
		VroPluginFactory.modelMap.put("DNSARDATA", "DnsARdata");
		VroPluginFactory.modelMap.put("DOSTHRESHOLD", "DosThreshold");
		VroPluginFactory.modelMap.put("VSVIP", "VsVip");
		VroPluginFactory.modelMap.put("PATHMATCH", "PathMatch");
		VroPluginFactory.modelMap.put("WEBHOOKAPIRESPONSE", "WebhookApiResponse");
		VroPluginFactory.modelMap.put("OBJECTACCESSMATCHTARGET", "ObjectAccessMatchTarget");
		VroPluginFactory.modelMap.put("SCPOOLSERVERSTATEINFO", "SCPoolServerStateInfo");
		VroPluginFactory.modelMap.put("PROPERTY", "Property");
		VroPluginFactory.modelMap.put("GATEWAYMONITOR", "GatewayMonitor");
		VroPluginFactory.modelMap.put("SEFAULTINJECTEXHAUSTPARAM", "SEFaultInjectExhaustParam");
		VroPluginFactory.modelMap.put("CONTROLLERLICENSEAPIRESPONSE", "ControllerLicenseApiResponse");
		VroPluginFactory.modelMap.put("CLUSTER", "Cluster");
		VroPluginFactory.modelMap.put("NETWORKRUNTIMEAPIRESPONSE", "NetworkRuntimeApiResponse");
		VroPluginFactory.modelMap.put("DNSQUERYTYPEMATCH", "DnsQueryTypeMatch");
		VroPluginFactory.modelMap.put("HTTPHDRACTION", "HTTPHdrAction");
		VroPluginFactory.modelMap.put("APPCOOKIEPERSISTENCEPROFILE", "AppCookiePersistenceProfile");
		VroPluginFactory.modelMap.put("SSOPOLICY", "SSOPolicy");
		VroPluginFactory.modelMap.put("GSLBSERVICE", "GslbService");
		VroPluginFactory.modelMap.put("ALERTOBJECTLIST", "AlertObjectList");
		VroPluginFactory.modelMap.put("IMAGEAPIRESPONSE", "ImageApiResponse");
		VroPluginFactory.modelMap.put("IPAMDNSOPENSTACKPROFILE", "IpamDnsOpenstackProfile");
		VroPluginFactory.modelMap.put("VIMGRGUESTNICRUNTIME", "VIMgrGuestNicRuntime");
		VroPluginFactory.modelMap.put("VLANRANGE", "VlanRange");
		VroPluginFactory.modelMap.put("DNSZONE", "DnsZone");
		VroPluginFactory.modelMap.put("HDRMATCH", "HdrMatch");
		VroPluginFactory.modelMap.put("APPLEARNINGPARAMS", "AppLearningParams");
		VroPluginFactory.modelMap.put("TRAFFICCLONEPROFILEAPIRESPONSE", "TrafficCloneProfileApiResponse");
		VroPluginFactory.modelMap.put("GSLBPOOLMEMBER", "GslbPoolMember");
		VroPluginFactory.modelMap.put("DEBUGVIRTUALSERVICECAPTURE", "DebugVirtualServiceCapture");
		VroPluginFactory.modelMap.put("POOLGROUPMEMBER", "PoolGroupMember");
		VroPluginFactory.modelMap.put("NSXCONFIGURATION", "NsxConfiguration");
		VroPluginFactory.modelMap.put("MICROSERVICEAPIRESPONSE", "MicroServiceApiResponse");
		VroPluginFactory.modelMap.put("PODTOLERATION", "PodToleration");
		VroPluginFactory.modelMap.put("MESOSMETRICSDEBUGFILTER", "MesosMetricsDebugFilter");
		VroPluginFactory.modelMap.put("SCHEDULERAPIRESPONSE", "SchedulerApiResponse");
		VroPluginFactory.modelMap.put("VCENTERDATASTORE", "VcenterDatastore");
		VroPluginFactory.modelMap.put("SERATELIMITERS", "SeRateLimiters");
		VroPluginFactory.modelMap.put("WAFCRS", "WafCRS");
		VroPluginFactory.modelMap.put("APPLICATIONPROFILE", "ApplicationProfile");
		VroPluginFactory.modelMap.put("HSMTHALESRFS", "HSMThalesRFS");
		VroPluginFactory.modelMap.put("ALERTSYSLOGSERVER", "AlertSyslogServer");
		VroPluginFactory.modelMap.put("IPADDRGROUP", "IpAddrGroup");
		VroPluginFactory.modelMap.put("OPENSTACKLOGIN", "OpenstackLogin");
		VroPluginFactory.modelMap.put("WAFPSMLOCATIONMATCH", "WafPSMLocationMatch");
		VroPluginFactory.modelMap.put("WAFRULEGROUP", "WafRuleGroup");
		VroPluginFactory.modelMap.put("GCPVIPROUTES", "GCPVIPRoutes");
		VroPluginFactory.modelMap.put("NETWORKSERVICE", "NetworkService");
		VroPluginFactory.modelMap.put("CONTROLLERPROPERTIESAPIRESPONSE", "ControllerPropertiesApiResponse");
		VroPluginFactory.modelMap.put("SIPSERVICEAPPLICATIONPROFILE", "SipServiceApplicationProfile");
		VroPluginFactory.modelMap.put("ALBSERVICESFILEUPLOADAPIRESPONSE", "ALBServicesFileUploadApiResponse");
		VroPluginFactory.modelMap.put("FILEOBJECT", "FileObject");
		VroPluginFactory.modelMap.put("CONTROLLERPROPERTIES", "ControllerProperties");
		VroPluginFactory.modelMap.put("DNSTXTRDATA", "DnsTxtRdata");
		VroPluginFactory.modelMap.put("VIMGRCLUSTERRUNTIMEAPIRESPONSE", "VIMgrClusterRuntimeApiResponse");
		VroPluginFactory.modelMap.put("IPADDRRANGE", "IpAddrRange");
		VroPluginFactory.modelMap.put("ALBSERVICESACCOUNTUSER", "ALBServicesAccountUser");
		VroPluginFactory.modelMap.put("IPAMDNSAWSPROFILE", "IpamDnsAwsProfile");
		VroPluginFactory.modelMap.put("ERRORPAGEPROFILE", "ErrorPageProfile");
		VroPluginFactory.modelMap.put("CLOUDRUNTIME", "CloudRuntime");
		VroPluginFactory.modelMap.put("PERSISTENCEFILTER", "PersistenceFilter");
		VroPluginFactory.modelMap.put("DNSRULEACTIONRESPONSE", "DnsRuleActionResponse");
		VroPluginFactory.modelMap.put("WAFDATAFILE", "WafDataFile");
		VroPluginFactory.modelMap.put("VISETVNICNWREQ", "VISetvNicNwReq");
		VroPluginFactory.modelMap.put("RATELIMITERPROPERTIES", "RateLimiterProperties");
		VroPluginFactory.modelMap.put("HYPERVISORPROPERTIES", "HypervisorProperties");
		VroPluginFactory.modelMap.put("FAILACTIONBACKUPPOOL", "FailActionBackupPool");
		VroPluginFactory.modelMap.put("SCSERVERSTATEINFO", "SCServerStateInfo");
		VroPluginFactory.modelMap.put("VIDELETENETWORKFILTER", "VIDeleteNetworkFilter");
		VroPluginFactory.modelMap.put("AZURENETWORKINFO", "AzureNetworkInfo");
		VroPluginFactory.modelMap.put("HTTPCLIENTAUTHENTICATIONPARAMS", "HTTPClientAuthenticationParams");
		VroPluginFactory.modelMap.put("VIMGRDCRUNTIME", "VIMgrDCRuntime");
		VroPluginFactory.modelMap.put("IPAMDNSCUSTOMPROFILE", "IpamDnsCustomProfile");
		VroPluginFactory.modelMap.put("CCAGENTPROPERTIES", "CCAgentProperties");
		VroPluginFactory.modelMap.put("NETWORKFILTER", "NetworkFilter");
		VroPluginFactory.modelMap.put("ALERTMGRDEBUGFILTER", "AlertMgrDebugFilter");
		VroPluginFactory.modelMap.put("VSSCALEOUTPARAMS", "VsScaleoutParams");
		VroPluginFactory.modelMap.put("SSLPROFILESELECTOR", "SSLProfileSelector");
		VroPluginFactory.modelMap.put("METHODMATCH", "MethodMatch");
		VroPluginFactory.modelMap.put("NTPCONFIGURATION", "NTPConfiguration");
		VroPluginFactory.modelMap.put("OBJECTACCESSPOLICYAPIRESPONSE", "ObjectAccessPolicyApiResponse");
		VroPluginFactory.modelMap.put("MGMTIPACCESSCONTROL", "MgmtIpAccessControl");
		VroPluginFactory.modelMap.put("TCPPROXYPROFILE", "TCPProxyProfile");
		VroPluginFactory.modelMap.put("CLOUDPROPERTIES", "CloudProperties");
		VroPluginFactory.modelMap.put("HTTPREWRITEURLACTION", "HTTPRewriteURLAction");
		VroPluginFactory.modelMap.put("METRICSAPISRVDEBUGFILTER", "MetricsApiSrvDebugFilter");
		VroPluginFactory.modelMap.put("GSLBHEALTHMONITORPROXY", "GslbHealthMonitorProxy");
		VroPluginFactory.modelMap.put("HEALTHMONITORHTTP", "HealthMonitorHttp");
		VroPluginFactory.modelMap.put("AUTHATTRIBUTEMATCH", "AuthAttributeMatch");
		VroPluginFactory.modelMap.put("IPTABLERULE", "IptableRule");
		VroPluginFactory.modelMap.put("SERVICEMATCH", "ServiceMatch");
		VroPluginFactory.modelMap.put("LOCATIONHDRMATCH", "LocationHdrMatch");
		VroPluginFactory.modelMap.put("DOCKERCONFIGURATION", "DockerConfiguration");
		VroPluginFactory.modelMap.put("DNSRULE", "DnsRule");
		VroPluginFactory.modelMap.put("SEFAULT", "SeFault");
		VroPluginFactory.modelMap.put("VIRTUALSERVICE", "VirtualService");
		VroPluginFactory.modelMap.put("DOCKERREGISTRY", "DockerRegistry");
		VroPluginFactory.modelMap.put("SERVER", "Server");
		VroPluginFactory.modelMap.put("VIMGRNWRUNTIME", "VIMgrNWRuntime");
		VroPluginFactory.modelMap.put("STRINGGROUPAPIRESPONSE", "StringGroupApiResponse");
		VroPluginFactory.modelMap.put("VNICNETWORK", "VNICNetwork");
		VroPluginFactory.modelMap.put("VIGUESTVNICIPADDR", "VIGuestvNicIPAddr");
		VroPluginFactory.modelMap.put("ROUTEINFO", "RouteInfo");
		VroPluginFactory.modelMap.put("HARDWARESECURITYMODULE", "HardwareSecurityModule");
		VroPluginFactory.modelMap.put("IPADDRGROUPAPIRESPONSE", "IpAddrGroupApiResponse");

	}

	@Override
	public Object find(InventoryRef ref) {
		String location = "com.vmware.avi.vro.model." + ref.getType();
		Class<?> cls;
		Object obj = null;
		try {
			cls = Class.forName(location);
			obj = cls.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			logger.debug("Exception : " + e.getMessage());
			throw new UnsupportedOperationException("Error in find..");
		}
		return obj;

	}

	@Override
	public QueryResult findAll(String type, String query) {
		return new QueryResult(getListOfAviVroClientList());
	}

	@Override
	public List<?> findChildrenInRootRelation(String type, String relationName) {
		throw new UnsupportedOperationException("findChildrenInRootRelation Not implemented.");
	}

	@Override
	public List<?> findChildrenInRelation(InventoryRef parent, String relationName) {
		throw new UnsupportedOperationException("findChildrenInRelation Not implemented.");
	}

	public static List<AviVroClient> getListOfAviVroClientList() {
		List<AviVroClient> listOfAviVroClient = new ArrayList<AviVroClient>(aviVroClientMap.values());
		return listOfAviVroClient;
	}

	/**
	 * This method return modelMap.
	 * 
	 * @return modelMap
	 */
	public static Map<String, String> getModelMap() {
		return modelMap;
	}

	/**
	 * This method return aviVroClientMap.
	 * 
	 * @return aviVroClientMap
	 */
	public static Map<String, AviVroClient> getListOfAviVroClientMap() {
		return aviVroClientMap;
	}

	/**
	 * This method will add Class names from the package into the modelMap.
	 * 
	 * @param packageName fully qualified package name
	 * @throws ClassNotFoundException
	 */
	public static void fetchClassNames(String packageName) {
		Class[] classes = null;
		try {
			classes = getClasses(packageName);
		} catch (IOException e) {

			logger.info("Unable to fetch class names : " + e.getMessage());
		}
		for (Class c : classes) {

			modelMap.put(c.getSimpleName().toUpperCase(), c.getSimpleName());

		}

	}

	/**
	 * Scans all classes accessible from the context class loader which belong to
	 * the given package and subpackages.
	 *
	 * @param packageName The base package
	 * @return The classes
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	private static Class[] getClasses(String packageName) throws IOException {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		assert classLoader != null;
		String path = packageName.replace('.', '/');
		Enumeration resources = classLoader.getResources(path);
		List<File> dirs = new ArrayList();
		while (resources.hasMoreElements()) {
			URL resource = (URL) resources.nextElement();
			dirs.add(new File(resource.getFile()));
		}
		ArrayList classes = new ArrayList();
		for (File directory : dirs) {
			classes.addAll(findClasses(directory, packageName));
		}
		return (Class[]) classes.toArray(new Class[classes.size()]);
	}

	/**
	 * Recursive method used to find all classes in a given directory and subdirs.
	 *
	 * @param directory   The base directory
	 * @param packageName The package name for classes found inside the base
	 *                    directory
	 * @return The classes
	 * @throws ClassNotFoundException
	 */
	private static List findClasses(File directory, String packageName) {
		List classes = new ArrayList();
		if (!directory.exists()) {
			return classes;
		}
		File[] files = directory.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				assert !file.getName().contains(".");
				classes.addAll(findClasses(file, packageName + "." + file.getName()));
			} else if (file.getName().endsWith(".class")) {
				try {
					classes.add(Class
							.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
				} catch (ClassNotFoundException e) {
					logger.debug("Exception : " + e.getMessage());
				}
			}
		}
		return classes;
	}

}