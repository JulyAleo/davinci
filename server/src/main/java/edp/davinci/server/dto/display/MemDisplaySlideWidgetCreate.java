/*
 * <<
 *  Davinci
 *  ==
 *  Copyright (C) 2016 - 2019 EDP
 *  ==
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *  >>
 *
 */

package edp.davinci.server.dto.display;


import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NotNull(message = "Display slide widget info cannot be null")
public class MemDisplaySlideWidgetCreate {

    private Long id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 1L, message = "Invalid display slide id")
    private Long displaySlideId;

    private Long widgetId;

    @Min(value = 0, message = "Invalid type")
    private Short type;

    private Short subType;

    private Integer index = 0;

    @NotBlank(message = "Type cannot be empty")
    private String params;

    private List<Long> roleIds;
}
