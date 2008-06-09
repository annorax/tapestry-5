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

package org.apache.tapestry5.internal.transform;

import org.apache.tapestry5.MetaDataConstants;
import org.apache.tapestry5.annotations.ContentType;
import org.apache.tapestry5.model.MutableComponentModel;
import org.apache.tapestry5.services.ClassTransformation;
import org.apache.tapestry5.services.ComponentClassTransformWorker;

/**
 * Checks for the {@link org.apache.tapestry5.annotations.ContentType} annotation, adding a corresponding meta-data
 * value when found.
 */
public class ContentTypeWorker implements ComponentClassTransformWorker
{
    public void transform(ClassTransformation transformation, MutableComponentModel model)
    {
        ContentType annotation = transformation.getAnnotation(ContentType.class);

        if (annotation != null) model.setMeta(MetaDataConstants.RESPONSE_CONTENT_TYPE, annotation.value());
    }
}
