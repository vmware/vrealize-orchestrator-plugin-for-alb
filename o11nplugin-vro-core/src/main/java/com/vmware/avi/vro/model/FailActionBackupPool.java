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
 * FailActionBackupPool
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-05-07T17:09:16.137+05:30")

@VsoObject(create = false, name = "FailActionBackupPool")
@VsoFinder(name = Constants.FINDER_VRO_FAILACTIONBACKUPPOOL, idAccessor = "getObjectID()")
@Service
public class FailActionBackupPool extends AviRestResource  {
  @JsonProperty("backup_pool_ref")
  private String backupPoolRef = null;

  
  /**
   * Specifies the UUID of the Pool acting as backup pool. It is a reference to an object of type Pool.
   * @return backupPoolRef
  **/
  @ApiModelProperty(required = true, value = "Specifies the UUID of the Pool acting as backup pool. It is a reference to an object of type Pool.")
  @NotNull


 
  @VsoMethod  
  public String getBackupPoolRef() {
    return backupPoolRef;
  }
    
  @VsoMethod
  public void setBackupPoolRef(String backupPoolRef) {
    this.backupPoolRef = backupPoolRef;
  }

  
  public String getObjectID() {
		return "FailActionBackupPool";
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailActionBackupPool failActionBackupPool = (FailActionBackupPool) o;
    return Objects.equals(this.backupPoolRef, failActionBackupPool.backupPoolRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPoolRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailActionBackupPool {\n");
    
    sb.append("    backupPoolRef: ").append(toIndentedString(backupPoolRef)).append("\n");
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

