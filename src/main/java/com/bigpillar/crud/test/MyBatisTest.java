package com.bigpillar.crud.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.bigpillar.crud.bean.Dept;
import com.bigpillar.crud.dao.DeptMapper;

public class MyBatisTest {
	@Test
	public void Test() throws IOException {

		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		// 1.��ȡSqlSessionFactory����
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
		// 2.��ȡSqlSession����
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 3.��ȡ�ӿڵ�ʵ�������
		try {
			DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
			Dept dept = deptMapper.getDeptById(1);
			System.out.println(dept);
		} finally {
			sqlSession.close();
		}
	}
}
