package com.example.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.YunMapper;

@Service
public class YunServiceImpl implements YunService{
	@Resource
	private YunMapper yunMapper;

}
