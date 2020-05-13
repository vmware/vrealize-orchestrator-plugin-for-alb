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
 * IpCommunity
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "IpCommunity")
@VsoFinder(name = Constants.FINDER_VRO_IPCOMMUNITY, idAccessor = "getObjectID()")
@Service
public class IpCommunity extends AviRestResource  {
  @JsonProperty("community")
  @Valid
  private List<String> community = null;

  @JsonProperty("ip_begin")
  private IpAddr ipBegin = null;

  @JsonProperty("ip_end")
  private IpAddr ipEnd = null;

  
  public IpCommunity addCommunityItem(String communityItem) {
    if (this.community == null) {
      this.community = new ArrayList<String>();
    }
    this.community.add(communityItem);
    return this;
  }
  
  /**
   * Community string either in aa nn format where aa, nn is within [1,65535] or local-AS|no-advertise|no-export|internet. Field introduced in 17.1.3.
   * @return community
  **/
  @ApiModelProperty(value = "Community string either in aa nn format where aa, nn is within [1,65535] or local-AS|no-advertise|no-export|internet. Field introduced in 17.1.3.")


 
  @VsoMethod  
  public List<String> getCommunity() {
    return community;
  }
    
  @VsoMethod
  public void setCommunity(List<String> community) {
    this.community = community;
  }

  
  /**
   * Beginning of IP address range. Field introduced in 17.1.3.
   * @return ipBegin
  **/
  @ApiModelProperty(required = true, value = "Beginning of IP address range. Field introduced in 17.1.3.")
  @NotNull

  @Valid

 
  @VsoMethod  
  public IpAddr getIpBegin() {
    return ipBegin;
  }
    
  @VsoMethod
  public void setIpBegin(IpAddr ipBegin) {
    this.ipBegin = ipBegin;
  }

  
  /**
   * End of IP address range. Optional if ip_begin is the only IP address in specified IP range. Field introduced in 17.1.3.
   * @return ipEnd
  **/
  @ApiModelProperty(value = "End of IP address range. Optional if ip_begin is the only IP address in specified IP range. Field introduced in 17.1.3.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIpEnd() {
    return ipEnd;
  }
    
  @VsoMethod
  public void setIpEnd(IpAddr ipEnd) {
    this.ipEnd = ipEnd;
  }

  
  public String getObjectID() {
		return "IpCommunity";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpCommunity ipCommunity = (IpCommunity) o;
    return Objects.equals(this.community, ipCommunity.community) &&
        Objects.equals(this.ipBegin, ipCommunity.ipBegin) &&
        Objects.equals(this.ipEnd, ipCommunity.ipEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(community, ipBegin, ipEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpCommunity {\n");
    
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    ipBegin: ").append(toIndentedString(ipBegin)).append("\n");
    sb.append("    ipEnd: ").append(toIndentedString(ipEnd)).append("\n");
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

