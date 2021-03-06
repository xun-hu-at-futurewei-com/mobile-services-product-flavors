// Copyright 2020. Huawei Technologies Co., Ltd. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

// http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.hms.lib.mobileservicesproductflavors.map.factory

import android.content.Context
import com.hms.lib.mobileservicesproductflavors.map.helper.DistanceUtil
import com.hms.lib.mobileservicesproductflavors.map.model.CommonLatLng

abstract class BaseMapImpl(context: Context) : CommonMap {

    override fun calculateDistanceBetweenPoints(p1: CommonLatLng, p2: CommonLatLng): Double {
        return DistanceUtil().calculateDistance(p1, p2)
    }
}