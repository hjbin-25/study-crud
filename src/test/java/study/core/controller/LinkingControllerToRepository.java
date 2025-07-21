package study.core.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.core.AppConfig;
import study.core.board.service.BoardService;

import static org.junit.jupiter.api.Assertions.*;

public class LinkingControllerToRepository {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("리포지토리, 컨드롤러 연결 확인")
    public void testLinkingControllerToRepository() {
        BoardService boardService = ac.getBean(BoardService.class);

        assertThrows(NullPointerException.class,
                () -> boardService.getPostInfo(null));
    }
}
