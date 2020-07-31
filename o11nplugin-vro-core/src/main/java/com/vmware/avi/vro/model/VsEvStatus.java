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
 * The VsEvStatus is a POJO class extends AviRestResource that used for creating
 * VsEvStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "VsEvStatus")
@VsoFinder(name = Constants.FINDER_VRO_VSEVSTATUS)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class VsEvStatus extends AviRestResource {
  @JsonProperty("notes")
  @JsonInclude(Include.NON_NULL)
  private List<String> notes = null;

  @JsonProperty("request")
  @JsonInclude(Include.NON_NULL)
  private String request = null;

  @JsonProperty("result")
  @JsonInclude(Include.NON_NULL)
  private String result = null;



  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property notes of obj type vsevstatus field type str  type array.
   * @return notes
   */
  @VsoMethod
  public List<String> getNotes() {
    return notes;
  }

  /**
   * This is the setter method. this will set the notes
   * Placeholder for description of property notes of obj type vsevstatus field type str  type array.
   * @return notes
   */
  @VsoMethod
  public void setNotes(List<String>  notes) {
    this.notes = notes;
  }

  /**
   * This is the setter method this will set the notes
   * Placeholder for description of property notes of obj type vsevstatus field type str  type array.
   * @return notes
   */
  @VsoMethod
  public VsEvStatus addNotesItem(String notesItem) {
    if (this.notes == null) {
      this.notes = new ArrayList<String>();
    }
    this.notes.add(notesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property request of obj type vsevstatus field type str  type string.
   * @return request
   */
  @VsoMethod
  public String getRequest() {
    return request;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property request of obj type vsevstatus field type str  type string.
   * @param request set the request.
   */
  @VsoMethod
  public void setRequest(String  request) {
    this.request = request;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Placeholder for description of property result of obj type vsevstatus field type str  type string.
   * @return result
   */
  @VsoMethod
  public String getResult() {
    return result;
  }

  /**
   * This is the setter method to the attribute.
   * Placeholder for description of property result of obj type vsevstatus field type str  type string.
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
  VsEvStatus objVsEvStatus = (VsEvStatus) o;
  return   Objects.equals(this.request, objVsEvStatus.request)&&
  Objects.equals(this.result, objVsEvStatus.result)&&
  Objects.equals(this.notes, objVsEvStatus.notes);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class VsEvStatus {\n");
      sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
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

