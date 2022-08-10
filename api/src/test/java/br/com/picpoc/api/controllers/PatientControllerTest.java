//package br.com.ecosistemas.api.controllers;
//
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//@Slf4j
//class PatientControllerTest {
//
//    @Autowired
//    MockMvc mockMvc;
//    String baseUrl = "/paciente";
//
//    @Test
//    @DisplayName("should return a patient")
//    void patient() throws Exception {
//
//        // when/then
//        String urlTemplate = baseUrl +"/cpf/{cpf}";
//        MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get(urlTemplate, "any_cpf")
//                .contentType(MediaType.APPLICATION_JSON);
//
//        mockMvc.perform(request)
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
//}