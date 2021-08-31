package com.qaprosoft.carina.demo.api.Weather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetWeatherByCityName extends AbstractApiMethodV2 {
    public GetWeatherByCityName() {
        super(null, "api.weatherByCityName/rs.json");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
        addParameter("appid","c78b555d424ca85cf2670dbfe1b3a125");
    }

    }

