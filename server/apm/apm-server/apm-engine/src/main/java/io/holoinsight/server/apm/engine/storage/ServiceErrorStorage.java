/*
 * Copyright 2022 Holoinsight Project Authors. Licensed under Apache-2.0.
 */
package io.holoinsight.server.apm.engine.storage;

import io.holoinsight.server.apm.engine.model.ServiceErrorDO;

import java.io.IOException;
import java.util.List;


public interface ServiceErrorStorage extends WritableStorage<ServiceErrorDO> {
}
