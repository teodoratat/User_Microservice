package ro.tuc.ds2020.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import ro.tuc.ds2020.Ds2020TestConfig;
import ro.tuc.ds2020.services.UserService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


public class UserControllerUnitTest extends Ds2020TestConfig {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService service;

//    @Test
//    public void insertPersonTest() throws Exception {
//        ObjectMapper objectMapper = new ObjectMapper();
//        PersonDetailsDTO personDTO = new PersonDetailsDTO("John", "Somewhere Else street","I like pizza", 22,"User");
//
//        mockMvc.perform(post("/person")
//                .content(objectMapper.writeValueAsString(personDTO))
//                .contentType("application/json"))
//                .andExpect(status().isCreated());
//    }
//
//    @Test
//    public void insertPersonTestFailsDueToAge() throws Exception {
//        ObjectMapper objectMapper = new ObjectMapper();
//        PersonDetailsDTO personDTO = new PersonDetailsDTO("John", "Somewhere Else street","I like hinking", 17,"User");
//
//        mockMvc.perform(post("/person")
//                .content(objectMapper.writeValueAsString(personDTO))
//                .contentType("application/json"))
//                .andExpect(status().isBadRequest());
//    }
//
//    @Test
//    public void insertPersonTestFailsDueToNull() throws Exception {
//        ObjectMapper objectMapper = new ObjectMapper();
//        PersonDetailsDTO personDTO = new PersonDetailsDTO("John", null,null,17, null);
//
//        mockMvc.perform(post("/person")
//                .content(objectMapper.writeValueAsString(personDTO))
//                .contentType("application/json"))
//                .andExpect(status().isBadRequest());
//    }
}
