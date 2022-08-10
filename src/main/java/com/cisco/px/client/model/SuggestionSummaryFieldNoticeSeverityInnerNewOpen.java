
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
 * Number of new field notices the current Cisco software releases are exposed to compared to the current Cisco software releases
 */
@ApiModel(description = "Number of new field notices the current Cisco software releases are exposed to compared to the current Cisco software releases")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-03T16:36:10.038229Z[GMT]")
public class SuggestionSummaryFieldNoticeSeverityInnerNewOpen {
  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private Long medium;

  public SuggestionSummaryFieldNoticeSeverityInnerNewOpen() { 
  }

  public SuggestionSummaryFieldNoticeSeverityInnerNewOpen medium(Long medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Number of new medium impact field notices the current Cisco software releases are exposed to
   * @return medium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of new medium impact field notices the current Cisco software releases are exposed to")

  public Long getMedium() {
    return medium;
  }


  public void setMedium(Long medium) {
    this.medium = medium;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuggestionSummaryFieldNoticeSeverityInnerNewOpen suggestionSummaryFieldNoticeSeverityInnerNewOpen = (SuggestionSummaryFieldNoticeSeverityInnerNewOpen) o;
    return Objects.equals(this.medium, suggestionSummaryFieldNoticeSeverityInnerNewOpen.medium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(medium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestionSummaryFieldNoticeSeverityInnerNewOpen {\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
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
    openapiFields.add("medium");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestionSummaryFieldNoticeSeverityInnerNewOpen
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SuggestionSummaryFieldNoticeSeverityInnerNewOpen.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestionSummaryFieldNoticeSeverityInnerNewOpen is not found in the empty JSON string", SuggestionSummaryFieldNoticeSeverityInnerNewOpen.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SuggestionSummaryFieldNoticeSeverityInnerNewOpen.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SuggestionSummaryFieldNoticeSeverityInnerNewOpen` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestionSummaryFieldNoticeSeverityInnerNewOpen.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestionSummaryFieldNoticeSeverityInnerNewOpen' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestionSummaryFieldNoticeSeverityInnerNewOpen> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestionSummaryFieldNoticeSeverityInnerNewOpen.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestionSummaryFieldNoticeSeverityInnerNewOpen>() {
           @Override
           public void write(JsonWriter out, SuggestionSummaryFieldNoticeSeverityInnerNewOpen value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SuggestionSummaryFieldNoticeSeverityInnerNewOpen read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SuggestionSummaryFieldNoticeSeverityInnerNewOpen given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestionSummaryFieldNoticeSeverityInnerNewOpen
  * @throws IOException if the JSON string is invalid with respect to SuggestionSummaryFieldNoticeSeverityInnerNewOpen
  */
  public static SuggestionSummaryFieldNoticeSeverityInnerNewOpen fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestionSummaryFieldNoticeSeverityInnerNewOpen.class);
  }

 /**
  * Convert an instance of SuggestionSummaryFieldNoticeSeverityInnerNewOpen to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

