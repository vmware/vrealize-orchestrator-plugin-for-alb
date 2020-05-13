package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.AppLearningConfidenceOverride;
import com.vmware.avi.vro.model.AppLearningParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * WafConfig
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "WafConfig")
@VsoFinder(name = Constants.FINDER_VRO_WAFCONFIG, idAccessor = "getObjectID()")
@Service
public class WafConfig extends AviRestResource  {
  @JsonProperty("allowed_http_versions")
  @Valid
  private List<String> allowedHttpVersions = null;

  @JsonProperty("allowed_methods")
  @Valid
  private List<String> allowedMethods = null;

  @JsonProperty("allowed_request_content_types")
  @Valid
  private List<String> allowedRequestContentTypes = null;

  @JsonProperty("argument_separator")
  private String argumentSeparator = "&";

  @JsonProperty("buffer_response_body_for_inspection")
  private Boolean bufferResponseBodyForInspection = null;

  @JsonProperty("client_file_upload_max_body_size")
  private Integer clientFileUploadMaxBodySize = null;

  @JsonProperty("client_nonfile_upload_max_body_size")
  private Integer clientNonfileUploadMaxBodySize = null;

  @JsonProperty("client_request_max_body_size")
  private Integer clientRequestMaxBodySize = 32;

  @JsonProperty("confidence_override")
  private AppLearningConfidenceOverride confidenceOverride = null;

  @JsonProperty("cookie_format_version")
  private Integer cookieFormatVersion = null;

  @JsonProperty("enable_auto_rule_updates")
  private Boolean enableAutoRuleUpdates = true;

  @JsonProperty("enable_regex_learning")
  private Boolean enableRegexLearning = null;

  @JsonProperty("ignore_incomplete_request_body_error")
  private Boolean ignoreIncompleteRequestBodyError = true;

  @JsonProperty("learning_params")
  private AppLearningParams learningParams = null;

  @JsonProperty("max_execution_time")
  private Integer maxExecutionTime = 50;

  @JsonProperty("min_confidence")
  private String minConfidence = "CONFIDENCE_VERY_HIGH";

  @JsonProperty("regex_match_limit")
  private Integer regexMatchLimit = 30000;

  @JsonProperty("regex_recursion_limit")
  private Integer regexRecursionLimit = 10000;

  @JsonProperty("request_body_default_action")
  private String requestBodyDefaultAction = "phase:2,deny,status:403,log,auditlog";

  @JsonProperty("request_hdr_default_action")
  private String requestHdrDefaultAction = "phase:1,deny,status:403,log,auditlog";

  @JsonProperty("response_body_default_action")
  private String responseBodyDefaultAction = "phase:4,deny,status:403,log,auditlog";

  @JsonProperty("response_hdr_default_action")
  private String responseHdrDefaultAction = "phase:3,deny,status:403,log,auditlog";

  @JsonProperty("restricted_extensions")
  @Valid
  private List<String> restrictedExtensions = null;

  @JsonProperty("restricted_headers")
  @Valid
  private List<String> restrictedHeaders = null;

  @JsonProperty("server_response_max_body_size")
  private Integer serverResponseMaxBodySize = 128;

  @JsonProperty("static_extensions")
  @Valid
  private List<String> staticExtensions = null;

  @JsonProperty("status_code_for_rejected_requests")
  private String statusCodeForRejectedRequests = "HTTP_RESPONSE_CODE_403";

  @JsonProperty("xml_xxe_protection")
  private Boolean xmlXxeProtection = true;

  
  public WafConfig addAllowedHttpVersionsItem(String allowedHttpVersionsItem) {
    if (this.allowedHttpVersions == null) {
      this.allowedHttpVersions = new ArrayList<String>();
    }
    this.allowedHttpVersions.add(allowedHttpVersionsItem);
    return this;
  }
  
  /**
   * WAF allowed HTTP Versions. Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO. Field introduced in 17.2.1.
   * @return allowedHttpVersions
  **/
  @ApiModelProperty(value = "WAF allowed HTTP Versions. Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public List<String> getAllowedHttpVersions() {
    return allowedHttpVersions;
  }
    
