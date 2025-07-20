package study.core.board.dto.request;

import study.core.board.domain.enums.BoardCategory;

public record PostPostRequest(
        String title,
        String content,
        BoardCategory category
) {

}