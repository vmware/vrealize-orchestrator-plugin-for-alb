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
 * VIFaultInjection
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "VIFaultInjection")
@VsoFinder(name = Constants.FINDER_VRO_VIFAULTINJECTION, idAccessor = "getObjectID()")
@Service
public class VIFaultInjection extends AviRestResource  {
  @JsonProperty("api")
  private String api = null;

  @JsonProperty("cloud_uuid")
  private String cloudUuid = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("network_uuid")
  private String networkUuid = null;

  @JsonProperty("status")
  private String status = "SEVM_CREATE_FAILURE";

  
  /**
   *  Enum options - INITIAL_VALUE, CREATE_SE, MODIFY_VNIC, VM_MONITOR, RESOURCE_MONITOR, PERF_MONITOR, SET_MGMT_IP, MODIFY_MGMT_IP, SIM_VM_BULK_NOTIF, RESYNC_ERROR, SIMULATE_OVA_ERR, VCENTER_NO_OBJECTS, CREATE_VM_RUNTIME_ERR, VERSION_NULL_ERR, DISC_PGNAME_ERR, DISC_DCDETAILS_ERR, DISC_DC_ERR, DISC_HOST_ERR, DISC_CLUSTER_ERR, DISC_PG_ERR, DISC_VM_ERR, HOST_PWR_STATE_ERR, HOST_CONN_STATE_ERR, HOST_MM_ERR, HOST_QUARANTINED_ERR, HOST_CTLR_ACCESS_ERR, HOST_NO_MGMT_ERR, HOST_NO_CPU_ERR, HOST_NO_MEM_ERR, HOST_NO_DISK_ERR, CREATE_SE_VIMGR, DELETE_SE_VIMGR, SLOW_VCENTER_ACCESS, CLEAR_ALL_FAULTS.
   * @return api
  **/
  @ApiModelProperty(required = true, value = " Enum options - INITIAL_VALUE, CREATE_SE, MODIFY_VNIC, VM_MONITOR, RESOURCE_MONITOR, PERF_MONITOR, SET_MGMT_IP, MODIFY_MGMT_IP, SIM_VM_BULK_NOTIF, RESYNC_ERROR, SIMULATE_OVA_ERR, VCENTER_NO_OBJECTS, CREATE_VM_RUNTIME_ERR, VERSION_NULL_ERR, DISC_PGNAME_ERR, DISC_DCDETAILS_ERR, DISC_DC_ERR, DISC_HOST_ERR, DISC_CLUSTER_ERR, DISC_PG_ERR, DISC_VM_ERR, HOST_PWR_STATE_ERR, HOST_CONN_STATE_ERR, HOST_MM_ERR, HOST_QUARANTINED_ERR, HOST_CTLR_ACCESS_ERR, HOST_NO_MGMT_ERR, HOST_NO_CPU_ERR, HOST_NO_MEM_ERR, HOST_NO_DISK_ERR, CREATE_SE_VIMGR, DELETE_SE_VIMGR, SLOW_VCENTER_ACCESS, CLEAR_ALL_FAULTS.")
  @NotNull


 
  @VsoMethod  
  public String getApi() {
    return api;
  }
    
  @VsoMethod
  public void setApi(String api) {
    this.api = api;
  }

  
  /**
   *  Field introduced in 17.1.3.
   * @return cloudUuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.3.")


 
  @VsoMethod  
  public String getCloudUuid() {
    return cloudUuid;
  }
    
  @VsoMethod
  public void setCloudUuid(String cloudUuid) {
    this.cloudUuid = cloudUuid;
  }

  
  /**
   * Number of count.
   * @return count
  **/
  @ApiModelProperty(required = true, value = "Number of count.")
  @NotNull


 
  @VsoMethod  
  public Integer getCount() {
    return count;
  }
    
  @VsoMethod
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   *  Field introduced in 17.1.3.
   * @return networkUuid
  **/
  @ApiModelProperty(value = " Field introduced in 17.1.3.")


 
  @VsoMethod  
  public String getNetworkUuid() {
    return networkUuid;
  }
    
