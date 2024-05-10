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


package com.cisco.px.client;

import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.TimeZone;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    private static final StdDateFormat sdf = new StdDateFormat()
        .withTimeZone(TimeZone.getTimeZone(ZoneId.systemDefault()))
        .withColonInTimeZone(true);
    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    static {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AccSessionAttendees.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AffectedAssets.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AffectedAssetsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.Asset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetSession.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetViolation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetViolationsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetsFaultHistory.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetsFaultHistoryResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetsViolations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetsViolationsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetsWithViolations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.AssetsWithViolationsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.Contract.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ContractDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ContractDetailsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ContractDetailsV2Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ContractResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ContractV2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ContractV2Details.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ContractsV2Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.Crash.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.CrashRiskDevice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.CrashRiskDevices.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.Customer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.CustomerDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.CustomerInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.CustomerResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.DeviceCrashDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.DeviceDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.DeviceRiskFactors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.DeviceRiskFactorsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ErrorResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.Faults.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.FaultsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.FaultsSummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.FaultsSummaryResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.InventoryCrashDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.LicensesPaginationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.LicensesResponseDTO.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.OptInResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.Pagination.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.PartnerAsset.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.PartnerAssetResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.PartnerOffer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.PartnerOfferAttendee.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.PartnerOfferSession.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.PartnerOfferWithSessions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.PartnerOffersInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.PolicyRuleDetails.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.RacetrackBuid.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.RacetrackBuidPitstop.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.RacetrackBuidPitstopAction.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.RacetrackBuidSolution.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.RacetrackTooltip.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.RacetrackUsecase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ReleaseSummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.Report.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ReportStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SimilarDeviceData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SimilarDevices.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroupBugs.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroupBugsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroupFieldNotices.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroupFieldNoticesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroupResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroupRisk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroupSecurityAdvisories.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroupSecurityAdvisoriesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SoftwareGroupSuggestions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SolutionMapping.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuccessTrack.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuccessTrackChecklistMapping.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuccessTrackMapping.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuccessTrackUsecasesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuccessTracks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuccessTracksResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.Suggestion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityExposed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityFixed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryAdvisoriesSeverityNewExposed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryBugSeverity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryBugSeverityExposed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryBugSeverityFixed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryBugSeverityNewExposed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryFeaturesCount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryFieldNoticeSeverity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryFieldNoticeSeverityExposed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryFieldNoticeSeverityFixed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionSummaryFieldNoticeSeverityNewExposed.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.SuggestionsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.UniqueContract.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.UniqueContractsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ViolationSummary.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.cisco.px.client.model.ViolationSummaryResponse.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(sdf.parse(date).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, DateTimeFormatter will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toInstant().atOffset(ZoneOffset.UTC).format(dtf);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return sdf.parse(date);
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
