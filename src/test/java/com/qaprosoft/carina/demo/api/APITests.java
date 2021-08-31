package com.qaprosoft.carina.demo.api;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.demo.api.Weather.*;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class APITests implements IAbstractTest {

    @Test()
    public void testGetWeatherByCityName() {
        GetWeatherByCityName getWeatherByCityName = new GetWeatherByCityName();
        getWeatherByCityName.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherByCityName.addParameterIfNotNull("q", "Minsk");
        getWeatherByCityName.callAPI();
        getWeatherByCityName.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWeatherByCityName.validateResponseAgainstSchema("api.weatherByCityName/rs.schema");
    }

    @Test()
    public void testGetWeatherByGeoCoordinates() {
        GetWeatherByGeoCoordinates getWeatherByGeoCoordinates = new GetWeatherByGeoCoordinates();
        getWeatherByGeoCoordinates.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherByGeoCoordinates.addParameterIfNotNull("lat", "53.9");
        getWeatherByGeoCoordinates.addParameterIfNotNull("lon", "27.5667");
        getWeatherByGeoCoordinates.callAPI();
        getWeatherByGeoCoordinates.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWeatherByGeoCoordinates.getProperties().replace("cityName", "skip", "Minsk");
        getWeatherByGeoCoordinates.getProperties().replace("countryName", "skip", "BY");
        getWeatherByGeoCoordinates.validateResponseAgainstSchema("api.geocordweather_get/rs.schema");

    }

    @Test()
    public void testGetGeoCordByCityName() {
        GetGeoCordByCityName getGeoCordByCityName = new GetGeoCordByCityName();
        getGeoCordByCityName.expectResponseStatus(HttpResponseStatusType.OK_200);
        getGeoCordByCityName.addParameterIfNotNull("q", "Warsaw");
        getGeoCordByCityName.addParameterIfNotNull("limit", "1");
        getGeoCordByCityName.callAPI();
        getGeoCordByCityName.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getGeoCordByCityName.validateResponseAgainstSchema("api.geocordByCityName/rs.shcema");
    }

    @Test
    public void testGetWeatherByCityId() {
        GetWeatherMethod getWeatherMethod = new GetWeatherMethod();
        getWeatherMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
        getWeatherMethod.addParameter("id", "2950158");
        getWeatherMethod.callAPI();
        getWeatherMethod.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getWeatherMethod.getProperties().replace("cityName", "skip", "Berlin");
        getWeatherMethod.getProperties().replace("countryName", "skip", "DE");
        getWeatherMethod.validateResponseAgainstSchema("api.weatherByCityId/rs.schema");
    }

    @Test()
    public void testGetAirPollutionByGeoCoord() {
        GetAirPollution getAirPollution = new GetAirPollution();
        getAirPollution.expectResponseStatus(HttpResponseStatusType.OK_200);
        getAirPollution.addParameterIfNotNull("lat", "53");
        getAirPollution.addParameterIfNotNull("lon", "50");
        getAirPollution.callAPI();
        getAirPollution.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getAirPollution.validateResponseAgainstSchema("api.airpollution/rs.schema");


    }
}