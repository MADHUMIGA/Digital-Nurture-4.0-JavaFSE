//WeatherApiClient
package in.madhu.junit_practice;

public class WeatherApiClient {
	public String getWeather(String city) {
        // In real life, this would make an HTTP call to fetch weather
        throw new UnsupportedOperationException("This hits real API!");
    }
}



// WeatherService
package in.madhu.junit_practice;

public class WeatherService {
	  private final WeatherApiClient apiClient;

	    public WeatherService(WeatherApiClient apiClient) {
	        this.apiClient = apiClient;
	    }

	    public String getTodaysWeather(String city) {
	        String result = apiClient.getWeather(city);
	        return "Today's weather in " + city + " is: " + result;
	    }
}




//WeatherServiceTest
package in.madhu.junit_practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


public class WeatherServiceTest {
	  @Test
	    void testGetTodaysWeather() {
	        // Step 1: Create mock of external API
	        WeatherApiClient mockApi = mock(WeatherApiClient.class);

	        // Step 2: Stub the method to return a fake response
	        when(mockApi.getWeather("Bengaluru")).thenReturn("Sunny, 30°C");

	        // Step 3: Inject mock into service
	        WeatherService service = new WeatherService(mockApi);

	        // Step 4: Call service method and assert
	        String result = service.getTodaysWeather("Bengaluru");

	        assertEquals("Today's weather in Bengaluru is: Sunny, 30°C", result);
	    }
}
