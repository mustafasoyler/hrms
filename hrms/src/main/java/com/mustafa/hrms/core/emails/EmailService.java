package com.mustafa.hrms.core.emails;

import com.mustafa.hrms.core.results.Result;

public interface EmailService {
	Result send(String to, String title, String message);

}
