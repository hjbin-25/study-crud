package study.core.board.dto.response;

import study.core.board.domain.entity.Post;
import study.core.board.domain.enums.BoardCategory;

public record PostInfoResponse(
        Long id,
        String title,
        String content,
        BoardCategory category
) {
    public static PostInfoResponse of(Post post) {
        return new PostInfoResponse(post.getId(), post.getTitle(), post.getContent(), post.getCategory());
    }
}