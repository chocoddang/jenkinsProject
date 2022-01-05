package com.koreait.jenkinsproject.service;

import java.util.Map;

import com.koreait.jenkinsproject.domain.Board;



public interface BoardService {
	public Map<String, Object> addBoard(Board board);
	
}
