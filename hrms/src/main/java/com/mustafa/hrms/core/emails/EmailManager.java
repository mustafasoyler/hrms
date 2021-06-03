package com.mustafa.hrms.core.emails;

import org.springframework.stereotype.Service;

import com.mustafa.hrms.core.results.Result;
import com.mustafa.hrms.core.results.SuccessResult;

@Service
public class EmailManager implements EmailService{

	@Override
	public Result send(String to, String title, String message) {
		return new SuccessResult("E-posta başarıyla gönderildi.");
	}

}