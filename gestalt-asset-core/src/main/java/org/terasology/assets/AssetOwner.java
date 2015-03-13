/*
 * Copyright 2015 MovingBlocks
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

/**
 * Base interface for classes that can own assets and need to be informed when they are disposed.
 * @author Immortius
 */
abstract class AssetOwner<T extends AssetData> {

    /**
     * Called when an owned asset is disposed
     * @param asset The asset that has been disposed
     */
    abstract void onOwnedAssetDisposed(Asset<T> asset);
}