  @VsoMethod
  public void setAllowedHttpVersions(List<String> allowedHttpVersions) {
    this.allowedHttpVersions = allowedHttpVersions;
  }

  
  public WafConfig addAllowedMethodsItem(String allowedMethodsItem) {
    if (this.allowedMethods == null) {
      this.allowedMethods = new ArrayList<String>();
    }
    this.allowedMethods.add(allowedMethodsItem);
    return this;
  }
  
  /**
   * WAF allowed HTTP methods. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 17.2.1.
   * @return allowedMethods
  **/
  @ApiModelProperty(value = "WAF allowed HTTP methods. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public List<String> getAllowedMethods() {
    return allowedMethods;
  }
    
  @VsoMethod
  public void setAllowedMethods(List<String> allowedMethods) {
    this.allowedMethods = allowedMethods;
  }

  
  public WafConfig addAllowedRequestContentTypesItem(String allowedRequestContentTypesItem) {
    if (this.allowedRequestContentTypes == null) {
      this.allowedRequestContentTypes = new ArrayList<String>();
    }
    this.allowedRequestContentTypes.add(allowedRequestContentTypesItem);
    return this;
  }
  
  /**
   * WAF allowed Content Types. Field introduced in 17.2.1.
   * @return allowedRequestContentTypes
  **/
  @ApiModelProperty(value = "WAF allowed Content Types. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public List<String> getAllowedRequestContentTypes() {
    return allowedRequestContentTypes;
  }
    
  @VsoMethod
  public void setAllowedRequestContentTypes(List<String> allowedRequestContentTypes) {
    this.allowedRequestContentTypes = allowedRequestContentTypes;
  }

  
  /**
   * Argument seperator. Field introduced in 17.2.1.
   * @return argumentSeparator
  **/
  @ApiModelProperty(value = "Argument seperator. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public String getArgumentSeparator() {
    return argumentSeparator;
  }
    
  @VsoMethod
  public void setArgumentSeparator(String argumentSeparator) {
    this.argumentSeparator = argumentSeparator;
  }

  
  /**
   * Enable to buffer response body for inspection. Field deprecated in 18.2.2. Field introduced in 17.2.3.
   * @return bufferResponseBodyForInspection
  **/
  @ApiModelProperty(value = "Enable to buffer response body for inspection. Field deprecated in 18.2.2. Field introduced in 17.2.3.")


 
  @VsoMethod  
  public Boolean isBufferResponseBodyForInspection() {
    return bufferResponseBodyForInspection;
  }
    
  @VsoMethod
  public void setBufferResponseBodyForInspection(Boolean bufferResponseBodyForInspection) {
    this.bufferResponseBodyForInspection = bufferResponseBodyForInspection;
  }

  
  /**
   * Maximum size for the client request body for file uploads. Allowed values are 1-32768. Field deprecated in 18.1.5. Field introduced in 17.2.1.
   * @return clientFileUploadMaxBodySize
  **/
  @ApiModelProperty(value = "Maximum size for the client request body for file uploads. Allowed values are 1-32768. Field deprecated in 18.1.5. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Integer getClientFileUploadMaxBodySize() {
    return clientFileUploadMaxBodySize;
  }
    
  @VsoMethod
  public void setClientFileUploadMaxBodySize(Integer clientFileUploadMaxBodySize) {
    this.clientFileUploadMaxBodySize = clientFileUploadMaxBodySize;
  }

  
  /**
   * Maximum size for the client request body for non-file uploads. Allowed values are 1-32768. Field deprecated in 18.1.5. Field introduced in 17.2.1.
   * @return clientNonfileUploadMaxBodySize
  **/
  @ApiModelProperty(value = "Maximum size for the client request body for non-file uploads. Allowed values are 1-32768. Field deprecated in 18.1.5. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Integer getClientNonfileUploadMaxBodySize() {
    return clientNonfileUploadMaxBodySize;
  }
    
