package com.jayg.web.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jayg.web.board.vo.BoardVO;
import com.jayg.web.board.vo.PageVO;

@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<BoardVO> getListAll() {
		return sqlSession.selectList("boardMapper.selectBoardList");
	}

	@Override
	public BoardVO get(int seq) {
		return sqlSession.selectOne("boardMapper.selectBoard", seq);
	}

	@Override
	public void insert(BoardVO vo) {
		sqlSession.insert("boardMapper.insertBoard", vo);
	}

	@Override
	public void update(BoardVO vo) {
		sqlSession.update("boardMapper.updateBoard", vo);
	}

	@Override
	public int getListCount() {
		return (int) sqlSession.selectOne("boardMapper.selectBoardCount");
	}

	@Override
	public List<BoardVO> getList(PageVO vo) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("boardMapper.selectBoardListPage", vo);
	}
}
