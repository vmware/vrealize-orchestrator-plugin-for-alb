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
 * UpgradeEvent
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "UpgradeEvent")
@VsoFinder(name = Constants.FINDER_VRO_UPGRADEEVENT, idAccessor = "getObjectID()")
@Service
public class UpgradeEvent extends AviRestResource  {
  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("end_time")
  private String endTime = null;

  @JsonProperty("ip")
  private IpAddr ip = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("start_time")
  private String startTime = null;

  @JsonProperty("status")
  private Boolean status = null;

  @JsonProperty("sub_tasks")
  @Valid
  private List<String> subTasks = null;

  
  /**
   * Time taken to complete upgrade event in seconds. Field introduced in 18.2.6.
   * @return duration
  **/
  @ApiModelProperty(value = "Time taken to complete upgrade event in seconds. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Integer getDuration() {
    return duration;
  }
    
  @VsoMethod
  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  
  /**
   * Task end time. Field introduced in 18.2.6.
   * @return endTime
  **/
  @ApiModelProperty(value = "Task end time. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getEndTime() {
    return endTime;
  }
    
  @VsoMethod
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  
  /**
   * Ip of the node. Field introduced in 18.2.6.
   * @return ip
  **/
  @ApiModelProperty(value = "Ip of the node. Field introduced in 18.2.6.")

  @Valid

 
  @VsoMethod  
  public IpAddr getIp() {
    return ip;
  }
    
  @VsoMethod
  public void setIp(IpAddr ip) {
    this.ip = ip;
  }

  
  /**
   * Upgrade event message if any. Field introduced in 18.2.6.
   * @return message
  **/
  @ApiModelProperty(value = "Upgrade event message if any. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getMessage() {
    return message;
  }
    
  @VsoMethod
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Task start time. Field introduced in 18.2.6.
   * @return startTime
  **/
  @ApiModelProperty(value = "Task start time. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public String getStartTime() {
    return startTime;
  }
    
  @VsoMethod
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  
  /**
   * Upgrade event status. Field introduced in 18.2.6.
   * @return status
  **/
  @ApiModelProperty(value = "Upgrade event status. Field introduced in 18.2.6.")


 
  @VsoMethod  
  public Boolean isStatus() {
    return status;
  }
    
  @VsoMethod
  public void setStatus(Boolean status) {
    this.status = status;
  }

  
  public UpgradeEvent addSubTasksItem(String subTasksItem) {
    if (this.subTasks == null) {
      this.subTasks = new ArrayList<String>();
    }
    this.subTasks.add(subTasksItem);
    return this;
  }
  
  /**
   * Sub tasks executed on each node. Field introduced in 18.2.8, 20.1.1.
   * @return subTasks
  **/
  @ApiModelProperty(value = "Sub tasks executed on each node. Field introduced in 18.2.8, 20.1.1.")


 
  @VsoMethod  
  public List<String> getSubTasks() {
    return subTasks;
  }
    
  @VsoMethod
  public void setSubTasks(List<String> subTasks) {
    this.subTasks = subTasks;
  }

  
  public String getObjectID() {
		return "UpgradeEvent";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpgradeEvent upgradeEvent = (UpgradeEvent) o;
    return Objects.equals(this.duration, upgradeEvent.duration) &&
        Objects.equals(this.endTime, upgradeEvent.endTime) &&
        Objects.equals(this.ip, upgradeEvent.ip) &&
        Objects.equals(this.message, upgradeEvent.message) &&
        Objects.equals(this.startTime, upgradeEvent.startTime) &&
        Objects.equals(this.status, upgradeEvent.status) &&
        Objects.equals(this.subTasks, upgradeEvent.subTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, endTime, ip, message, startTime, status, subTasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpgradeEvent {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
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

