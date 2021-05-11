package com.rajesh.logApp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LogEntry {

	String serviceName;
	String logType;
	String logMessage;

}
