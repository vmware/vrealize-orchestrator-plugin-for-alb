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
 * The SePersistenceEventDetails is a POJO class extends AviRestResource that used for creating
 * SePersistenceEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "SePersistenceEventDetails")
@VsoFinder(name = Constants.FINDER_VRO_SEPERSISTENCEEVENTDETAILS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class SePersistenceEventDetails extends AviRestResource {
  @JsonProperty("entries")
  @JsonInclude(Include.NON_NULL)
  private Integer entries = null;

  @JsonProperty("pool")
  @JsonInclude(Include.NON_NULL)
  private String pool = null;

  @JsonProperty("type")
  @JsonInclude(Include.NON_NULL)
  private String type = null;



  /**
   * This is the getter method this will return the attribute value.
   * Current number of entries in the client ip persistence table.
   * @return entries
   */
  @VsoMethod
  public Integer getEntries() {
    return entries;
  }

  /**
   * This is the setter method to the attribute.
   * Current number of entries in the client ip persistence table.
   * @param entries set the entries.
   */
  @VsoMethod
  public void setEntries(Integer  entries) {
    this.entries = entries;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Name of pool whose persistence table limits were reached.
   * It is a reference to an object of type pool.
   * @return pool
   */
  @VsoMethod
  public String getPool() {
    return pool;
  }

  /**
   * This is the setter method to the attribute.
   * Name of pool whose persistence table limits were reached.
   * It is a reference to an object of type pool.
   * @param pool set the pool.
   */
  @VsoMethod
  public void setPool(String  pool) {
    this.pool = pool;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Type of persistence.
   * Enum options - PERSISTENCE_TYPE_CLIENT_IP_ADDRESS, PERSISTENCE_TYPE_HTTP_COOKIE, PERSISTENCE_TYPE_TLS, PERSISTENCE_TYPE_CLIENT_IPV6_ADDRESS,
   * PERSISTENCE_TYPE_CUSTOM_HTTP_HEADER, PERSISTENCE_TYPE_APP_COOKIE, PERSISTENCE_TYPE_GSLB_SITE.
   * @return type
   */
  @VsoMethod
  public String getType() {
    return type;
  }

  /**
   * This is the setter method to the attribute.
   * Type of persistence.
   * Enum options - PERSISTENCE_TYPE_CLIENT_IP_ADDRESS, PERSISTENCE_TYPE_HTTP_COOKIE, PERSISTENCE_TYPE_TLS, PERSISTENCE_TYPE_CLIENT_IPV6_ADDRESS,
   * PERSISTENCE_TYPE_CUSTOM_HTTP_HEADER, PERSISTENCE_TYPE_APP_COOKIE, PERSISTENCE_TYPE_GSLB_SITE.
   * @param type set the type.
   */
  @VsoMethod
  public void setType(String  type) {
    this.type = type;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  SePersistenceEventDetails objSePersistenceEventDetails = (SePersistenceEventDetails) o;
  return   Objects.equals(this.pool, objSePersistenceEventDetails.pool)&&
  Objects.equals(this.type, objSePersistenceEventDetails.type)&&
  Objects.equals(this.entries, objSePersistenceEventDetails.entries);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class SePersistenceEventDetails {\n");
      sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

