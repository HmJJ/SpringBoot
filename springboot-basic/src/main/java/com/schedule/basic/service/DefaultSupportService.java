package com.schedule.basic.service;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.schedule.basic.entity.SupportModel;

public class DefaultSupportService<T extends SupportModel, PK extends Serializable> implements SupportService<T, PK> {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
}
