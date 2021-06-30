/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.vro.model;

import com.vmware.avi.vro.Constants;
import com.vmware.o11n.plugin.sdk.annotation.VsoFinder;
import com.vmware.o11n.plugin.sdk.annotation.VsoObject;

@VsoObject(create = false, name = "AviRestResource")
@VsoFinder(name = Constants.FINDER_VRO_AVIRESTRESOURCE, idAccessor = "getObjectID()")
public abstract class AviRestResource {

}