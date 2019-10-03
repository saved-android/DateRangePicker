/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.beeline09.daterangepicker.date

import android.content.Context
import android.util.AttributeSet

/**
 * A DayPickerView customized for [SimpleMonthAdapter]
 */
class SimpleDayPickerView : DayPickerView {

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {}

    constructor(context: Context, controller: SmoothDateRangePickerController) : super(context, controller) {}

    override fun createMonthAdapter(context: Context, controller: SmoothDateRangePickerController?): MonthAdapter {
        return SimpleMonthAdapter(context, controller)
    }

}