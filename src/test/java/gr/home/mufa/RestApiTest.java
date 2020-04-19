package gr.home.mufa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(EmployeeRepository.class)
public class RestApiTest {

    @Mock
    EmployeeRepository repository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Rest API - Create: ")
    public void createRestTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8080/employee")
                .requestAttr("name", "test")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
