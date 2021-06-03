package com.mustafa.hrms.core.business;

import com.mustafa.hrms.core.results.Result;

public class BusinessRule {
	 public static Result run(Result... logics)
    {
        for (Result result : logics)
        {
            if (!result.isSuccess())
            {
                return result;
            }
        }

        return null;
    }
}
