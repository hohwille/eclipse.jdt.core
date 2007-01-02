/*******************************************************************************
 * Copyright (c) 2006 BEA Systems, Inc. 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    wharley@bea.com - initial API and implementation
 *    
 *******************************************************************************/

package org.eclipse.jdt.internal.compiler.apt.dispatch;

import java.util.List;

/**
 * Implementors know how to discover annotation processors, and maintain a list of processors that
 * have been discovered and initialized so far.
 */
public interface IProcessorProvider {

	/**
	 * Return the next processor that can be discovered, according to the order and discovery rules
	 *         of the provider (see, for instance, {@link Processor}.
	 * @return a ProcessorInfo wrapping an initialized Processor, or <code>null</code> if there are
	 * no more processors to be discovered.
	 */
	ProcessorInfo discoverNextProcessor();

	/**
	 * @return the list of all processors that have been discovered so far. This list will grow when
	 *         {@link #discoverNextProcessor()} is called.
	 */
	List<ProcessorInfo> getDiscoveredProcessors();
}
