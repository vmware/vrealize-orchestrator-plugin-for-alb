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
 * SeGroupResumeOptions
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "SeGroupResumeOptions")
@VsoFinder(name = Constants.FINDER_VRO_SEGROUPRESUMEOPTIONS, idAccessor = "getObjectID()")
@Service
public class SeGroupResumeOptions extends AviRestResource  {
  @JsonProperty("action_on_error")
  private String actionOnError = "SUSPEND_UPGRADE_OPS_ON_ERROR";

  @JsonProperty("disruptive")
  private Boolean disruptive = null;

  @JsonProperty("skip_suspended")
  private Boolean skipSuspended = null;

  
  /**
   * The error recovery action configured for a SE Group. Enum options - ROLLBACK_UPGRADE_OPS_ON_ERROR, SUSPEND_UPGRADE_OPS_ON_ERROR, CONTINUE_UPGRADE_OPS_ON_ERROR. Field introduced in 18.2.6.
   * @return actionOnError
  **/
  @ApiModelProperty(value = "The error recovery action configured for a SE Group. Enum options - ROLLBACK_UPGRADE_OPS_ON_ERROR, SUSPEND_UPGRADE_OPS_ON_ERROR, CONTINUE_UPGRADE_OPS_ON_ERROR. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getActionOnError() {
    return actionOnError;
  }
    
  @VsoMethod
  public void setActionOnError(String actionOnError) {
    this.actionOnError = actionOnError;
  }

  
  /**
   * Allow disruptive mechanism. Field introduced in 18.2.8, 20.1.1.
   * @return disruptive
  **/
  @ApiModelProperty(value = "Allow disruptive mechanism. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public Boolean isDisruptive() {
    return disruptive;
  }
    
  @VsoMethod
  public void setDisruptive(Boolean disruptive) {
    this.disruptive = disruptive;
  }

  
  /**
   * Skip upgrade on suspended SE(s). Field introduced in 18.2.6.
   * @return skipSuspended
  **/
  @ApiModelProperty(value = "Skip upgrade on suspended SE(s). Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isSkipSuspended() {
    return skipSuspended;
  }
    
  @VsoMethod
  public void setSkipSuspended(Boolean skipSuspended) {
    this.skipSuspended = skipSuspended;
  }

  
  public String getObjectID() {
		return "SeGroupResumeOptions";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeGroupResumeOptions seGroupResumeOptions = (SeGroupResumeOptions) o;
    return Objects.equals(this.actionOnError, seGroupResumeOptions.actionOnError) &&
        Objects.equals(this.disruptive, seGroupResumeOptions.disruptive) &&
        Objects.equals(this.skipSuspended, seGroupResumeOptions.skipSuspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionOnError, disruptive, skipSuspended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeGroupResumeOptions {\n");
    
    sb.append("    actionOnError: ").append(toIndentedString(actionOnError)).append("\n");
    sb.append("    disruptive: ").append(toIndentedString(disruptive)).append("\n");
    sb.append("    skipSuspended: ").append(toIndentedString(skipSuspended)).append("\n");
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