  @VsoMethod
  public void setClientNonfileUploadMaxBodySize(Integer clientNonfileUploadMaxBodySize) {
    this.clientNonfileUploadMaxBodySize = clientNonfileUploadMaxBodySize;
  }

  
  /**
   * Maximum size for the client request body scanned by WAF. Allowed values are 1-32768. Field introduced in 18.1.5, 18.2.1.
   * @return clientRequestMaxBodySize
  **/
  @ApiModelProperty(value = "Maximum size for the client request body scanned by WAF. Allowed values are 1-32768. Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Integer getClientRequestMaxBodySize() {
    return clientRequestMaxBodySize;
  }
    
  @VsoMethod
  public void setClientRequestMaxBodySize(Integer clientRequestMaxBodySize) {
    this.clientRequestMaxBodySize = clientRequestMaxBodySize;
  }

  
  /**
   * Configure thresholds for confidence labels. Field introduced in 18.2.3.
   * @return confidenceOverride
  **/
  @ApiModelProperty(value = "Configure thresholds for confidence labels. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public AppLearningConfidenceOverride getConfidenceOverride() {
    return confidenceOverride;
  }
    
  @VsoMethod
  public void setConfidenceOverride(AppLearningConfidenceOverride confidenceOverride) {
    this.confidenceOverride = confidenceOverride;
  }

  
  /**
   * 0  For Netscape Cookies. 1  For version 1 cookies. Allowed values are 0-1. Field introduced in 17.2.1.
   * @return cookieFormatVersion
  **/
  @ApiModelProperty(value = "0  For Netscape Cookies. 1  For version 1 cookies. Allowed values are 0-1. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Integer getCookieFormatVersion() {
    return cookieFormatVersion;
  }
    
  @VsoMethod
  public void setCookieFormatVersion(Integer cookieFormatVersion) {
    this.cookieFormatVersion = cookieFormatVersion;
  }

  
  /**
   * Enable Application Learning based rule updates on the WAF Profile. Rules will be programmed in dedicated WAF learning group. Field introduced in 18.2.3.
   * @return enableAutoRuleUpdates
  **/
  @ApiModelProperty(value = "Enable Application Learning based rule updates on the WAF Profile. Rules will be programmed in dedicated WAF learning group. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public Boolean isEnableAutoRuleUpdates() {
    return enableAutoRuleUpdates;
  }
    
  @VsoMethod
  public void setEnableAutoRuleUpdates(Boolean enableAutoRuleUpdates) {
    this.enableAutoRuleUpdates = enableAutoRuleUpdates;
  }

  
  /**
   * Enable dynamic regex generation for positive security model rules. Field introduced in 20.1.1.
   * @return enableRegexLearning
  **/
  @ApiModelProperty(value = "Enable dynamic regex generation for positive security model rules. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isEnableRegexLearning() {
    return enableRegexLearning;
  }
    
  @VsoMethod
  public void setEnableRegexLearning(Boolean enableRegexLearning) {
    this.enableRegexLearning = enableRegexLearning;
  }

  
  /**
   * Ignore request body parsing errors due to partial scanning. Field introduced in 18.1.5, 18.2.1.
   * @return ignoreIncompleteRequestBodyError
  **/
  @ApiModelProperty(value = "Ignore request body parsing errors due to partial scanning. Field introduced in 18.1.5, 18.2.1.")


 
  @VsoMethod  
  public Boolean isIgnoreIncompleteRequestBodyError() {
    return ignoreIncompleteRequestBodyError;
  }
    
  @VsoMethod
  public void setIgnoreIncompleteRequestBodyError(Boolean ignoreIncompleteRequestBodyError) {
    this.ignoreIncompleteRequestBodyError = ignoreIncompleteRequestBodyError;
  }

  
  /**
   * Parameters for tuning Application learning. Field introduced in 18.2.3.
   * @return learningParams
  **/
  @ApiModelProperty(value = "Parameters for tuning Application learning. Field introduced in 18.2.3.")

  @Valid

 
  @VsoMethod  
  public AppLearningParams getLearningParams() {
    return learningParams;
  }
    
