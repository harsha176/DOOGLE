package edu.ncsu.csc573.project.common.messages;

import java.math.BigInteger;

import edu.ncsu.csc573.project.common.schema.CommandRequestType;
import edu.ncsu.csc573.project.common.schema.LoginParamsType;
import edu.ncsu.csc573.project.common.schema.LoginType;
import edu.ncsu.csc573.project.common.schema.Request;

public class LoginRequestMessage extends RequestMessage {

	public String getRequestInXML() throws Exception {
		//
		Request req = new Request();
		req.setId(BigInteger.valueOf(System.currentTimeMillis()));
		CommandRequestType login = new CommandRequestType();
		LoginType loginType = new LoginType();
		LoginParamsType lpt = new LoginParamsType();
		
		lpt.setUsername((getParameter().getParamValue(EnumParamsType.USERNAME).toString()));
		lpt.setPassword(getParameter().getParamValue(EnumParamsType.PASSWORD).toString());

		loginType.setParams(lpt);
		login.setLogin(loginType);
		req.setCommand(login);
		
		return getXML(req);
	}

	public void parseXML(String XML) {
		
	}

}
