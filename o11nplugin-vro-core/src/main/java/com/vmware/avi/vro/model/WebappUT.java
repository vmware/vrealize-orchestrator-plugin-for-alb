package com.vmware.avi.vro.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vmware.avi.vro.model.L1FMandatoryTestCase;
import com.vmware.avi.vro.model.L1FSensitiveTestCase;
import com.vmware.avi.vro.model.L1StringLengthTestCase;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoMethod;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;
import com.vmware.avi.vro.Constants;
import org.springframework.stereotype.Service;

/**
 * The WebappUT is a POJO class extends AviRestResource that used for creating
 * WebappUT.
 *
 * @version 1.0
 * @since 
 *
 */
@VsoObject(create = false, name = "WebappUT")
@VsoFinder(name = Constants.FINDER_VRO_WEBAPPUT, idAccessor = "getObjectID()")
@JsonIgnoreProperties(ignoreUnknown = true)
@Service
public class WebappUT extends AviRestResource {
    @JsonProperty("default_first_int")
    @JsonInclude(Include.NON_NULL)
    private Integer defaultFirstInt = 1;

    @JsonProperty("default_second_int")
    @JsonInclude(Include.NON_NULL)
    private Integer defaultSecondInt = 2;

    @JsonProperty("default_string")
    @JsonInclude(Include.NON_NULL)
    private String defaultString = "default string";

    @JsonProperty("default_third_int")
    @JsonInclude(Include.NON_NULL)
    private Integer defaultThirdInt = 3;

    @JsonProperty("mandatory_test")
    @JsonInclude(Include.NON_NULL)
    private L1FMandatoryTestCase mandatoryTest = null;

    @JsonProperty("mandatory_tests")
    @JsonInclude(Include.NON_NULL)
    private List<L1FMandatoryTestCase> mandatoryTests = null;

    @JsonProperty("name")
    @JsonInclude(Include.NON_NULL)
    private String name = null;

    @JsonProperty("sensitive_test")
    @JsonInclude(Include.NON_NULL)
    private L1FSensitiveTestCase sensitiveTest = null;

    @JsonProperty("sensitive_tests")
    @JsonInclude(Include.NON_NULL)
    private List<L1FSensitiveTestCase> sensitiveTests = null;

    @JsonProperty("skip_optional_check_tests")
    @JsonInclude(Include.NON_NULL)
    private Boolean skipOptionalCheckTests = null;

    @JsonProperty("string_length_test")
    @JsonInclude(Include.NON_NULL)
    private L1StringLengthTestCase stringLengthTest = null;

    @JsonProperty("string_length_tests")
    @JsonInclude(Include.NON_NULL)
    private List<L1StringLengthTestCase> stringLengthTests = null;

    @JsonProperty("tenant_ref")
    @JsonInclude(Include.NON_NULL)
    private String tenantRef = null;

    @JsonProperty("test_sensitive_string")
    @JsonInclude(Include.NON_NULL)
    private String testSensitiveString = null;

    @JsonProperty("test_string")
    @JsonInclude(Include.NON_NULL)
    private String testString = null;

    @JsonProperty("url")
    @JsonInclude(Include.NON_NULL)
    private String url = "url";

    @JsonProperty("uuid")
    @JsonInclude(Include.NON_NULL)
    private String uuid = null;



  /**
   * This is the getter method this will return the attribute value.
   * Default uint64 field.
   * Field introduced in 30.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @return defaultFirstInt
   */
  @VsoMethod
  public Integer getDefaultFirstInt() {
    return defaultFirstInt;
  }

