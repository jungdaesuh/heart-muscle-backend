package shop.heartmuscle.heartmuscle.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class WebMvcConfig implements WebMvcConfigurer {
//
//    @Bean
//    public MappingJackson2HttpMessageConverter jsonEscapeConverter() {
//        ObjectMapper objectMapper = Jackson2ObjectMapperBuilder.json().build();
//        objectMapper.getFactory().setCharacterEscapes(new HtmlCharacterEscapes());
//        return new MappingJackson2HttpMessageConverter(objectMapper);
//    }
//}
