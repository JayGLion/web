package com.jayg.web.board.service;

import java.util.List;

import com.jayg.web.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> getList();
	int getListCount();
	BoardVO get(int seq);
	void insert(BoardVO vo);
	void update(BoardVO vo);
}
