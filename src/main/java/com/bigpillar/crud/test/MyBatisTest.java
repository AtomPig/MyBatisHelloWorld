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
		// 1.获取SqlSessionFactory对象
		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
		// 2.获取SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 3.获取接口的实现类对象
		try {
			DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
			Dept dept = deptMapper.getDeptById(1);
			System.out.println(dept);
		} finally {
			sqlSession.close();
		}
	}
}
