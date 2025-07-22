package study.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.core.board.repository.BoardRepository;
import study.core.board.service.BoardService;
import study.core.board.service.impl.BoardServiceImpl;

@Configuration
public class AppConfig {
    private final BoardRepository boardRepository;

    @Autowired
    public AppConfig(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    // 생성자 주입 대상

    @Bean
    public BoardService boardService() {
        return new BoardServiceImpl(boardRepository);
    }
}