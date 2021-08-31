package com.qaprosoft.carina.demo.api.Weather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetWeatherMethod extends AbstractApiMethodV2 {
    public GetWeatherMethod() {
        super(null, "api.weatherByCityId/rs.json", "api.weatherByCityId/weather.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        addParameter("appId", "c78b555d424ca85cf2670dbfe1b3a125");
    }
}
