/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.logging.Logger;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 * @author Clayton Veras, Clayton Santos & Marcos Alexandre
 */
public abstract class AbstractRegistration<T> {
	
	@Inject
	protected Logger log;

	@Inject
	protected EntityManager em;

	@Inject
	protected Event<T> entityEventSrc;

	public abstract void remove(T entity) throws Exception;
	
	public void insert(T entity) throws Exception {
//		log.info("Registering " + entity);
		em.persist(entity);
		em.flush();
		entityEventSrc.fire(entity);
	}

	public T update(T entity) {
//		log.info("Updating" + entity);
		em.merge(entity);
		em.flush();
		entityEventSrc.fire(entity);
		return entity;
	}
}
