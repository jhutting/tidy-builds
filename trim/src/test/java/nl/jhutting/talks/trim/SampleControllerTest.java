package nl.jhutting.talks.trim;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Minimal sample test that exercises a few of the declared test-scope
 * dependencies so that {@code mvn dependency:analyze} has real usages to detect.
 */
class SampleControllerTest {

    private static final Logger log = LoggerFactory.getLogger(SampleControllerTest.class);

    @Test
    void sampleControllerCanBeInstantiated() throws Exception {
        SampleController controller = Mockito.spy(new SampleController());
        assertNotNull(controller.sample());
        log.info("Sample controller test executed");
    }
}
