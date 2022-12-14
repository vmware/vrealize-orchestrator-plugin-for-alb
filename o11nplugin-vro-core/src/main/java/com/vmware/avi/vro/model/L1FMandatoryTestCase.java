package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.L2FMandatoryTestCase;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The L1FMandatoryTestCase is a POJO class extends AviRestResource that used for creating
 * L1FMandatoryTestCase.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "L1FMandatoryTestCase")
@VsoFinder(name = Constants.FINDER_VRO_L1FMANDATORYTESTCASE)
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class L1FMandatoryTestCase extends AviRestResource {
    @JsonProperty("mandatory_message")
    @JsonInclude(Include.NON_NULL)
    private L2FMandatoryTestCase mandatoryMessage = null;

    @JsonProperty("mandatory_messages")
    @JsonInclude(Include.NON_NULL)
    private List<L2FMandatoryTestCase> mandatoryMessages = null;

    @JsonProperty("mandatory_string")
    @JsonInclude(Include.NON_NULL)
    private String mandatoryString = null;

    @JsonProperty("mandatory_strings")
    @JsonInclude(Include.NON_NULL)
    private List<String> mandatoryStrings = null;



  /**
   * This is the getter method this will return the attribute value.
   * F_mandatory message for nested f_mandatory test cases-level2.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryMessage
   */
  @VsoMethod
  public L2FMandatoryTestCase getMandatoryMessage() {
    return mandatoryMessage;
  }

  /**
   * This is the setter method to the attribute.
   * F_mandatory message for nested f_mandatory test cases-level2.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mandatoryMessage set the mandatoryMessage.
   */
  @VsoMethod
  public void setMandatoryMessage(L2FMandatoryTestCase mandatoryMessage) {
    this.mandatoryMessage = mandatoryMessage;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Repeated f_mandatory_message for nested f_mandatory test cases-level2.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryMessages
   */
  @VsoMethod
  public List<L2FMandatoryTestCase> getMandatoryMessages() {
    return mandatoryMessages;
  }

  /**
   * This is the setter method. this will set the mandatoryMessages
   * Repeated f_mandatory_message for nested f_mandatory test cases-level2.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryMessages
   */
  @VsoMethod
  public void setMandatoryMessages(List<L2FMandatoryTestCase>  mandatoryMessages) {
    this.mandatoryMessages = mandatoryMessages;
  }

  /**
   * This is the setter method this will set the mandatoryMessages
   * Repeated f_mandatory_message for nested f_mandatory test cases-level2.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryMessages
   */
  @VsoMethod
  public L1FMandatoryTestCase addMandatoryMessagesItem(L2FMandatoryTestCase mandatoryMessagesItem) {
    if (this.mandatoryMessages == null) {
      this.mandatoryMessages = new ArrayList<L2FMandatoryTestCase>();
    }
    this.mandatoryMessages.add(mandatoryMessagesItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * F_mandatory string field for nested f_mandatory test cases-level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryString
   */
  @VsoMethod
  public String getMandatoryString() {
    return mandatoryString;
  }

  /**
   * This is the setter method to the attribute.
   * F_mandatory string field for nested f_mandatory test cases-level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mandatoryString set the mandatoryString.
   */
  @VsoMethod
  public void setMandatoryString(String  mandatoryString) {
    this.mandatoryString = mandatoryString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Repeated f_mandatory string field for nested f_mandatory test cases-level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryStrings
   */
  @VsoMethod
  public List<String> getMandatoryStrings() {
    return mandatoryStrings;
  }

  /**
   * This is the setter method. this will set the mandatoryStrings
   * Repeated f_mandatory string field for nested f_mandatory test cases-level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryStrings
   */
  @VsoMethod
  public void setMandatoryStrings(List<String>  mandatoryStrings) {
    this.mandatoryStrings = mandatoryStrings;
  }

  /**
   * This is the setter method this will set the mandatoryStrings
   * Repeated f_mandatory string field for nested f_mandatory test cases-level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryStrings
   */
  @VsoMethod
  public L1FMandatoryTestCase addMandatoryStringsItem(String mandatoryStringsItem) {
    if (this.mandatoryStrings == null) {
      this.mandatoryStrings = new ArrayList<String>();
    }
    this.mandatoryStrings.add(mandatoryStringsItem);
    return this;
  }




@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  L1FMandatoryTestCase objL1FMandatoryTestCase = (L1FMandatoryTestCase) o;
  return   Objects.equals(this.mandatoryString, objL1FMandatoryTestCase.mandatoryString)&&
  Objects.equals(this.mandatoryStrings, objL1FMandatoryTestCase.mandatoryStrings)&&
  Objects.equals(this.mandatoryMessage, objL1FMandatoryTestCase.mandatoryMessage)&&
  Objects.equals(this.mandatoryMessages, objL1FMandatoryTestCase.mandatoryMessages);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class L1FMandatoryTestCase {\n");
      sb.append("    mandatoryMessage: ").append(toIndentedString(mandatoryMessage)).append("\n");
        sb.append("    mandatoryMessages: ").append(toIndentedString(mandatoryMessages)).append("\n");
        sb.append("    mandatoryString: ").append(toIndentedString(mandatoryString)).append("\n");
        sb.append("    mandatoryStrings: ").append(toIndentedString(mandatoryStrings)).append("\n");
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

