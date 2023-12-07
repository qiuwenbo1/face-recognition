package org.qwb.ai.faceRecognition;

import org.qwb.ai.common.constant.AppConstant;
import org.qwb.ai.common.utils.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableFeignClients(basePackages = "org.qwb.ai.faceRecognition.feign")
@SpringBootApplication
@Import(SpringUtil.class)
public class FaceRecognitionApplication {

    public static void main(String[] args) {
        SpringApplication.run(FaceRecognitionApplication.class, args);
    }

}
