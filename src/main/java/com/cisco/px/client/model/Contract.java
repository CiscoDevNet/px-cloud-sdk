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
 * Contract
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T19:31:00.454334Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Contract {
  public static final String SERIALIZED_NAME_CONTRACT_NUMBER = "contractNumber";
  @SerializedName(SERIALIZED_NAME_CONTRACT_NUMBER)
  private String contractNumber;

  public static final String SERIALIZED_NAME_CUID = "cuid";
  @SerializedName(SERIALIZED_NAME_CUID)
  private Long cuid;

  public static final String SERIALIZED_NAME_CAVID = "cavid";
  @SerializedName(SERIALIZED_NAME_CAVID)
  private Long cavid;

  public static final String SERIALIZED_NAME_CONTRACT_STATUS = "contractStatus";
  @SerializedName(SERIALIZED_NAME_CONTRACT_STATUS)
  private String contractStatus;

  public static final String SERIALIZED_NAME_CONTRACT_VALUE = "contractValue";
  @SerializedName(SERIALIZED_NAME_CONTRACT_VALUE)
  private Long contractValue;

  public static final String SERIALIZED_NAME_CUSTOMER_G_U_NAME = "customerGUName";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_G_U_NAME)
  private String customerGUName;

  public static final String SERIALIZED_NAME_CUSTOMER_NAME = "customerName";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_NAME)
  private String customerName;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_SERVICE_LEVEL = "serviceLevel";
  @SerializedName(SERIALIZED_NAME_SERVICE_LEVEL)
  private String serviceLevel;

  public static final String SERIALIZED_NAME_SERVICE_PROGRAM = "serviceProgram";
  @SerializedName(SERIALIZED_NAME_SERVICE_PROGRAM)
  private String serviceProgram;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_CURRENCY_SYMBOL = "currencySymbol";
  @SerializedName(SERIALIZED_NAME_CURRENCY_SYMBOL)
  private String currencySymbol;

  public static final String SERIALIZED_NAME_ONBOARDEDSTATUS = "onboardedstatus";
  @SerializedName(SERIALIZED_NAME_ONBOARDEDSTATUS)
  private Long onboardedstatus;

  public Contract() {
  }

  public Contract contractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
    return this;
  }

   /**
   * Get contractNumber
   * @return contractNumber
  **/
  @javax.annotation.Nullable
  public String getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(String contractNumber) {
    this.contractNumber = contractNumber;
  }


  public Contract cuid(Long cuid) {
    this.cuid = cuid;
    return this;
  }

   /**
   * Get cuid
   * @return cuid
  **/
  @javax.annotation.Nullable
  public Long getCuid() {
    return cuid;
  }

  public void setCuid(Long cuid) {
    this.cuid = cuid;
  }


  public Contract cavid(Long cavid) {
    this.cavid = cavid;
    return this;
  }

   /**
   * Get cavid
   * @return cavid
  **/
  @javax.annotation.Nullable
  public Long getCavid() {
    return cavid;
  }

  public void setCavid(Long cavid) {
    this.cavid = cavid;
  }


  public Contract contractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
    return this;
  }

   /**
   * Get contractStatus
   * @return contractStatus
  **/
  @javax.annotation.Nullable
  public String getContractStatus() {
    return contractStatus;
  }

  public void setContractStatus(String contractStatus) {
    this.contractStatus = contractStatus;
  }


  public Contract contractValue(Long contractValue) {
    this.contractValue = contractValue;
    return this;
  }

   /**
   * Get contractValue
   * @return contractValue
  **/
  @javax.annotation.Nullable
  public Long getContractValue() {
    return contractValue;
  }

  public void setContractValue(Long contractValue) {
    this.contractValue = contractValue;
  }


  public Contract customerGUName(String customerGUName) {
    this.customerGUName = customerGUName;
    return this;
  }

   /**
   * Get customerGUName
   * @return customerGUName
  **/
  @javax.annotation.Nullable
  public String getCustomerGUName() {
    return customerGUName;
  }

  public void setCustomerGUName(String customerGUName) {
    this.customerGUName = customerGUName;
  }


  public Contract customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @javax.annotation.Nullable
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public Contract currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Contract serviceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

   /**
   * Get serviceLevel
   * @return serviceLevel
  **/
  @javax.annotation.Nullable
  public String getServiceLevel() {
    return serviceLevel;
  }

  public void setServiceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
  }


  public Contract serviceProgram(String serviceProgram) {
    this.serviceProgram = serviceProgram;
    return this;
  }

   /**
   * Get serviceProgram
   * @return serviceProgram
  **/
  @javax.annotation.Nullable
  public String getServiceProgram() {
    return serviceProgram;
  }

  public void setServiceProgram(String serviceProgram) {
    this.serviceProgram = serviceProgram;
  }


  public Contract startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public Contract endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public Contract currencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
    return this;
  }

   /**
   * Get currencySymbol
   * @return currencySymbol
  **/
  @javax.annotation.Nullable
  public String getCurrencySymbol() {
    return currencySymbol;
  }

  public void setCurrencySymbol(String currencySymbol) {
    this.currencySymbol = currencySymbol;
  }


  public Contract onboardedstatus(Long onboardedstatus) {
    this.onboardedstatus = onboardedstatus;
    return this;
  }

   /**
   * Get onboardedstatus
   * @return onboardedstatus
  **/
  @javax.annotation.Nullable
  public Long getOnboardedstatus() {
    return onboardedstatus;
  }

  public void setOnboardedstatus(Long onboardedstatus) {
    this.onboardedstatus = onboardedstatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contract contract = (Contract) o;
    return Objects.equals(this.contractNumber, contract.contractNumber) &&
        Objects.equals(this.cuid, contract.cuid) &&
        Objects.equals(this.cavid, contract.cavid) &&
        Objects.equals(this.contractStatus, contract.contractStatus) &&
        Objects.equals(this.contractValue, contract.contractValue) &&
        Objects.equals(this.customerGUName, contract.customerGUName) &&
        Objects.equals(this.customerName, contract.customerName) &&
        Objects.equals(this.currency, contract.currency) &&
        Objects.equals(this.serviceLevel, contract.serviceLevel) &&
        Objects.equals(this.serviceProgram, contract.serviceProgram) &&
        Objects.equals(this.startDate, contract.startDate) &&
        Objects.equals(this.endDate, contract.endDate) &&
        Objects.equals(this.currencySymbol, contract.currencySymbol) &&
        Objects.equals(this.onboardedstatus, contract.onboardedstatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractNumber, cuid, cavid, contractStatus, contractValue, customerGUName, customerName, currency, serviceLevel, serviceProgram, startDate, endDate, currencySymbol, onboardedstatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contract {\n");
    sb.append("    contractNumber: ").append(toIndentedString(contractNumber)).append("\n");
    sb.append("    cuid: ").append(toIndentedString(cuid)).append("\n");
    sb.append("    cavid: ").append(toIndentedString(cavid)).append("\n");
    sb.append("    contractStatus: ").append(toIndentedString(contractStatus)).append("\n");
    sb.append("    contractValue: ").append(toIndentedString(contractValue)).append("\n");
    sb.append("    customerGUName: ").append(toIndentedString(customerGUName)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    serviceProgram: ").append(toIndentedString(serviceProgram)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    currencySymbol: ").append(toIndentedString(currencySymbol)).append("\n");
    sb.append("    onboardedstatus: ").append(toIndentedString(onboardedstatus)).append("\n");
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
    openapiFields.add("contractNumber");
    openapiFields.add("cuid");
    openapiFields.add("cavid");
    openapiFields.add("contractStatus");
    openapiFields.add("contractValue");
    openapiFields.add("customerGUName");
    openapiFields.add("customerName");
    openapiFields.add("currency");
    openapiFields.add("serviceLevel");
    openapiFields.add("serviceProgram");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("currencySymbol");
    openapiFields.add("onboardedstatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Contract
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Contract.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contract is not found in the empty JSON string", Contract.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Contract.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Contract` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("contractNumber") != null && !jsonObj.get("contractNumber").isJsonNull()) && !jsonObj.get("contractNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractNumber").toString()));
      }
      if ((jsonObj.get("contractStatus") != null && !jsonObj.get("contractStatus").isJsonNull()) && !jsonObj.get("contractStatus").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contractStatus` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contractStatus").toString()));
      }
      if ((jsonObj.get("customerGUName") != null && !jsonObj.get("customerGUName").isJsonNull()) && !jsonObj.get("customerGUName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerGUName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerGUName").toString()));
      }
      if ((jsonObj.get("customerName") != null && !jsonObj.get("customerName").isJsonNull()) && !jsonObj.get("customerName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerName").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if ((jsonObj.get("serviceLevel") != null && !jsonObj.get("serviceLevel").isJsonNull()) && !jsonObj.get("serviceLevel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceLevel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceLevel").toString()));
      }
      if ((jsonObj.get("serviceProgram") != null && !jsonObj.get("serviceProgram").isJsonNull()) && !jsonObj.get("serviceProgram").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceProgram` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceProgram").toString()));
      }
      if ((jsonObj.get("startDate") != null && !jsonObj.get("startDate").isJsonNull()) && !jsonObj.get("startDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startDate").toString()));
      }
      if ((jsonObj.get("endDate") != null && !jsonObj.get("endDate").isJsonNull()) && !jsonObj.get("endDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endDate").toString()));
      }
      if ((jsonObj.get("currencySymbol") != null && !jsonObj.get("currencySymbol").isJsonNull()) && !jsonObj.get("currencySymbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currencySymbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currencySymbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contract.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contract' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contract> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contract.class));

       return (TypeAdapter<T>) new TypeAdapter<Contract>() {
           @Override
           public void write(JsonWriter out, Contract value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Contract read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Contract given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Contract
  * @throws IOException if the JSON string is invalid with respect to Contract
  */
  public static Contract fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contract.class);
  }

 /**
  * Convert an instance of Contract to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