  @VsoMethod
  public void setLearningParams(AppLearningParams learningParams) {
    this.learningParams = learningParams;
  }

  
  /**
   * The maximum period of time WAF processing is allowed to take for a single request. A value of 0 (zero) means no limit and should not be chosen in production deployments. It is only used for exceptional situations where crashes of se_dp processes are acceptable. The behavior of the system if this time is exceeded depends on two other configuration settings, the WAF policy mode and the WAF failure mode. In WAF policy mode 'Detection', the request is allowed and flagged for both failure mode 'Closed' and 'Open'. In enforcement node, 'Closed' means the request is rejected, 'Open' means the request is allowed and flagged. Irrespective of these settings, no subsequent WAF rules of this or other phases will be executed once the maximum execution time has been exceeded. Allowed values are 0-5000. Field introduced in 17.2.12, 18.1.2.
   * @return maxExecutionTime
  **/
  @ApiModelProperty(value = "The maximum period of time WAF processing is allowed to take for a single request. A value of 0 (zero) means no limit and should not be chosen in production deployments. It is only used for exceptional situations where crashes of se_dp processes are acceptable. The behavior of the system if this time is exceeded depends on two other configuration settings, the WAF policy mode and the WAF failure mode. In WAF policy mode 'Detection', the request is allowed and flagged for both failure mode 'Closed' and 'Open'. In enforcement node, 'Closed' means the request is rejected, 'Open' means the request is allowed and flagged. Irrespective of these settings, no subsequent WAF rules of this or other phases will be executed once the maximum execution time has been exceeded. Allowed values are 0-5000. Field introduced in 17.2.12, 18.1.2.")


 
  @VsoMethod  
  public Integer getMaxExecutionTime() {
    return maxExecutionTime;
  }
    
  @VsoMethod
  public void setMaxExecutionTime(Integer maxExecutionTime) {
    this.maxExecutionTime = maxExecutionTime;
  }

  
  /**
   * Minimum confidence label required for auto rule updates. Enum options - CONFIDENCE_VERY_HIGH, CONFIDENCE_HIGH, CONFIDENCE_PROBABLE, CONFIDENCE_LOW, CONFIDENCE_NONE. Field introduced in 18.2.3.
   * @return minConfidence
  **/
  @ApiModelProperty(value = "Minimum confidence label required for auto rule updates. Enum options - CONFIDENCE_VERY_HIGH, CONFIDENCE_HIGH, CONFIDENCE_PROBABLE, CONFIDENCE_LOW, CONFIDENCE_NONE. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getMinConfidence() {
    return minConfidence;
  }
    
  @VsoMethod
  public void setMinConfidence(String minConfidence) {
    this.minConfidence = minConfidence;
  }

  
  /**
   * Limit CPU utilization for each regular expression match when processing rules. Field introduced in 17.2.5.
   * @return regexMatchLimit
  **/
  @ApiModelProperty(value = "Limit CPU utilization for each regular expression match when processing rules. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public Integer getRegexMatchLimit() {
    return regexMatchLimit;
  }
    
  @VsoMethod
  public void setRegexMatchLimit(Integer regexMatchLimit) {
    this.regexMatchLimit = regexMatchLimit;
  }

  
  /**
   * Limit depth of recursion for each regular expression match when processing rules. Field introduced in 20.1.1.
   * @return regexRecursionLimit
  **/
  @ApiModelProperty(value = "Limit depth of recursion for each regular expression match when processing rules. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Integer getRegexRecursionLimit() {
    return regexRecursionLimit;
  }
    
  @VsoMethod
  public void setRegexRecursionLimit(Integer regexRecursionLimit) {
    this.regexRecursionLimit = regexRecursionLimit;
  }

  
  /**
   * WAF default action for Request Body Phase. Field introduced in 17.2.1.
   * @return requestBodyDefaultAction
  **/
  @ApiModelProperty(required = true, value = "WAF default action for Request Body Phase. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getRequestBodyDefaultAction() {
    return requestBodyDefaultAction;
  }
    
  @VsoMethod
  public void setRequestBodyDefaultAction(String requestBodyDefaultAction) {
    this.requestBodyDefaultAction = requestBodyDefaultAction;
  }

  
  /**
   * WAF default action for Request Header Phase. Field introduced in 17.2.1.
   * @return requestHdrDefaultAction
  **/
  @ApiModelProperty(required = true, value = "WAF default action for Request Header Phase. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getRequestHdrDefaultAction() {
    return requestHdrDefaultAction;
  }
    
