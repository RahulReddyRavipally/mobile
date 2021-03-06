/*******************************************************************************
 * Copyright (c) 2014-2016 IBM Corp.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *    Mike Robertson - initial contribution
 *    Aldo Eisma - add bearing and speed to acceleration message
 *******************************************************************************/
package com.ibm.iot.android.iotstarter.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Build messages to be published by the application.
 * This class is currently unused.
 */
public class MessageFactory {

    /**
     * Construct a JSON formatted string accel event message
     * @param G Float array with accelerometer x, y, z data
     * @param O Float array with gyroscope roll, pitch data
     * @param yaw Float representing gyroscope yaw value
     * @param lon Double containing device longitude
     * @param lat Double containing device latitude
     * @param heading Float containing device heading
     * @param speed Float containing device speed in km/h
     * @param tripId Long containing trip identifier
     * @return String containing JSON formatted message
     */
    public static String getAccelMessage(float G[], float O[], float yaw, double lon, double lat, float heading, float speed, long tripId,float compass[],float acc) {
        // Android does not support the X pattern, so use Z and insert ':' if required.
        DateFormat isoDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss.SSSZ");
//        isoDateTimeFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String isoTimestamp = isoDateTimeFormat.format(new Date());
        if (!isoTimestamp.endsWith("Z")) {
            int pos = isoTimestamp.length() - 2;
            isoTimestamp = isoTimestamp.substring(0, pos) + ':' + isoTimestamp.substring(pos);
        }
        return "{ \"d\": {" +
                "\"longitude\":" + lon + ", " +
                "\"latitude\":" + lat + ", " +
                "\"speed\":" + speed + ", " +
                "\"compass\":" + compass[0] + ", " +
                "\"trip_id\": \"" + tripId + "\", " +
                "\"accuracy\": \"" + acc + "\", " +
                "\"timestamp\":\"" + isoTimestamp + "\" " +
                "} }";
    }

    /**
     * Construct a JSON formatted string text event message
     * @param text String of text message to send
     * @return String containing JSON formatted message
     */
    public static String getTextMessage(String text) {
        String s="stop";
        return "{\"d\":{" +
                "\"text\":\"" + s + "\"" +
                " } }";
    }

    public static String getCommandReceive(String text) {
        String s="command";
        return "{\"d\":{" +
                "\"command\":\"" + s + "\"" +
                " } }";
    }
    /**
     * Construct a JSON formatted string touchmove event message
     * @param x Double of relative x position on screen
     * @param y Double of relative y position on screen
     * @param dX Double of relative x delta from previous position
     * @param dY Double of relative y delta from previous position
     * @param ended True if final message of the touch, false otherwise
     * @return String containing JSON formatted message
     */


}
