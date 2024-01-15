package kr.ezen.boot3.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ezen.boot3.dao.TestDAO;
import kr.ezen.boot3.vo.TestVO;

@Service("testService")
public class TestService {

	@Autowired
	private TestDAO testDAO1;
	
	@Autowired
	private TestDAO testDAO2;
	
	public Date getToday1() {
		return testDAO1.selectToday();
	}
	
	public Date getToday2() {
		return testDAO2.selectToday();
	}
	
	public TestVO getTestVO1(int num1, int num2) {
		TestVO testVO = new TestVO();
		testVO.setNum1(num1);
		testVO.setNum2(num2);
		return testDAO1.selecCalc(testVO);
	}
	
	public TestVO getTestVO2(int num1, int num2) {
		TestVO testVO = new TestVO();
		testVO.setNum1(num1);
		testVO.setNum2(num2);
		return testDAO2.selecCalc(testVO);
	}
}
