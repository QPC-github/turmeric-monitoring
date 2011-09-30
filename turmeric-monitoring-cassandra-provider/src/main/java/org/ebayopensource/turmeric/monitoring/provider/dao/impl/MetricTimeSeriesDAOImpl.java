/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.monitoring.provider.dao.impl;





import org.ebayopensource.turmeric.monitoring.provider.dao.MetricTimeSeriesDAO;
import org.ebayopensource.turmeric.monitoring.provider.model.Model;
import org.ebayopensource.turmeric.utils.cassandra.dao.AbstractColumnFamilyDao;



/**
 * The Class MetricsTimeSeriesDAOImpl.
 * 
 * @author jamuguerza
 */
public class MetricTimeSeriesDAOImpl<K> extends
		AbstractColumnFamilyDao<K, Model>
		implements MetricTimeSeriesDAO<K> {

	/**
	 * Instantiates a new metrics error values dao impl.
	 * 
	 * @param clusterName
	 *            the cluster name
	 * @param host
	 *            the host
	 * @param s_keyspace
	 *            the s_keyspace
	 * @param columnFamilyName
	 *            the column family name
	 */
	public MetricTimeSeriesDAOImpl(final String clusterName, final String host,
			final String s_keyspace, final String columnFamilyName,  final Class<K> kTypeClass) {
		super(clusterName, host, s_keyspace, kTypeClass, 
				Model.class,  columnFamilyName);
	}

}
