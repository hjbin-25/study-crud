package study.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.core.board.repository.BoardRepository;
import study.core.board.service.BoardService;
import study.core.board.service.impl.BoardServiceImpl;

@Configuration
public class AppConfig {

    BoardRepository boardRepository;

    @Bean
    public BoardService boardService() {
        return new BoardServiceImpl(boardRepository);
    }
}
