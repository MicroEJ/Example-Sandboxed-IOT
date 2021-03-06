/*
 * Java
 *
 * Copyright 2019 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 * MicroEJ Corp. PROPRIETARY. Use is subject to license terms.
 */
package com.microej.example.iot;

import java.io.IOException;

import ej.wadapps.app.BackgroundService;

/**
 * A background service using {@link Main}.
 */
public class DynamicServerBackgroundService implements BackgroundService {

	@Override
	public void onStart() {
		try {
			Main.main(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onStop() {
		Main.stop();
	}

}
