/*
 * Java
 *
 * Copyright 2016-2019 MicroEJ Corp. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be found with this software.
 * MicroEJ Corp. PROPRIETARY. Use is subject to license terms.
 */
package com.microej.example.iot.zwave;

import com.microej.example.iot.zwave.app.MorseSwitchBG;
import com.microej.example.iot.zwave.app.ZWaveBG;

/**
 *
 */
public class Simulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ZWaveDriver().start();
		new MorseSwitchBG().onStart();
		new ZWaveBG().onStart();
	}

}
