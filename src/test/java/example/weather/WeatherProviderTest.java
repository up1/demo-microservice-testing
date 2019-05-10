package example.weather;

import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.RestPactRunner;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.TestTarget;
import au.com.dius.pact.provider.spring.target.MockMvcTarget;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(RestPactRunner.class)
@Provider("weather_provider") // same as in the "provider_name" part in our clientConsumerTest
@PactFolder("target/pacts") // tells pact where to load the pact files from
public class WeatherProviderTest {

//    @InjectMocks
//    private ForecastController forecastController = new ForecastController();
//
//    @Mock
//    private ForecastService forecastService;
//
//    @TestTarget
//    public final MockMvcTarget target = new MockMvcTarget();
//
//    @Before
//    public void before() {
//        initMocks(this);
//        target.setControllers(forecastController);
//    }
//
//    @State("weather forecast data") // same as the "given()" part in our clientConsumerTest
//    public void weatherForecastData() {
//        when(forecastService.fetchForecastFor(any(String.class), any(String.class)))
//                .thenReturn(weatherForecast("Rain"));
//    }
}

