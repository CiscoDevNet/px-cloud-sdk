
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

import com.cisco.px.client.JSON;
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

/**
 * SimilarDeviceData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:34:07.228086Z[GMT]")
public class SimilarDeviceData {
  public static final String SERIALIZED_NAME_ASSET_ID = "assetId";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private String assetId;

  public static final String SERIALIZED_NAME_ASSET_NAME = "assetName";
  @SerializedName(SERIALIZED_NAME_ASSET_NAME)
  private String assetName;

  public static final String SERIALIZED_NAME_PRODUCT_FAMILY = "productFamily";
  @SerializedName(SERIALIZED_NAME_PRODUCT_FAMILY)
  private String productFamily;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private String productId;

  public static final String SERIALIZED_NAME_SOFTWARE_RELEASE = "softwareRelease";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_RELEASE)
  private String softwareRelease;

  public static final String SERIALIZED_NAME_SOFTWARE_TYPE = "softwareType";
  @SerializedName(SERIALIZED_NAME_SOFTWARE_TYPE)
  private String softwareType;

  public static final String SERIALIZED_NAME_RISK = "risk";
  @SerializedName(SERIALIZED_NAME_RISK)
  private String risk;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "serialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_SIMILARITY_SCORE = "similarityScore";
  @SerializedName(SERIALIZED_NAME_SIMILARITY_SCORE)
  private Double similarityScore;

  public SimilarDeviceData() { 
  }

  public SimilarDeviceData assetId(String assetId) {
    
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


  public SimilarDeviceData assetName(String assetName) {
    
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


  public SimilarDeviceData productFamily(String productFamily) {
    
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


  public SimilarDeviceData productId(String productId) {
    
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


  public SimilarDeviceData softwareRelease(String softwareRelease) {
    
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


  public SimilarDeviceData softwareType(String softwareType) {
    
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


  public SimilarDeviceData risk(String risk) {
    
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRisk() {
    return risk;
  }


  public void setRisk(String risk) {
    this.risk = risk;
  }


  public SimilarDeviceData serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public SimilarDeviceData similarityScore(Double similarityScore) {
    
    this.similarityScore = similarityScore;
    return this;
  }

   /**
   * Get similarityScore
   * @return similarityScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getSimilarityScore() {
    return similarityScore;
  }


  public void setSimilarityScore(Double similarityScore) {
    this.similarityScore = similarityScore;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarDeviceData similarDeviceData = (SimilarDeviceData) o;
    return Objects.equals(this.assetId, similarDeviceData.assetId) &&
        Objects.equals(this.assetName, similarDeviceData.assetName) &&
        Objects.equals(this.productFamily, similarDeviceData.productFamily) &&
        Objects.equals(this.productId, similarDeviceData.productId) &&
        Objects.equals(this.softwareRelease, similarDeviceData.softwareRelease) &&
        Objects.equals(this.softwareType, similarDeviceData.softwareType) &&
        Objects.equals(this.risk, similarDeviceData.risk) &&
        Objects.equals(this.serialNumber, similarDeviceData.serialNumber) &&
        Objects.equals(this.similarityScore, similarDeviceData.similarityScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, assetName, productFamily, productId, softwareRelease, softwareType, risk, serialNumber, similarityScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarDeviceData {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
    sb.append("    productFamily: ").append(toIndentedString(productFamily)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    softwareRelease: ").append(toIndentedString(softwareRelease)).append("\n");
    sb.append("    softwareType: ").append(toIndentedString(softwareType)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    similarityScore: ").append(toIndentedString(similarityScore)).append("\n");
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
    openapiFields.add("productFamily");
    openapiFields.add("productId");
    openapiFields.add("softwareRelease");
    openapiFields.add("softwareType");
    openapiFields.add("risk");
    openapiFields.add("serialNumber");
    openapiFields.add("similarityScore");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimilarDeviceData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SimilarDeviceData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimilarDeviceData is not found in the empty JSON string", SimilarDeviceData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SimilarDeviceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimilarDeviceData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("assetId") != null && !jsonObj.get("assetId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetId").toString()));
      }
      if (jsonObj.get("assetName") != null && !jsonObj.get("assetName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetName").toString()));
      }
      if (jsonObj.get("productFamily") != null && !jsonObj.get("productFamily").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productFamily` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productFamily").toString()));
      }
      if (jsonObj.get("productId") != null && !jsonObj.get("productId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `productId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("productId").toString()));
      }
      if (jsonObj.get("softwareRelease") != null && !jsonObj.get("softwareRelease").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareRelease` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareRelease").toString()));
      }
      if (jsonObj.get("softwareType") != null && !jsonObj.get("softwareType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `softwareType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("softwareType").toString()));
      }
      if (jsonObj.get("risk") != null && !jsonObj.get("risk").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `risk` to be a primitive type in the JSON string but got `%s`", jsonObj.get("risk").toString()));
      }
      if (jsonObj.get("serialNumber") != null && !jsonObj.get("serialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serialNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimilarDeviceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimilarDeviceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimilarDeviceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimilarDeviceData.class));

       return (TypeAdapter<T>) new TypeAdapter<SimilarDeviceData>() {
           @Override
           public void write(JsonWriter out, SimilarDeviceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimilarDeviceData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimilarDeviceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimilarDeviceData
  * @throws IOException if the JSON string is invalid with respect to SimilarDeviceData
  */
  public static SimilarDeviceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimilarDeviceData.class);
  }

 /**
  * Convert an instance of SimilarDeviceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

