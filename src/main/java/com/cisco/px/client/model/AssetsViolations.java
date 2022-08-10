
package com.cisco.px.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cisco.px.client.JSON;

/**
 * AssetsViolations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:05.060218Z[GMT]")
public class AssetsViolations {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_ASSET_NAME = "assetName";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_SOFTWARE_TYPE = "softwareType";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_TYPE)
  private String softwareType;

  public static final String SERIALIZED_NAME_SOFTWARE_RELEASE = "softwareRelease";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_RELEASE)
  private String softwareRelease;

  public static final String SERIALIZED_NAME_PRODUCT_FAMILY = "productFamily";
  @SerializedName(SERIALIZED_NAME_PRODUCT_FAMILY)
  private String productFamily;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private String severity;

  public static final String SERIALIZED_NAME_LAST_CHECKED = "lastChecked";
  @SerializedName(SERIALIZED_NAME_LAST_CHECKED)
  private String lastChecked;

  public static final String SERIALIZED_NAME_SCAN_STATUS = "scanStatus";
  @SerializedName(SERIALIZED_NAME_SCAN_STATUS)
  private Boolean scanStatus;

  public static final String SERIALIZED_NAME_VIOLATION_COUNT = "violationCount";
  @SerializedName(SERIALIZED_NAME_VIOLATION_COUNT)
  private Long violationCount;

  public AssetsViolations() { 
  }

  public AssetsViolations assetId(String assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetId() {
    return assetId;
  }


  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }


  public AssetsViolations assetName(String assetName) {
    
    this.assetName = assetName;
    return this;
  }

   /**
   * Get assetName
   * @return assetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetName() {
    return assetName;
  }


  public void setAssetName(String assetName) {
    this.assetName = assetName;
  }


  public AssetsViolations ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public AssetsViolations softwareType(String softwareType) {
    
    this.softwareType = softwareType;
    return this;
  }

   /**
   * Get softwareType
   * @return softwareType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSoftwareType() {
    return softwareType;
  }


  public void setSoftwareType(String softwareType) {
    this.softwareType = softwareType;
  }


  public AssetsViolations softwareRelease(String softwareRelease) {
    
    this.softwareRelease = softwareRelease;
    return this;
  }

   /**
   * Get softwareRelease
   * @return softwareRelease
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSoftwareRelease() {
    return softwareRelease;
  }


  public void setSoftwareRelease(String softwareRelease) {
    this.softwareRelease = softwareRelease;
  }


  public AssetsViolations productFamily(String productFamily) {
    
    this.productFamily = productFamily;
    return this;
  }

   /**
   * Get productFamily
   * @return productFamily
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductFamily() {
    return productFamily;
  }


  public void setProductFamily(String productFamily) {
    this.productFamily = productFamily;
  }


  public AssetsViolations productId(String productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductId() {
    return productId;
  }


  public void setProductId(String productId) {
    this.productId = productId;
  }


  public AssetsViolations severity(String severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSeverity() {
    return severity;
  }


  public void setSeverity(String severity) {
    this.severity = severity;
  }


  public AssetsViolations lastChecked(String lastChecked) {
    
    this.lastChecked = lastChecked;
    return this;
  }

   /**
   * Get lastChecked
   * @return lastChecked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastChecked() {
    return lastChecked;
  }


  public void setLastChecked(String lastChecked) {
    this.lastChecked = lastChecked;
  }


  public AssetsViolations scanStatus(Boolean scanStatus) {
    
    this.scanStatus = scanStatus;
    return this;
  }

   /**
   * Get scanStatus
   * @return scanStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getScanStatus() {
    return scanStatus;
  }


  public void setScanStatus(Boolean scanStatus) {
    this.scanStatus = scanStatus;
  }


  public AssetsViolations violationCount(Long violationCount) {
    
    this.violationCount = violationCount;
    return this;
  }

   /**
   * Get violationCount
   * @return violationCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getViolationCount() {
    return violationCount;
  }


  public void setViolationCount(Long violationCount) {
    this.violationCount = violationCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsViolations assetsViolations = (AssetsViolations) o;
    return Objects.equals(this.assetId, assetsViolations.assetId) &&
        Objects.equals(this.assetName, assetsViolations.assetName) &&
        Objects.equals(this.ipAddress, assetsViolations.ipAddress) &&
        Objects.equals(this.softwareType, assetsViolations.softwareType) &&
        Objects.equals(this.softwareRelease, assetsViolations.softwareRelease) &&
        Objects.equals(this.productFamily, assetsViolations.productFamily) &&
        Objects.equals(this.productId, assetsViolations.productId) &&
        Objects.equals(this.severity, assetsViolations.severity) &&
        Objects.equals(this.lastChecked, assetsViolations.lastChecked) &&
        Objects.equals(this.scanStatus, assetsViolations.scanStatus) &&
        Objects.equals(this.violationCount, assetsViolations.violationCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName, ipAddress, softwareType, softwareRelease, productFamily, productId, severity, lastChecked, scanStatus, violationCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsViolations {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    softwareType: ").append(toIndentedString(softwareType)).append("\n");
    sb.append("    softwareRelease: ").append(toIndentedString(softwareRelease)).append("\n");
    sb.append("    productFamily: ").append(toIndentedString(productFamily)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    lastChecked: ").append(toIndentedString(lastChecked)).append("\n");
    sb.append("    scanStatus: ").append(toIndentedString(scanStatus)).append("\n");
    sb.append("    violationCount: ").append(toIndentedString(violationCount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("assetId");
    openapiFields.add("assetName");
    openapiFields.add("ipAddress");
    openapiFields.add("softwareType");
    openapiFields.add("softwareRelease");
    openapiFields.add("productFamily");
    openapiFields.add("productId");
    openapiFields.add("severity");
    openapiFields.add("lastChecked");
    openapiFields.add("scanStatus");
    openapiFields.add("violationCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssetsViolations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssetsViolations.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssetsViolations is not found in the empty JSON string", AssetsViolations.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AssetsViolations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssetsViolations` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("assetName") != null && !jsonObj.get("assetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetName").toString()));
      }
      if (jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ipAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ipAddress").toString()));
      }
      if (jsonObj.get("softwareType") != null && !jsonObj.get("softwareType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareType").toString()));
      }
      if (jsonObj.get("softwareRelease") != null && !jsonObj.get("softwareRelease").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareRelease` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareRelease").toString()));
      }
      if (jsonObj.get("productFamily") != null && !jsonObj.get("productFamily").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productFamily` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productFamily").toString()));
      }
      if (jsonObj.get("productId") != null && !jsonObj.get("productId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productId").toString()));
      }
      if (jsonObj.get("severity") != null && !jsonObj.get("severity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `severity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("severity").toString()));
      }
      if (jsonObj.get("lastChecked") != null && !jsonObj.get("lastChecked").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastChecked` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastChecked").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetsViolations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetsViolations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetsViolations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetsViolations.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetsViolations>() {
           @Override
           public void write(JsonWriter out, AssetsViolations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetsViolations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetsViolations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetsViolations
  * @throws IOException if the JSON string is invalid with respect to AssetsViolations
  */
  public static AssetsViolations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetsViolations.class);
  }

 /**
  * Convert an instance of AssetsViolations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

