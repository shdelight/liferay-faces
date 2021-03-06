/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.util.io;

import java.io.Serializable;
import java.net.URL;


/**
 * @author  Neil Griffin
 */
public class TextResourceImpl implements TextResource, Serializable {

	// serialVersionUID
	private static final long serialVersionUID = 7030482290552228199L;

	// Private Data Members
	private long lastModified;
	private String text;
	private URL url;

	public TextResourceImpl(URL url, String text, long lastModified) {
		this.url = url;
		this.text = text;
		this.lastModified = lastModified;
	}

	@Override
	public long getLastModified() {
		return lastModified;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public URL getURL() {
		return url;
	}
}
