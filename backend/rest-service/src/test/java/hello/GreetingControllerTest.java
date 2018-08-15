package hello;


import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World")));
    }

    @Test
    public void test_greeter_with_no_params() throws Exception {

        this.mvc.perform(get("/hello")).andDo(print()).
                andExpect(status().isOk())
                .andExpect(jsonPath("$.id", Matchers.is(1)))
                .andExpect(jsonPath("$.content", Matchers.is("Hello, Stranger!")))
                .andExpect(jsonPath("$.name", Matchers.is("Greeter")));
    }

    @Test
    public void test_default() throws  Exception {
        this.mvc.perform(post("/test"))
            .andDo(print())
        .andExpect(status().isOk())
                .andExpect(content().string(is("Hello Stranger")));
    }

    @Test
    public void test_with_param() throws  Exception {
        String param = "Test";

        System.out.println("Test");
        this.mvc.perform(post("/test")
                .param("name",param))
                .andDo(print())
                .andExpect(
                        status().isOk())
                .andExpect(
                        content().string(is("Hello " + param)));
    }
}