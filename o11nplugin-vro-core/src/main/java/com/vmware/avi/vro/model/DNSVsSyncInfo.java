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
 * The DNSVsSyncInfo is a POJO class extends AviRestResource that used for creating
 * DNSVsSyncInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "DNSVsSyncInfo")
@VsoFinder(name = Constants.FINDER_VRO_DNSVSSYNCINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class DNSVsSyncInfo extends AviRestResource {
    @JsonProperty("error")
    @JsonInclude(Include.NON_NULL)
    private String error;

    @JsonProperty("total_records")
    @JsonInclude(Include.NON_NULL)
    private Integer totalRecords;



  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return error
   */
  @VsoMethod
  public String getError() {
    return error;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param error set the error.
   */
  @VsoMethod
  public void setError(String  error) {
    this.error = error;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return totalRecords
   */
  @VsoMethod
  public Integer getTotalRecords() {
    return totalRecords;
  }

  /**
   * This is the setter method to the attribute.
   * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param totalRecords set the totalRecords.
   */
  @VsoMethod
  public void setTotalRecords(Integer  totalRecords) {
    this.totalRecords = totalRecords;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  DNSVsSyncInfo objDNSVsSyncInfo = (DNSVsSyncInfo) o;
  return   Objects.equals(this.totalRecords, objDNSVsSyncInfo.totalRecords)&&
  Objects.equals(this.error, objDNSVsSyncInfo.error);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class DNSVsSyncInfo {\n");
      sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
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

