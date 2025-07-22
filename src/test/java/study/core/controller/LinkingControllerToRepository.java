package study.core.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import study.core.AppConfig;
import study.core.board.service.BoardService;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@EnableJpaRepositories(basePackages = "study.core.board.repository")
@EntityScan(basePackages = "study.core.board.domain.entity")
@ComponentScan(basePackages = "study.core")
public class LinkingControllerToRepository {

    @Autowired
    private BoardService boardService;

    @Test
    @DisplayName("리포지토리, 컨드롤러 연결 확인")
    public void testLinkingControllerToRepository() {
        assertThrows(NullPointerException.class,
                () -> boardService.getPostInfo(null));
    }
}
