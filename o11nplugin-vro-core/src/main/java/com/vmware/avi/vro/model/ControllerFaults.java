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
 * The ControllerFaults is a POJO class extends AviRestResource that used for creating
 * ControllerFaults.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ControllerFaults")
@VsoFinder(name = Constants.FINDER_VRO_CONTROLLERFAULTS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ControllerFaults extends AviRestResource {
    @JsonProperty("backup_scheduler_faults")
    @JsonInclude(Include.NON_NULL)
    private Boolean backupSchedulerFaults = true;

    @JsonProperty("cluster_faults")
    @JsonInclude(Include.NON_NULL)
    private Boolean clusterFaults = true;

    @JsonProperty("deprecated_api_version_faults")
    @JsonInclude(Include.NON_NULL)
    private Boolean deprecatedApiVersionFaults = true;

    @JsonProperty("license_faults")
    @JsonInclude(Include.NON_NULL)
    private Boolean licenseFaults = true;

    @JsonProperty("migration_faults")
    @JsonInclude(Include.NON_NULL)
    private Boolean migrationFaults = true;

    @JsonProperty("sslprofile_faults")
    @JsonInclude(Include.NON_NULL)
    private Boolean sslprofileFaults = true;



  /**
   * This is the getter method this will return the attribute value.
   * Enable backup scheduler faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return backupSchedulerFaults
   */
  @VsoMethod
  public Boolean getBackupSchedulerFaults() {
    return backupSchedulerFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Enable backup scheduler faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param backupSchedulerFaults set the backupSchedulerFaults.
   */
  @VsoMethod
  public void setBackupSchedulerFaults(Boolean  backupSchedulerFaults) {
    this.backupSchedulerFaults = backupSchedulerFaults;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable cluster faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return clusterFaults
   */
  @VsoMethod
  public Boolean getClusterFaults() {
    return clusterFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Enable cluster faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param clusterFaults set the clusterFaults.
   */
  @VsoMethod
  public void setClusterFaults(Boolean  clusterFaults) {
    this.clusterFaults = clusterFaults;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable deprecated api version faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return deprecatedApiVersionFaults
   */
  @VsoMethod
  public Boolean getDeprecatedApiVersionFaults() {
    return deprecatedApiVersionFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Enable deprecated api version faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param deprecatedApiVersionFaults set the deprecatedApiVersionFaults.
   */
  @VsoMethod
  public void setDeprecatedApiVersionFaults(Boolean  deprecatedApiVersionFaults) {
    this.deprecatedApiVersionFaults = deprecatedApiVersionFaults;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable license faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return licenseFaults
   */
  @VsoMethod
  public Boolean getLicenseFaults() {
    return licenseFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Enable license faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param licenseFaults set the licenseFaults.
   */
  @VsoMethod
  public void setLicenseFaults(Boolean  licenseFaults) {
    this.licenseFaults = licenseFaults;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable db migration faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return migrationFaults
   */
  @VsoMethod
  public Boolean getMigrationFaults() {
    return migrationFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Enable db migration faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param migrationFaults set the migrationFaults.
   */
  @VsoMethod
  public void setMigrationFaults(Boolean  migrationFaults) {
    this.migrationFaults = migrationFaults;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enable ssl profile faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @return sslprofileFaults
   */
  @VsoMethod
  public Boolean getSslprofileFaults() {
    return sslprofileFaults;
  }

  /**
   * This is the setter method to the attribute.
   * Enable ssl profile faults.
   * Field introduced in 20.1.6.
   * Default value when not specified in API or module is interpreted by Avi Controller as true.
   * @param sslprofileFaults set the sslprofileFaults.
   */
  @VsoMethod
  public void setSslprofileFaults(Boolean  sslprofileFaults) {
    this.sslprofileFaults = sslprofileFaults;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ControllerFaults objControllerFaults = (ControllerFaults) o;
  return   Objects.equals(this.licenseFaults, objControllerFaults.licenseFaults)&&
  Objects.equals(this.clusterFaults, objControllerFaults.clusterFaults)&&
  Objects.equals(this.migrationFaults, objControllerFaults.migrationFaults)&&
  Objects.equals(this.backupSchedulerFaults, objControllerFaults.backupSchedulerFaults)&&
  Objects.equals(this.sslprofileFaults, objControllerFaults.sslprofileFaults)&&
  Objects.equals(this.deprecatedApiVersionFaults, objControllerFaults.deprecatedApiVersionFaults);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ControllerFaults {\n");
      sb.append("    backupSchedulerFaults: ").append(toIndentedString(backupSchedulerFaults)).append("\n");
        sb.append("    clusterFaults: ").append(toIndentedString(clusterFaults)).append("\n");
        sb.append("    deprecatedApiVersionFaults: ").append(toIndentedString(deprecatedApiVersionFaults)).append("\n");
        sb.append("    licenseFaults: ").append(toIndentedString(licenseFaults)).append("\n");
        sb.append("    migrationFaults: ").append(toIndentedString(migrationFaults)).append("\n");
        sb.append("    sslprofileFaults: ").append(toIndentedString(sslprofileFaults)).append("\n");
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

