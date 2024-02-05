package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.BotClassMatcher;
import com.vmware.avi.vro.model.IpAddrMatch;
import com.vmware.avi.vro.model.HostHdrMatch;
import com.vmware.avi.vro.model.StringMatch;
import com.vmware.avi.vro.model.MethodMatch;
import com.vmware.avi.vro.model.PathMatch;
import com.vmware.avi.vro.model.BotTypeMatcher;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The BotMappingRuleMatchTarget is a POJO class extends AviRestResource that used for creating
 * BotMappingRuleMatchTarget.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "BotMappingRuleMatchTarget")
@VsoFinder(name = Constants.FINDER_VRO_BOTMAPPINGRULEMATCHTARGET)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class BotMappingRuleMatchTarget extends AviRestResource {
    @JsonProperty("class_matcher")
    @JsonInclude(Include.NON_NULL)
    private BotClassMatcher classMatcher;

    @JsonProperty("client_ip")
    @JsonInclude(Include.NON_NULL)
    private IpAddrMatch clientIp;

    @JsonProperty("component_matcher")
    @JsonInclude(Include.NON_NULL)
    private String componentMatcher;

    @JsonProperty("hdrs")
    @JsonInclude(Include.NON_NULL)
    private List<HdrMatch> hdrs;

    @JsonProperty("host_hdr")
    @JsonInclude(Include.NON_NULL)
    private HostHdrMatch hostHdr;

    @JsonProperty("identifier_matcher")
    @JsonInclude(Include.NON_NULL)
    private StringMatch identifierMatcher;

    @JsonProperty("method")
    @JsonInclude(Include.NON_NULL)
    private MethodMatch method;

    @JsonProperty("path")
    @JsonInclude(Include.NON_NULL)
    private PathMatch path;

    @JsonProperty("type_matcher")
    @JsonInclude(Include.NON_NULL)
    private BotTypeMatcher typeMatcher;



  /**
   * This is the getter method this will return the attribute value.
   * How to match the botclientclass.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return classMatcher
   */
  @VsoMethod
  public BotClassMatcher getClassMatcher() {
    return classMatcher;
  }

  /**
   * This is the setter method to the attribute.
   * How to match the botclientclass.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param classMatcher set the classMatcher.
   */
  @VsoMethod
  public void setClassMatcher(BotClassMatcher classMatcher) {
    this.classMatcher = classMatcher;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure client ip addresses.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return clientIp
   */
  @VsoMethod
  public IpAddrMatch getClientIp() {
    return clientIp;
  }

  /**
   * This is the setter method to the attribute.
   * Configure client ip addresses.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param clientIp set the clientIp.
   */
  @VsoMethod
  public void setClientIp(IpAddrMatch clientIp) {
    this.clientIp = clientIp;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The component for which this mapping is used.
   * Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION,
   * BOT_DECIDER_CLIENT_BEHAVIOR.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return componentMatcher
   */
  @VsoMethod
  public String getComponentMatcher() {
    return componentMatcher;
  }

  /**
   * This is the setter method to the attribute.
   * The component for which this mapping is used.
   * Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION,
   * BOT_DECIDER_CLIENT_BEHAVIOR.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param componentMatcher set the componentMatcher.
   */
  @VsoMethod
  public void setComponentMatcher(String  componentMatcher) {
    this.componentMatcher = componentMatcher;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure http header(s).
   * All configured headers must match.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrs
   */
  @VsoMethod
  public List<HdrMatch> getHdrs() {
    return hdrs;
  }

  /**
   * This is the setter method. this will set the hdrs
   * Configure http header(s).
   * All configured headers must match.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrs
   */
  @VsoMethod
  public void setHdrs(List<HdrMatch>  hdrs) {
    this.hdrs = hdrs;
  }

  /**
   * This is the setter method this will set the hdrs
   * Configure http header(s).
   * All configured headers must match.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hdrs
   */
  @VsoMethod
  public BotMappingRuleMatchTarget addHdrsItem(HdrMatch hdrsItem) {
    if (this.hdrs == null) {
      this.hdrs = new ArrayList<HdrMatch>();
    }
    this.hdrs.add(hdrsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Configure the host header.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return hostHdr
   */
  @VsoMethod
  public HostHdrMatch getHostHdr() {
    return hostHdr;
  }

  /**
   * This is the setter method to the attribute.
   * Configure the host header.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param hostHdr set the hostHdr.
   */
  @VsoMethod
  public void setHostHdr(HostHdrMatch hostHdr) {
    this.hostHdr = hostHdr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The list of bot identifier names and how they're matched.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return identifierMatcher
   */
  @VsoMethod
  public StringMatch getIdentifierMatcher() {
    return identifierMatcher;
  }

  /**
   * This is the setter method to the attribute.
   * The list of bot identifier names and how they're matched.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param identifierMatcher set the identifierMatcher.
   */
  @VsoMethod
  public void setIdentifierMatcher(StringMatch identifierMatcher) {
    this.identifierMatcher = identifierMatcher;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure http methods.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return method
   */
  @VsoMethod
  public MethodMatch getMethod() {
    return method;
  }

  /**
   * This is the setter method to the attribute.
   * Configure http methods.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param method set the method.
   */
  @VsoMethod
  public void setMethod(MethodMatch method) {
    this.method = method;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Configure request paths.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return path
   */
  @VsoMethod
  public PathMatch getPath() {
    return path;
  }

  /**
   * This is the setter method to the attribute.
   * Configure request paths.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param path set the path.
   */
  @VsoMethod
  public void setPath(PathMatch path) {
    this.path = path;
  }

  /**
   * This is the getter method this will return the attribute value.
   * How to match the botclienttype.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return typeMatcher
   */
  @VsoMethod
  public BotTypeMatcher getTypeMatcher() {
    return typeMatcher;
  }

  /**
   * This is the setter method to the attribute.
   * How to match the botclienttype.
   * Field introduced in 21.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param typeMatcher set the typeMatcher.
   */
  @VsoMethod
  public void setTypeMatcher(BotTypeMatcher typeMatcher) {
    this.typeMatcher = typeMatcher;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  BotMappingRuleMatchTarget objBotMappingRuleMatchTarget = (BotMappingRuleMatchTarget) o;
  return   Objects.equals(this.componentMatcher, objBotMappingRuleMatchTarget.componentMatcher)&&
  Objects.equals(this.classMatcher, objBotMappingRuleMatchTarget.classMatcher)&&
  Objects.equals(this.typeMatcher, objBotMappingRuleMatchTarget.typeMatcher)&&
  Objects.equals(this.identifierMatcher, objBotMappingRuleMatchTarget.identifierMatcher)&&
  Objects.equals(this.clientIp, objBotMappingRuleMatchTarget.clientIp)&&
  Objects.equals(this.method, objBotMappingRuleMatchTarget.method)&&
  Objects.equals(this.path, objBotMappingRuleMatchTarget.path)&&
  Objects.equals(this.hdrs, objBotMappingRuleMatchTarget.hdrs)&&
  Objects.equals(this.hostHdr, objBotMappingRuleMatchTarget.hostHdr);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class BotMappingRuleMatchTarget {\n");
      sb.append("    classMatcher: ").append(toIndentedString(classMatcher)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    componentMatcher: ").append(toIndentedString(componentMatcher)).append("\n");
        sb.append("    hdrs: ").append(toIndentedString(hdrs)).append("\n");
        sb.append("    hostHdr: ").append(toIndentedString(hostHdr)).append("\n");
        sb.append("    identifierMatcher: ").append(toIndentedString(identifierMatcher)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    typeMatcher: ").append(toIndentedString(typeMatcher)).append("\n");
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