  @VsoMethod
  public void setRequestHdrDefaultAction(String requestHdrDefaultAction) {
    this.requestHdrDefaultAction = requestHdrDefaultAction;
  }

  
  /**
   * WAF default action for Response Body Phase. Field introduced in 17.2.1.
   * @return responseBodyDefaultAction
  **/
  @ApiModelProperty(required = true, value = "WAF default action for Response Body Phase. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getResponseBodyDefaultAction() {
    return responseBodyDefaultAction;
  }
    
  @VsoMethod
  public void setResponseBodyDefaultAction(String responseBodyDefaultAction) {
    this.responseBodyDefaultAction = responseBodyDefaultAction;
  }

  
  /**
   * WAF default action for Response Header Phase. Field introduced in 17.2.1.
   * @return responseHdrDefaultAction
  **/
  @ApiModelProperty(required = true, value = "WAF default action for Response Header Phase. Field introduced in 17.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getResponseHdrDefaultAction() {
    return responseHdrDefaultAction;
  }
    
  @VsoMethod
  public void setResponseHdrDefaultAction(String responseHdrDefaultAction) {
    this.responseHdrDefaultAction = responseHdrDefaultAction;
  }

  
  public WafConfig addRestrictedExtensionsItem(String restrictedExtensionsItem) {
    if (this.restrictedExtensions == null) {
      this.restrictedExtensions = new ArrayList<String>();
    }
    this.restrictedExtensions.add(restrictedExtensionsItem);
    return this;
  }
  
  /**
   * WAF Restricted File Extensions. Field introduced in 17.2.1.
   * @return restrictedExtensions
  **/
  @ApiModelProperty(value = "WAF Restricted File Extensions. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public List<String> getRestrictedExtensions() {
    return restrictedExtensions;
  }
    
  @VsoMethod
  public void setRestrictedExtensions(List<String> restrictedExtensions) {
    this.restrictedExtensions = restrictedExtensions;
  }

  
  public WafConfig addRestrictedHeadersItem(String restrictedHeadersItem) {
    if (this.restrictedHeaders == null) {
      this.restrictedHeaders = new ArrayList<String>();
    }
    this.restrictedHeaders.add(restrictedHeadersItem);
    return this;
  }
  
  /**
   * WAF Restricted HTTP Headers. Field introduced in 17.2.1.
   * @return restrictedHeaders
  **/
  @ApiModelProperty(value = "WAF Restricted HTTP Headers. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public List<String> getRestrictedHeaders() {
    return restrictedHeaders;
  }
    
  @VsoMethod
  public void setRestrictedHeaders(List<String> restrictedHeaders) {
    this.restrictedHeaders = restrictedHeaders;
  }

  
  /**
   * Maximum size for response body scanned by WAF. Allowed values are 1-32768. Field introduced in 17.2.1.
   * @return serverResponseMaxBodySize
  **/
  @ApiModelProperty(value = "Maximum size for response body scanned by WAF. Allowed values are 1-32768. Field introduced in 17.2.1.")


 
  @VsoMethod  
  public Integer getServerResponseMaxBodySize() {
    return serverResponseMaxBodySize;
  }
    
  @VsoMethod
  public void setServerResponseMaxBodySize(Integer serverResponseMaxBodySize) {
    this.serverResponseMaxBodySize = serverResponseMaxBodySize;
  }

  
  public WafConfig addStaticExtensionsItem(String staticExtensionsItem) {
    if (this.staticExtensions == null) {
      this.staticExtensions = new ArrayList<String>();
    }
    this.staticExtensions.add(staticExtensionsItem);
    return this;
  }
  
  /**
   * WAF Static File Extensions. GET and HEAD requests with no query args and one of these extensions are whitelisted and not checked by the ruleset. Field introduced in 17.2.5.
   * @return staticExtensions
  **/
  @ApiModelProperty(value = "WAF Static File Extensions. GET and HEAD requests with no query args and one of these extensions are whitelisted and not checked by the ruleset. Field introduced in 17.2.5.")


 
  @VsoMethod  
  public List<String> getStaticExtensions() {
    return staticExtensions;
  }
    
