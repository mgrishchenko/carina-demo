package com.qaprosoft.carina.demo.api.Weather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetWeatherByGeoCoordinates extends AbstractApiMethodV2 {
    public GetWeatherByGeoCoordinates() {
        super(null, "api.geocordweather_get/rs.json", "api.geocordweather_get/geocordweather.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        addParameter("appid","c78b555d424ca85cf2670dbfe1b3a125");
    }
}
