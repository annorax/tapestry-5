// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.apache.tapestry5.services;

/**
 * Interface for objects which can periodically check for updates.
 *
 * Note that this interface has moved from module tapestry-core to tapestry-ioc, but has kept the same package (for
 * backwards compatibility reasons).
 * 
 * @see org.apache.tapestry5.services.UpdateListenerHub
 * @since 5.1.0.0
 */
public interface UpdateListener
{
    /**
     * Invoked to force the receiver to check for updates to whatever underlying resources it makes use of.
     */
    void checkForUpdates();
}
