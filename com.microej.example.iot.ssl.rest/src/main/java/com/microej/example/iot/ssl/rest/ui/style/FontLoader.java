/*
 * Java
 *
 * Copyright 2015-2019 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 * MicroEJ Corp. PROPRIETARY. Use is subject to license terms.
 */
package com.microej.example.iot.ssl.rest.ui.style;

import ej.style.font.FontProfile;
import ej.style.font.loader.AbstractFontLoader;

/**
 * The font loader used in the application.
 */
public class FontLoader extends AbstractFontLoader {

	private static final int XLARGE_HEIGHT = 50;
	private static final int LARGE_HEIGHT = 30;
	private static final int MEDIUM_HEIGHT = 20;
	private static final int SMALL_HEIGHT = 14;

	@Override
	protected int getFontHeight(FontProfile fontProfile) {
		switch (fontProfile.getSize()) {
		case LENGTH:
			return fontProfile.getSizeValue();
		case X_LARGE:
			return XLARGE_HEIGHT;
		case LARGE:
			return LARGE_HEIGHT;
		case SMALL:
			return SMALL_HEIGHT;
		case MEDIUM:
		default:
			return MEDIUM_HEIGHT;
		}
	}

}
