package per.sc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 版    权:  Bulin Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  boye
 *
 * @version [版本号, 2019/4/10 010]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/static/");
        //registry.addResourceHandler("/image/**").addResourceLocations("file:D://image/");
        registry.addResourceHandler("/image/**").addResourceLocations("file:/Users/Macx/Desktop/素材/");

    }

    /**
     * 解决跨域问题
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*")
            .allowedMethods("GET", "HEAD", "POST","PUT", "DELETE", "OPTIONS")
            .allowCredentials(true).maxAge(3600);
    }

}
