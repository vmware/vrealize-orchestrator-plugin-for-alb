package com.vmware.avi.vro.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ConnPoolProperties
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "ConnPoolProperties")
@VsoFinder(name = Constants.FINDER_VRO_CONNPOOLPROPERTIES, idAccessor = "getObjectID()")
@Service
public class ConnPoolProperties extends AviRestResource  {
  @JsonProperty("upstream_connpool_conn_idle_tmo")
  private Integer upstreamConnpoolConnIdleTmo = 60000;

  @JsonProperty("upstream_connpool_conn_life_tmo")
  private Integer upstreamConnpoolConnLifeTmo = 600000;

  @JsonProperty("upstream_connpool_conn_max_reuse")
  private Integer upstreamConnpoolConnMaxReuse = null;

  @JsonProperty("upstream_connpool_server_max_cache")
  private Integer upstreamConnpoolServerMaxCache = null;

  
  /**
   * Connection idle timeout. Field introduced in 18.2.1.
   * @return upstreamConnpoolConnIdleTmo
  **/
  @ApiModelProperty(value = "Connection idle timeout. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolConnIdleTmo() {
    return upstreamConnpoolConnIdleTmo;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolConnIdleTmo(Integer upstreamConnpoolConnIdleTmo) {
    this.upstreamConnpoolConnIdleTmo = upstreamConnpoolConnIdleTmo;
  }

  
  /**
   * Connection life timeout. Field introduced in 18.2.1.
   * @return upstreamConnpoolConnLifeTmo
  **/
  @ApiModelProperty(value = "Connection life timeout. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolConnLifeTmo() {
    return upstreamConnpoolConnLifeTmo;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolConnLifeTmo(Integer upstreamConnpoolConnLifeTmo) {
    this.upstreamConnpoolConnLifeTmo = upstreamConnpoolConnLifeTmo;
  }

  
  /**
   * Maximum number of times a connection can be reused. Special values are 0- 'unlimited'. Field introduced in 18.2.1.
   * @return upstreamConnpoolConnMaxReuse
  **/
  @ApiModelProperty(value = "Maximum number of times a connection can be reused. Special values are 0- 'unlimited'. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolConnMaxReuse() {
    return upstreamConnpoolConnMaxReuse;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolConnMaxReuse(Integer upstreamConnpoolConnMaxReuse) {
    this.upstreamConnpoolConnMaxReuse = upstreamConnpoolConnMaxReuse;
  }

  
  /**
   * Maximum number of connections a server can cache. Special values are 0- 'unlimited'. Field introduced in 18.2.1.
   * @return upstreamConnpoolServerMaxCache
  **/
  @ApiModelProperty(value = "Maximum number of connections a server can cache. Special values are 0- 'unlimited'. Field introduced in 18.2.1.")


 
  @VsoMethod  
  public Integer getUpstreamConnpoolServerMaxCache() {
    return upstreamConnpoolServerMaxCache;
  }
    
  @VsoMethod
  public void setUpstreamConnpoolServerMaxCache(Integer upstreamConnpoolServerMaxCache) {
    this.upstreamConnpoolServerMaxCache = upstreamConnpoolServerMaxCache;
  }

  
  public String getObjectID() {
		return "ConnPoolProperties";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnPoolProperties connPoolProperties = (ConnPoolProperties) o;
    return Objects.equals(this.upstreamConnpoolConnIdleTmo, connPoolProperties.upstreamConnpoolConnIdleTmo) &&
        Objects.equals(this.upstreamConnpoolConnLifeTmo, connPoolProperties.upstreamConnpoolConnLifeTmo) &&
        Objects.equals(this.upstreamConnpoolConnMaxReuse, connPoolProperties.upstreamConnpoolConnMaxReuse) &&
        Objects.equals(this.upstreamConnpoolServerMaxCache, connPoolProperties.upstreamConnpoolServerMaxCache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(upstreamConnpoolConnIdleTmo, upstreamConnpoolConnLifeTmo, upstreamConnpoolConnMaxReuse, upstreamConnpoolServerMaxCache);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnPoolProperties {\n");
    
    sb.append("    upstreamConnpoolConnIdleTmo: ").append(toIndentedString(upstreamConnpoolConnIdleTmo)).append("\n");
    sb.append("    upstreamConnpoolConnLifeTmo: ").append(toIndentedString(upstreamConnpoolConnLifeTmo)).append("\n");
    sb.append("    upstreamConnpoolConnMaxReuse: ").append(toIndentedString(upstreamConnpoolConnMaxReuse)).append("\n");
    sb.append("    upstreamConnpoolServerMaxCache: ").append(toIndentedString(upstreamConnpoolServerMaxCache)).append("\n");
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

