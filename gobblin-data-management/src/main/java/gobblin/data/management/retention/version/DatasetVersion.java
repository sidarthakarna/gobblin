/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package gobblin.data.management.retention.version;

import java.util.Set;

import org.apache.hadoop.fs.Path;

import gobblin.data.management.version.FileSystemDatasetVersion;


/**
 * @deprecated
 * Extends {@link gobblin.data.management.version.FileSystemDatasetVersion}.
 */
@Deprecated
public interface DatasetVersion extends FileSystemDatasetVersion {

  /**
   * Get set of {@link org.apache.hadoop.fs.Path} that should be deleted to delete this dataset version.
   *
   * <p>
   *   Each path will be deleted recursively, and the deletions will be done serially. As such, this set should be
   *   the minimal set of {@link org.apache.hadoop.fs.Path} that can be deleted to remove the dataset version.
   *   (For example, the parent directory of the files in the dataset, assuming all descendants of that
   *   directory are files for this dataset version).
   * </p>
   *
   * @return Minimal set of {@link org.apache.hadoop.fs.Path} to delete in order to remove the dataset version.
   */
  public Set<Path> getPathsToDelete();
}
