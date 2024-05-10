/*
 * PX Cloud for Success Tracks API
 * PX Cloud for Success Tracks API
 *
 * The version of the OpenAPI document: 0.9.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cisco.px.client.model;

import java.util.Objects;
import com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityExposed;
import com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityFixed;
import com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityNewExposed;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cisco.px.client.JSON;

/**
 * Number of security advisories the current Cisco software releases are exposed to that are addressed by the suggested release
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T19:31:00.454334Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SuggestionSummaryAdvisoriesSeverity {
  public static final String SERIALIZED_NAME_EXPOSED = "Exposed";
  @SerializedName(SERIALIZED_NAME_EXPOSED)
  private SuggestionSummaryAdvisoriesSeverityExposed exposed;

  public static final String SERIALIZED_NAME_NEW_EXPOSED = "New_Exposed";
  @SerializedName(SERIALIZED_NAME_NEW_EXPOSED)
  private SuggestionSummaryAdvisoriesSeverityNewExposed newExposed;

  public static final String SERIALIZED_NAME_FIXED = "Fixed";
  @SerializedName(SERIALIZED_NAME_FIXED)
  private SuggestionSummaryAdvisoriesSeverityFixed fixed;

  public SuggestionSummaryAdvisoriesSeverity() {
  }

  public SuggestionSummaryAdvisoriesSeverity exposed(SuggestionSummaryAdvisoriesSeverityExposed exposed) {
    this.exposed = exposed;
    return this;
  }

   /**
   * Get exposed
   * @return exposed
  **/
  @javax.annotation.Nullable
  public SuggestionSummaryAdvisoriesSeverityExposed getExposed() {
    return exposed;
  }

  public void setExposed(SuggestionSummaryAdvisoriesSeverityExposed exposed) {
    this.exposed = exposed;
  }


  public SuggestionSummaryAdvisoriesSeverity newExposed(SuggestionSummaryAdvisoriesSeverityNewExposed newExposed) {
    this.newExposed = newExposed;
    return this;
  }

   /**
   * Get newExposed
   * @return newExposed
  **/
  @javax.annotation.Nullable
  public SuggestionSummaryAdvisoriesSeverityNewExposed getNewExposed() {
    return newExposed;
  }

  public void setNewExposed(SuggestionSummaryAdvisoriesSeverityNewExposed newExposed) {
    this.newExposed = newExposed;
  }


  public SuggestionSummaryAdvisoriesSeverity fixed(SuggestionSummaryAdvisoriesSeverityFixed fixed) {
    this.fixed = fixed;
    return this;
  }

   /**
   * Get fixed
   * @return fixed
  **/
  @javax.annotation.Nullable
  public SuggestionSummaryAdvisoriesSeverityFixed getFixed() {
    return fixed;
  }

  public void setFixed(SuggestionSummaryAdvisoriesSeverityFixed fixed) {
    this.fixed = fixed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionSummaryAdvisoriesSeverity suggestionSummaryAdvisoriesSeverity = (SuggestionSummaryAdvisoriesSeverity) o;
    return Objects.equals(this.exposed, suggestionSummaryAdvisoriesSeverity.exposed) &&
        Objects.equals(this.newExposed, suggestionSummaryAdvisoriesSeverity.newExposed) &&
        Objects.equals(this.fixed, suggestionSummaryAdvisoriesSeverity.fixed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exposed, newExposed, fixed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionSummaryAdvisoriesSeverity {\n");
    sb.append("    exposed: ").append(toIndentedString(exposed)).append("\n");
    sb.append("    newExposed: ").append(toIndentedString(newExposed)).append("\n");
    sb.append("    fixed: ").append(toIndentedString(fixed)).append("\n");
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
    openapiFields.add("Exposed");
    openapiFields.add("New_Exposed");
    openapiFields.add("Fixed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SuggestionSummaryAdvisoriesSeverity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SuggestionSummaryAdvisoriesSeverity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionSummaryAdvisoriesSeverity is not found in the empty JSON string", SuggestionSummaryAdvisoriesSeverity.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SuggestionSummaryAdvisoriesSeverity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionSummaryAdvisoriesSeverity` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `Exposed`
      if (jsonObj.get("Exposed") != null && !jsonObj.get("Exposed").isJsonNull()) {
        SuggestionSummaryAdvisoriesSeverityExposed.validateJsonElement(jsonObj.get("Exposed"));
      }
      // validate the optional field `New_Exposed`
      if (jsonObj.get("New_Exposed") != null && !jsonObj.get("New_Exposed").isJsonNull()) {
        SuggestionSummaryAdvisoriesSeverityNewExposed.validateJsonElement(jsonObj.get("New_Exposed"));
      }
      // validate the optional field `Fixed`
      if (jsonObj.get("Fixed") != null && !jsonObj.get("Fixed").isJsonNull()) {
        SuggestionSummaryAdvisoriesSeverityFixed.validateJsonElement(jsonObj.get("Fixed"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionSummaryAdvisoriesSeverity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionSummaryAdvisoriesSeverity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionSummaryAdvisoriesSeverity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionSummaryAdvisoriesSeverity.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionSummaryAdvisoriesSeverity>() {
           @Override
           public void write(JsonWriter out, SuggestionSummaryAdvisoriesSeverity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionSummaryAdvisoriesSeverity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionSummaryAdvisoriesSeverity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionSummaryAdvisoriesSeverity
  * @throws IOException if the JSON string is invalid with respect to SuggestionSummaryAdvisoriesSeverity
  */
  public static SuggestionSummaryAdvisoriesSeverity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionSummaryAdvisoriesSeverity.class);
  }

 /**
  * Convert an instance of SuggestionSummaryAdvisoriesSeverity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