  @VsoMethod
  public void setStaticExtensions(List<String> staticExtensions) {
    this.staticExtensions = staticExtensions;
  }

  
  /**
   * HTTP status code used by WAF Positive Security Model when rejecting a request. Enum options - HTTP_RESPONSE_CODE_0, HTTP_RESPONSE_CODE_100, HTTP_RESPONSE_CODE_101, HTTP_RESPONSE_CODE_200, HTTP_RESPONSE_CODE_201, HTTP_RESPONSE_CODE_202, HTTP_RESPONSE_CODE_203, HTTP_RESPONSE_CODE_204, HTTP_RESPONSE_CODE_205, HTTP_RESPONSE_CODE_206, HTTP_RESPONSE_CODE_300, HTTP_RESPONSE_CODE_301, HTTP_RESPONSE_CODE_302, HTTP_RESPONSE_CODE_303, HTTP_RESPONSE_CODE_304, HTTP_RESPONSE_CODE_305, HTTP_RESPONSE_CODE_307, HTTP_RESPONSE_CODE_400, HTTP_RESPONSE_CODE_401, HTTP_RESPONSE_CODE_402, HTTP_RESPONSE_CODE_403, HTTP_RESPONSE_CODE_404, HTTP_RESPONSE_CODE_405, HTTP_RESPONSE_CODE_406, HTTP_RESPONSE_CODE_407, HTTP_RESPONSE_CODE_408, HTTP_RESPONSE_CODE_409, HTTP_RESPONSE_CODE_410, HTTP_RESPONSE_CODE_411, HTTP_RESPONSE_CODE_412, HTTP_RESPONSE_CODE_413, HTTP_RESPONSE_CODE_414, HTTP_RESPONSE_CODE_415, HTTP_RESPONSE_CODE_416, HTTP_RESPONSE_CODE_417, HTTP_RESPONSE_CODE_426, HTTP_RESPONSE_CODE_470, HTTP_RESPONSE_CODE_475, HTTP_RESPONSE_CODE_500, HTTP_RESPONSE_CODE_501, HTTP_RESPONSE_CODE_502, HTTP_RESPONSE_CODE_503, HTTP_RESPONSE_CODE_504, HTTP_RESPONSE_CODE_505. Field introduced in 18.2.3.
   * @return statusCodeForRejectedRequests
  **/
  @ApiModelProperty(value = "HTTP status code used by WAF Positive Security Model when rejecting a request. Enum options - HTTP_RESPONSE_CODE_0, HTTP_RESPONSE_CODE_100, HTTP_RESPONSE_CODE_101, HTTP_RESPONSE_CODE_200, HTTP_RESPONSE_CODE_201, HTTP_RESPONSE_CODE_202, HTTP_RESPONSE_CODE_203, HTTP_RESPONSE_CODE_204, HTTP_RESPONSE_CODE_205, HTTP_RESPONSE_CODE_206, HTTP_RESPONSE_CODE_300, HTTP_RESPONSE_CODE_301, HTTP_RESPONSE_CODE_302, HTTP_RESPONSE_CODE_303, HTTP_RESPONSE_CODE_304, HTTP_RESPONSE_CODE_305, HTTP_RESPONSE_CODE_307, HTTP_RESPONSE_CODE_400, HTTP_RESPONSE_CODE_401, HTTP_RESPONSE_CODE_402, HTTP_RESPONSE_CODE_403, HTTP_RESPONSE_CODE_404, HTTP_RESPONSE_CODE_405, HTTP_RESPONSE_CODE_406, HTTP_RESPONSE_CODE_407, HTTP_RESPONSE_CODE_408, HTTP_RESPONSE_CODE_409, HTTP_RESPONSE_CODE_410, HTTP_RESPONSE_CODE_411, HTTP_RESPONSE_CODE_412, HTTP_RESPONSE_CODE_413, HTTP_RESPONSE_CODE_414, HTTP_RESPONSE_CODE_415, HTTP_RESPONSE_CODE_416, HTTP_RESPONSE_CODE_417, HTTP_RESPONSE_CODE_426, HTTP_RESPONSE_CODE_470, HTTP_RESPONSE_CODE_475, HTTP_RESPONSE_CODE_500, HTTP_RESPONSE_CODE_501, HTTP_RESPONSE_CODE_502, HTTP_RESPONSE_CODE_503, HTTP_RESPONSE_CODE_504, HTTP_RESPONSE_CODE_505. Field introduced in 18.2.3.")


 
  @VsoMethod  
  public String getStatusCodeForRejectedRequests() {
    return statusCodeForRejectedRequests;
  }
    
