/*
 * Copyright 2014 MovingBlocks
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

package org.terasology.assets;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * @author Immortius
 */
public interface AssetDeltaFormat<T extends AssetData> {

    /**
     * @return The file extension this asset delta format handles
     */
    Set<String> getFileExtensions();

    /**
     * @param filename The filename of an asset delta file
     * @return The asset name corresponding to the given filename
     */
    String getAssetName(String filename);

    /**
     * Applies a delta to the given assetData
     *
     * @param inputs    The inputs corresponding to this asset
     * @param assetData An assetData to update
     * @throws java.io.IOException If there are any errors loading the delta
     */
    void applyDelta(List<AssetInput> inputs, T assetData) throws IOException;
}
