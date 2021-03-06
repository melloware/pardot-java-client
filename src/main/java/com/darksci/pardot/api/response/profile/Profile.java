/**
 * Copyright 2017, 2018, 2019, 2020 Stephen Powis https://github.com/Crim/pardot-java-client
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.darksci.pardot.api.response.profile;

import java.util.Collections;
import java.util.List;

/**
 * Represents a Pardot profile.
 */
public class Profile {
    private Long id;
    private String name;
    private List<ProfileCriteria> profileCriteria = Collections.emptyList();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * Profile Criterias associated to this Profile.
     *
     * @return Associated profile criteria.
     */
    public List<ProfileCriteria> getProfileCriteria() {
        if (profileCriteria == null) {
            profileCriteria = Collections.emptyList();
        }
        return Collections.unmodifiableList(profileCriteria);
    }

    @Override
    public String toString() {
        return "Profile{"
            + "id=" + id
            + ", name='" + name + '\''
            + ", profileCriteria=" + profileCriteria
            + '}';
    }
}
