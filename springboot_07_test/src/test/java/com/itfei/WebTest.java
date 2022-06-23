package com.itfei;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc//开启虚拟mvc掉调用
public class WebTest {
    @Test
    void webTest01(){
    }
    @Test
    void getWeb(@Autowired MockMvc mockMvc) throws Exception{
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mockMvc.perform(builder);
        StatusResultMatchers statusResultMatchers= MockMvcResultMatchers.status();
        ResultMatcher ok=statusResultMatchers.isOk();
        perform.andExpect(ok);
    }
    @Test
    void getWebBody(@Autowired MockMvc mockMvc) throws Exception{
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mockMvc.perform(builder);
        ContentResultMatchers content = MockMvcResultMatchers.content();
        //StatusResultMatchers statusResultMatchers= content;
        ResultMatcher ok=content.string("springboot");
        perform.andExpect(ok);
    }
    @Test
    void getWebJson(@Autowired MockMvc mockMvc) throws Exception{
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mockMvc.perform(builder);
        ContentResultMatchers content = MockMvcResultMatchers.content();
        //StatusResultMatchers statusResultMatchers= content;
        ResultMatcher ok=content.json("{\"id\":1,\"name\":\"spring1\",\"type\":\"教科书\",\"description\":\"很好的一本书\"}");
        perform.andExpect(ok);
    }
    @Test
    void getWebgetContentType(@Autowired MockMvc mockMvc) throws Exception{
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions perform = mockMvc.perform(builder);
        HeaderResultMatchers header = MockMvcResultMatchers.header();
//        ContentResultMatchers content = header;
        //StatusResultMatchers statusResultMatchers= content;
        //ResultMatcher ok=content.json("{\"id\":1,\"name\":\"spring1\",\"type\":\"教科书\",\"description\":\"很好的一本书\"}");
        ResultMatcher content_type = header.string("Content-type", "application/json");
        perform.andExpect(content_type);
    }
}
