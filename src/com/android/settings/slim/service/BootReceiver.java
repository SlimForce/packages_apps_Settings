/*
 * Copyright (C) 2013 Android Open Kang Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.slim.service;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import com.android.settings.livedisplay.DisplayColor;
import com.android.settings.livedisplay.DisplayGamma;
import com.android.settings.hardware.VibratorIntensity;
import com.android.settings.slim.HardwareKeysSettings;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        ContentResolver resolver = context.getContentResolver();

        /* Restore the hardware tunable values */
        DisplayGamma.restore(context);
        VibratorIntensity.restore(context);
        HardwareKeysSettings.restore(context);
    }
}
