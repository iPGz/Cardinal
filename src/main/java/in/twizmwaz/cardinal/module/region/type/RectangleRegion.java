/*
 * Copyright (c) 2016, Kevin Phoenix
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package in.twizmwaz.cardinal.module.region.type;

import in.twizmwaz.cardinal.match.Match;
import in.twizmwaz.cardinal.module.region.parser.RectangleRegionParser;
import org.bukkit.util.Cuboid;
import org.bukkit.util.Vector;

public class RectangleRegion extends CuboidRegion {

  /**
   * @param min The rectangle's minimum bound.
   * @param max The rectangle's maximum bound.
   */
  public RectangleRegion(Match match, Vector min, Vector max) {
    super(match, Cuboid.between(min.add(0, Double.NEGATIVE_INFINITY, 0), max.add(0, Double.POSITIVE_INFINITY, 0)));
  }

  public RectangleRegion(Match match, Cuboid cuboid) {
    this(match, cuboid.minimum(), cuboid.maximum());
  }

  public RectangleRegion(Match match, RectangleRegionParser parser) {
    this(match, parser.getCuboid().minimum(), parser.getCuboid().maximum());
  }
}
