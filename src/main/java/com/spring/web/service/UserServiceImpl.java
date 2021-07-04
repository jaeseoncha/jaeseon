package com.spring.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.mapper.UserMapper;
import com.spring.web.vo.UserVO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
	private final UserMapper userMapper;
	
	@Override
	public void userJoin(UserVO vo){
		//TODO 이메일 중복 체크, 비밀번호 암호화
		log.info("회원가입 동작");
	
		userMapper.userJoin(vo);
	}
	
	@Override
	public UserVO getUser(UserVO vo) {

		return userMapper.getUser(vo);
	}

	@Override
	public UserVO getUserById(int id) {
		return userMapper.getUserById(id);
	}

	@Override
	public UserVO userUpdate(UserVO vo) {
		return userMapper.userUpdate(vo);
		
	}
}
