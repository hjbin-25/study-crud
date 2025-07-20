package study.core.board.service;

import study.core.board.dto.request.GetPostRequest;
import study.core.board.dto.request.PostPostRequest;
import study.core.board.dto.response.PostInfoResponse;

public interface BoardService {
    PostInfoResponse getPostInfo(GetPostRequest request);
    PostInfoResponse postPostInfo(PostPostRequest request);
    PostInfoResponse updatePostInfo(Long id, PostPostRequest request);
    void deletePost(Long id);
}