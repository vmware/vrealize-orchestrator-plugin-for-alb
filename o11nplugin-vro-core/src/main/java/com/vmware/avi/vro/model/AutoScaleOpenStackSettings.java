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
 * AutoScaleOpenStackSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AutoScaleOpenStackSettings")
@VsoFinder(name = Constants.FINDER_VRO_AUTOSCALEOPENSTACKSETTINGS, idAccessor = "getObjectID()")
@Service
public class AutoScaleOpenStackSettings extends AviRestResource  {
  @JsonProperty("heat_scale_down_url")
  private String heatScaleDownUrl = null;

  @JsonProperty("heat_scale_up_url")
  private String heatScaleUpUrl = null;

  
  /**
   * Avi Controller will use this URL to scale downthe pool. Cloud connector will automatically update the membership. This is an alpha feature. Field introduced in 17.1.1.
   * @return heatScaleDownUrl
  **/
  @ApiModelProperty(value = "Avi Controller will use this URL to scale downthe pool. Cloud connector will automatically update the membership. This is an alpha feature. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getHeatScaleDownUrl() {
    return heatScaleDownUrl;
  }
    
  @VsoMethod
  public void setHeatScaleDownUrl(String heatScaleDownUrl) {
    this.heatScaleDownUrl = heatScaleDownUrl;
  }

  
  /**
   * Avi Controller will use this URL to scale upthe pool. Cloud connector will automatically update the membership. This is an alpha feature. Field introduced in 17.1.1.
   * @return heatScaleUpUrl
  **/
  @ApiModelProperty(value = "Avi Controller will use this URL to scale upthe pool. Cloud connector will automatically update the membership. This is an alpha feature. Field introduced in 17.1.1.")


 
  @VsoMethod  
  public String getHeatScaleUpUrl() {
    return heatScaleUpUrl;
  }
    
  @VsoMethod
  public void setHeatScaleUpUrl(String heatScaleUpUrl) {
    this.heatScaleUpUrl = heatScaleUpUrl;
  }

  
  public String getObjectID() {
		return "AutoScaleOpenStackSettings";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleOpenStackSettings autoScaleOpenStackSettings = (AutoScaleOpenStackSettings) o;
    return Objects.equals(this.heatScaleDownUrl, autoScaleOpenStackSettings.heatScaleDownUrl) &&
        Objects.equals(this.heatScaleUpUrl, autoScaleOpenStackSettings.heatScaleUpUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heatScaleDownUrl, heatScaleUpUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleOpenStackSettings {\n");
    
    sb.append("    heatScaleDownUrl: ").append(toIndentedString(heatScaleDownUrl)).append("\n");
    sb.append("    heatScaleUpUrl: ").append(toIndentedString(heatScaleUpUrl)).append("\n");
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

