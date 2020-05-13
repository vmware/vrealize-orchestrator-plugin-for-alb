package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.avi.vro.model.IpAddrPort;
import com.vmware.avi.vro.model.IpAddrPrefix;
import com.vmware.avi.vro.model.IpAddrRange;
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
 * IpAddrGroup
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpAddrGroup")
@VsoFinder(name = Constants.FINDER_VRO_IPADDRGROUP, idAccessor = "getObjectID()")
@Service
public class IpAddrGroup extends AviRestResource  {
  @JsonProperty("_last_modified")
  private String lastModified = null;

  @JsonProperty("addrs")
  @Valid
  private List<IpAddr> addrs = null;

  @JsonProperty("apic_epg_name")
  private String apicEpgName = null;

  @JsonProperty("country_codes")
  @Valid
  private List<String> countryCodes = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("ip_ports")
  @Valid
  private List<IpAddrPort> ipPorts = null;

  @JsonProperty("marathon_app_name")
  private String marathonAppName = null;

  @JsonProperty("marathon_service_port")
  private Integer marathonServicePort = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("prefixes")
  @Valid
  private List<IpAddrPrefix> prefixes = null;

  @JsonProperty("ranges")
  @Valid
  private List<IpAddrRange> ranges = null;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

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

  
  public IpAddrGroup addAddrsItem(IpAddr addrsItem) {
    if (this.addrs == null) {
      this.addrs = new ArrayList<IpAddr>();
    }
    this.addrs.add(addrsItem);
    return this;
  }
  
  /**
   * Configure IP address(es).
   * @return addrs
  **/
  @ApiModelProperty(value = "Configure IP address(es).")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getAddrs() {
    return addrs;
  }
    
  @VsoMethod
  public void setAddrs(List<IpAddr> addrs) {
    this.addrs = addrs;
  }

  
  /**
   * Populate IP addresses from members of this Cisco APIC EPG.
   * @return apicEpgName
  **/
  @ApiModelProperty(value = "Populate IP addresses from members of this Cisco APIC EPG.")


 
  @VsoMethod  
  public String getApicEpgName() {
    return apicEpgName;
  }
    
  @VsoMethod
  public void setApicEpgName(String apicEpgName) {
    this.apicEpgName = apicEpgName;
  }

  
  public IpAddrGroup addCountryCodesItem(String countryCodesItem) {
    if (this.countryCodes == null) {
      this.countryCodes = new ArrayList<String>();
    }
    this.countryCodes.add(countryCodesItem);
    return this;
  }
  
  /**
   * Populate the IP address ranges from the geo database for this country.
   * @return countryCodes
  **/
  @ApiModelProperty(value = "Populate the IP address ranges from the geo database for this country.")


 
  @VsoMethod  
  public List<String> getCountryCodes() {
    return countryCodes;
  }
    
  @VsoMethod
  public void setCountryCodes(List<String> countryCodes) {
    this.countryCodes = countryCodes;
  }

  
  /**
   * User defined description for the object.
   * @return description
  **/
  @ApiModelProperty(value = "User defined description for the object.")


 
  @VsoMethod  
  public String getDescription() {
    return description;
  }
    
  @VsoMethod
  public void setDescription(String description) {
    this.description = description;
  }

  
  public IpAddrGroup addIpPortsItem(IpAddrPort ipPortsItem) {
    if (this.ipPorts == null) {
      this.ipPorts = new ArrayList<IpAddrPort>();
    }
    this.ipPorts.add(ipPortsItem);
    return this;
  }
  
  /**
   * Configure (IP address, port) tuple(s).
   * @return ipPorts
  **/
  @ApiModelProperty(value = "Configure (IP address, port) tuple(s).")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPort> getIpPorts() {
    return ipPorts;
  }
    
  @VsoMethod
  public void setIpPorts(List<IpAddrPort> ipPorts) {
    this.ipPorts = ipPorts;
  }

  
  /**
   * Populate IP addresses from tasks of this Marathon app.
   * @return marathonAppName
  **/
  @ApiModelProperty(value = "Populate IP addresses from tasks of this Marathon app.")


 
  @VsoMethod  
  public String getMarathonAppName() {
    return marathonAppName;
  }
    
