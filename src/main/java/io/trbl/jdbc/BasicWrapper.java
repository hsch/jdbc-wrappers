/*
 * MIT License, Copyright (c) 2016 Hendrik Schnepel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.trbl.jdbc;

import java.sql.SQLException;
import java.sql.Wrapper;

public class BasicWrapper<T extends Wrapper> implements Wrapper {

  protected final T target;

  public BasicWrapper(final T target) {
    if (target == null) {
      throw new NullPointerException("Wrapped object must not be null");
    }
    this.target = target;
  }

  @Override
  public final boolean isWrapperFor(final Class<?> iface) throws SQLException {
    if (iface.isAssignableFrom(getClass())) {
      return true;
    }
    else if (iface.isAssignableFrom(target.getClass())) {
      return true;
    }
    else if (target.isWrapperFor(iface)) {
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public final <I> I unwrap(final Class<I> iface) throws SQLException {
    if (iface.isAssignableFrom(getClass())) {
      return iface.cast(this);
    }
    else if (iface.isAssignableFrom(target.getClass())) {
      return iface.cast(target);
    }
    else {
      return target.unwrap(iface);
    }
  }

}