  @VsoMethod
  public void setStatusCodeForRejectedRequests(String statusCodeForRejectedRequests) {
    this.statusCodeForRejectedRequests = statusCodeForRejectedRequests;
  }

  
  /**
   * Block or flag XML requests referring to External Entities. Field introduced in 20.1.1.
   * @return xmlXxeProtection
  **/
  @ApiModelProperty(value = "Block or flag XML requests referring to External Entities. Field introduced in 20.1.1.")


 
  @VsoMethod  
  public Boolean isXmlXxeProtection() {
    return xmlXxeProtection;
  }
    
  @VsoMethod
  public void setXmlXxeProtection(Boolean xmlXxeProtection) {
    this.xmlXxeProtection = xmlXxeProtection;
  }

  
  public String getObjectID() {
		return "WafConfig";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WafConfig wafConfig = (WafConfig) o;
    return Objects.equals(this.allowedHttpVersions, wafConfig.allowedHttpVersions) &&
        Objects.equals(this.allowedMethods, wafConfig.allowedMethods) &&
        Objects.equals(this.allowedRequestContentTypes, wafConfig.allowedRequestContentTypes) &&
        Objects.equals(this.argumentSeparator, wafConfig.argumentSeparator) &&
        Objects.equals(this.bufferResponseBodyForInspection, wafConfig.bufferResponseBodyForInspection) &&
        Objects.equals(this.clientFileUploadMaxBodySize, wafConfig.clientFileUploadMaxBodySize) &&
        Objects.equals(this.clientNonfileUploadMaxBodySize, wafConfig.clientNonfileUploadMaxBodySize) &&
        Objects.equals(this.clientRequestMaxBodySize, wafConfig.clientRequestMaxBodySize) &&
        Objects.equals(this.confidenceOverride, wafConfig.confidenceOverride) &&
        Objects.equals(this.cookieFormatVersion, wafConfig.cookieFormatVersion) &&
        Objects.equals(this.enableAutoRuleUpdates, wafConfig.enableAutoRuleUpdates) &&
        Objects.equals(this.enableRegexLearning, wafConfig.enableRegexLearning) &&
        Objects.equals(this.ignoreIncompleteRequestBodyError, wafConfig.ignoreIncompleteRequestBodyError) &&
        Objects.equals(this.learningParams, wafConfig.learningParams) &&
        Objects.equals(this.maxExecutionTime, wafConfig.maxExecutionTime) &&
        Objects.equals(this.minConfidence, wafConfig.minConfidence) &&
        Objects.equals(this.regexMatchLimit, wafConfig.regexMatchLimit) &&
        Objects.equals(this.regexRecursionLimit, wafConfig.regexRecursionLimit) &&
        Objects.equals(this.requestBodyDefaultAction, wafConfig.requestBodyDefaultAction) &&
        Objects.equals(this.requestHdrDefaultAction, wafConfig.requestHdrDefaultAction) &&
        Objects.equals(this.responseBodyDefaultAction, wafConfig.responseBodyDefaultAction) &&
        Objects.equals(this.responseHdrDefaultAction, wafConfig.responseHdrDefaultAction) &&
        Objects.equals(this.restrictedExtensions, wafConfig.restrictedExtensions) &&
        Objects.equals(this.restrictedHeaders, wafConfig.restrictedHeaders) &&
        Objects.equals(this.serverResponseMaxBodySize, wafConfig.serverResponseMaxBodySize) &&
        Objects.equals(this.staticExtensions, wafConfig.staticExtensions) &&
        Objects.equals(this.statusCodeForRejectedRequests, wafConfig.statusCodeForRejectedRequests) &&
        Objects.equals(this.xmlXxeProtection, wafConfig.xmlXxeProtection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedHttpVersions, allowedMethods, allowedRequestContentTypes, argumentSeparator, bufferResponseBodyForInspection, clientFileUploadMaxBodySize, clientNonfileUploadMaxBodySize, clientRequestMaxBodySize, confidenceOverride, cookieFormatVersion, enableAutoRuleUpdates, enableRegexLearning, ignoreIncompleteRequestBodyError, learningParams, maxExecutionTime, minConfidence, regexMatchLimit, regexRecursionLimit, requestBodyDefaultAction, requestHdrDefaultAction, responseBodyDefaultAction, responseHdrDefaultAction, restrictedExtensions, restrictedHeaders, serverResponseMaxBodySize, staticExtensions, statusCodeForRejectedRequests, xmlXxeProtection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WafConfig {\n");
    
    sb.append("    allowedHttpVersions: ").append(toIndentedString(allowedHttpVersions)).append("\n");
    sb.append("    allowedMethods: ").append(toIndentedString(allowedMethods)).append("\n");
    sb.append("    allowedRequestContentTypes: ").append(toIndentedString(allowedRequestContentTypes)).append("\n");
    sb.append("    argumentSeparator: ").append(toIndentedString(argumentSeparator)).append("\n");
    sb.append("    bufferResponseBodyForInspection: ").append(toIndentedString(bufferResponseBodyForInspection)).append("\n");
    sb.append("    clientFileUploadMaxBodySize: ").append(toIndentedString(clientFileUploadMaxBodySize)).append("\n");
    sb.append("    clientNonfileUploadMaxBodySize: ").append(toIndentedString(clientNonfileUploadMaxBodySize)).append("\n");
    sb.append("    clientRequestMaxBodySize: ").append(toIndentedString(clientRequestMaxBodySize)).append("\n");
    sb.append("    confidenceOverride: ").append(toIndentedString(confidenceOverride)).append("\n");
    sb.append("    cookieFormatVersion: ").append(toIndentedString(cookieFormatVersion)).append("\n");
    sb.append("    enableAutoRuleUpdates: ").append(toIndentedString(enableAutoRuleUpdates)).append("\n");
    sb.append("    enableRegexLearning: ").append(toIndentedString(enableRegexLearning)).append("\n");
    sb.append("    ignoreIncompleteRequestBodyError: ").append(toIndentedString(ignoreIncompleteRequestBodyError)).append("\n");
    sb.append("    learningParams: ").append(toIndentedString(learningParams)).append("\n");
    sb.append("    maxExecutionTime: ").append(toIndentedString(maxExecutionTime)).append("\n");
    sb.append("    minConfidence: ").append(toIndentedString(minConfidence)).append("\n");
    sb.append("    regexMatchLimit: ").append(toIndentedString(regexMatchLimit)).append("\n");
    sb.append("    regexRecursionLimit: ").append(toIndentedString(regexRecursionLimit)).append("\n");
    sb.append("    requestBodyDefaultAction: ").append(toIndentedString(requestBodyDefaultAction)).append("\n");
    sb.append("    requestHdrDefaultAction: ").append(toIndentedString(requestHdrDefaultAction)).append("\n");
    sb.append("    responseBodyDefaultAction: ").append(toIndentedString(responseBodyDefaultAction)).append("\n");
    sb.append("    responseHdrDefaultAction: ").append(toIndentedString(responseHdrDefaultAction)).append("\n");
    sb.append("    restrictedExtensions: ").append(toIndentedString(restrictedExtensions)).append("\n");
    sb.append("    restrictedHeaders: ").append(toIndentedString(restrictedHeaders)).append("\n");
    sb.append("    serverResponseMaxBodySize: ").append(toIndentedString(serverResponseMaxBodySize)).append("\n");
    sb.append("    staticExtensions: ").append(toIndentedString(staticExtensions)).append("\n");
    sb.append("    statusCodeForRejectedRequests: ").append(toIndentedString(statusCodeForRejectedRequests)).append("\n");
    sb.append("    xmlXxeProtection: ").append(toIndentedString(xmlXxeProtection)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

