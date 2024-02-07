package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The OpenStackLbPluginOp is a POJO class extends AviRestResource that used for creating
 * OpenStackLbPluginOp.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "OpenStackLbPluginOp")
@VsoFinder(name = Constants.FINDER_VRO_OPENSTACKLBPLUGINOP)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class OpenStackLbPluginOp extends AviRestResource {
    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("command")
    @JsonInclude(Include.NON_NULL)
    private String command;

    @JsonProperty("detail")
    @JsonInclude(Include.NON_NULL)
    private String detail;

    @JsonProperty("elapsed")
    @JsonInclude(Include.NON_NULL)
    private Integer elapsed;

    @JsonProperty("id")
    @JsonInclude(Include.NON_NULL)
    private String id;

    @JsonProperty("prov")
    @JsonInclude(Include.NON_NULL)
    private String prov;

    @JsonProperty("result")
    @JsonInclude(Include.NON_NULL)
    private String result;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return ccId
   */
  @VsoMethod
  public String getCcId() {
    return ccId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param ccId set the ccId.
   */
  @VsoMethod
  public void setCcId(String  ccId) {
    this.ccId = ccId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return command
   */
  @VsoMethod
  public String getCommand() {
    return command;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param command set the command.
   */
  @VsoMethod
  public void setCommand(String  command) {
    this.command = command;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return detail
   */
  @VsoMethod
  public String getDetail() {
    return detail;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param detail set the detail.
   */
  @VsoMethod
  public void setDetail(String  detail) {
    this.detail = detail;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return elapsed
   */
  @VsoMethod
  public Integer getElapsed() {
    return elapsed;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param elapsed set the elapsed.
   */
  @VsoMethod
  public void setElapsed(Integer  elapsed) {
    this.elapsed = elapsed;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return id
   */
  @VsoMethod
  public String getId() {
    return id;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param id set the id.
   */
  @VsoMethod
  public void setId(String  id) {
    this.id = id;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return prov
   */
  @VsoMethod
  public String getProv() {
    return prov;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param prov set the prov.
   */
  @VsoMethod
  public void setProv(String  prov) {
    this.prov = prov;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return result
   */
  @VsoMethod
  public String getResult() {
    return result;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param result set the result.
   */
  @VsoMethod
  public void setResult(String  result) {
    this.result = result;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  OpenStackLbPluginOp objOpenStackLbPluginOp = (OpenStackLbPluginOp) o;
  return   Objects.equals(this.ccId, objOpenStackLbPluginOp.ccId)&&
  Objects.equals(this.id, objOpenStackLbPluginOp.id)&&
  Objects.equals(this.prov, objOpenStackLbPluginOp.prov)&&
  Objects.equals(this.command, objOpenStackLbPluginOp.command)&&
  Objects.equals(this.result, objOpenStackLbPluginOp.result)&&
  Objects.equals(this.detail, objOpenStackLbPluginOp.detail)&&
  Objects.equals(this.elapsed, objOpenStackLbPluginOp.elapsed);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class OpenStackLbPluginOp {\n");
      sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    prov: ").append(toIndentedString(prov)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

