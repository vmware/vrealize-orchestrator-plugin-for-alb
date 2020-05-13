package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.vmware.avi.vro.model.IpAddr;
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
 * DNSConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "DNSConfiguration")
@VsoFinder(name = Constants.FINDER_VRO_DNSCONFIGURATION, idAccessor = "getObjectID()")
@Service
public class DNSConfiguration extends AviRestResource  {
  @JsonProperty("search_domain")
  private String searchDomain = null;

  @JsonProperty("server_list")
  @Valid
  private List<IpAddr> serverList = null;

  
  /**
   * Search domain to use in DNS lookup.
   * @return searchDomain
  **/
  @ApiModelProperty(value = "Search domain to use in DNS lookup.")


 
  @VsoMethod  
  public String getSearchDomain() {
    return searchDomain;
  }
    
  @VsoMethod
  public void setSearchDomain(String searchDomain) {
    this.searchDomain = searchDomain;
  }

  
  public DNSConfiguration addServerListItem(IpAddr serverListItem) {
    if (this.serverList == null) {
      this.serverList = new ArrayList<IpAddr>();
    }
    this.serverList.add(serverListItem);
    return this;
  }
  
  /**
   * List of DNS Server IP addresses.
   * @return serverList
  **/
  @ApiModelProperty(value = "List of DNS Server IP addresses.")

  @Valid

 
  @VsoMethod  
  public List<IpAddr> getServerList() {
    return serverList;
  }
    
  @VsoMethod
  public void setServerList(List<IpAddr> serverList) {
    this.serverList = serverList;
  }

  
  public String getObjectID() {
		return "DNSConfiguration";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DNSConfiguration dnSConfiguration = (DNSConfiguration) o;
    return Objects.equals(this.searchDomain, dnSConfiguration.searchDomain) &&
        Objects.equals(this.serverList, dnSConfiguration.serverList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchDomain, serverList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DNSConfiguration {\n");
    
    sb.append("    searchDomain: ").append(toIndentedString(searchDomain)).append("\n");
    sb.append("    serverList: ").append(toIndentedString(serverList)).append("\n");
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

