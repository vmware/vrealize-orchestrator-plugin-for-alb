package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.DnsAttacks;
import com.vmware.avi.vro.model.TcpAttacks;
import com.vmware.avi.vro.model.UdpAttacks;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;
/**
 * SecurityPolicy
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SecurityPolicy")
@VsoFinder(name = Constants.FINDER_VRO_SECURITYPOLICY, idAccessor = "getObjectID()")
@Service
public class SecurityPolicy extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("dns_attacks")
  private DnsAttacks dnsAttacks = null;

  @JsonProperty("dns_policy_index")
  private Integer dnsPolicyIndex = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("network_security_policy_index")
  private Integer networkSecurityPolicyIndex = null;

  @JsonProperty("oper_mode")
  private String operMode = "DETECTION";

  @JsonProperty("tcp_attacks")
  private TcpAttacks tcpAttacks = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("udp_attacks")
  private UdpAttacks udpAttacks = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("uuid")
  private String uuid = null;

  
  /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return lastModified
  **/
  @ApiModelProperty(readOnly = true, value = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")


 
  @VsoMethod  
  public String getLastModified() {
    return lastModified;
  }
    
  @VsoMethod
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  
  /**
   * Security policy is used to specify various configuration information used to perform Distributed Denial of Service (DDoS) attacks detection and mitigation. Field introduced in 18.2.1.
   * @return description
  **/
  @ApiModelProperty(value = "Security policy is used to specify various configuration information used to perform Distributed Denial of Service (DDoS) attacks detection and mitigation. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Attacks utilizing the DNS protocol operations. Field introduced in 18.2.1.
   * @return dnsAttacks
  **/
  @ApiModelProperty(value = "Attacks utilizing the DNS protocol operations. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public DnsAttacks getDnsAttacks() {
    return dnsAttacks;
  }
    
  @VsoMethod
  public void setDnsAttacks(DnsAttacks dnsAttacks) {
    this.dnsAttacks = dnsAttacks;
  }

  
  /**
   * Index of the dns policy to use for the mitigation rules applied to the dns attacks. Field introduced in 18.2.1.
   * @return dnsPolicyIndex
  **/
  @ApiModelProperty(required = true, value = "Index of the dns policy to use for the mitigation rules applied to the dns attacks. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public Integer getDnsPolicyIndex() {
    return dnsPolicyIndex;
  }
    
  @VsoMethod
  public void setDnsPolicyIndex(Integer dnsPolicyIndex) {
    this.dnsPolicyIndex = dnsPolicyIndex;
  }

  
  /**
   * The name of the security policy. Field introduced in 18.2.1.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the security policy. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Index of the network security policy to use for the mitigation rules applied to the attacks. Field introduced in 18.2.1.
   * @return networkSecurityPolicyIndex
  **/
  @ApiModelProperty(required = true, value = "Index of the network security policy to use for the mitigation rules applied to the attacks. Field introduced in 18.2.1.")
  @NotNull


 
  @VsoMethod  
  public Integer getNetworkSecurityPolicyIndex() {
    return networkSecurityPolicyIndex;
  }
    
  @VsoMethod
  public void setNetworkSecurityPolicyIndex(Integer networkSecurityPolicyIndex) {
    this.networkSecurityPolicyIndex = networkSecurityPolicyIndex;
  }

  
  /**
   * Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks. Enum options - DETECTION, MITIGATION. Field introduced in 18.2.1.
   * @return operMode
  **/
  @ApiModelProperty(value = "Mode of dealing with the attacks - perform detection only, or detect and mitigate the attacks. Enum options - DETECTION, MITIGATION. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getOperMode() {
    return operMode;
  }
    
  @VsoMethod
  public void setOperMode(String operMode) {
    this.operMode = operMode;
  }

  
  /**
   * Attacks utilizing the TCP protocol operations. Field introduced in 18.2.1.
   * @return tcpAttacks
  **/
  @ApiModelProperty(value = "Attacks utilizing the TCP protocol operations. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public TcpAttacks getTcpAttacks() {
    return tcpAttacks;
  }
    
  @VsoMethod
  public void setTcpAttacks(TcpAttacks tcpAttacks) {
    this.tcpAttacks = tcpAttacks;
  }

  
  /**
   * Tenancy of the security policy. It is a reference to an object of type Tenant. Field introduced in 18.2.1.
   * @return tenantRef
  **/
  @ApiModelProperty(value = "Tenancy of the security policy. It is a reference to an object of type Tenant. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

  
  /**
   * Attacks utilizing the UDP protocol operations. Field introduced in 18.2.1.
   * @return udpAttacks
  **/
  @ApiModelProperty(value = "Attacks utilizing the UDP protocol operations. Field introduced in 18.2.1.")

  @Valid

 
  @VsoMethod  
  public UdpAttacks getUdpAttacks() {
    return udpAttacks;
  }
    
  @VsoMethod
  public void setUdpAttacks(UdpAttacks udpAttacks) {
    this.udpAttacks = udpAttacks;
  }

  
  /**
   * url
   * @return url
  **/
  @ApiModelProperty(readOnly = true, value = "url")


 
  @VsoMethod  
  public String getUrl() {
    return url;
  }
    
  @VsoMethod
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The UUID of the security policy. Field introduced in 18.2.1.
   * @return uuid
  **/
  @ApiModelProperty(value = "The UUID of the security policy. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "SecurityPolicy";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityPolicy securityPolicy = (SecurityPolicy) o;
    return Objects.equals(this.lastModified, securityPolicy.lastModified) &&
        Objects.equals(this.description, securityPolicy.description) &&
        Objects.equals(this.dnsAttacks, securityPolicy.dnsAttacks) &&
        Objects.equals(this.dnsPolicyIndex, securityPolicy.dnsPolicyIndex) &&
        Objects.equals(this.name, securityPolicy.name) &&
        Objects.equals(this.networkSecurityPolicyIndex, securityPolicy.networkSecurityPolicyIndex) &&
        Objects.equals(this.operMode, securityPolicy.operMode) &&
        Objects.equals(this.tcpAttacks, securityPolicy.tcpAttacks) &&
        Objects.equals(this.tenantRef, securityPolicy.tenantRef) &&
        Objects.equals(this.udpAttacks, securityPolicy.udpAttacks) &&
        Objects.equals(this.url, securityPolicy.url) &&
        Objects.equals(this.uuid, securityPolicy.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, description, dnsAttacks, dnsPolicyIndex, name, networkSecurityPolicyIndex, operMode, tcpAttacks, tenantRef, udpAttacks, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityPolicy {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dnsAttacks: ").append(toIndentedString(dnsAttacks)).append("\n");
    sb.append("    dnsPolicyIndex: ").append(toIndentedString(dnsPolicyIndex)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    networkSecurityPolicyIndex: ").append(toIndentedString(networkSecurityPolicyIndex)).append("\n");
    sb.append("    operMode: ").append(toIndentedString(operMode)).append("\n");
    sb.append("    tcpAttacks: ").append(toIndentedString(tcpAttacks)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    udpAttacks: ").append(toIndentedString(udpAttacks)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

