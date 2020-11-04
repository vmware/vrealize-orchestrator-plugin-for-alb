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
 * The ConfigInfo is a POJO class extends AviRestResource that used for creating
 * ConfigInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "ConfigInfo")
@VsoFinder(name = Constants.FINDER_VRO_CONFIGINFO)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class ConfigInfo extends AviRestResource {
    @JsonProperty("queue")
    @JsonInclude(Include.NON_NULL)
    private List<VersionInfo> queue = null;

    @JsonProperty("reader_count")
    @JsonInclude(Include.NON_NULL)
    private Integer readerCount = null;

    @JsonProperty("state")
    @JsonInclude(Include.NON_NULL)
    private String state = null;

    @JsonProperty("writer_count")
    @JsonInclude(Include.NON_NULL)
    private Integer writerCount = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property queue of obj type configinfo field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return queue
   */
  @VsoMethod
  public List<VersionInfo> getQueue() {
    return queue;
  }

  /**
   * This is the setter method. this will set the queue
   * Placeholder for description of property queue of obj type configinfo field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return queue
   */
  @VsoMethod
  public void setQueue(List<VersionInfo>  queue) {
    this.queue = queue;
  }

  /**
   * This is the setter method this will set the queue
   * Placeholder for description of property queue of obj type configinfo field type str  type array.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return queue
   */
  @VsoMethod
  public ConfigInfo addQueueItem(VersionInfo queueItem) {
    if (this.queue == null) {
      this.queue = new ArrayList<VersionInfo>();
    }
    this.queue.add(queueItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property reader_count of obj type configinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return readerCount
   */
  @VsoMethod
  public Integer getReaderCount() {
    return readerCount;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property reader_count of obj type configinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param readerCount set the readerCount.
   */
  @VsoMethod
  public void setReaderCount(Integer  readerCount) {
    this.readerCount = readerCount;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Enum options - REPL_NONE, REPL_ENABLED, REPL_DISABLED.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return state
   */
  @VsoMethod
  public String getState() {
    return state;
  }

  /**
   * This is the setter method to the attribute.
   * Enum options - REPL_NONE, REPL_ENABLED, REPL_DISABLED.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param state set the state.
   */
  @VsoMethod
  public void setState(String  state) {
    this.state = state;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property writer_count of obj type configinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return writerCount
   */
  @VsoMethod
  public Integer getWriterCount() {
    return writerCount;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property writer_count of obj type configinfo field type str  type integer.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param writerCount set the writerCount.
   */
  @VsoMethod
  public void setWriterCount(Integer  writerCount) {
    this.writerCount = writerCount;
  }



@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  ConfigInfo objConfigInfo = (ConfigInfo) o;
  return   Objects.equals(this.state, objConfigInfo.state)&&
  Objects.equals(this.writerCount, objConfigInfo.writerCount)&&
  Objects.equals(this.readerCount, objConfigInfo.readerCount)&&
  Objects.equals(this.queue, objConfigInfo.queue);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class ConfigInfo {\n");
      sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    readerCount: ").append(toIndentedString(readerCount)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    writerCount: ").append(toIndentedString(writerCount)).append("\n");
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

