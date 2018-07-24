package com.schedule.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

import com.schedule.basic.entity.DefaultModel;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBL_ACC_QUARTZ")
@BatchSize(size = 20)
@DiscriminatorValue(value = "quartz")
public class Schedule extends DefaultModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9026429060045959143L;

	@Column(name="CRON", length=32, nullable=false)
	@Getter
	@Setter
	private String cron;
	
	@Column(name="CLASS_NAME", length=32, nullable=false)
	@Getter
	@Setter
	private String class_Name;
	
	public Schedule() {
		
	}
	
	public Schedule(String class_name, String cron) {
		this.class_Name = class_name;
		this.cron = cron;
	}
	
}
