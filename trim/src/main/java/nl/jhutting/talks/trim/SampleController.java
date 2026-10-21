package nl.jhutting.talks.trim;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Minimal sample code that exercises a few of the declared dependencies
 * so that {@code mvn dependency:analyze} has real usages to detect.
 */
@RestController
public class SampleController {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Gson gson = new Gson();

    @GetMapping("/sample")
    public String sample() throws Exception {
        Map<String, Object> payload = Map.of("message", "hello");
        String json = objectMapper.writeValueAsString(payload);

        List<String> values = List.of("a", "b", "c");
        boolean hasAny = CollectionUtils.isNotEmpty(values);

        return hasAny ? gson.toJson(json) : json;
    }
}
