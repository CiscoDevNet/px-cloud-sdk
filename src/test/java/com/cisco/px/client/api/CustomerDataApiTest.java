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


package com.cisco.px.client.api;

import com.cisco.px.client.ApiException;
import com.cisco.px.client.model.CustomerResponse;
import com.cisco.px.client.model.ErrorResponse;
import com.cisco.px.client.model.Report;
import com.cisco.px.client.model.ReportStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CustomerDataApi
 */
@Disabled
public class CustomerDataApiTest {

    private final CustomerDataApi api = new CustomerDataApi();

    /**
     * List customers
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCustomersTest() throws ApiException {
        Integer max = null;
        Integer offset = null;
        CustomerResponse response = api.getCustomers(max, offset);
        // TODO: test validations
    }

    /**
     * Get report status and location
     *
     * If report is in-progress (&#x60;200 OK&#x60;), body will include status description and suggested poll/retry interval.  If ready (&#x60;303 See Other&#x60;), &#x60;Location&#x60; header will contain the final report download URL.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReportStatusTest() throws ApiException {
        String customerId = null;
        String reportId = null;
        ReportStatus response = api.getReportStatus(customerId, reportId);
        // TODO: test validations
    }

    /**
     * Request customer data report
     *
     * Report generation is asynchronous. The response &#x60;Location&#x60; header will contain the report status URL.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postReportsTest() throws ApiException {
        String customerId = null;
        Report report = null;
        api.postReports(customerId, report);
        // TODO: test validations
    }

}
