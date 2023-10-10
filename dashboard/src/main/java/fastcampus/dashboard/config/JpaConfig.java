package fastcampus.dashboard.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorProvider() {
        return ()-> Optional.of("임의Stufit"); //추후에 스프링 시큐리티 적용시 변경하자
    }
}