  /**
   * This is the setter method to the attribute.
   * Default uint64 field.
   * Field introduced in 30.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 1.
   * @param defaultFirstInt set the defaultFirstInt.
   */
  @VsoMethod
  public void setDefaultFirstInt(Integer  defaultFirstInt) {
    this.defaultFirstInt = defaultFirstInt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default int64 field.
   * Field introduced in 30.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @return defaultSecondInt
   */
  @VsoMethod
  public Integer getDefaultSecondInt() {
    return defaultSecondInt;
  }

  /**
   * This is the setter method to the attribute.
   * Default int64 field.
   * Field introduced in 30.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 2.
   * @param defaultSecondInt set the defaultSecondInt.
   */
  @VsoMethod
  public void setDefaultSecondInt(Integer  defaultSecondInt) {
    this.defaultSecondInt = defaultSecondInt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default string field.
   * Field introduced in 30.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default string".
   * @return defaultString
   */
  @VsoMethod
  public String getDefaultString() {
    return defaultString;
  }

  /**
   * This is the setter method to the attribute.
   * Default string field.
   * Field introduced in 30.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as "default string".
   * @param defaultString set the defaultString.
   */
  @VsoMethod
  public void setDefaultString(String  defaultString) {
    this.defaultString = defaultString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Default int32 field.
   * Field introduced in 30.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @return defaultThirdInt
   */
  @VsoMethod
  public Integer getDefaultThirdInt() {
    return defaultThirdInt;
  }

  /**
   * This is the setter method to the attribute.
   * Default int32 field.
   * Field introduced in 30.1.2.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as 3.
   * @param defaultThirdInt set the defaultThirdInt.
   */
  @VsoMethod
  public void setDefaultThirdInt(Integer  defaultThirdInt) {
    this.defaultThirdInt = defaultThirdInt;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Optional message for nested f_mandatory test cases defined at level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryTest
   */
  @VsoMethod
  public L1FMandatoryTestCase getMandatoryTest() {
    return mandatoryTest;
  }

  /**
   * This is the setter method to the attribute.
   * Optional message for nested f_mandatory test cases defined at level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param mandatoryTest set the mandatoryTest.
   */
  @VsoMethod
  public void setMandatoryTest(L1FMandatoryTestCase mandatoryTest) {
    this.mandatoryTest = mandatoryTest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Repeated message for nested f_mandatory test cases-level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryTests
   */
  @VsoMethod
  public List<L1FMandatoryTestCase> getMandatoryTests() {
    return mandatoryTests;
  }

  /**
   * This is the setter method. this will set the mandatoryTests
   * Repeated message for nested f_mandatory test cases-level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryTests
   */
  @VsoMethod
  public void setMandatoryTests(List<L1FMandatoryTestCase>  mandatoryTests) {
    this.mandatoryTests = mandatoryTests;
  }

  /**
   * This is the setter method this will set the mandatoryTests
   * Repeated message for nested f_mandatory test cases-level1.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return mandatoryTests
   */
  @VsoMethod
  public WebappUT addMandatoryTestsItem(L1FMandatoryTestCase mandatoryTestsItem) {
    if (this.mandatoryTests == null) {
      this.mandatoryTests = new ArrayList<L1FMandatoryTestCase>();
    }
    this.mandatoryTests.add(mandatoryTestsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Name of the webapput object-level0.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return name
   */
  @VsoMethod
  public String getName() {
    return name;
  }

  /**
   * This is the setter method to the attribute.
   * Name of the webapput object-level0.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param name set the name.
   */
  @VsoMethod
  public void setName(String  name) {
    this.name = name;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Optional message for nested f_sensitive test cases defined at level1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sensitiveTest
   */
  @VsoMethod
  public L1FSensitiveTestCase getSensitiveTest() {
    return sensitiveTest;
  }

  /**
   * This is the setter method to the attribute.
   * Optional message for nested f_sensitive test cases defined at level1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param sensitiveTest set the sensitiveTest.
   */
  @VsoMethod
  public void setSensitiveTest(L1FSensitiveTestCase sensitiveTest) {
    this.sensitiveTest = sensitiveTest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Repeated message for nested f_sensitive test cases-level1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sensitiveTests
   */
  @VsoMethod
  public List<L1FSensitiveTestCase> getSensitiveTests() {
    return sensitiveTests;
  }

  /**
   * This is the setter method. this will set the sensitiveTests
   * Repeated message for nested f_sensitive test cases-level1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sensitiveTests
   */
  @VsoMethod
  public void setSensitiveTests(List<L1FSensitiveTestCase>  sensitiveTests) {
    this.sensitiveTests = sensitiveTests;
  }

  /**
   * This is the setter method this will set the sensitiveTests
   * Repeated message for nested f_sensitive test cases-level1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return sensitiveTests
   */
  @VsoMethod
  public WebappUT addSensitiveTestsItem(L1FSensitiveTestCase sensitiveTestsItem) {
    if (this.sensitiveTests == null) {
      this.sensitiveTests = new ArrayList<L1FSensitiveTestCase>();
    }
    this.sensitiveTests.add(sensitiveTestsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Optional bool for nested skip_optional_check test cases-level1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return skipOptionalCheckTests
   */
  @VsoMethod
  public Boolean getSkipOptionalCheckTests() {
    return skipOptionalCheckTests;
  }

  /**
   * This is the setter method to the attribute.
   * Optional bool for nested skip_optional_check test cases-level1.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param skipOptionalCheckTests set the skipOptionalCheckTests.
   */
  @VsoMethod
  public void setSkipOptionalCheckTests(Boolean  skipOptionalCheckTests) {
    this.skipOptionalCheckTests = skipOptionalCheckTests;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Optional message for nested  max string length test cases.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringLengthTest
   */
  @VsoMethod
  public L1StringLengthTestCase getStringLengthTest() {
    return stringLengthTest;
  }

  /**
   * This is the setter method to the attribute.
   * Optional message for nested  max string length test cases.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param stringLengthTest set the stringLengthTest.
   */
  @VsoMethod
  public void setStringLengthTest(L1StringLengthTestCase stringLengthTest) {
    this.stringLengthTest = stringLengthTest;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Repeated message for nested  max string length test cases.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringLengthTests
   */
  @VsoMethod
  public List<L1StringLengthTestCase> getStringLengthTests() {
    return stringLengthTests;
  }

  /**
   * This is the setter method. this will set the stringLengthTests
   * Repeated message for nested  max string length test cases.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringLengthTests
   */
  @VsoMethod
  public void setStringLengthTests(List<L1StringLengthTestCase>  stringLengthTests) {
    this.stringLengthTests = stringLengthTests;
  }

  /**
   * This is the setter method this will set the stringLengthTests
   * Repeated message for nested  max string length test cases.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return stringLengthTests
   */
  @VsoMethod
  public WebappUT addStringLengthTestsItem(L1StringLengthTestCase stringLengthTestsItem) {
    if (this.stringLengthTests == null) {
      this.stringLengthTests = new ArrayList<L1StringLengthTestCase>();
    }
    this.stringLengthTests.add(stringLengthTestsItem);
    return this;
  }


  /**
   * This is the getter method this will return the attribute value.
   * Tenant of the webapput object-level0.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return tenantRef
   */
  @VsoMethod
  public String getTenantRef() {
    return tenantRef;
  }

  /**
   * This is the setter method to the attribute.
   * Tenant of the webapput object-level0.
   * It is a reference to an object of type tenant.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param tenantRef set the tenantRef.
   */
  @VsoMethod
  public void setTenantRef(String  tenantRef) {
    this.tenantRef = tenantRef;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The string for sensitive (secret) field.
   * Object-level0.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return testSensitiveString
   */
  @VsoMethod
  public String getTestSensitiveString() {
    return testSensitiveString;
  }

  /**
   * This is the setter method to the attribute.
   * The string for sensitive (secret) field.
   * Object-level0.
   * Field introduced in 22.1.3.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param testSensitiveString set the testSensitiveString.
   */
  @VsoMethod
  public void setTestSensitiveString(String  testSensitiveString) {
    this.testSensitiveString = testSensitiveString;
  }

  /**
   * This is the getter method this will return the attribute value.
   * The maximum string length.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return testString
   */
  @VsoMethod
  public String getTestString() {
    return testString;
  }

  /**
   * This is the setter method to the attribute.
   * The maximum string length.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param testString set the testString.
   */
  @VsoMethod
  public void setTestString(String  testString) {
    this.testString = testString;
  }
/**
   * This is the getter method this will return the attribute value.
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public String getUrl() {
    return url;
  }

  /**
   * This is the setter method. this will set the url
   * Avi controller URL of the object.
   * @return url
   */
  @VsoMethod
  public void setUrl(String  url) {
    this.url = url;
  }

  /**
   * This is the getter method this will return the attribute value.
   * Uuid of the webapput object-level0.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @return uuid
   */
  @VsoMethod
  public String getUuid() {
    return uuid;
  }

  /**
   * This is the setter method to the attribute.
   * Uuid of the webapput object-level0.
   * Field introduced in 21.1.5, 22.1.1.
   * Allowed in enterprise edition with any value, enterprise with cloud services edition.
   * Default value when not specified in API or module is interpreted by Avi Controller as null.
   * @param uuid set the uuid.
   */
  @VsoMethod
  public void setUuid(String  uuid) {
    this.uuid = uuid;
  }


  public String getObjectID() {
    return name + "(" + uuid  + ")";
  }

@Override
public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
  WebappUT objWebappUT = (WebappUT) o;
  return   Objects.equals(this.uuid, objWebappUT.uuid)&&
  Objects.equals(this.name, objWebappUT.name)&&
  Objects.equals(this.tenantRef, objWebappUT.tenantRef)&&
  Objects.equals(this.testString, objWebappUT.testString)&&
  Objects.equals(this.mandatoryTest, objWebappUT.mandatoryTest)&&
  Objects.equals(this.mandatoryTests, objWebappUT.mandatoryTests)&&
  Objects.equals(this.stringLengthTest, objWebappUT.stringLengthTest)&&
  Objects.equals(this.stringLengthTests, objWebappUT.stringLengthTests)&&
  Objects.equals(this.testSensitiveString, objWebappUT.testSensitiveString)&&
  Objects.equals(this.sensitiveTest, objWebappUT.sensitiveTest)&&
  Objects.equals(this.sensitiveTests, objWebappUT.sensitiveTests)&&
  Objects.equals(this.skipOptionalCheckTests, objWebappUT.skipOptionalCheckTests)&&
  Objects.equals(this.defaultString, objWebappUT.defaultString)&&
  Objects.equals(this.defaultFirstInt, objWebappUT.defaultFirstInt)&&
  Objects.equals(this.defaultSecondInt, objWebappUT.defaultSecondInt)&&
  Objects.equals(this.defaultThirdInt, objWebappUT.defaultThirdInt);
}

@Override
public String toString() {
  StringBuilder sb = new StringBuilder();
  sb.append("class WebappUT {\n");
      sb.append("    defaultFirstInt: ").append(toIndentedString(defaultFirstInt)).append("\n");
        sb.append("    defaultSecondInt: ").append(toIndentedString(defaultSecondInt)).append("\n");
        sb.append("    defaultString: ").append(toIndentedString(defaultString)).append("\n");
        sb.append("    defaultThirdInt: ").append(toIndentedString(defaultThirdInt)).append("\n");
        sb.append("    mandatoryTest: ").append(toIndentedString(mandatoryTest)).append("\n");
        sb.append("    mandatoryTests: ").append(toIndentedString(mandatoryTests)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sensitiveTest: ").append(toIndentedString(sensitiveTest)).append("\n");
        sb.append("    sensitiveTests: ").append(toIndentedString(sensitiveTests)).append("\n");
        sb.append("    skipOptionalCheckTests: ").append(toIndentedString(skipOptionalCheckTests)).append("\n");
        sb.append("    stringLengthTest: ").append(toIndentedString(stringLengthTest)).append("\n");
        sb.append("    stringLengthTests: ").append(toIndentedString(stringLengthTests)).append("\n");
        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
        sb.append("    testSensitiveString: ").append(toIndentedString(testSensitiveString)).append("\n");
        sb.append("    testString: ").append(toIndentedString(testString)).append("\n");
            sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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

