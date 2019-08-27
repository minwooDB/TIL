package my.spring.springedu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.LoginService;
import vo.ResultVO;
@Controller
public class LoginController{
	@Autowired
	private LoginService loginService;	
	@RequestMapping(value = "/login", produces="application/json; chareset=uft-8")
	//mapping 을 사용할 때, 응답형식을 지정해야 하면, produces를 추가해 위와 같이 포맷을 지정해준다.
	@ResponseBody
	public ResultVO LoginProcess(String id, String passwd) {
		// vo 응답을 사용할 경우에, 타입을 위와 같이 주게되면 vo 리턴이 수월함.
		ResultVO vo = new ResultVO();
		if (loginService.login(id, passwd)==true) {
			vo.setResult("ok");
		} else {
			vo.setResult("fail");
		}
		return vo;
	}
}



