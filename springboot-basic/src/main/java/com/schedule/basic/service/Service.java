package com.schedule.basic.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.hibernate.criterion.DetachedCriteria;

import com.schedule.basic.entity.SupportModel;
import com.schedule.basic.page.Page;
import com.schedule.basic.page.PageRequest;
import com.schedule.basic.page.Sort;
import com.schedule.basic.repository.PageRepository;

public interface Service<T extends SupportModel, PK extends Serializable> extends SupportService<T, PK> {
	
	DetachedCriteria getDetachedCriteria();
	
	EntityManager getManager();
	
	PageRepository<T, PK> getPageRepository();
	
	T persist(T entity);
	
	T merge(T entity);

	void merge(final Collection<T> entities);
	
	T delete(PK id);
	
	void remove(PK id);
	
	void refresh(final T entity);
	
	void flush();
	
	List<T> findAll();
	
	List<T> findAll(Sort sort);
	
	T findBy(PK id);
	
	List<T> findBy(AssembleCriteriaParamsCallback callback);
	
	List<T> findBy(AssembleCriteriaParamsCallback callback, Sort sort);
	
	Page<T> pageBy(AssembleCriteriaParamsCallback callback, PageRequest pageable);

	Page<T> pageBy(AssembleCriteriaParamsCallback callback, Sort sort, PageRequest pageable);
	
	List<?> findArrayByNativeSql(final StringBuilder sql);
	
	List<?> findArrayByNativeSql(final StringBuilder sql, final Map<String, Object>params);

	List<?> findMapByNativeSql(final StringBuilder sql);

	List<?> findMapByNativeSql(final StringBuilder sql, final Map<String, Object>params);
	
	DetachedCriteria assembleSort(DetachedCriteria criteria, Sort sort);
	
	
	public interface AssembleCriteriaParamsCallback {
		abstract DetachedCriteria assembleParams(DetachedCriteria criteria);
	}
}
