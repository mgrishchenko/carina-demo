package com.qaprosoft.carina.demo.api.Weather;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class GetAirPollution extends AbstractApiMethodV2 {
        public GetAirPollution() {
            super(null, "api.airpollution/rs.json");
            replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
            addParameter("appid","c78b555d424ca85cf2670dbfe1b3a125");
        }
    }

