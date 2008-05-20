// Copyright 2008 The Apache Software Foundation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.apache.tapestry.internal.transform;

import org.apache.tapestry.MetaDataConstants;
import org.apache.tapestry.annotation.Secure;
import org.apache.tapestry.model.MutableComponentModel;
import org.apache.tapestry.services.ClassTransformation;
import org.apache.tapestry.services.ComponentClassTransformWorker;

/**
 * Recognizes the {@link org.apache.tapestry.annotation.Secure} annotation and sets the {@link
 * org.apache.tapestry.MetaDataConstants#SECURE_PAGE} meta data to "true".
 */
public class SecureWorker implements ComponentClassTransformWorker
{
    public void transform(ClassTransformation transformation, MutableComponentModel model)
    {
        Secure secure = transformation.getAnnotation(Secure.class);

        if (secure != null)
            model.setMeta(MetaDataConstants.SECURE_PAGE, "true");
    }
}