  @VsoMethod
  public void setNetworkUuid(String networkUuid) {
    this.networkUuid = networkUuid;
  }

  
  /**
   *  Enum options - SEVM_SUCCESS, SEVM_CREATE_FAIL_NO_HW_INFO, SEVM_CREATE_FAIL_DUPLICATE_NAME, SEVM_CREATE_FAIL_NO_MGMT_NW, SEVM_CREATE_FAIL_NO_CPU, SEVM_CREATE_FAIL_NO_MEM, SEVM_CREATE_FAIL_NO_LEASE, SEVM_CREATE_FAIL_OVF_ERROR, SEVM_CREATE_NO_HOST_VM_NETWORK, SEVM_CREATE_FAIL_NO_PROGRESS, SEVM_CREATE_FAIL_ABORTED, SEVM_CREATE_FAILURE, SEVM_CREATE_FAIL_POWER_ON, SEVM_VNIC_NO_VM, SEVM_VNIC_MAC_ADDR_ERROR, SEVM_VNIC_FAILURE, SEVM_VNIC_NO_PG_PORTS, SEVM_DELETE_FAILURE, SEVM_CREATE_LIMIT_REACHED, SEVM_SET_MGMT_IP_FAILED, SEVM_CREATE_ACCESS_ERROR, SEVM_CREATE_NO_IMAGE, SEVM_VINFRA_UNINITIALIZED, SEVM_CREATE_NO_HOST, SEVM_CREATE_FAIL_NO_MGMT_NW_PORTS, SEVM_INVALID_DATA, SEVM_VCENTER_CONN_FAIL, SEVM_TIMED_OUT, SEVM_NO_SOURCE_CLONE, SEVM_NO_AVAILABILITY_ZONE, SEVM_FLAVOR_UNAVAIL, SEVM_DELETED, SEVM_VINFRA_FAILURE, SEVM_VNIC_FAILURE_QUESTION, SEVM_VNIC_NO_IPS_AVAILABLE, SEVM_NO_MGMT_IP_AVAILABLE.
   * @return status
  **/
  @ApiModelProperty(value = " Enum options - SEVM_SUCCESS, SEVM_CREATE_FAIL_NO_HW_INFO, SEVM_CREATE_FAIL_DUPLICATE_NAME, SEVM_CREATE_FAIL_NO_MGMT_NW, SEVM_CREATE_FAIL_NO_CPU, SEVM_CREATE_FAIL_NO_MEM, SEVM_CREATE_FAIL_NO_LEASE, SEVM_CREATE_FAIL_OVF_ERROR, SEVM_CREATE_NO_HOST_VM_NETWORK, SEVM_CREATE_FAIL_NO_PROGRESS, SEVM_CREATE_FAIL_ABORTED, SEVM_CREATE_FAILURE, SEVM_CREATE_FAIL_POWER_ON, SEVM_VNIC_NO_VM, SEVM_VNIC_MAC_ADDR_ERROR, SEVM_VNIC_FAILURE, SEVM_VNIC_NO_PG_PORTS, SEVM_DELETE_FAILURE, SEVM_CREATE_LIMIT_REACHED, SEVM_SET_MGMT_IP_FAILED, SEVM_CREATE_ACCESS_ERROR, SEVM_CREATE_NO_IMAGE, SEVM_VINFRA_UNINITIALIZED, SEVM_CREATE_NO_HOST, SEVM_CREATE_FAIL_NO_MGMT_NW_PORTS, SEVM_INVALID_DATA, SEVM_VCENTER_CONN_FAIL, SEVM_TIMED_OUT, SEVM_NO_SOURCE_CLONE, SEVM_NO_AVAILABILITY_ZONE, SEVM_FLAVOR_UNAVAIL, SEVM_DELETED, SEVM_VINFRA_FAILURE, SEVM_VNIC_FAILURE_QUESTION, SEVM_VNIC_NO_IPS_AVAILABLE, SEVM_NO_MGMT_IP_AVAILABLE.")


 
  @VsoMethod  
  public String getStatus() {
    return status;
  }
    
  @VsoMethod
  public void setStatus(String status) {
    this.status = status;
  }

  
  public String getObjectID() {
		return "VIFaultInjection";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VIFaultInjection viFaultInjection = (VIFaultInjection) o;
    return Objects.equals(this.api, viFaultInjection.api) &&
        Objects.equals(this.cloudUuid, viFaultInjection.cloudUuid) &&
        Objects.equals(this.count, viFaultInjection.count) &&
        Objects.equals(this.networkUuid, viFaultInjection.networkUuid) &&
        Objects.equals(this.status, viFaultInjection.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(api, cloudUuid, count, networkUuid, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VIFaultInjection {\n");
    
    sb.append("    api: ").append(toIndentedString(api)).append("\n");
    sb.append("    cloudUuid: ").append(toIndentedString(cloudUuid)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    networkUuid: ").append(toIndentedString(networkUuid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