  @VsoMethod
  public void setMarathonAppName(String marathonAppName) {
    this.marathonAppName = marathonAppName;
  }

  
  /**
   * Task port associated with marathon service port. If Marathon app has multiple service ports, this is required. Else, the first task port is used.
   * @return marathonServicePort
  **/
  @ApiModelProperty(value = "Task port associated with marathon service port. If Marathon app has multiple service ports, this is required. Else, the first task port is used.")


 
  @VsoMethod  
  public Integer getMarathonServicePort() {
    return marathonServicePort;
  }
    
  @VsoMethod
  public void setMarathonServicePort(Integer marathonServicePort) {
    this.marathonServicePort = marathonServicePort;
  }

  
  /**
   * Name of the IP address group.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the IP address group.")
  @NotNull


 
  @VsoMethod  
  public String getName() {
    return name;
  }
    
  @VsoMethod
  public void setName(String name) {
    this.name = name;
  }

  
  public IpAddrGroup addPrefixesItem(IpAddrPrefix prefixesItem) {
    if (this.prefixes == null) {
      this.prefixes = new ArrayList<IpAddrPrefix>();
    }
    this.prefixes.add(prefixesItem);
    return this;
  }
  
  /**
   * Configure IP address prefix(es).
   * @return prefixes
  **/
  @ApiModelProperty(value = "Configure IP address prefix(es).")

  @Valid

 
  @VsoMethod  
  public List<IpAddrPrefix> getPrefixes() {
    return prefixes;
  }
    
  @VsoMethod
  public void setPrefixes(List<IpAddrPrefix> prefixes) {
    this.prefixes = prefixes;
  }

  
  public IpAddrGroup addRangesItem(IpAddrRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<IpAddrRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }
  
  /**
   * Configure IP address range(s).
   * @return ranges
  **/
  @ApiModelProperty(value = "Configure IP address range(s).")

  @Valid

 
  @VsoMethod  
  public List<IpAddrRange> getRanges() {
    return ranges;
  }
    
  @VsoMethod
  public void setRanges(List<IpAddrRange> ranges) {
    this.ranges = ranges;
  }

  
  /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @ApiModelProperty(value = " It is a reference to an object of type Tenant.")


 
  @VsoMethod  
  public String getTenantRef() {
    return tenantRef;
  }
    
  @VsoMethod
  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
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
   * UUID of the IP address group.
   * @return uuid
  **/
  @ApiModelProperty(value = "UUID of the IP address group.")


 
  @VsoMethod  
  public String getUuid() {
    return uuid;
  }
    
  @VsoMethod
  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  
  public String getObjectID() {
		return "IpAddrGroup";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpAddrGroup ipAddrGroup = (IpAddrGroup) o;
    return Objects.equals(this.lastModified, ipAddrGroup.lastModified) &&
        Objects.equals(this.addrs, ipAddrGroup.addrs) &&
        Objects.equals(this.apicEpgName, ipAddrGroup.apicEpgName) &&
        Objects.equals(this.countryCodes, ipAddrGroup.countryCodes) &&
        Objects.equals(this.description, ipAddrGroup.description) &&
        Objects.equals(this.ipPorts, ipAddrGroup.ipPorts) &&
        Objects.equals(this.marathonAppName, ipAddrGroup.marathonAppName) &&
        Objects.equals(this.marathonServicePort, ipAddrGroup.marathonServicePort) &&
        Objects.equals(this.name, ipAddrGroup.name) &&
        Objects.equals(this.prefixes, ipAddrGroup.prefixes) &&
        Objects.equals(this.ranges, ipAddrGroup.ranges) &&
        Objects.equals(this.tenantRef, ipAddrGroup.tenantRef) &&
        Objects.equals(this.url, ipAddrGroup.url) &&
        Objects.equals(this.uuid, ipAddrGroup.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastModified, addrs, apicEpgName, countryCodes, description, ipPorts, marathonAppName, marathonServicePort, name, prefixes, ranges, tenantRef, url, uuid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpAddrGroup {\n");
    
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    addrs: ").append(toIndentedString(addrs)).append("\n");
    sb.append("    apicEpgName: ").append(toIndentedString(apicEpgName)).append("\n");
    sb.append("    countryCodes: ").append(toIndentedString(countryCodes)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    ipPorts: ").append(toIndentedString(ipPorts)).append("\n");
    sb.append("    marathonAppName: ").append(toIndentedString(marathonAppName)).append("\n");
    sb.append("    marathonServicePort: ").append(toIndentedString(marathonServicePort)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    prefixes: ").append(toIndentedString(prefixes)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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

