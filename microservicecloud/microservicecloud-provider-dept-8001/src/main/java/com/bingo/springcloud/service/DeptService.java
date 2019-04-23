package com.bingo.springcloud.service;

import java.util.List;

import com.bingo.springcloud.entities.Dept;

public interface DeptService{
	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
