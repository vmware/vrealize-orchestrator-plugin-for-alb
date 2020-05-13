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
 * AutoScaleMesosSettings
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "AutoScaleMesosSettings")
@VsoFinder(name = Constants.FINDER_VRO_AUTOSCALEMESOSSETTINGS, idAccessor = "getObjectID()")
@Service
public class AutoScaleMesosSettings extends AviRestResource  {
  @JsonProperty("force")
  private Boolean force = true;

  
  /**
   * Apply scaleout even when there are deployments inprogress.
   * @return force
  **/
  @ApiModelProperty(value = "Apply scaleout even when there are deployments inprogress.")


 
  @VsoMethod  
  public Boolean isForce() {
    return force;
  }
    
  @VsoMethod
  public void setForce(Boolean force) {
    this.force = force;
  }

  
  public String getObjectID() {
		return "AutoScaleMesosSettings";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoScaleMesosSettings autoScaleMesosSettings = (AutoScaleMesosSettings) o;
    return Objects.equals(this.force, autoScaleMesosSettings.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoScaleMesosSettings {\n");
    
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

