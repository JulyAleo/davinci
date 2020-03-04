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

import java.util.List;
import java.util.Set;

import edp.davinci.core.dao.entity.DisplaySlide;
import edp.davinci.server.model.MemDisplaySlideWidget;
import edp.davinci.server.model.View;
import edp.davinci.server.model.Widget;

@Data
public class SlideWithMem extends DisplaySlide {
	private List<MemDisplaySlideWidget> items;
    private Set<View> views;
    private List<Widget> widgets;
}
