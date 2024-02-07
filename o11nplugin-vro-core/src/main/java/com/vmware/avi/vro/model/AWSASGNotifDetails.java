package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.IpAddr;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The AWSASGNotifDetails is a POJO class extends AviRestResource that used for creating
 * AWSASGNotifDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "AWSASGNotifDetails")
@VsoFinder(name = Constants.FINDER_VRO_AWSASGNOTIFDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class AWSASGNotifDetails extends AviRestResource {
    @JsonProperty("asg_name")
    @JsonInclude(Include.NON_NULL)
    private String asgName;

    @JsonProperty("cc_id")
    @JsonInclude(Include.NON_NULL)
    private String ccId;

    @JsonProperty("error_string")
    @JsonInclude(Include.NON_NULL)
    private String errorString;

    @JsonProperty("event_type")
    @JsonInclude(Include.NON_NULL)
    private String eventType;

    @JsonProperty("instance_id")
    @JsonInclude(Include.NON_NULL)
    private String instanceId;

    @JsonProperty("instance_ip_addr")
    @JsonInclude(Include.NON_NULL)
    private IpAddr instanceIpAddr;

    @JsonProperty("pool_ref")
    @JsonInclude(Include.NON_NULL)
    private String poolRef;

    @JsonProperty("vpc_id")
    @JsonInclude(Include.NON_NULL)
    private String vpcId;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return asgName
   */
  @VsoMethod
  public String getAsgName() {
    return asgName;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param asgName set the asgName.
   */
  @VsoMethod
  public void setAsgName(String  asgName) {
    this.asgName = asgName;
  }

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
   * @return errorString
   */
  @VsoMethod
  public String getErrorString() {
    return errorString;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param errorString set the errorString.
   */
  @VsoMethod
  public void setErrorString(String  errorString) {
    this.errorString = errorString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return eventType
   */
  @VsoMethod
  public String getEventType() {
    return eventType;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param eventType set the eventType.
   */
  @VsoMethod
  public void setEventType(String  eventType) {
    this.eventType = eventType;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return instanceId
   */
  @VsoMethod
  public String getInstanceId() {
    return instanceId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param instanceId set the instanceId.
   */
  @VsoMethod
  public void setInstanceId(String  instanceId) {
    this.instanceId = instanceId;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return instanceIpAddr
   */
  @VsoMethod
  public IpAddr getInstanceIpAddr() {
    return instanceIpAddr;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param instanceIpAddr set the instanceIpAddr.
   */
  @VsoMethod
  public void setInstanceIpAddr(IpAddr instanceIpAddr) {
    this.instanceIpAddr = instanceIpAddr;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the pool.
   * It is a reference to an object of type pool.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return poolRef
   */
  @VsoMethod
  public String getPoolRef() {
    return poolRef;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the pool.
   * It is a reference to an object of type pool.
   * Field introduced in 17.2.3.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param poolRef set the poolRef.
   */
  @VsoMethod
  public void setPoolRef(String  poolRef) {
    this.poolRef = poolRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return vpcId
   */
  @VsoMethod
  public String getVpcId() {
    return vpcId;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param vpcId set the vpcId.
   */
  @VsoMethod
  public void setVpcId(String  vpcId) {
    this.vpcId = vpcId;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  AWSASGNotifDetails objAWSASGNotifDetails = (AWSASGNotifDetails) o;
  return   Objects.equals(this.ccId, objAWSASGNotifDetails.ccId)&&
  Objects.equals(this.asgName, objAWSASGNotifDetails.asgName)&&
  Objects.equals(this.instanceId, objAWSASGNotifDetails.instanceId)&&
  Objects.equals(this.eventType, objAWSASGNotifDetails.eventType)&&
  Objects.equals(this.instanceIpAddr, objAWSASGNotifDetails.instanceIpAddr)&&
  Objects.equals(this.vpcId, objAWSASGNotifDetails.vpcId)&&
  Objects.equals(this.errorString, objAWSASGNotifDetails.errorString)&&
  Objects.equals(this.poolRef, objAWSASGNotifDetails.poolRef);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class AWSASGNotifDetails {\n");
      sb.append("    asgName: ").append(toIndentedString(asgName)).append("\n");
        sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceIpAddr: ").append(toIndentedString(instanceIpAddr)).append("\n");
        sb.append("    poolRef: ").append(toIndentedString(poolRef)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

