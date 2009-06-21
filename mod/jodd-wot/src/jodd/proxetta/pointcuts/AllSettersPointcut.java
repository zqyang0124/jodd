// Copyright (c) 2003-2009, Jodd Team (jodd.org). All Rights Reserved.

package jodd.proxetta.pointcuts;

import jodd.proxetta.MethodInfo;

/**
 * Pointcut on all public setters methods.
 */
public class AllSettersPointcut extends ProxyPointcutSupport {

	public boolean apply(MethodInfo methodInfo) {
		return
				isPublic(methodInfo)
				&& matchMethodName(methodInfo, "set*")
				&& hasOneArgument(methodInfo)
				;
	}
}